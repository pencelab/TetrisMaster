package com.pencelab.tetrismaster.stage;

import com.pencelab.tetrismaster.pieces.Piece;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.powermock.reflect.Whitebox;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ZROnTetrisBoardTest extends PieceOnTetrisBoardTest {

    //#region Test: Position allowed

    //Test positioning allowed in position 0
    @Test
    public void shouldPositionPieceInInitialPosition(){
        this.loadBoardAndPieceFromFile("/tetris/zr/position/allowed/pos_00");
        this.tetrisBoard.setPiece(this.piece);
        Piece privatePiece = Whitebox.getInternalState(this.tetrisBoard, "piece");
        assertEquals(this.piece, privatePiece);
    }

    //Test positioning allowed in position 0
    @Test
    public void shouldPositionPieceInPositionOne(){
        this.loadBoardAndPieceFromFile("/tetris/zr/position/allowed/pos_01");
        this.tetrisBoard.setPiece(this.piece);
        Piece privatePiece = Whitebox.getInternalState(this.tetrisBoard, "piece");
        assertEquals(this.piece, privatePiece);
    }

    //Test positioning allowed in position 0
    @Test
    public void shouldPositionPieceInPositionTwo(){
        this.loadBoardAndPieceFromFile("/tetris/zr/position/allowed/pos_02");
        this.tetrisBoard.setPiece(this.piece);
        Piece privatePiece = Whitebox.getInternalState(this.tetrisBoard, "piece");
        assertEquals(this.piece, privatePiece);
    }

    //Test positioning allowed in position 0
    @Test
    public void shouldPositionPieceInPositionThree(){
        this.loadBoardAndPieceFromFile("/tetris/zr/position/allowed/pos_03");
        this.tetrisBoard.setPiece(this.piece);
        Piece privatePiece = Whitebox.getInternalState(this.tetrisBoard, "piece");
        assertEquals(this.piece, privatePiece);
    }

    //Test positioning allowed in position 0 after one rotation cycle
    @Test
    public void shouldPositionPieceInInitialPositionAfterOneRotationCycle(){
        this.loadBoardAndPieceFromFile("/tetris/zr/position/allowed/pos_10");
        this.tetrisBoard.setPiece(this.piece);
        Piece privatePiece = Whitebox.getInternalState(this.tetrisBoard, "piece");
        assertEquals(this.piece, privatePiece);
    }

    //#endregion

    //#region Test: IllegalArgumentException thrown because of piece set on an occupied field

    //Test IllegalArgumentException thrown because of piece set on an occupied field in position 0
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInInitialPositionOnAnOccupiedField(){
        this.loadBoardAndPieceFromFile("/tetris/zr/position/occupiedfield/pos_00");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set on an occupied field in position 1
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInPositionOneOnAnOccupiedField(){
        this.loadBoardAndPieceFromFile("/tetris/zr/position/occupiedfield/pos_01");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set on an occupied field in position 2
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInPositionTwoOnAnOccupiedField(){
        this.loadBoardAndPieceFromFile("/tetris/zr/position/occupiedfield/pos_02");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set on an occupied field in position 3
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInPositionThreeOnAnOccupiedField(){
        this.loadBoardAndPieceFromFile("/tetris/zr/position/occupiedfield/pos_03");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set on an occupied field in position 0 after one rotation cycle
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInInitialPositionAfterOneRotationCycleOnAnOccupiedField(){
        this.loadBoardAndPieceFromFile("/tetris/zr/position/occupiedfield/pos_10");
        this.tetrisBoard.setPiece(this.piece);
    }

    //#endregion

    //#region Test: IllegalArgumentException thrown because of piece set out of boundaries on the top

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 0
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInInitialPositionOutOfBoundariesOnTheTop(){
        this.loadBoardAndPieceFromFile("/tetris/zr/position/outofbounds/top/pos_00");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 1
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInPositionOneOutOfBoundariesOnTheTop(){
        this.loadBoardAndPieceFromFile("/tetris/zr/position/outofbounds/top/pos_01");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 2
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInPositionTwoOutOfBoundariesOnTheTop(){
        this.loadBoardAndPieceFromFile("/tetris/zr/position/outofbounds/top/pos_02");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 3
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInPositionThreeOutOfBoundariesOnTheTop(){
        this.loadBoardAndPieceFromFile("/tetris/zr/position/outofbounds/top/pos_03");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 0 after one rotation cycle
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInInitialPositionAfterOneRotationCycleOutOfBoundariesOnTheTop(){
        this.loadBoardAndPieceFromFile("/tetris/zr/position/outofbounds/top/pos_10");
        this.tetrisBoard.setPiece(this.piece);
    }

    //#endregion

    //#region Test: IllegalArgumentException thrown because of piece set out of boundaries on the left

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 0
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInInitialPositionOutOfBoundariesOnTheLeft(){
        this.loadBoardAndPieceFromFile("/tetris/zr/position/outofbounds/left/pos_00");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 1
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInPositionOneOutOfBoundariesOnTheLeft(){
        this.loadBoardAndPieceFromFile("/tetris/zr/position/outofbounds/left/pos_01");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 2
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInPositionTwoOutOfBoundariesOnTheLeft(){
        this.loadBoardAndPieceFromFile("/tetris/zr/position/outofbounds/left/pos_02");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 3
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInPositionThreeOutOfBoundariesOnTheLeft(){
        this.loadBoardAndPieceFromFile("/tetris/zr/position/outofbounds/left/pos_03");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 0 after one rotation cycle
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInInitialPositionAfterOneRotationCycleOutOfBoundariesOnTheLeft(){
        this.loadBoardAndPieceFromFile("/tetris/zr/position/outofbounds/left/pos_10");
        this.tetrisBoard.setPiece(this.piece);
    }

    //#endregion

    //#region Test: IllegalArgumentException thrown because of piece set out of boundaries on the right

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 0
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInInitialPositionOutOfBoundariesOnTheRight(){
        this.loadBoardAndPieceFromFile("/tetris/zr/position/outofbounds/right/pos_00");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 1
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInPositionOneOutOfBoundariesOnTheRight(){
        this.loadBoardAndPieceFromFile("/tetris/zr/position/outofbounds/right/pos_01");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 2
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInPositionTwoOutOfBoundariesOnTheRight(){
        this.loadBoardAndPieceFromFile("/tetris/zr/position/outofbounds/right/pos_02");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 3
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInPositionThreeOutOfBoundariesOnTheRight(){
        this.loadBoardAndPieceFromFile("/tetris/zr/position/outofbounds/right/pos_03");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 0 after one rotation cycle
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInInitialPositionAfterOneRotationCycleOutOfBoundariesOnTheRight(){
        this.loadBoardAndPieceFromFile("/tetris/zr/position/outofbounds/right/pos_10");
        this.tetrisBoard.setPiece(this.piece);
    }

    //#endregion

    //#region Test: IllegalArgumentException thrown because of piece set out of boundaries on the bottom

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 0
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInInitialPositionOutOfBoundariesOnTheBottom(){
        this.loadBoardAndPieceFromFile("/tetris/zr/position/outofbounds/bottom/pos_00");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 1
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInPositionOneOutOfBoundariesOnTheBottom(){
        this.loadBoardAndPieceFromFile("/tetris/zr/position/outofbounds/bottom/pos_01");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 2
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInPositionTwoOutOfBoundariesOnTheBottom(){
        this.loadBoardAndPieceFromFile("/tetris/zr/position/outofbounds/bottom/pos_02");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 3
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInPositionThreeOutOfBoundariesOnTheBottom(){
        this.loadBoardAndPieceFromFile("/tetris/zr/position/outofbounds/bottom/pos_03");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 0 after one rotation cycle
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInInitialPositionAfterOneRotationCycleOutOfBoundariesOnTheBottom(){
        this.loadBoardAndPieceFromFile("/tetris/zr/position/outofbounds/bottom/pos_10");
        this.tetrisBoard.setPiece(this.piece);
    }

    //#endregion

    //region Test: Rotation allowed

    //Test rotation allowed in position 0
    @Test
    public void shouldRotatePieceToPositionOne(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/rotation/allowed/pos_00");
        this.shouldRotatePiece(this.piece, this.piece.rotate());
    }

    //Test rotation allowed in position 1
    @Test
    public void shouldRotatePieceToPositionTwo(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/rotation/allowed/pos_01");
        this.shouldRotatePiece(this.piece, this.piece.rotate());
    }

    //Test rotation allowed in position 2
    @Test
    public void shouldRotatePieceToPositionThree(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/rotation/allowed/pos_02");
        this.shouldRotatePiece(this.piece, this.piece.rotate());
    }

    //Test rotation allowed in position 3
    @Test
    public void shouldRotatePieceToInitialPosition(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/rotation/allowed/pos_03");
        this.shouldRotatePiece(this.piece, this.piece.rotate());
    }

    //Test rotation allowed in position 0 after one rotation cycle
    @Test
    public void shouldRotatePieceToPositionOneAfterOneRotationCycle(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/rotation/allowed/pos_10");
        this.shouldRotatePiece(this.piece, this.piece.rotate());
    }

    //endregion

    //region Test: Rotation not allowed because of boundary

    //Test rotation not allowed in position 0
    @Test
    public void shouldNotRotatePieceToPositionOneBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/rotation/boundary/pos_00");
        this.shouldNotRotatePiece(this.piece);
    }

    //Test rotation not allowed in position 2
    @Test
    public void shouldNotRotatePieceToPositionThreeBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/rotation/boundary/pos_02");
        this.shouldNotRotatePiece(this.piece);
    }

    //Test rotation not allowed in position 0 after one rotation cycle
    @Test
    public void shouldNotRotatePieceToPositionOneAfterOneRotationCycleBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/rotation/boundary/pos_10");
        this.shouldNotRotatePiece(this.piece);
    }

    //endregion

    //region Test: Rotation not allowed because of obstacle

    //Test rotation not allowed in position 0
    @Test
    public void shouldNotRotatePieceToPositionOneBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/rotation/obstacle/pos_00");
        this.shouldNotRotatePiece(this.piece);
    }

    //Test rotation not allowed in position 1
    @Test
    public void shouldNotRotatePieceToPositionTwoBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/rotation/obstacle/pos_01");
        this.shouldNotRotatePiece(this.piece);
    }

    //Test rotation not allowed in position 2
    @Test
    public void shouldNotRotatePieceToPositionThreeBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/rotation/obstacle/pos_02");
        this.shouldNotRotatePiece(this.piece);
    }

    //Test rotation not allowed in position 3
    @Test
    public void shouldNotRotatePieceToInitialPositionBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/rotation/obstacle/pos_03");
        this.shouldNotRotatePiece(this.piece);
    }

    //Test rotation not allowed in position 0 after one rotation cycle
    @Test
    public void shouldNotRotatePieceToPositionOneAfterOneRotationCycleBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/rotation/obstacle/pos_10");
        this.shouldNotRotatePiece(this.piece);
    }

    //endregion

    //#region Test: Moving to left allowed

    //Test moveLeft allowed in position 0
    @Test
    public void shouldMovePieceToLeftInInitialPosition(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/left/allowed/pos_00");
        this.shouldMovePieceToLeft(this.piece, this.piece.moveLeft());
    }

    //Test moveLeft allowed in position 1
    @Test
    public void shouldMovePieceToLeftInPositionOne(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/left/allowed/pos_01");
        this.shouldMovePieceToLeft(this.piece, this.piece.moveLeft());
    }

    //Test moveLeft allowed in position 2
    @Test
    public void shouldMovePieceToLeftInPositionTwo(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/left/allowed/pos_02");
        this.shouldMovePieceToLeft(this.piece, this.piece.moveLeft());
    }

    //Test moveLeft allowed in position 3
    @Test
    public void shouldMovePieceToLeftInPositionThree(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/left/allowed/pos_03");
        this.shouldMovePieceToLeft(this.piece, this.piece.moveLeft());
    }

    //Test moveLeft allowed in position 0 after one rotation cycle
    @Test
    public void shouldMovePieceToLeftAfterOneRotationCycle(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/left/allowed/pos_10");
        this.shouldMovePieceToLeft(this.piece, this.piece.moveLeft());
    }

    //endregion

    //#region Test: Moving to left not allowed because of boundary

    //Test moveLeft not allowed in position 0
    @Test
    public void shouldNotMovePieceToLeftInInitialPositionBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/left/boundary/pos_00");
        this.shouldNotMovePieceToLeft(this.piece);
    }

    //Test moveLeft not allowed in position 1
    @Test
    public void shouldNotMovePieceToLeftInPositionOneBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/left/boundary/pos_01");
        this.shouldNotMovePieceToLeft(this.piece);
    }

    //Test moveLeft not allowed in position 2
    @Test
    public void shouldNotMovePieceToLeftInPositionTwoBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/left/boundary/pos_02");
        this.shouldNotMovePieceToLeft(this.piece);
    }

    //Test moveLeft not allowed in position 3
    @Test
    public void shouldNotMovePieceToLeftInPositionThreeBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/left/boundary/pos_03");
        this.shouldNotMovePieceToLeft(this.piece);
    }

    //Test moveLeft not allowed in position 0 after one rotation cycle
    @Test
    public void shouldNotMovePieceToLeftInInitialPositionAfterOneRotationCycleBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/left/boundary/pos_10");
        this.shouldNotMovePieceToLeft(this.piece);
    }

    //endregion

    //#region Test: Moving to left not allowed because of obstacle

    //Test moveLeft not allowed in position 0
    @Test
    public void shouldNotMovePieceToLeftInInitialPositionBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/left/obstacle/pos_00");
        this.shouldNotMovePieceToLeft(this.piece);
    }

    //Test moveLeft not allowed in position 1
    @Test
    public void shouldNotMovePieceToLeftInPositionOneBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/left/obstacle/pos_01");
        this.shouldNotMovePieceToLeft(this.piece);
    }

    //Test moveLeft not allowed in position 2
    @Test
    public void shouldNotMovePieceToLeftInPositionTwoBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/left/obstacle/pos_02");
        this.shouldNotMovePieceToLeft(this.piece);
    }

    //Test moveLeft not allowed in position 3
    @Test
    public void shouldNotMovePieceToLeftInPositionThreeBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/left/obstacle/pos_03");
        this.shouldNotMovePieceToLeft(this.piece);
    }

    //Test moveLeft not allowed in position 0 after one rotation cycle
    @Test
    public void shouldNotMovePieceToLeftInInitialPositionAfterOneRotationCycleBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/left/obstacle/pos_10");
        this.shouldNotMovePieceToLeft(this.piece);
    }

    //endregion

    //#region Test: Moving to right allowed

    //Test moveRight allowed in position 0
    @Test
    public void shouldMovePieceToRightPositionInInitialPosition(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/right/allowed/pos_00");
        this.shouldMovePieceToRight(this.piece, this.piece.moveRight());
    }

    //Test moveRight allowed in position 1
    @Test
    public void shouldMovePieceToRightPositionInPositionOne(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/right/allowed/pos_01");
        this.shouldMovePieceToRight(this.piece, this.piece.moveRight());
    }

    //Test moveRight allowed in position 2
    @Test
    public void shouldMovePieceToRightPositionInPositionTwo(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/right/allowed/pos_02");
        this.shouldMovePieceToRight(this.piece, this.piece.moveRight());
    }

    //Test moveRight allowed in position 3
    @Test
    public void shouldMovePieceToRightPositionInPositionThree(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/right/allowed/pos_03");
        this.shouldMovePieceToRight(this.piece, this.piece.moveRight());
    }

    //Test moveRight allowed in position 0 after one rotation cycle
    @Test
    public void shouldMovePieceToRightPositionAfterOneRotationCycle(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/right/allowed/pos_10");
        this.shouldMovePieceToRight(this.piece, this.piece.moveRight());
    }

    //endregion

    //#region Test: Moving to right not allowed because of boundary

    //Test moveRight not allowed in position 0
    @Test
    public void shouldNotMovePieceToRightInInitialPositionBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/right/boundary/pos_00");
        this.shouldNotMovePieceToRight(this.piece);
    }

    //Test moveRight not allowed in position 1
    @Test
    public void shouldNotMovePieceToRightInPositionOneBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/right/boundary/pos_01");
        this.shouldNotMovePieceToRight(this.piece);
    }

    //Test moveRight not allowed in position 2
    @Test
    public void shouldNotMovePieceToRightInPositionTwoBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/right/boundary/pos_02");
        this.shouldNotMovePieceToRight(this.piece);
    }

    //Test moveRight not allowed in position 3
    @Test
    public void shouldNotMovePieceToRightInPositionThreeBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/right/boundary/pos_03");
        this.shouldNotMovePieceToRight(this.piece);
    }

    //Test moveRight not allowed in position 0 after one rotation cycle
    @Test
    public void shouldNotMovePieceToRightInInitialPositionAfterOneRotationCycleBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/right/boundary/pos_10");
        this.shouldNotMovePieceToRight(this.piece);
    }

    //endregion

    //#region Test: Moving to right not allowed because of obstacle

    //Test moveRight not allowed in position 0
    @Test
    public void shouldNotMovePieceToRightInInitialPositionBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/right/obstacle/pos_00");
        this.shouldNotMovePieceToRight(this.piece);
    }

    //Test moveRight not allowed in position 1
    @Test
    public void shouldNotMovePieceToRightInPositionOneBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/right/obstacle/pos_01");
        this.shouldNotMovePieceToRight(this.piece);
    }

    //Test moveRight not allowed in position 2
    @Test
    public void shouldNotMovePieceToRightInPositionTwoBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/right/obstacle/pos_02");
        this.shouldNotMovePieceToRight(this.piece);
    }

    //Test moveRight not allowed in position 3
    @Test
    public void shouldNotMovePieceToRightInPositionThreeBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/right/obstacle/pos_03");
        this.shouldNotMovePieceToRight(this.piece);
    }

    //Test moveRight not allowed in position 0 after one rotation cycle
    @Test
    public void shouldNotMovePieceToRightInInitialPositionAfterOneRotationCycleBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/right/obstacle/pos_10");
        this.shouldNotMovePieceToRight(this.piece);
    }

    //endregion

    //#region Test: Moving to down allowed

    //Test moveDown allowed in position 0
    @Test
    public void shouldMovePieceDownInInitialPosition(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/down/allowed/pos_00");
        this.shouldMovePieceDown(this.piece, this.piece.moveDown());
    }

    //Test moveDown allowed in position 1
    @Test
    public void shouldMovePieceDownInPositionOne(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/down/allowed/pos_01");
        this.shouldMovePieceDown(this.piece, this.piece.moveDown());
    }

    //Test moveDown allowed in position 2
    @Test
    public void shouldMovePieceDownInPositionTwo(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/down/allowed/pos_02");
        this.shouldMovePieceDown(this.piece, this.piece.moveDown());
    }

    //Test moveDown allowed in position 3
    @Test
    public void shouldMovePieceDownInPositionThree(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/down/allowed/pos_03");
        this.shouldMovePieceDown(this.piece, this.piece.moveDown());
    }

    //Test moveDown allowed in position 0 after one rotation cycle
    @Test
    public void shouldMovePieceDownAfterOneRotationCycle(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/down/allowed/pos_10");
        this.shouldMovePieceDown(this.piece, this.piece.moveDown());
    }

    //endregion

    //#region Test: Moving to down not allowed because of boundary

    //Test moveDown allowed in position 0
    @Test
    public void shouldReleasePieceWhenMovingDownInInitialPositionBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/down/boundary/pos_00");
        this.shouldReleasePieceWhenMovingDown(this.piece);
    }

    //Test moveDown allowed in position 1
    @Test
    public void shouldReleasePieceWhenMovingDownInPositionOneBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/down/boundary/pos_01");
        this.shouldReleasePieceWhenMovingDown(this.piece);
    }

    //Test moveDown allowed in position 2
    @Test
    public void shouldReleasePieceWhenMovingDownInPositionTwoBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/down/boundary/pos_02");
        this.shouldReleasePieceWhenMovingDown(this.piece);
    }

    //Test moveDown allowed in position 3
    @Test
    public void shouldReleasePieceWhenMovingDownInPositionThreeBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/down/boundary/pos_03");
        this.shouldReleasePieceWhenMovingDown(this.piece);
    }

    //Test moveDown allowed in position 0 after one rotation cycle
    @Test
    public void shouldReleasePieceWhenMovingDownInInitialPositionAfterOneRotationCycleBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/down/boundary/pos_10");
        this.shouldReleasePieceWhenMovingDown(this.piece);
    }

    //endregion

    //#region Test: Moving to down not allowed because of obstacle

    //Test moveDown allowed in position 0
    @Test
    public void shouldReleasePieceWhenMovingDownInInitialPositionBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/down/obstacle/pos_00");
        this.shouldReleasePieceWhenMovingDown(this.piece);
    }

    //Test moveDown allowed in position 1
    @Test
    public void shouldReleasePieceWhenMovingDownInPositionOneBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/down/obstacle/pos_01");
        this.shouldReleasePieceWhenMovingDown(this.piece);
    }

    //Test moveDown allowed in position 2
    @Test
    public void shouldReleasePieceWhenMovingDownInPositionTwoBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/down/obstacle/pos_02");
        this.shouldReleasePieceWhenMovingDown(this.piece);
    }

    //Test moveDown allowed in position 3
    @Test
    public void shouldReleasePieceWhenMovingDownInPositionThreeBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/down/obstacle/pos_03");
        this.shouldReleasePieceWhenMovingDown(this.piece);
    }

    //Test moveDown allowed in position 0 after one rotation cycle
    @Test
    public void shouldReleasePieceWhenMovingDownInInitialPositionAfterOneRotationCycleBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/down/obstacle/pos_10");
        this.shouldReleasePieceWhenMovingDown(this.piece);
    }

    //endregion

    //#region Test: Rows rearranged covering 3 lines after piece released because of boundary

    //Test rows rearranged after releasePiece in position 0
    @Test
    public void shouldRearrangeBoardCoveringThreeLinesWhenReleasingPieceInInitialPositionBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/bottom/3_lines/pos_00");
    }

    //Test rows rearranged after releasePiece in position 2
    @Test
    public void shouldRearrangeBoardCoveringThreeLinesWhenReleasingPieceInPositionTwoBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/bottom/3_lines/pos_02");
    }

    //Test rows rearranged after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldRearrangeBoardCoveringThreeLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/bottom/3_lines/pos_10");
    }

    //endregion

    //#region Test: Rows rearranged covering 2 lines after piece released because of boundary

    //Test rows rearranged after releasePiece in position 1
    @Test
    public void shouldRearrangeBoardCoveringTwoLinesWhenReleasingPieceInInitialPositionBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/bottom/2_lines/pos_00");
    }

    //Test rows rearranged after releasePiece in position 1
    @Test
    public void shouldRearrangeBoardCoveringTwoLinesWhenReleasingPieceInPositionOneBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/bottom/2_lines/pos_01");
    }

    //Test rows rearranged after releasePiece in position 2
    @Test
    public void shouldRearrangeBoardCoveringTwoLinesWhenReleasingPieceInPositionTwoBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/bottom/2_lines/pos_02");
    }

    //Test rows rearranged after releasePiece in position 3
    @Test
    public void shouldRearrangeBoardCoveringTwoLinesWhenReleasingPieceInPositionThreeBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/bottom/2_lines/pos_03");
    }

    //Test rows rearranged after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldRearrangeBoardCoveringTwoLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/bottom/2_lines/pos_10");
    }

    //endregion

    //#region Test: Rows rearranged covering 1 line after piece released because of boundary

    //Test rows rearranged after releasePiece in position 0
    @Test
    public void shouldRearrangeBoardCoveringOneLineWhenReleasingPieceInInitialPositionBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/bottom/1_line/pos_00");
    }

    //Test rows rearranged after releasePiece in position 1
    @Test
    public void shouldRearrangeBoardCoveringOneLineWhenReleasingPieceInPositionOneBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/bottom/1_line/pos_01");
    }

    //Test rows rearranged after releasePiece in position 2
    @Test
    public void shouldRearrangeBoardCoveringOneLineWhenReleasingPieceInPositionTwoBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/bottom/1_line/pos_02");
    }

    //Test rows rearranged after releasePiece in position 3
    @Test
    public void shouldRearrangeBoardCoveringOneLineWhenReleasingPieceInPositionThreeBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/bottom/1_line/pos_03");
    }

    //Test rows rearranged after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldRearrangeBoardCoveringOneLineWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/bottom/1_line/pos_10");
    }

    //#endregion

    //#region Test: Rows not rearranged covering 0 lines after piece released because of boundary

    //Test rows rearranged after releasePiece in position 0
    @Test
    public void shouldNotRearrangeBoardCoveringZeroLinesWhenReleasingPieceInInitialPositionBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/bottom/0_lines/pos_00");
    }

    //Test rows rearranged after releasePiece in position 1
    @Test
    public void shouldNotRearrangeBoardCoveringZeroLinesWhenReleasingPieceInPositionOneBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/bottom/0_lines/pos_01");
    }

    //Test rows rearranged after releasePiece in position 2
    @Test
    public void shouldNotRearrangeBoardCoveringZeroLinesWhenReleasingPieceInPositionTwoBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/bottom/0_lines/pos_02");
    }

    //Test rows rearranged after releasePiece in position 3
    @Test
    public void shouldNotRearrangeBoardCoveringZeroLinesWhenReleasingPieceInPositionThreeBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/bottom/0_lines/pos_03");
    }

    //Test rows rearranged after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotRearrangeBoardCoveringZeroLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/bottom/0_lines/pos_10");
    }

    //#endregion

    //#region Test: Rows rearranged covering 3 lines after piece released because of obstacle

    //Test rows rearranged after releasePiece in position 0
    @Test
    public void shouldRearrangeBoardCoveringThreeLinesWhenReleasingPieceInInitialPositionBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/middle/3_lines/pos_00");
    }

    //Test rows rearranged after releasePiece in position 2
    @Test
    public void shouldRearrangeBoardCoveringThreeLinesWhenReleasingPieceInPositionTwoBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/middle/3_lines/pos_02");
    }

    //Test rows rearranged after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldRearrangeBoardCoveringThreeLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/middle/3_lines/pos_10");
    }

    //#endregion

    //#region Test: Rows rearranged covering 2 lines after piece released because of obstacle

    //Test rows rearranged after releasePiece in position 0
    @Test
    public void shouldRearrangeBoardCoveringTwoLinesWhenReleasingPieceInInitialPositionBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/middle/2_lines/pos_00");
    }

    //Test rows rearranged after releasePiece in position 1
    @Test
    public void shouldRearrangeBoardCoveringTwoLinesWhenReleasingPieceInPositionOneBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/middle/2_lines/pos_01");
    }

    //Test rows rearranged after releasePiece in position 2
    @Test
    public void shouldRearrangeBoardCoveringTwoLinesWhenReleasingPieceInPositionTwoBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/middle/2_lines/pos_02");
    }

    //Test rows rearranged after releasePiece in position 3
    @Test
    public void shouldRearrangeBoardCoveringTwoLinesWhenReleasingPieceInPositionThreeBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/middle/2_lines/pos_03");
    }

    //Test rows rearranged after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldRearrangeBoardCoveringTwoLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/middle/2_lines/pos_10");
    }

    //#endregion

    //#region Test: Rows rearranged covering 1 line after piece released because of obstacle

    //Test rows rearranged after releasePiece in position 0
    @Test
    public void shouldRearrangeBoardCoveringOneLineWhenReleasingPieceInInitialPositionBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/middle/1_line/pos_00");
    }

    //Test rows rearranged after releasePiece in position 1
    @Test
    public void shouldRearrangeBoardCoveringOneLineWhenReleasingPieceInPositionOneBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/middle/1_line/pos_01");
    }

    //Test rows rearranged after releasePiece in position 2
    @Test
    public void shouldRearrangeBoardCoveringOneLineWhenReleasingPieceInPositionTwoBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/middle/1_line/pos_02");
    }

    //Test rows rearranged after releasePiece in position 3
    @Test
    public void shouldRearrangeBoardCoveringOneLineWhenReleasingPieceInPositionThreeBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/middle/1_line/pos_03");
    }

    //Test rows rearranged after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldRearrangeBoardCoveringOneLineWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/middle/1_line/pos_10");
    }

    //#endregion

    //#region Test: Rows not rearranged covering 0 lines after piece released because of obstacle

    //Test rows not rearranged after releasePiece in position 0
    @Test
    public void shouldNotRearrangeBoardCoveringZeroLinesWhenReleasingPieceInInitialPositionBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/middle/0_lines/pos_00");
    }

    //Test rows not rearranged after releasePiece in position 1
    @Test
    public void shouldNotRearrangeBoardCoveringZeroLinesWhenReleasingPieceInPositionOneBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/middle/0_lines/pos_01");
    }

    //Test rows not rearranged after releasePiece in position 2
    @Test
    public void shouldNotRearrangeBoardCoveringZeroLinesWhenReleasingPieceInPositionTwoBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/middle/0_lines/pos_02");
    }

    //Test rows not rearranged after releasePiece in position 3
    @Test
    public void shouldNotRearrangeBoardCoveringZeroLinesWhenReleasingPieceInPositionThreeBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/middle/0_lines/pos_03");
    }

    //Test rows not rearranged after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotRearrangeBoardCoveringZeroLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/middle/0_lines/pos_10");
    }

    //#endregion

    //#region Test: Rows rearranged covering 3 lines after piece released because of obstacle on the top

    //Test rows rearranged after releasePiece in position 0
    @Test
    public void shouldRearrangeBoardCoveringThreeLinesWhenReleasingPieceInInitialPositionBecauseOfObstacleOnTheTop() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/top/3_lines/pos_00");
    }

    //Test rows rearranged after releasePiece in position 2
    @Test
    public void shouldRearrangeBoardCoveringThreeLinesWhenReleasingPieceInPositionTwoBecauseOfObstacleOnTheTop() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/top/3_lines/pos_02");
    }

    //Test rows rearranged after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldRearrangeBoardCoveringThreeLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacleOnTheTop() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/top/3_lines/pos_10");
    }

    //#endregion

    //#region Test: Rows rearranged covering 2 lines after piece released because of obstacle on the top

    //Test rows rearranged after releasePiece in position 0
    @Test
    public void shouldRearrangeBoardCoveringTwoLinesWhenReleasingPieceInInitialPositionBecauseOfObstacleOnTheTop() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/top/2_lines/pos_00");
    }

    //Test rows rearranged after releasePiece in position 2
    @Test
    public void shouldRearrangeBoardCoveringTwoLinesWhenReleasingPieceInPositionTwoBecauseOfObstacleOnTheTop() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/top/2_lines/pos_02");
    }

    //Test rows rearranged after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldRearrangeBoardCoveringTwoLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacleOnTheTop() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/top/2_lines/pos_10");
    }

    //#endregion

    //#region Test: Rows rearranged covering 1 line after piece released because of obstacle on the top

    //Test rows rearranged after releasePiece in position 0
    @Test
    public void shouldRearrangeBoardCoveringOneLineWhenReleasingPieceInInitialPositionBecauseOfObstacleOnTheTop() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/top/1_line/pos_00");
    }

    //Test rows rearranged after releasePiece in position 1
    @Test
    public void shouldRearrangeBoardCoveringOneLineWhenReleasingPieceInPositionOneBecauseOfObstacleOnTheTop() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/top/1_line/pos_01");
    }

    //Test rows rearranged after releasePiece in position 2
    @Test
    public void shouldRearrangeBoardCoveringOneLineWhenReleasingPieceInPositionTwoBecauseOfObstacleOnTheTop() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/top/1_line/pos_02");
    }

    //Test rows rearranged after releasePiece in position 3
    @Test
    public void shouldRearrangeBoardCoveringOneLineWhenReleasingPieceInPositionThreeBecauseOfObstacleOnTheTop() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/top/1_line/pos_03");
    }

    //Test rows rearranged after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldRearrangeBoardCoveringOneLineWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacleOnTheTop() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/top/1_line/pos_10");
    }

    //#endregion

    //#region Test: Rows not rearranged covering 0 lines after piece released because of obstacle on the top

    //Test rows rearranged after releasePiece in position 0
    @Test
    public void shouldNotRearrangeBoardCoveringZeroLinesWhenReleasingPieceInInitialPositionBecauseOfObstacleOnTheTop() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/top/0_lines/pos_00");
    }

    //Test rows rearranged after releasePiece in position 1
    @Test
    public void shouldNotRearrangeBoardCoveringZeroLinesWhenReleasingPieceInPositionOneBecauseOfObstacleOnTheTop() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/top/0_lines/pos_01");
    }

    //Test rows rearranged after releasePiece in position 2
    @Test
    public void shouldNotRearrangeBoardCoveringZeroLinesWhenReleasingPieceInPositionTwoBecauseOfObstacleOnTheTop() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/top/0_lines/pos_02");
    }

    //Test rows rearranged after releasePiece in position 3
    @Test
    public void shouldNotRearrangeBoardCoveringZeroLinesWhenReleasingPieceInPositionThreeBecauseOfObstacleOnTheTop() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/top/0_lines/pos_03");
    }

    //Test rows rearranged after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotRearrangeBoardCoveringZeroLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacleOnTheTop() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/top/0_lines/pos_10");
    }

    //#endregion

    //#region Test: Listener notified with score covering 3 lines after piece released because of boundary

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyScoreListenerCoveringThreeLinesWhenReleasingPieceInInitialPositionBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/bottom/3_lines/pos_00");
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyScoreListenerCoveringThreeLinesWhenReleasingPieceInPositionTwoBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/bottom/3_lines/pos_02");
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyScoreListenerCoveringThreeLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/bottom/3_lines/pos_10");
    }

    //endregion

    //#region Test: Listener notified with score covering 2 lines after piece released because of boundary

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyScoreListenerCoveringTwoLinesWhenReleasingPieceInInitialPositionBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/bottom/2_lines/pos_00");
    }

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyScoreListenerCoveringTwoLinesWhenReleasingPieceInPositionOneBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/bottom/2_lines/pos_01");
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyScoreListenerCoveringTwoLinesWhenReleasingPieceInPositionTwoBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/bottom/2_lines/pos_02");
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyScoreListenerCoveringTwoLinesWhenReleasingPieceInPositionThreeBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/bottom/2_lines/pos_03");
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyScoreListenerCoveringTwoLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/bottom/2_lines/pos_10");
    }

    //endregion

    //#region Test: Listener notified with score covering 1 line after piece released because of boundary

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyScoreListenerCoveringOneLineWhenReleasingPieceInInitialPositionBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/bottom/1_line/pos_00");
    }

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyScoreListenerCoveringOneLineWhenReleasingPieceInPositionOneBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/bottom/1_line/pos_01");
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyScoreListenerCoveringOneLineWhenReleasingPieceInPositionTwoBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/bottom/1_line/pos_02");
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyScoreListenerCoveringOneLineWhenReleasingPieceInPositionThreeBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/bottom/1_line/pos_03");
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyScoreListenerCoveringOneLineWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/bottom/1_line/pos_10");
    }

    //endregion

    //#region Test: Listener not notified with score covering 0 lines after piece released because of boundary

    //Test not notifyScored after releasePiece in position 0
    @Test
    public void shouldNotNotifyScoreListenerCoveringZeroLinesWhenReleasingPieceInInitialPositionBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/bottom/0_lines/pos_00");
    }

    //Test not notifyScored after releasePiece in position 1
    @Test
    public void shouldNotNotifyScoreListenerCoveringZeroLinesWhenReleasingPieceInPositionOneBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/bottom/0_lines/pos_01");
    }

    //Test not notifyScored after releasePiece in position 2
    @Test
    public void shouldNotNotifyScoreListenerCoveringZeroLinesWhenReleasingPieceInPositionTwoBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/bottom/0_lines/pos_02");
    }

    //Test not notifyScored after releasePiece in position 3
    @Test
    public void shouldNotNotifyScoreListenerCoveringZeroLinesWhenReleasingPieceInPositionThreeBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/bottom/0_lines/pos_03");
    }

    //Test not notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotNotifyScoreListenerCoveringZeroLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/bottom/0_lines/pos_10");
    }

    //endregion

    //#region Test: Listener notified with score covering 3 lines after piece released because of obstacle

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyScoreListenerCoveringThreeLinesWhenReleasingPieceInInitialPositionBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/middle/3_lines/pos_00");
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyScoreListenerCoveringThreeLinesWhenReleasingPieceInPositionTwoBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/middle/3_lines/pos_02");
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyScoreListenerCoveringThreeLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/middle/3_lines/pos_10");
    }

    //endregion

    //#region Test: Listener notified with score covering 2 lines after piece released because of obstacle

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyScoreListenerCoveringTwoLinesWhenReleasingPieceInInitialPositionBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/middle/2_lines/pos_00");
    }

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyScoreListenerCoveringTwoLinesWhenReleasingPieceInPositionOneBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/middle/2_lines/pos_01");
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyScoreListenerCoveringTwoLinesWhenReleasingPieceInPositionTwoBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/middle/2_lines/pos_02");
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyScoreListenerCoveringTwoLinesWhenReleasingPieceInPositionThreeBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/middle/2_lines/pos_03");
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyScoreListenerCoveringTwoLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/middle/2_lines/pos_10");
    }

    //endregion

    //#region Test: Listener notified with score covering 1 line after piece released because of obstacle

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyScoreListenerCoveringOneLineWhenReleasingPieceInInitialPositionBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/middle/1_line/pos_00");
    }

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyScoreListenerCoveringOneLineWhenReleasingPieceInPositionOneBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/middle/1_line/pos_01");
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyScoreListenerCoveringOneLineWhenReleasingPieceInPositionTwoBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/middle/1_line/pos_02");
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyScoreListenerCoveringOneLineWhenReleasingPieceInPositionThreeBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/middle/1_line/pos_03");
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyScoreListenerCoveringOneLineWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/middle/1_line/pos_10");
    }

    //endregion

    //#region Test: Listener not notified with score covering 0 lines after piece released because of obstacle

    //Test not notifyScored after releasePiece in position 0
    @Test
    public void shouldNotNotifyScoreListenerCoveringZeroLinesWhenReleasingPieceInInitialPositionBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/middle/0_lines/pos_00");
    }

    //Test not notifyScored after releasePiece in position 1
    @Test
    public void shouldNotNotifyScoreListenerCoveringZeroLinesWhenReleasingPieceInPositionOneBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/middle/0_lines/pos_01");
    }

    //Test not notifyScored after releasePiece in position 2
    @Test
    public void shouldNotNotifyScoreListenerCoveringZeroLinesWhenReleasingPieceInPositionTwoBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/middle/0_lines/pos_02");
    }

    //Test not notifyScored after releasePiece in position 3
    @Test
    public void shouldNotNotifyScoreListenerCoveringZeroLinesWhenReleasingPieceInPositionThreeBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/middle/0_lines/pos_03");
    }

    //Test not notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotNotifyScoreListenerCoveringZeroLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/middle/0_lines/pos_10");
    }

    //#endregion

    //#region Test: Listener notified with score covering 3 lines after piece released because of obstacle on the top

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyScoreListenerCoveringThreeLinesWhenReleasingPieceInInitialPositionBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/top/3_lines/pos_00");
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyScoreListenerCoveringThreeLinesWhenReleasingPieceInPositionTwoBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/top/3_lines/pos_02");
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyScoreListenerCoveringThreeLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/top/3_lines/pos_10");
    }

    //endregion

    //#region Test: Listener notified with score covering 2 lines after piece released because of obstacle on the top

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyScoreListenerCoveringTwoLinesWhenReleasingPieceInInitialPositionBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/top/2_lines/pos_00");
    }

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyScoreListenerCoveringTwoLinesWhenReleasingPieceInPositionOneBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/top/2_lines/pos_01");
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyScoreListenerCoveringTwoLinesWhenReleasingPieceInPositionTwoBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/top/2_lines/pos_02");
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyScoreListenerCoveringTwoLinesWhenReleasingPieceInPositionThreeBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/top/2_lines/pos_03");
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyScoreListenerCoveringTwoLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/top/2_lines/pos_10");
    }

    //endregion

    //#region Test: Listener notified with score covering 1 line after piece released because of obstacle on the top

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyScoreListenerCoveringOneLineWhenReleasingPieceInInitialPositionBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/top/1_line/pos_00");
    }

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyScoreListenerCoveringOneLineWhenReleasingPieceInPositionOneBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/top/1_line/pos_01");
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyScoreListenerCoveringOneLineWhenReleasingPieceInPositionTwoBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/top/1_line/pos_02");
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyScoreListenerCoveringOneLineWhenReleasingPieceInPositionThreeBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/top/1_line/pos_03");
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyScoreListenerCoveringOneLineWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/top/1_line/pos_10");
    }

    //endregion

    //#region Test: Listener not notified with score covering 0 lines after piece released because of obstacle on the top

    //Test not notifyScored after releasePiece in position 0
    @Test
    public void shouldNotNotifyScoreListenerCoveringZeroLinesWhenReleasingPieceInInitialPositionBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/top/0_lines/pos_00");
    }

    //Test not notifyScored after releasePiece in position 1
    @Test
    public void shouldNotNotifyScoreListenerCoveringZeroLinesWhenReleasingPieceInPositionOneBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/top/0_lines/pos_01");
    }

    //Test not notifyScored after releasePiece in position 2
    @Test
    public void shouldNotNotifyScoreListenerCoveringZeroLinesWhenReleasingPieceInPositionTwoBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/top/0_lines/pos_02");
    }

    //Test not notifyScored after releasePiece in position 3
    @Test
    public void shouldNotNotifyScoreListenerCoveringZeroLinesWhenReleasingPieceInPositionThreeBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/top/0_lines/pos_03");
    }

    //Test not notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotNotifyScoreListenerCoveringZeroLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/top/0_lines/pos_10");
    }

    //#endregion

    //#region Test: Listener piece released notified when covering 3 lines after piece released because of boundary

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringThreeLinesInInitialPositionBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/bottom/3_lines/pos_00", times(1));
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringThreeLinesInPositionTwoBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/bottom/3_lines/pos_02", times(1));
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringThreeLinesInInitialPositionAfterOneRotationCycleBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/bottom/3_lines/pos_10", times(1));
    }

    //endregion

    //#region Test: Listener piece released notified when covering 2 lines after piece released because of boundary

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringTwoLinesInInitialPositionBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/bottom/2_lines/pos_00", times(1));
    }

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringTwoLinesInPositionOneBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/bottom/2_lines/pos_01", times(1));
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringTwoLinesInPositionTwoBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/bottom/2_lines/pos_02", times(1));
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringTwoLinesInPositionThreeBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/bottom/2_lines/pos_03", times(1));
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringTwoLinesInInitialPositionAfterOneRotationCycleBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/bottom/2_lines/pos_10", times(1));
    }

    //endregion

    //#region Test: Listener piece released notified when covering 1 line after piece released because of boundary

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInInitialPositionBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/bottom/1_line/pos_00", times(1));
    }

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInPositionOneBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/bottom/1_line/pos_01", times(1));
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInPositionTwoBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/bottom/1_line/pos_02", times(1));
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInPositionThreeBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/bottom/1_line/pos_03", times(1));
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInInitialPositionAfterOneRotationCycleBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/bottom/1_line/pos_10", times(1));
    }

    //endregion

    //#region Test: Listener piece released notified when covering 0 lines after piece released because of boundary

    //Test not notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringZeroLinesInInitialPositionBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/bottom/0_lines/pos_00", times(1));
    }

    //Test not notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringZeroLinesInPositionOneBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/bottom/0_lines/pos_01", times(1));
    }

    //Test not notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringZeroLinesInPositionTwoBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/bottom/0_lines/pos_02", times(1));
    }

    //Test not notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringZeroLinesInPositionThreeBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/bottom/0_lines/pos_03", times(1));
    }

    //Test not notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringZeroLinesInInitialPositionAfterOneRotationCycleBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/bottom/0_lines/pos_10", times(1));
    }

    //endregion

    //#region Test: Listener piece released notified when covering 3 lines after piece released because of obstacle

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringThreeLinesInInitialPositionBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/middle/3_lines/pos_00", times(1));
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringThreeLinesInPositionTwoBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/middle/3_lines/pos_02", times(1));
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringThreeLinesInInitialPositionAfterOneRotationCycleBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/middle/3_lines/pos_10", times(1));
    }

    //endregion

    //#region Test: Listener piece released notified when covering 2 lines after piece released because of obstacle

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringTwoLinesInInitialPositionBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/middle/2_lines/pos_00", times(1));
    }

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringTwoLinesInPositionOneBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/middle/2_lines/pos_01", times(1));
    }

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringTwoLinesInPositionTwoBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/middle/2_lines/pos_02", times(1));
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringTwoLinesInPositionThreeBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/middle/2_lines/pos_03", times(1));
    }

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringTwoLinesInInitialPositionAfterOneRotationCycleBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/middle/2_lines/pos_10", times(1));
    }

    //endregion

    //#region Test: Listener piece released notified when covering 1 line after piece released because of obstacle

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInInitialPositionBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/middle/1_line/pos_00", times(1));
    }

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInPositionOneBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/middle/1_line/pos_01", times(1));
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInPositionTwoBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/middle/1_line/pos_02", times(1));
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInPositionThreeBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/middle/1_line/pos_03", times(1));
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInInitialPositionAfterOneRotationCycleBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/middle/1_line/pos_10", times(1));
    }

    //endregion

    //#region Test: Listener piece released notified when covering 0 lines after piece released because of obstacle

    //Test not notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringZeroLinesInInitialPositionBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/middle/0_lines/pos_00", times(1));
    }

    //Test not notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringZeroLinesInPositionOneBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/middle/0_lines/pos_01", times(1));
    }

    //Test not notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringZeroLinesInPositionTwoBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/middle/0_lines/pos_02", times(1));
    }

    //Test not notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringZeroLinesInPositionThreeBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/middle/0_lines/pos_03", times(1));
    }

    //Test not notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringZeroLinesInInitialPositionAfterOneRotationCycleBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/middle/0_lines/pos_10", times(1));
    }

    //endregion

    //#region Test: Listener piece released notified when covering 3 lines after piece released because of obstacle on the top

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringThreeLinesInInitialPositionBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/top/3_lines/pos_00", times(1));
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringThreeLinesInPositionTwoBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/top/3_lines/pos_02", times(1));
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringThreeLinesInInitialPositionAfterOneRotationCycleBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/top/3_lines/pos_10", times(1));
    }

    //endregion

    //#region Test: Listener piece released notified when covering 2 lines after piece released because of obstacle on the top

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringTwoLinesInInitialPositionBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/top/2_lines/pos_00", times(1));
    }

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringTwoLinesInPositionOneBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/top/2_lines/pos_01", times(1));
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringTwoLinesInPositionTwoBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/top/2_lines/pos_02", times(1));
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringTwoLinesInPositionThreeBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/top/2_lines/pos_03", times(1));
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringTwoLinesInInitialPositionAfterOneRotationCycleBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/top/2_lines/pos_10", times(1));
    }

    //endregion

    //#region Test: Listener piece released notified when covering 1 line after piece released because of obstacle on the top

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInInitialPositionBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/top/1_line/pos_00", times(1));
    }

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInPositionOneBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/top/1_line/pos_01", times(1));
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInPositionTwoBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/top/1_line/pos_02", times(1));
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInPositionThreeBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/top/1_line/pos_03", times(1));
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInInitialPositionAfterOneRotationCycleBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/top/1_line/pos_10", times(1));
    }

    //endregion

    //#region Test: Listener piece released notified when covering 0 lines after piece released because of obstacle on the top

    //Test not notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringZeroLinesInInitialPositionBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/top/0_lines/pos_00", times(1));
    }

    //Test not notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringZeroLinesInPositionOneBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/top/0_lines/pos_01", times(1));
    }

    //Test not notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringZeroLinesInPositionTwoBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/top/0_lines/pos_02", times(1));
    }

    //Test not notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringZeroLinesInPositionThreeBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/top/0_lines/pos_03", times(1));
    }

    //Test not notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringZeroLinesInInitialPositionAfterOneRotationCycleBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/top/0_lines/pos_10", times(1));
    }

    //endregion

    //#region Test: Listener game over not notified when covering 3 lines after piece released because of boundary

    //Test Game Over not notified after releasePiece in position 0
    @Test
    public void shouldNotNotifyGameOverListenerCoveringThreeLinesWhenReleasingPieceInInitialPositionBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/bottom/3_lines/pos_00", never());
    }

    //Test Game Over not notified after releasePiece in position 2
    @Test
    public void shouldNotNotifyGameOverListenerCoveringThreeLinesWhenReleasingPieceInPositionTwoBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/bottom/3_lines/pos_02", never());
    }

    //Test Game Over not notified after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotNotifyGameOverListenerCoveringThreeLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/bottom/3_lines/pos_10", never());
    }

    //#endregion

    //#region Test: Listener game over not notified when covering 2 lines after piece released because of boundary

    //Test Game Over not notified after releasePiece in position 0
    @Test
    public void shouldNotNotifyGameOverListenerCoveringTwoLinesWhenReleasingPieceInInitialPositionBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/bottom/2_lines/pos_00", never());
    }

    //Test Game Over not notified after releasePiece in position 1
    @Test
    public void shouldNotNotifyGameOverListenerCoveringTwoLinesWhenReleasingPieceInPositionOneBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/bottom/2_lines/pos_01", never());
    }

    //Test Game Over not notified after releasePiece in position 2
    @Test
    public void shouldNotNotifyGameOverListenerCoveringTwoLinesWhenReleasingPieceInPositionTwoBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/bottom/2_lines/pos_01", never());
    }

    //Test Game Over not notified after releasePiece in position 3
    @Test
    public void shouldNotNotifyGameOverListenerCoveringTwoLinesWhenReleasingPieceInPositionThreeBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/bottom/2_lines/pos_03", never());
    }

    //Test Game Over not notified after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotNotifyGameOverListenerCoveringTwoLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/bottom/2_lines/pos_01", never());
    }

    //#endregion

    //#region Test: Listener game over not notified when covering 1 line after piece released because of boundary

    //Test Game Over not notified after releasePiece in position 0
    @Test
    public void shouldNotNotifyGameOverListenerCoveringOneLineWhenReleasingPieceInInitialPositionBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/bottom/1_line/pos_00", never());
    }

    //Test Game Over not notified after releasePiece in position 1
    @Test
    public void shouldNotNotifyGameOverListenerCoveringOneLineWhenReleasingPieceInPositionOneBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/bottom/1_line/pos_01", never());
    }

    //Test Game Over not notified after releasePiece in position 2
    @Test
    public void shouldNotNotifyGameOverListenerCoveringOneLineWhenReleasingPieceInPositionTwoBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/bottom/1_line/pos_02", never());
    }

    //Test Game Over not notified after releasePiece in position 3
    @Test
    public void shouldNotNotifyGameOverListenerCoveringOneLineWhenReleasingPieceInPositionThreeBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/bottom/1_line/pos_03", never());
    }

    //Test Game Over not notified after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotNotifyGameOverListenerCoveringOneLineWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/bottom/1_line/pos_10", never());
    }

    //#endregion

    //#region Test: Listener game over not notified when covering 0 lines after piece released because of boundary

    //Test Game Over not notified after releasePiece in position 0
    @Test
    public void shouldNotNotifyGameOverListenerCoveringZeroLinesWhenReleasingPieceInInitialPositionBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/bottom/0_lines/pos_00", never());
    }

    //Test Game Over not notified after releasePiece in position 1
    @Test
    public void shouldNotNotifyGameOverListenerCoveringZeroLinesWhenReleasingPieceInPositionOneBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/bottom/0_lines/pos_01", never());
    }

    //Test Game Over not notified after releasePiece in position 2
    @Test
    public void shouldNotNotifyGameOverListenerCoveringZeroLinesWhenReleasingPieceInPositionTwoBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/bottom/0_lines/pos_02", never());
    }

    //Test Game Over not notified after releasePiece in position 3
    @Test
    public void shouldNotNotifyGameOverListenerCoveringZeroLinesWhenReleasingPieceInPositionThreeBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/bottom/0_lines/pos_03", never());
    }

    //Test Game Over not notified after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotNotifyGameOverListenerCoveringZeroLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/bottom/0_lines/pos_10", never());
    }

    //#endregion

    //#region Test: Listener game over not notified when covering 3 lines after piece released because of obstacle

    //Test Game Over not notified after releasePiece in position 0
    @Test
    public void shouldNotNotifyGameOverListenerCoveringThreeLinesWhenReleasingPieceInInitialPositionBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/middle/3_lines/pos_00", never());
    }

    //Test Game Over not notified after releasePiece in position 2
    @Test
    public void shouldNotNotifyGameOverListenerCoveringThreeLinesWhenReleasingPieceInPositionTwoBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/middle/3_lines/pos_02", never());
    }

    //Test Game Over not notified after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotNotifyGameOverListenerCoveringThreeLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/middle/3_lines/pos_10", never());
    }

    //#endregion

    //#region Test: Listener game over not notified when covering 2 lines after piece released because of obstacle

    //Test Game Over not notified after releasePiece in position 0
    @Test
    public void shouldNotNotifyGameOverListenerCoveringTwoLinesWhenReleasingPieceInInitialPositionBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/middle/2_lines/pos_00", never());
    }

    //Test Game Over not notified after releasePiece in position 1
    @Test
    public void shouldNotNotifyGameOverListenerCoveringTwoLinesWhenReleasingPieceInPositionOneBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/middle/2_lines/pos_01", never());
    }

    //Test Game Over not notified after releasePiece in position 2
    @Test
    public void shouldNotNotifyGameOverListenerCoveringTwoLinesWhenReleasingPieceInPositionTwoBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/middle/2_lines/pos_02", never());
    }

    //Test Game Over not notified after releasePiece in position 3
    @Test
    public void shouldNotNotifyGameOverListenerCoveringTwoLinesWhenReleasingPieceInPositionThreeBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/middle/2_lines/pos_03", never());
    }

    //Test Game Over not notified after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotNotifyGameOverListenerCoveringTwoLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/middle/2_lines/pos_10", never());
    }

    //#endregion

    //#region Test: Listener game over not notified when covering 1 line after piece released because of obstacle

    //Test Game Over not notified after releasePiece in position 0
    @Test
    public void shouldNotNotifyGameOverListenerCoveringOneLineWhenReleasingPieceInInitialPositionBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/middle/1_line/pos_00", never());
    }

    //Test Game Over not notified after releasePiece in position 1
    @Test
    public void shouldNotNotifyGameOverListenerCoveringOneLineWhenReleasingPieceInPositionOneBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/middle/1_line/pos_01", never());
    }

    //Test Game Over not notified after releasePiece in position 2
    @Test
    public void shouldNotNotifyGameOverListenerCoveringOneLineWhenReleasingPieceInPositionTwoBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/middle/1_line/pos_02", never());
    }

    //Test Game Over not notified after releasePiece in position 3
    @Test
    public void shouldNotNotifyGameOverListenerCoveringOneLineWhenReleasingPieceInPositionThreeBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/middle/1_line/pos_03", never());
    }

    //Test Game Over not notified after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotNotifyGameOverListenerCoveringOneLineWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/middle/1_line/pos_10", never());
    }

    //#endregion

    //#region Test: Listener game over not notified when covering 0 lines after piece released because of obstacle

    //Test Game Over not notified after releasePiece in position 0
    @Test
    public void shouldNotNotifyGameOverListenerCoveringZeroLinesWhenReleasingPieceInInitialPositionBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/middle/0_lines/pos_00", never());
    }

    //Test Game Over not notified after releasePiece in position 1
    @Test
    public void shouldNotNotifyGameOverListenerCoveringZeroLinesWhenReleasingPieceInPositionOneBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/middle/0_lines/pos_01", never());
    }

    //Test Game Over not notified after releasePiece in position 2
    @Test
    public void shouldNotNotifyGameOverListenerCoveringZeroLinesWhenReleasingPieceInPositionTwoBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/middle/0_lines/pos_02", never());
    }

    //Test Game Over not notified after releasePiece in position 3
    @Test
    public void shouldNotNotifyGameOverListenerCoveringZeroLinesWhenReleasingPieceInPositionThreeBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/middle/0_lines/pos_03", never());
    }

    //Test Game Over not notified after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotNotifyGameOverListenerCoveringZeroLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/middle/0_lines/pos_10", never());
    }

    //#endregion

    //#region Test: Listener game over not notified when covering 3 lines after piece released because of obstacle on the top

    //Test Game Over not notified after releasePiece in position 0
    @Test
    public void shouldNotNotifyGameOverListenerCoveringThreeLinesWhenReleasingPieceInInitialPositionBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/top/3_lines/pos_00", never());
    }

    //Test Game Over not notified after releasePiece in position 2
    @Test
    public void shouldNotNotifyGameOverListenerCoveringThreeLinesWhenReleasingPieceInPositionTwoBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/top/3_lines/pos_02", never());
    }

    //Test Game Over not notified after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotNotifyGameOverListenerCoveringThreeLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/top/3_lines/pos_10", never());
    }

    //#endregion

    //#region Test: Listener game over not notified when covering 2 lines after piece released because of obstacle on the top

    //Test Game Over not notified after releasePiece in position 0
    @Test
    public void shouldNotNotifyGameOverListenerCoveringTwoLinesWhenReleasingPieceInInitialPositionBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/top/2_lines/pos_00", never());
    }

    //Test Game Over not notified after releasePiece in position 1
    @Test
    public void shouldNotNotifyGameOverListenerCoveringTwoLinesWhenReleasingPieceInPositionOneBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/top/2_lines/pos_01", never());
    }

    //Test Game Over not notified after releasePiece in position 2
    @Test
    public void shouldNotNotifyGameOverListenerCoveringTwoLinesWhenReleasingPieceInPositionTwoBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/top/2_lines/pos_02", never());
    }

    //Test Game Over not notified after releasePiece in position 3
    @Test
    public void shouldNotNotifyGameOverListenerCoveringTwoLinesWhenReleasingPieceInPositionThreeBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/top/2_lines/pos_03", never());
    }

    //Test Game Over not notified after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotNotifyGameOverListenerCoveringTwoLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/top/2_lines/pos_10", never());
    }

    //#endregion

    //#region Test: Listener game over not notified when covering 1 line after piece released because of obstacle on the top

    //Test Game Over not notified after releasePiece in position 0
    @Test
    public void shouldNotNotifyGameOverListenerCoveringOneLineWhenReleasingPieceInInitialPositionBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/top/1_line/pos_00", never());
    }

    //Test Game Over not notified after releasePiece in position 1
    @Test
    public void shouldNotNotifyGameOverListenerCoveringOneLineWhenReleasingPieceInPositionOneBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/top/1_line/pos_01", never());
    }

    //Test Game Over not notified after releasePiece in position 2
    @Test
    public void shouldNotNotifyGameOverListenerCoveringOneLineWhenReleasingPieceInPositionTwoBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/top/1_line/pos_02", never());
    }

    //Test Game Over not notified after releasePiece in position 3
    @Test
    public void shouldNotNotifyGameOverListenerCoveringOneLineWhenReleasingPieceInPositionThreeBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/top/1_line/pos_03", never());
    }

    //Test Game Over not notified after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotNotifyGameOverListenerCoveringOneLineWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/top/1_line/pos_10", never());
    }

    //#endregion

    //#region Test: Listener game over not notified when covering 0 lines after piece released because of obstacle on the top

    //Test Game Over not notified after releasePiece in position 0
    @Test
    public void shouldNotNotifyGameOverListenerCoveringZeroLinesWhenReleasingPieceInInitialPositionBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/top/0_lines/pos_00", never());
    }

    //Test Game Over not notified after releasePiece in position 1
    @Test
    public void shouldNotNotifyGameOverListenerCoveringZeroLinesWhenReleasingPieceInPositionOneBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/top/0_lines/pos_01", never());
    }

    //Test Game Over not notified after releasePiece in position 2
    @Test
    public void shouldNotNotifyGameOverListenerCoveringZeroLinesWhenReleasingPieceInPositionTwoBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/top/0_lines/pos_02", never());
    }

    //Test Game Over not notified after releasePiece in position 3
    @Test
    public void shouldNotNotifyGameOverListenerCoveringZeroLinesWhenReleasingPieceInPositionThreeBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/top/0_lines/pos_03", never());
    }

    //Test Game Over not notified after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotNotifyGameOverListenerCoveringZeroLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/top/0_lines/pos_10", never());
    }

    //#endregion

    //#region Test: Listener game over notified covering 1 line after piece released when game over occurred in the same turn with 1 hidden row overlapped

    //Test Game Over notified after releasePiece in position 0
    @Test
    public void shouldNotifyGameOverListenerWhenReleasingPieceCoveringOneLineInInitialPositionOverlappingOneRow() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/gameover/1_row/pos_00_score_1", times(1));
    }

    //Test Game Over notified after releasePiece in position 2
    @Test
    public void shouldNotifyGameOverListenerWhenReleasingPieceCoveringOneLineInPositionTwoOverlappingOneRow() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/gameover/1_row/pos_02_score_1", times(1));
    }

    //Test Game Over notified after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyGameOverListenerWhenReleasingPieceCoveringOneLineInInitialPositionAfterOneRotationCycleOverlappingOneRow() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/gameover/1_row/pos_10_score_1", times(1));
    }

    //#endregion

    //#region Test: Listener game over notified with 3 hidden rows overlapped

    //Test Game Over notified after releasePiece in position 0
    @Test
    public void shouldNotifyGameOverListenerWhenReleasingPieceInInitialPositionOverlappingThreeRows() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/gameover/3_rows/pos_00_no_score", times(1));
    }

    //Test Game Over notified after releasePiece in position 2
    @Test
    public void shouldNotifyGameOverListenerWhenReleasingPieceInPositionTwoOverlappingThreeRows() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/gameover/3_rows/pos_02_no_score", times(1));
    }

    //Test Game Over notified after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyGameOverListenerWhenReleasingPieceInInitialPositionAfterOneRotationCycleOverlappingThreeRows() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/gameover/3_rows/pos_10_no_score", times(1));
    }

    //#endregion

    //#region Test: Listener game over notified with 2 hidden rows overlapped

    //Test Game Over notified after releasePiece in position 0
    @Test
    public void shouldNotifyGameOverListenerWhenReleasingPieceInInitialPositionOverlappingTwoRows() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/gameover/2_rows/pos_00_no_score", times(1));
    }

    //Test Game Over notified after releasePiece in position 1
    @Test
    public void shouldNotifyGameOverListenerWhenReleasingPieceInPositionOneOverlappingTwoRows() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/gameover/2_rows/pos_01_no_score", times(1));
    }

    //Test Game Over notified after releasePiece in position 2
    @Test
    public void shouldNotifyGameOverListenerWhenReleasingPieceInPositionTwoOverlappingTwoRows() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/gameover/2_rows/pos_02_no_score", times(1));
    }

    //Test Game Over notified after releasePiece in position 3
    @Test
    public void shouldNotifyGameOverListenerWhenReleasingPieceInPositionThreeOverlappingTwoRows() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/gameover/2_rows/pos_03_no_score", times(1));
    }

    //Test Game Over notified after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyGameOverListenerWhenReleasingPieceInInitialPositionAfterOneRotationCycleOverlappingTwoRows() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/gameover/2_rows/pos_10_no_score", times(1));
    }

    //#endregion

    //#region Test: Listener game over notified with 1 hidden row overlapped

    //Test Game Over notified after releasePiece in position 0
    @Test
    public void shouldNotifyGameOverListenerWhenReleasingPieceInInitialPositionOverlappingOneRow() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/gameover/1_row/pos_00_no_score", times(1));
    }

    //Test Game Over notified after releasePiece in position 1
    @Test
    public void shouldNotifyGameOverListenerWhenReleasingPieceInPositionOneOverlappingOneRow() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/gameover/1_row/pos_01_no_score", times(1));
    }

    //Test Game Over notified after releasePiece in position 2
    @Test
    public void shouldNotifyGameOverListenerWhenReleasingPieceInPositionTwoOverlappingOneRow() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/gameover/1_row/pos_02_no_score", times(1));
    }

    //Test Game Over notified after releasePiece in position 3
    @Test
    public void shouldNotifyGameOverListenerWhenReleasingPieceInPositionThreeOverlappingOneRow() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/gameover/1_row/pos_03_no_score", times(1));
    }

    //Test Game Over notified after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyGameOverListenerWhenReleasingPieceAfterOneRotationCycleOverlappingOneRow() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/zr/release/gameover/1_row/pos_10_no_score", times(1));
    }

    //#endregion

    //#region Test: Listener notified with score covering 1 line after piece released when game over occurred in the same turn with 1 hidden row overlapped

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyScoreListenerWhenReleasingPieceCoveringOneLineInInitialPositionOverlappingOneRow() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/gameover/1_row/pos_00_score_1");
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyScoreListenerWhenReleasingPieceCoveringOneLineInPositionTwoOverlappingOneRow() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/gameover/1_row/pos_02_score_1");
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyScoreListenerWhenReleasingPieceCoveringOneLineInInitialPositionAfterOneRotationCycleOverlappingOneRow() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/gameover/1_row/pos_10_score_1");
    }

    //#endregion

    //#region Test: Listener not notified with score after piece released when game over occurred in the same turn with 3 hidden rows overlapped

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyScoreListenerWhenReleasingPieceInInitialPositionOverlappingThreeRows() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/gameover/3_rows/pos_00_no_score");
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyScoreListenerWhenReleasingPieceInPositionTwoOverlappingThreeRows() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/gameover/3_rows/pos_02_no_score");
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyScoreListenerWhenReleasingPieceInInitialPositionAfterOneRotationCycleOverlappingThreeRows() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/gameover/3_rows/pos_10_no_score");
    }

    //#endregion

    //#region Test: Listener not notified with score after piece released when game over occurred in the same turn with 2 hidden rows overlapped

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyScoreListenerWhenReleasingPieceInInitialPositionOverlappingTwoRows() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/gameover/2_rows/pos_00_no_score");
    }

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyScoreListenerWhenReleasingPieceInPositionOneOverlappingTwoRows() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/gameover/2_rows/pos_01_no_score");
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyScoreListenerWhenReleasingPieceInPositionTwoOverlappingTwoRows() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/gameover/2_rows/pos_02_no_score");
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyScoreListenerWhenReleasingPieceInPositionThreeOverlappingTwoRows() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/gameover/2_rows/pos_03_no_score");
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyScoreListenerWhenReleasingPieceInInitialPositionAfterOneRotationCycleOverlappingTwoRows() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/gameover/2_rows/pos_10_no_score");
    }

    //#endregion

    //#region Test: Listener not notified with score after piece released when game over occurred in the same turn with 1 hidden row overlapped

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyScoreListenerWhenReleasingPieceInInitialPositionOverlappingOneRow() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/gameover/1_row/pos_00_no_score");
    }

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyScoreListenerWhenReleasingPieceInPositionOneOverlappingOneRow() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/gameover/1_row/pos_01_no_score");
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyScoreListenerWhenReleasingPieceInPositionTwoOverlappingOneRow() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/gameover/1_row/pos_02_no_score");
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyScoreListenerWhenReleasingPieceInPositionThreeOverlappingOneRow() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/gameover/1_row/pos_03_no_score");
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyScoreListenerWhenReleasingPieceInInitialPositionAfterOneRotationCycleOverlappingOneRow() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/zr/release/gameover/1_row/pos_10_no_score");
    }

    //#endregion

    //#region Test: Rows rearranged covering 1 line after piece released when game over occurred in the same turn with 1 hidden row overlapped

    //Test rows not rearranged after releasePiece in position 0
    @Test
    public void shouldRearrangeBoardWhenReleasingPieceCoveringOneLineInInitialPositionOverlappingOneRow() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/gameover/1_row/pos_00_score_1");
    }

    //Test rows not rearranged after releasePiece in position 2
    @Test
    public void shouldRearrangeBoardWhenReleasingPieceCoveringOneLineInPositionTwoOverlappingOneRow() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/gameover/1_row/pos_02_score_1");
    }

    //Test rows not rearranged after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldRearrangeBoardWhenReleasingPieceCoveringOneLineInInitialPositionAfterOneRotationCycleOverlappingOneRow() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/gameover/1_row/pos_10_score_1");
    }

    //#endregion

    //#region Test: Rows not rearranged when game over occurred with 2 hidden rows overlapped

    //Test rows not rearranged after releasePiece in position 0
    @Test
    public void shouldNotRearrangeBoardWhenReleasingPieceInInitialPositionOverlappingTwoRows() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/gameover/2_rows/pos_00_no_score");
    }

    //Test rows not rearranged after releasePiece in position 1
    @Test
    public void shouldNotRearrangeBoardWhenReleasingPieceInPositionOneOverlappingTwoRows() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/gameover/2_rows/pos_01_no_score");
    }

    //Test rows not rearranged after releasePiece in position 2
    @Test
    public void shouldNotRearrangeBoardWhenReleasingPieceInPositionTwoOverlappingTwoRows() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/gameover/2_rows/pos_02_no_score");
    }

    //Test rows not rearranged after releasePiece in position 3
    @Test
    public void shouldNotRearrangeBoardWhenReleasingPieceInPositionThreeOverlappingTwoRows() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/gameover/2_rows/pos_03_no_score");
    }

    //Test rows not rearranged after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotRearrangeBoardWhenReleasingPieceInInitialPositionAfterOneRotationCycleOverlappingTwoRows() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/gameover/2_rows/pos_10_no_score");
    }

    //#endregion

    //#region Test: Rows not rearranged when game over occurred with 1 hidden row overlapped

    //Test rows not rearranged after releasePiece in position 0
    @Test
    public void shouldNotRearrangeBoardWhenReleasingPieceInInitialPositionOverlappingOneRow() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/gameover/1_row/pos_00_no_score");
    }

    //Test rows not rearranged after releasePiece in position 1
    @Test
    public void shouldNotRearrangeBoardWhenReleasingPieceInPositionOneOverlappingOneRow() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/gameover/1_row/pos_01_no_score");
    }

    //Test rows not rearranged after releasePiece in position 2
    @Test
    public void shouldNotRearrangeBoardWhenReleasingPieceInPositionTwoOverlappingOneRow() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/gameover/1_row/pos_02_no_score");
    }

    //Test rows not rearranged after releasePiece in position 3
    @Test
    public void shouldNotRearrangeBoardWhenReleasingPieceInPositionThreeOverlappingOneRow() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/gameover/1_row/pos_03_no_score");
    }

    //Test rows not rearranged after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotRearrangeBoardWhenReleasingPieceInInitialPositionAfterOneRotationCycleOverlappingOneRow() {
        this.assertRearrangeUseCaseFromFile("/tetris/zr/release/gameover/1_row/pos_10_no_score");
    }

    //#endregion

    //#region Test: Listener piece released not notified covering 1 line after piece released when game over occurred in the same turn with 1 hidden row overlapped

    //Test pieceReleased notified after releasePiece in position 0
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInInitialPositionOverlappingOneRow() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/gameover/1_row/pos_00_score_1", never());
    }

    //Test pieceReleased notified after releasePiece in position 2
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInPositionTwoOverlappingOneRow() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/gameover/1_row/pos_02_score_1", never());
    }

    //Test pieceReleased notified after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInInitialPositionAfterOneRotationCycleOverlappingOneRow() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/gameover/1_row/pos_10_score_1", never());
    }

    //#endregion

    //#region Test: Listener piece released not notified after piece released when game over occurred in the same turn with 2 hidden rows overlapped

    //Test pieceReleased notified after releasePiece in position 0
    @Test
    public void shouldNotifyListenerWhenPieceReleasedInInitialPositionOverlappingTwoRows() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/gameover/2_rows/pos_00_no_score", never());
    }

    //Test pieceReleased notified after releasePiece in position 1
    @Test
    public void shouldNotifyListenerWhenPieceReleasedInPositionOneOverlappingTwoRows() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/gameover/2_rows/pos_01_no_score", never());
    }

    //Test pieceReleased notified after releasePiece in position 2
    @Test
    public void shouldNotifyListenerWhenPieceReleasedInPositionTwoOverlappingTwoRows() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/gameover/2_rows/pos_02_no_score", never());
    }

    //Test pieceReleased notified after releasePiece in position 3
    @Test
    public void shouldNotifyListenerWhenPieceReleasedInPositionThreeOverlappingTwoRows() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/gameover/2_rows/pos_03_no_score", never());
    }

    //Test pieceReleased notified after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyListenerWhenPieceReleasedInInitialPositionAfterOneRotationCycleOverlappingTwoRows() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/gameover/2_rows/pos_10_no_score", never());
    }

    //#endregion

    //#region Test: Listener piece released not notified after piece released when game over occurred in the same turn with 1 hidden row overlapped

    //Test pieceReleased notified after releasePiece in position 0
    @Test
    public void shouldNotifyListenerWhenPieceReleasedInInitialPositionOverlappingOneRow() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/gameover/1_row/pos_00_no_score", never());
    }

    //Test pieceReleased notified after releasePiece in position 1
    @Test
    public void shouldNotifyListenerWhenPieceReleasedInPositionOneOverlappingOneRow() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/gameover/1_row/pos_01_no_score", never());
    }

    //Test pieceReleased notified after releasePiece in position 2
    @Test
    public void shouldNotifyListenerWhenPieceReleasedInPositionTwoOverlappingOneRow() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/gameover/1_row/pos_02_no_score", never());
    }

    //Test pieceReleased notified after releasePiece in position 3
    @Test
    public void shouldNotifyListenerWhenPieceReleasedInPositionThreeOverlappingOneRow() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/gameover/1_row/pos_03_no_score", never());
    }

    //Test pieceReleased notified after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyListenerWhenPieceReleasedInInitialPositionAfterOneRotationCycleOverlappingOneRow() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/zr/release/gameover/1_row/pos_10_no_score", never());
    }

    //#endregion

    //#region Test: Listener piece rotated notified when rotation allowed

    //Test piece rotated notification received when rotation allowed in position 0
    @Test
    public void shouldNotifyPieceRotatedListenerWhenPieceRotatedInInitialPosition(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/rotation/allowed/pos_00");
        this.shouldNotifyPieceRotatedListenerWhenPieceRotationExecuted(this.piece);
    }

    //Test piece rotated notification received when rotation allowed in position 1
    @Test
    public void shouldNotifyPieceRotatedListenerWhenPieceRotatedInPositionOne(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/rotation/allowed/pos_01");
        this.shouldNotifyPieceRotatedListenerWhenPieceRotationExecuted(this.piece);
    }

    //Test piece rotated notification received when rotation allowed in position 2
    @Test
    public void shouldNotifyPieceRotatedListenerWhenPieceRotatedInPositionTwo(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/rotation/allowed/pos_02");
        this.shouldNotifyPieceRotatedListenerWhenPieceRotationExecuted(this.piece);
    }

    //Test piece rotated notification received when rotation allowed in position 3
    @Test
    public void shouldNotifyPieceRotatedListenerWhenPieceRotatedInPositionThree(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/rotation/allowed/pos_03");
        this.shouldNotifyPieceRotatedListenerWhenPieceRotationExecuted(this.piece);
    }

    //Test piece rotated notification received when rotation allowed in position 0 after one rotation cycle
    @Test
    public void shouldNotifyPieceRotatedListenerWhenPieceRotatedAfterOneRotationCycle(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/rotation/allowed/pos_10");
        this.shouldNotifyPieceRotatedListenerWhenPieceRotationExecuted(this.piece);
    }

    //endregion

    //#region Test: Listener piece moved notified when moving to left allowed

    //Test piece moved notification received when moveLeft allowed in position 0
    @Test
    public void shouldNotifyPieceMovedListenerWhenPieceMovedToLeftInInitialPosition(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/left/allowed/pos_00");
        this.shouldNotifyPieceMovedListenerWhenPieceMoveExecuted(this.piece, () -> {
            this.tetrisBoard.moveLeft();
            return null;
        });
    }

    //Test piece moved notification received when moveLeft allowed in position 1
    @Test
    public void shouldNotifyPieceMovedListenerWhenPieceMovedToLeftInPositionOne(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/left/allowed/pos_01");
        this.shouldNotifyPieceMovedListenerWhenPieceMoveExecuted(this.piece, () -> {
            this.tetrisBoard.moveLeft();
            return null;
        });
    }

    //Test piece moved notification received when moveLeft allowed in position 2
    @Test
    public void shouldNotifyPieceMovedListenerWhenPieceMovedToLeftInPositionTwo(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/left/allowed/pos_02");
        this.shouldNotifyPieceMovedListenerWhenPieceMoveExecuted(this.piece, () -> {
            this.tetrisBoard.moveLeft();
            return null;
        });
    }

    //Test piece moved notification received when moveLeft allowed in position 3
    @Test
    public void shouldNotifyPieceMovedListenerWhenPieceMovedToLeftInPositionThree(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/left/allowed/pos_03");
        this.shouldNotifyPieceMovedListenerWhenPieceMoveExecuted(this.piece, () -> {
            this.tetrisBoard.moveLeft();
            return null;
        });
    }

    //Test piece moved notification received when moveLeft allowed in position 0 after one rotation cycle
    @Test
    public void shouldNotifyPieceMovedListenerWhenPieceMovedToLeftAfterOneRotationCycle(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/left/allowed/pos_10");
        this.shouldNotifyPieceMovedListenerWhenPieceMoveExecuted(this.piece, () -> {
            this.tetrisBoard.moveLeft();
            return null;
        });
    }

    //endregion

    //#region Test: Listener piece moved notified when moving to right allowed

    //Test piece moved notification received when moveRight allowed in position 0
    @Test
    public void shouldNotifyPieceMovedListenerWhenPieceMovedToRightInInitialPosition(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/right/allowed/pos_00");
        this.shouldNotifyPieceMovedListenerWhenPieceMoveExecuted(this.piece, () -> {
            this.tetrisBoard.moveRight();
            return null;
        });
    }

    //Test piece moved notification received when moveRight allowed in position 1
    @Test
    public void shouldNotifyPieceMovedListenerWhenPieceMovedToRightInPositionOne(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/right/allowed/pos_01");
        this.shouldNotifyPieceMovedListenerWhenPieceMoveExecuted(this.piece, () -> {
            this.tetrisBoard.moveRight();
            return null;
        });
    }

    //Test piece moved notification received when moveRight allowed in position 2
    @Test
    public void shouldNotifyPieceMovedListenerWhenPieceMovedToRightInPositionTwo(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/right/allowed/pos_02");
        this.shouldNotifyPieceMovedListenerWhenPieceMoveExecuted(this.piece, () -> {
            this.tetrisBoard.moveRight();
            return null;
        });
    }

    //Test piece moved notification received when moveRight allowed in position 3
    @Test
    public void shouldNotifyPieceMovedListenerWhenPieceMovedToRightInPositionThree(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/right/allowed/pos_03");
        this.shouldNotifyPieceMovedListenerWhenPieceMoveExecuted(this.piece, () -> {
            this.tetrisBoard.moveRight();
            return null;
        });
    }

    //Test piece moved notification received when moveRight allowed in position 0 after one rotation cycle
    @Test
    public void shouldNotifyPieceMovedListenerWhenPieceMovedToRightAfterOneRotationCycle(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/right/allowed/pos_10");
        this.shouldNotifyPieceMovedListenerWhenPieceMoveExecuted(this.piece, () -> {
            this.tetrisBoard.moveRight();
            return null;
        });
    }

    //endregion

    //#region Test: Listener piece moved notified when moving down allowed

    //Test piece moved notification received when moveDown allowed in position 0
    @Test
    public void shouldNotifyPieceMovedListenerWhenPieceMovedDownInInitialPosition(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/down/allowed/pos_00");
        this.shouldNotifyPieceMovedListenerWhenPieceMoveExecuted(this.piece, () -> {
            this.tetrisBoard.moveDown();
            return null;
        });
    }

    //Test piece moved notification received when moveDown allowed in position 1
    @Test
    public void shouldNotifyPieceMovedListenerWhenPieceMovedDownInPositionOne(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/down/allowed/pos_01");
        this.shouldNotifyPieceMovedListenerWhenPieceMoveExecuted(this.piece, () -> {
            this.tetrisBoard.moveDown();
            return null;
        });
    }

    //Test piece moved notification received when moveDown allowed in position 2
    @Test
    public void shouldNotifyPieceMovedListenerWhenPieceMovedDownInPositionTwo(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/down/allowed/pos_02");
        this.shouldNotifyPieceMovedListenerWhenPieceMoveExecuted(this.piece, () -> {
            this.tetrisBoard.moveDown();
            return null;
        });
    }

    //Test piece moved notification received when moveDown allowed in position 3
    @Test
    public void shouldNotifyPieceMovedListenerWhenPieceMovedDownInPositionThree(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/down/allowed/pos_03");
        this.shouldNotifyPieceMovedListenerWhenPieceMoveExecuted(this.piece, () -> {
            this.tetrisBoard.moveDown();
            return null;
        });
    }

    //Test piece moved notification received when moveDown allowed in position 0 after one rotation cycle
    @Test
    public void shouldNotifyPieceMovedListenerWhenPieceMovedDownAfterOneRotationCycle(){
        this.loadBoardAndPieceFromFile("/tetris/zr/move/down/allowed/pos_10");
        this.shouldNotifyPieceMovedListenerWhenPieceMoveExecuted(this.piece, () -> {
            this.tetrisBoard.moveDown();
            return null;
        });
    }

    //endregion
}
