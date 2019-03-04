package com.pencelab.tetrismaster.stage;

import com.pencelab.tetrismaster.pieces.IPiece;
import com.pencelab.tetrismaster.pieces.Piece;
import com.pencelab.tetrismaster.testing.Utils;
import org.mockito.Mock;
import org.mockito.verification.VerificationMode;
import org.powermock.reflect.Whitebox;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.concurrent.Callable;

import static org.junit.Assert.*;
import static org.junit.Assert.fail;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.verify;

public class PieceOnTetrisBoardTest {

    protected TetrisBoard tetrisBoard;

    protected IPiece.ISquareUnit[][] squareUnits;

    protected Piece piece;

    @Mock
    protected Piece.SquareUnit squareUnitMock;

    @Mock
    protected IBoard.Listener listener;

    //#region Protected methods for piece movement

    protected void shouldRotatePiece(Piece actual, Piece expected){
        this.assertMovePerformed(actual, expected, () -> {
            this.tetrisBoard.rotate();
            return null;
        });
    }

    protected void shouldNotRotatePiece(Piece piece){
        this.assertMoveNotPerformed(piece, () -> {
            this.tetrisBoard.rotate();
            return null;
        });
    }

    protected void shouldNotifyPieceRotatedListenerWhenPieceRotationExecuted(Piece piece){
        this.tetrisBoard.addListener(this.listener);
        this.tetrisBoard.setPiece(piece);
        this.tetrisBoard.rotate();
        verify(this.listener, times(1)).pieceRotated();
    }

    protected void shouldNotifyPieceMovedListenerWhenPieceMoveExecuted(Piece piece, Callable<Void> moveAction){
        this.tetrisBoard.addListener(this.listener);
        this.tetrisBoard.setPiece(piece);

        try {
            moveAction.call();
        } catch (Exception e) {
            e.printStackTrace();
        }

        verify(this.listener, times(1)).pieceMoved();
    }

    protected void shouldMovePieceToLeft(Piece actual, Piece expected){
        this.assertMovePerformed(actual, expected, () -> {
            this.tetrisBoard.moveLeft();
            return null;
        });
    }

    protected void shouldNotMovePieceToLeft(Piece piece){
        this.assertMoveNotPerformed(piece, () -> {
            this.tetrisBoard.moveLeft();
            return null;
        });
    }

    protected void shouldMovePieceToRight(Piece actual, Piece expected){
        this.assertMovePerformed(actual, expected, () -> {
            this.tetrisBoard.moveRight();
            return null;
        });
    }

    protected void shouldNotMovePieceToRight(Piece piece) {
        this.assertMoveNotPerformed(piece, () -> {
            this.tetrisBoard.moveRight();
            return null;
        });
    }

    protected void shouldMovePieceDown(Piece actual, Piece expected){
        this.assertMovePerformed(actual, expected, () -> {
            this.tetrisBoard.moveDown();
            return null;
        });
    }

    protected void shouldReleasePieceWhenMovingDown(Piece actual){
        this.tetrisBoard.setPiece(actual);
        this.tetrisBoard.moveDown();
        Piece privatePiece = Whitebox.getInternalState(this.tetrisBoard, "piece");
        assertNull(privatePiece);
    }

