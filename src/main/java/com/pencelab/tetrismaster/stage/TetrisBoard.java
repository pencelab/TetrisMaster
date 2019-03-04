package com.pencelab.tetrismaster.stage;

import com.pencelab.tetrismaster.pieces.IPiece;
import com.pencelab.tetrismaster.pieces.IPiece.ISquareUnit;
import com.pencelab.tetrismaster.pieces.Pipe;

import java.util.*;
import java.util.concurrent.TimeUnit;

public final class TetrisBoard implements IBoard {

    public static final int COLUMNS = 10;
    public static final int ROWS = 24;
    private static final int HIDDEN_ROWS = 4;

    private static final int REARRANGE_WAIT_TIME_BETWEEN_STEPS_IN_MILLISECOND = 100;

    private IPiece piece = null;

    private final ISquareUnit[][] squareUnitsBoard;

    private final List<Listener> listeners = new ArrayList<>();

    public TetrisBoard(final ISquareUnit[][] squareUnitsBoard) {
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
                Set<Integer> rows = this.getAffectedRows();
                this.releasePiece();
                this.notifyPieceReleased();
                Set<Integer> fullRows = this.getFullRows(rows);
                if(!fullRows.isEmpty()) {
                    this.sweepRows(fullRows);
                    this.notifyScored(fullRows.size());
                    this.rearrangeRows();
                }

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
    public ISquareUnit[][] getSquareUnits() {
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
        ISquareUnit[] squareUnits = piece.getSquareUnits();
        for (ISquareUnit squareUnit : squareUnits) {
            if(squareUnit.getX() < 0 || squareUnit.getX() >= COLUMNS || squareUnit.getY() < 0 || squareUnit.getY() >= ROWS)
                return true;
        }
        return false;
    }

    private boolean collisionDetected(final IPiece piece) {
        ISquareUnit[] squareUnits = piece.getSquareUnits();
        for (ISquareUnit squareUnit : squareUnits) {
            if(this.squareUnitsBoard[squareUnit.getY()][squareUnit.getX()] != null)
                return true;
        }
        return false;
    }

    private Set<Integer> getAffectedRows(){
        Set<Integer> rows = new HashSet<>();
        IPiece.ISquareUnit[] squareUnits = this.piece.getSquareUnits();
        for (IPiece.ISquareUnit squareUnit : squareUnits) {
            rows.add(squareUnit.getY());
        }
        return Collections.unmodifiableSet(rows);
    }

    private void releasePiece(){
        ISquareUnit[] squareUnits = this.piece.getSquareUnits();
        for (ISquareUnit squareUnit : squareUnits) {
            this.squareUnitsBoard[squareUnit.getY()][squareUnit.getX()] = squareUnit;
        }
        this.piece = null;
    }

    private Set<Integer> getFullRows(final Set<Integer> rows) {
        Set<Integer> fullRows = new HashSet<>();
        for (Integer row : rows) {
            boolean fullRow = true;
            int columns = this.squareUnitsBoard[row].length;
            for(int i = 0; i < columns && fullRow; i++){
                if(this.squareUnitsBoard[row][i] == null)
                    fullRow = false;
            }
            if(fullRow)
                fullRows.add(row);
        }
        return Collections.unmodifiableSet(fullRows);
    }

    private void sweepRows(final Set<Integer> rows) {
        for (int row : rows) {
            int columns = this.squareUnitsBoard[row].length;
            for (int i = 0; i < columns; i++) {
                this.squareUnitsBoard[row][i] = null;
            }
        }
    }

    private void rearrangeRows() {
        boolean moved;
        do {
            moved = false;
            int maxEmptyRow = -1;

            for (int i = ROWS - 1; i >= 0; i--) {
                if(this.isRowEmpty(i)) {
                    maxEmptyRow = i;
                    break;
                }
            }

            Set<Integer> rowsToMoveDown = new HashSet<>();

            for (int i = maxEmptyRow - 1; i >= 0; i--) {
                if(!this.isRowEmpty(i))
                    rowsToMoveDown.add(i);
            }

            if(!rowsToMoveDown.isEmpty()) {
                this.moveRows(rowsToMoveDown);
                moved = true;
                this.notifyBoardRearranged();

                try {
                    TimeUnit.MILLISECONDS.sleep(REARRANGE_WAIT_TIME_BETWEEN_STEPS_IN_MILLISECOND);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }while(moved);
    }

    private void moveRows(final Set<Integer> rowsToMoveDown){
        List<Integer> sortedRows = new ArrayList<>(rowsToMoveDown);
        sortedRows.sort(Collections.reverseOrder());
        for (Integer row : sortedRows)
            this.moveRowDown(row);
    }

    private void moveRowDown(final int row) {
        int columns = this.squareUnitsBoard[row].length;
        for(int i = 0; i < columns; i++){
            if(this.squareUnitsBoard[row][i] != null) {
                this.squareUnitsBoard[row + 1][i] = this.squareUnitsBoard[row][i];
                this.squareUnitsBoard[row][i] = null;
            }
        }
    }

    private boolean isRowEmpty(final int row){
        int columns = this.squareUnitsBoard[row].length;
        for(int i = 0; i < columns; i++){
            if(this.squareUnitsBoard[row][i] != null)
                return false;
        }

        return true;
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

    private void notifyScored(final int points) {
        for (Listener listener : this.listeners) {
            listener.scored(points);
        }
    }

    private void notifyGameOver() {
        for (Listener listener : this.listeners) {
            listener.gameOver();
        }
    }
}
