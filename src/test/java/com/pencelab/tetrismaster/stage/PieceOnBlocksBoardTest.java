package com.pencelab.tetrismaster.stage;

import com.pencelab.tetrismaster.pieces.IPiece;
import com.pencelab.tetrismaster.pieces.Piece;
import com.pencelab.tetrismaster.testing.Utils;
import org.mockito.Mock;

import java.io.BufferedReader;
import java.io.IOException;

import static org.junit.Assert.*;

public class PieceOnBlocksBoardTest {

    protected BlocksBoard blocksBoard;

    protected IPiece.ISquareUnit[][] squareUnits;

    protected Piece piece;

    @Mock
    protected IBoard.Listener listener;

    protected void loadBoardAndPieceFromFile(String filename){
        BufferedReader in = Utils.openFile(this.getClass(), filename);
        try {
            int width = Integer.parseInt(Utils.readLine(in));
            int height = Integer.parseInt(Utils.readLine(in));
            this.squareUnits = Utils.setupSquareUnits(width, height, in);
            this.blocksBoard = new BlocksBoard(this.squareUnits);
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

    protected void assertSquareUnitsMapAreEqual(IPiece.ISquareUnit[][] actual, IPiece.ISquareUnit[][] expected){
        int height = actual.length;
        int width = actual[0].length;

        assertEquals(height, expected.length);
        assertEquals(width, expected[0].length);

        for(int j = 0; j < height; j++){
            for(int i = 0; i < width; i++){
                if(expected[j][i] == null)
                    assertNull(actual[j][i]);
                else {
                    assertEquals(expected[j][i], actual[j][i]);
                    //assertNotNull(expected[j][i]);
                }
            }
        }
    }

    protected void assertRearrangeUseCaseFromFile(String filename){
        BufferedReader in = Utils.openFile(this.getClass(), filename);
        try {
            int width = Integer.parseInt(Utils.readLine(in));
            int height = Integer.parseInt(Utils.readLine(in));
            this.squareUnits = Utils.setupSquareUnits(width, height, in);
            this.blocksBoard = new BlocksBoard(this.squareUnits);
            this.piece = Utils.setupPiece(in);
            Integer.parseInt(Utils.readLine(in));//Needed to skip points line
            IPiece.ISquareUnit[][] expectedSquareUnits = Utils.setupSquareUnits(width, height, in);
            this.blocksBoard.setPiece(this.piece);
            this.blocksBoard.moveDown();
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

}