    protected void assertMovePerformed(Piece actual, Piece expected, Callable<Void> action){
        this.tetrisBoard.setPiece(actual);

        try {
            if(action != null)
                action.call();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Piece privatePiece = Whitebox.getInternalState(this.tetrisBoard, "piece");
        assertNotEquals(actual, privatePiece);

        IPiece.ISquareUnit[] expectedSquareUnits = expected.getSquareUnits();
        IPiece.ISquareUnit[] privateSquareUnits = privatePiece.getSquareUnits();

        for (int i = 0; i < expectedSquareUnits.length; i++) {
            assertEquals(expectedSquareUnits[i], privateSquareUnits[i]);
        }
    }

    protected void assertMoveNotPerformed(Piece piece, Callable<Void> action){
        this.tetrisBoard.setPiece(piece);

        try {
            if(action != null)
                action.call();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Piece privatePiece = Whitebox.getInternalState(this.tetrisBoard, "piece");
        assertEquals(piece, privatePiece);
    }

    protected void loadBoardAndPieceFromFile(String filename){
        BufferedReader in = Utils.openFile(this.getClass(), filename);
        try {
            int width = Integer.parseInt(Utils.readLine(in));
            int height = Integer.parseInt(Utils.readLine(in));
            this.squareUnits = Utils.setupSquareUnits(width, height, in, this.squareUnitMock);
            this.tetrisBoard = new TetrisBoard(this.squareUnits);
            this.piece = Utils.setupPiece(in);
        } catch (IOException e) {
            e.printStackTrace();
            fail();
        } finally {
            try {
                Utils.closeFile(in);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //endregion

    //#region Protected methods for piece released

    protected void assertSquareUnitsMapAreEqual(IPiece.ISquareUnit[][] actual, IPiece.ISquareUnit[][] expected){
        int height = actual.length;
        int width = actual[0].length;

        assertEquals(height, expected.length);
        assertEquals(width, expected[0].length);

        for(int j = 0; j < height; j++){
            for(int i = 0; i < width; i++){
                if(expected[j][i] == null)
                    assertNull(actual[j][i]);
                else
                    assertNotNull(expected[j][i]);
            }
        }
    }

    protected void assertRearrangeUseCaseFromFile(String filename){
        BufferedReader in = Utils.openFile(this.getClass(), filename);
        try {
            int width = Integer.parseInt(Utils.readLine(in));
            int height = Integer.parseInt(Utils.readLine(in));
            this.squareUnits = Utils.setupSquareUnits(width, height, in, this.squareUnitMock);
            this.tetrisBoard = new TetrisBoard(this.squareUnits);
            this.piece = Utils.setupPiece(in);
            Integer.parseInt(Utils.readLine(in));//Needed to skip points line
            IPiece.ISquareUnit[][] expectedSquareUnits = Utils.setupSquareUnits(width, height, in, this.squareUnitMock);
            this.tetrisBoard.setPiece(this.piece);
            this.tetrisBoard.moveDown();
            this.assertSquareUnitsMapAreEqual(this.squareUnits, expectedSquareUnits);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            fail();
        } finally {
            try {
                Utils.closeFile(in);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    protected void verifyScoreNotificationUseCaseFromFile(String filename) {
        BufferedReader in = Utils.openFile(this.getClass(), filename);
        try {
            int width = Integer.parseInt(Utils.readLine(in));
            int height = Integer.parseInt(Utils.readLine(in));
            this.squareUnits = Utils.setupSquareUnits(width, height, in, this.squareUnitMock);
            this.tetrisBoard = new TetrisBoard(this.squareUnits);
            this.piece = Utils.setupPiece(in);
            int points = Integer.parseInt(Utils.readLine(in));
            this.tetrisBoard.setPiece(this.piece);
            this.tetrisBoard.addListener(this.listener);
            this.tetrisBoard.moveDown();

            if(points > 0)
                verify(this.listener, times(1)).scored(points);
            else
                verify(this.listener, never()).scored(anyInt());

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            fail();
        } finally {
            try {
                Utils.closeFile(in);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    protected void verifyPieceReleasedNotificationUseCaseFromFile(String filename, VerificationMode mode) {
        BufferedReader in = Utils.openFile(this.getClass(), filename);
        try {
            int width = Integer.parseInt(Utils.readLine(in));
            int height = Integer.parseInt(Utils.readLine(in));
            this.squareUnits = Utils.setupSquareUnits(width, height, in, this.squareUnitMock);
            this.tetrisBoard = new TetrisBoard(this.squareUnits);
            this.piece = Utils.setupPiece(in);
            this.tetrisBoard.setPiece(this.piece);
            this.tetrisBoard.addListener(this.listener);
            this.tetrisBoard.moveDown();
            verify(this.listener, mode).pieceReleased();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            fail();
        } finally {
            try {
                Utils.closeFile(in);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    protected void verifyGameOverNotificationUseCaseFromFile(String filename, VerificationMode mode) {
        BufferedReader in = Utils.openFile(this.getClass(), filename);
        try {
            int width = Integer.parseInt(Utils.readLine(in));
            int height = Integer.parseInt(Utils.readLine(in));
            this.squareUnits = Utils.setupSquareUnits(width, height, in, this.squareUnitMock);
            this.tetrisBoard = new TetrisBoard(this.squareUnits);
            this.piece = Utils.setupPiece(in);
            this.tetrisBoard.setPiece(this.piece);
            this.tetrisBoard.addListener(this.listener);
            this.tetrisBoard.moveDown();
            verify(this.listener, mode).gameOver();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            fail();
        } finally {
            try {
                Utils.closeFile(in);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //endregion

}
