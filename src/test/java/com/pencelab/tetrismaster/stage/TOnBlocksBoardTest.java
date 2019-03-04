package com.pencelab.tetrismaster.stage;

import com.pencelab.tetrismaster.common.Globals;
import com.pencelab.tetrismaster.pieces.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.powermock.reflect.Whitebox;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class TOnBlocksBoardTest extends PieceOnBlocksBoardTest {

    @Test
    public void useCase01(){
        this.assertRearrangeUseCaseFromFile("/blocks/t/01");
    }

    @Test
    public void useCase02(){
        IPiece squareOne = new Square.Builder().withCoordinatesXY(4, 22).build();
        IBoard actualBoard = new BlocksBoard(new IPiece.ISquareUnit[BlocksBoard.ROWS][BlocksBoard.COLUMNS]);
        actualBoard.setPiece(squareOne);
        actualBoard.moveDown();
        IPiece z = new ZR.Builder().withCoordinatesXY(4, 19).build();
        actualBoard.setPiece(z);
        actualBoard.moveDown();
        IPiece squareTwo = new Square.Builder().withCoordinatesXY(6, 22).build();
        actualBoard.setPiece(squareTwo);
        actualBoard.moveDown();

        IBoard expectedBoard = new BlocksBoard(new IPiece.ISquareUnit[BlocksBoard.ROWS][BlocksBoard.COLUMNS]);
        IPiece zExpected = new ZR.Builder().withCoordinatesXY(4, 19).build();
        expectedBoard.setPiece(zExpected);
        expectedBoard.drop();

        this.assertSquareUnitsMapAreEqual(actualBoard.getSquareUnits(), expectedBoard.getSquareUnits());

        //this.assertRearrangeUseCaseFromFile("/blocks/t/02");
    }



}
