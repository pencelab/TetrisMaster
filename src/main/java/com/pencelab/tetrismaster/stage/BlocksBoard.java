package com.pencelab.tetrismaster.stage;

import com.pencelab.tetrismaster.pieces.IPiece;
import com.pencelab.tetrismaster.pieces.Piece;
import com.pencelab.tetrismaster.pieces.Pipe;

import java.util.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BlocksBoard implements IBoard {

    public static final int COLUMNS = 10;
    public static final int ROWS = 24;
    private static final int HIDDEN_ROWS = 4;
    private static final int MIN_BLOCK_SIZE = 5;

    private static final int REARRANGE_WAIT_TIME_BETWEEN_STEPS_IN_MILLISECOND = 100;

    private IPiece piece = null;

    private final IPiece.ISquareUnit[][] squareUnitsBoard;

    private final List<Listener> listeners = new ArrayList<>();

    public BlocksBoard(IPiece.ISquareUnit[][] squareUnitsBoard) {
        if(squareUnitsBoard.length != ROWS)
            throw new IllegalArgumentException("Illegal size of square units matrix. Board must have " + ROWS + " rows.");

        if(squareUnitsBoard[0].length != COLUMNS)
            throw new IllegalArgumentException("Illegal size of square units matrix. Board must have " + COLUMNS + " columns.");

        this.squareUnitsBoard = squareUnitsBoard;
    }

    @Override
    public void setPiece(final IPiece piece) throws IllegalArgumentException {
        if(this.isOutOfBoundaries(piece))
            throw new IllegalArgumentException("Piece position is not valid. Piece is out of bounds.");

        if(this.collisionDetected(piece))
            throw new IllegalArgumentException("Piece position is not valid. Piece is on an occupied field.");

        if(this.piece == null)
            this.piece = piece;
    }

    @Override
    public void rotate() {
        if(this.piece != null){
            if(this.replacePiece(this.piece.rotate()))
                this.notifyPieceRotated();
            else if(this.replacePiece(this.piece.moveLeft().rotate()))
                this.notifyPieceRotated();
            else if(this.piece instanceof Pipe && this.replacePiece(this.piece.moveLeft().moveLeft().rotate()))
                this.notifyPieceRotated();
            else if(this.piece instanceof Pipe && this.replacePiece(this.piece.moveRight().rotate()))
                this.notifyPieceRotated();
        }
    }

    @Override
    public void moveDown() {
        if(this.piece != null) {
            if(!this.replacePiece(this.piece.moveDown())) {
                this.releasePiece();
                this.notifyPieceReleased();
                int chain = 0;
                do{
                    chain = this.sweepBlocks(chain);
                }while(chain > 0 && this.rearrangeBoard());
                if(this.isGameOver())
                    this.notifyGameOver();
                else
                    this.notifyBoardIdleState();
            }else {
                this.notifyPieceMoved();
            }
        }
    }

    @Override
    public void moveLeft() {
        if(this.piece != null) {
            if (this.replacePiece(this.piece.moveLeft()))
                this.notifyPieceMoved();
        }
    }

    @Override
    public void moveRight() {
        if(this.piece != null) {
            if(this.replacePiece(this.piece.moveRight()))
                this.notifyPieceMoved();
        }
    }

    @Override
    public void drop() {
        IPiece shadowPiece = this.getShadowPiece();
        if(shadowPiece != null) {
            if(this.replacePiece(shadowPiece))
                this.moveDown();
        }
    }

    @Override
    public IPiece.ISquareUnit[][] getSquareUnits() {
        return this.squareUnitsBoard;
    }

    @Override
    public IPiece getPiece() {
        return this.piece;
    }

    @Override
    public IPiece getShadowPiece() {
        if(this.piece != null){
            IPiece shadowPiece = this.piece;
            IPiece cache = shadowPiece;
            while(!this.isOutOfBoundaries(shadowPiece) && !this.collisionDetected(shadowPiece)){
                cache = shadowPiece;
                shadowPiece = shadowPiece.moveDown();
            }
            return cache;
        }
        return null;
    }

    @Override
    public void addListener(final Listener listener) {
        this.listeners.add(listener);
    }

    @Override
    public void removeListener(final Listener listener) {
        this.listeners.remove(listener);
    }

    @Override
    public void clearAllListeners() {
        this.listeners.clear();
    }

    @Override
    public int getColumns() {
        return COLUMNS;
    }

    @Override
    public int getRows() {
        return ROWS;
    }

    @Override
    public int getHiddenRows() {
        return HIDDEN_ROWS;
    }

    private boolean replacePiece(final IPiece piece){
        if(!this.isOutOfBoundaries(piece) && !this.collisionDetected(piece)) {
            this.piece = piece;
            return true;
        }
        return false;
    }

    private boolean isOutOfBoundaries(final IPiece piece) {
        IPiece.ISquareUnit[] squareUnits = piece.getSquareUnits();
        for (IPiece.ISquareUnit squareUnit : squareUnits) {
            if(squareUnit.getX() < 0 || squareUnit.getX() >= COLUMNS || squareUnit.getY() < 0 || squareUnit.getY() >= ROWS)
                return true;
        }
        return false;
    }

    private boolean collisionDetected(final IPiece piece) {
        IPiece.ISquareUnit[] squareUnits = piece.getSquareUnits();
        for (IPiece.ISquareUnit squareUnit : squareUnits) {
            if(this.squareUnitsBoard[squareUnit.getY()][squareUnit.getX()] != null)
                return true;
        }
        return false;
    }

    private boolean rearrangeBoard() {
        boolean rearranged = false;
        boolean moved = true;
        while(moved) {

            try {
                TimeUnit.MILLISECONDS.sleep(REARRANGE_WAIT_TIME_BETWEEN_STEPS_IN_MILLISECOND);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            moved = false;
            Set<IPiece.ISquareUnit> movedSquareUnits = new HashSet<>();
            for (int i = ROWS - 2; i >= 0; i--) {
                for (int j = 0; j < COLUMNS; j++) {
                    if(this.squareUnitsBoard[i][j] != null) {
                        IPiece.ISquareUnit squareUnit = new Piece.SquareUnit(j, i, this.squareUnitsBoard[i][j].getColor());
                        if (!movedSquareUnits.contains(squareUnit)) {
                            Set<IPiece.ISquareUnit> linkedSquareUnitsMovedDown = this.linkedSquareUnitsMovedDown(j, i);
                            if(linkedSquareUnitsMovedDown.size() > 0){
                                movedSquareUnits.addAll(linkedSquareUnitsMovedDown);
                                moved = true;
                                rearranged = true;
                            }
                        }
                    }
                }
            }

            if(moved)
                this.notifyBoardRearranged();

        }
        return rearranged;
    }

    private Set<IPiece.ISquareUnit> linkedSquareUnitsMovedDown(final int x, final int y) {
        Map<Integer, Set<IPiece.ISquareUnit>> linkedSquareUnitsBlockToMovedDown = buildLinkedSquareUnitsPieceBlockToMoveDown(x, y, new HashMap<>());
        Set<IPiece.ISquareUnit> linkedSquareUnitsMovedDown = new HashSet<>();
        if(!linkedSquareUnitsBlockToMovedDown.isEmpty()){
            for(int i = ROWS - 1; i >= 0; i--){
                Set<IPiece.ISquareUnit> squareUnitsRow = linkedSquareUnitsBlockToMovedDown.get(i);
                if(squareUnitsRow != null) {
                    for (IPiece.ISquareUnit squareUnit : squareUnitsRow) {
                        linkedSquareUnitsMovedDown.add(squareUnit);
                        this.squareUnitsBoard[squareUnit.getY() + 1][squareUnit.getX()] = this.squareUnitsBoard[squareUnit.getY()][squareUnit.getX()];
                        this.squareUnitsBoard[squareUnit.getY()][squareUnit.getX()] = null;
                    }
                }
            }
        }
        return Collections.unmodifiableSet(linkedSquareUnitsMovedDown);
    }

    private Map<Integer, Set<IPiece.ISquareUnit>> buildLinkedSquareUnitsPieceBlockToMoveDown(final int x, final int y, final Map<Integer, Set<IPiece.ISquareUnit>> checkedLinkedSquareUnits) {
        Map<Integer, Set<IPiece.ISquareUnit>> localCheckedLinkedSquareUnits = new HashMap<>(checkedLinkedSquareUnits);

        if(this.squareUnitsBoard[y][x] == null || y == ROWS - 1) {
            localCheckedLinkedSquareUnits.clear();
            return Collections.unmodifiableMap(localCheckedLinkedSquareUnits);
        }

        localCheckedLinkedSquareUnits.computeIfAbsent(y, k -> new HashSet<>());

        IPiece.ISquareUnit squareUnit = new Piece.SquareUnit(x, y, this.squareUnitsBoard[y][x].getColor());
        if(localCheckedLinkedSquareUnits.get(y).contains(squareUnit))
            return Collections.unmodifiableMap(localCheckedLinkedSquareUnits);

        Piece.LinkedSquareUnit linkedSquareUnit = (Piece.LinkedSquareUnit) this.squareUnitsBoard[y][x];
        if(linkedSquareUnit.getBottomSquareUnit() == null && this.squareUnitsBoard[y + 1][x] != null){
            localCheckedLinkedSquareUnits.clear();
            return Collections.unmodifiableMap(localCheckedLinkedSquareUnits);
        }

        localCheckedLinkedSquareUnits.get(y).add(squareUnit);

        Piece.LinkedSquareUnit left = linkedSquareUnit.getLeftSquareUnit();
        Piece.LinkedSquareUnit top = linkedSquareUnit.getTopSquareUnit();
        Piece.LinkedSquareUnit right = linkedSquareUnit.getRightSquareUnit();
        Piece.LinkedSquareUnit bottom = linkedSquareUnit.getBottomSquareUnit();

        if(x > 0 && left != null && !localCheckedLinkedSquareUnits.isEmpty())
            localCheckedLinkedSquareUnits = this.buildLinkedSquareUnitsPieceBlockToMoveDown(x - 1, y, localCheckedLinkedSquareUnits);

        if(y > 0 && top != null && !localCheckedLinkedSquareUnits.isEmpty())
            localCheckedLinkedSquareUnits = this.buildLinkedSquareUnitsPieceBlockToMoveDown(x, y - 1, localCheckedLinkedSquareUnits);

        if(x < COLUMNS - 1 && right != null && !localCheckedLinkedSquareUnits.isEmpty())
            localCheckedLinkedSquareUnits = this.buildLinkedSquareUnitsPieceBlockToMoveDown(x + 1, y, localCheckedLinkedSquareUnits);

        if(y < ROWS - 1 && bottom != null && !localCheckedLinkedSquareUnits.isEmpty())
            localCheckedLinkedSquareUnits = this.buildLinkedSquareUnitsPieceBlockToMoveDown(x, y + 1, localCheckedLinkedSquareUnits);

        return Collections.unmodifiableMap(localCheckedLinkedSquareUnits);
    }

    private void releasePiece(){
        IPiece.ISquareUnit[] linkedSquareUnits = this.piece.getLinkedSquareUnits();
        for (IPiece.ISquareUnit linkedSquareUnit : linkedSquareUnits) {
            this.squareUnitsBoard[linkedSquareUnit.getY()][linkedSquareUnit.getX()] = linkedSquareUnit;
        }
        this.piece = null;
    }

    private Set<IPiece.ISquareUnit> buildSquareUnitsColorBlock(final IPiece.ISquareUnit squareUnit, final int x, final int y, final Set<IPiece.ISquareUnit> block){
        Set<IPiece.ISquareUnit> localBlock = new HashSet<>(block);
        localBlock.add(new Piece.SquareUnit(x, y, squareUnit.getColor()));

        IPiece.ISquareUnit left = null;
        if(x > 0 && this.squareUnitsBoard[y][x - 1] != null && this.squareUnitsBoard[y][x - 1].getColor() == squareUnit.getColor())
            left = new Piece.SquareUnit(x - 1, y, this.squareUnitsBoard[y][x - 1].getColor());

        IPiece.ISquareUnit top = null;
        if(squareUnit.getY() > 0 && this.squareUnitsBoard[y - 1][x] != null && this.squareUnitsBoard[y - 1][x].getColor() == squareUnit.getColor())
            top = new Piece.SquareUnit(x, y - 1, this.squareUnitsBoard[y - 1][x].getColor());

        IPiece.ISquareUnit right = null;
        if(squareUnit.getX() < COLUMNS - 1 && this.squareUnitsBoard[y][x + 1] != null && this.squareUnitsBoard[y][x + 1].getColor() == squareUnit.getColor())
            right = new Piece.SquareUnit(x + 1, y, this.squareUnitsBoard[y][x + 1].getColor());

        IPiece.ISquareUnit bottom = null;
        if(squareUnit.getY() < ROWS - 1 && this.squareUnitsBoard[y + 1][x] != null && this.squareUnitsBoard[y + 1][x].getColor() == squareUnit.getColor())
            bottom = new Piece.SquareUnit(x, y + 1, this.squareUnitsBoard[y + 1][x].getColor());

        if(left != null && !localBlock.contains(left))
            localBlock.addAll(this.buildSquareUnitsColorBlock(left, x - 1, y, localBlock));

        if(top != null && !localBlock.contains(top))
            localBlock.addAll(this.buildSquareUnitsColorBlock(top, x, y - 1, localBlock));

        if(right != null && !localBlock.contains(right))
            localBlock.addAll(this.buildSquareUnitsColorBlock(right, x + 1, y, localBlock));

        if(bottom != null && !localBlock.contains(bottom))
            localBlock.addAll(this.buildSquareUnitsColorBlock(bottom, x, y + 1, localBlock));

        return Collections.unmodifiableSet(localBlock);
    }

    private int sweepBlocks(final int chain) {
        int localChain = chain;
        Set<IPiece.ISquareUnit> checkedSquareUnits = new HashSet<>();
        for(int i = ROWS - 1; i >= 0; i--){
            for(int j = 0; j < COLUMNS; j++){
                if(this.squareUnitsBoard[i][j] != null) {
                    IPiece.ISquareUnit squareUnit = new Piece.SquareUnit(j, i, this.squareUnitsBoard[i][j].getColor());
                    if (!checkedSquareUnits.contains(squareUnit)) {
                        Set<IPiece.ISquareUnit> block = this.buildSquareUnitsColorBlock(squareUnit, j, i, new HashSet<>());
                        checkedSquareUnits.addAll(block);
                        int size = block.size();
                        if (size >= MIN_BLOCK_SIZE) {
                            this.sweepBlock(block);
                            localChain++;
                            notifyScored(size, localChain);
                        }
                    }
                }
            }
        }
        return localChain;
    }

    private void sweepBlock(final Set<IPiece.ISquareUnit> block) {
        for (IPiece.ISquareUnit squareUnit : block) {
            int x = squareUnit.getX();
            int y = squareUnit.getY();
            this.unlinkSquareUnit(x, y);
            this.squareUnitsBoard[y][x] = null;
        }
    }

    private void unlinkSquareUnit(final int x, final int y) {
        Piece.LinkedSquareUnit linkedSquareUnit = (Piece.LinkedSquareUnit) this.squareUnitsBoard[y][x];

        if(linkedSquareUnit.getLeftSquareUnit() != null)
            linkedSquareUnit.getLeftSquareUnit().unlinkRightSquareUnit();

        if(linkedSquareUnit.getTopSquareUnit() != null)
            linkedSquareUnit.getTopSquareUnit().unlinkBottomSquareUnit();

        if(linkedSquareUnit.getRightSquareUnit() != null)
            linkedSquareUnit.getRightSquareUnit().unlinkLeftSquareUnit();

        if(linkedSquareUnit.getBottomSquareUnit() != null)
            linkedSquareUnit.getBottomSquareUnit().unlinkTopSquareUnit();

        linkedSquareUnit.unlinkAllSquareUnits();
    }

    private boolean isGameOver() {
        for(int i = HIDDEN_ROWS - 1; i >= 0; i--){
            int columns = this.squareUnitsBoard[i].length;
            for(int j = 0; j < columns; j++){
                if(this.squareUnitsBoard[i][j] != null)
                    return true;
            }
        }
        return false;
    }

    private void notifyPieceRotated(){
        for (Listener listener : this.listeners) {
            listener.pieceRotated();
        }
    }

    private void notifyPieceMoved(){
        for (Listener listener : this.listeners) {
            listener.pieceMoved();
        }
    }

    private void notifyPieceReleased(){
        for (Listener listener : this.listeners) {
            listener.pieceReleased();
        }
    }

    private void notifyBoardRearranged(){
        for (Listener listener : this.listeners) {
            listener.rearranged();
        }
    }

    private void notifyBoardIdleState(){
        for (Listener listener : this.listeners) {
            listener.idleState();
        }
    }

    private void notifyScored(final int points, final int chain) {
        for (Listener listener : this.listeners) {
            listener.scored(points, chain);
        }
    }

    private void notifyGameOver() {
        for (Listener listener : this.listeners) {
            listener.gameOver();
        }
    }
}
