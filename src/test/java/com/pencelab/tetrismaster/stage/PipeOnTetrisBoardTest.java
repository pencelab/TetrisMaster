package com.pencelab.tetrismaster.stage;

import com.pencelab.tetrismaster.pieces.Piece;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.powermock.reflect.Whitebox;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public final class PipeOnTetrisBoardTest extends PieceOnTetrisBoardTest {

    //#region Test: Position allowed

    //Test positioning allowed in position 0
    @Test
    public void shouldPositionPieceInInitialPosition(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/position/allowed/pos_00");
        this.tetrisBoard.setPiece(this.piece);
        Piece privatePiece = Whitebox.getInternalState(this.tetrisBoard, "piece");
        assertEquals(this.piece, privatePiece);
    }

    //Test positioning allowed in position 0
    @Test
    public void shouldPositionPieceInPositionOne(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/position/allowed/pos_01");
        this.tetrisBoard.setPiece(this.piece);
        Piece privatePiece = Whitebox.getInternalState(this.tetrisBoard, "piece");
        assertEquals(this.piece, privatePiece);
    }

    //Test positioning allowed in position 0
    @Test
    public void shouldPositionPieceInPositionTwo(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/position/allowed/pos_02");
        this.tetrisBoard.setPiece(this.piece);
        Piece privatePiece = Whitebox.getInternalState(this.tetrisBoard, "piece");
        assertEquals(this.piece, privatePiece);
    }

    //Test positioning allowed in position 0
    @Test
    public void shouldPositionPieceInPositionThree(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/position/allowed/pos_03");
        this.tetrisBoard.setPiece(this.piece);
        Piece privatePiece = Whitebox.getInternalState(this.tetrisBoard, "piece");
        assertEquals(this.piece, privatePiece);
    }

    //Test positioning allowed in position 0 after one rotation cycle
    @Test
    public void shouldPositionPieceInInitialPositionAfterOneRotationCycle(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/position/allowed/pos_10");
        this.tetrisBoard.setPiece(this.piece);
        Piece privatePiece = Whitebox.getInternalState(this.tetrisBoard, "piece");
        assertEquals(this.piece, privatePiece);
    }

    //#endregion

    //#region Test: IllegalArgumentException thrown because of piece set on an occupied field

    //Test IllegalArgumentException thrown because of piece set on an occupied field in position 0
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInInitialPositionOnAnOccupiedField(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/position/occupiedfield/pos_00");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set on an occupied field in position 1
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInPositionOneOnAnOccupiedField(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/position/occupiedfield/pos_01");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set on an occupied field in position 2
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInPositionTwoOnAnOccupiedField(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/position/occupiedfield/pos_02");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set on an occupied field in position 3
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInPositionThreeOnAnOccupiedField(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/position/occupiedfield/pos_03");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set on an occupied field in position 0 after one rotation cycle
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInInitialPositionAfterOneRotationCycleOnAnOccupiedField(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/position/occupiedfield/pos_10");
        this.tetrisBoard.setPiece(this.piece);
    }

    //#endregion

    //#region Test: IllegalArgumentException thrown because of piece set out of boundaries on the top

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 0
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInInitialPositionOutOfBoundariesOnTheTop(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/position/outofbounds/top/pos_00");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 1
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInPositionOneOutOfBoundariesOnTheTop(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/position/outofbounds/top/pos_01");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 2
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInPositionTwoOutOfBoundariesOnTheTop(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/position/outofbounds/top/pos_02");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 3
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInPositionThreeOutOfBoundariesOnTheTop(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/position/outofbounds/top/pos_03");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 0 after one rotation cycle
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInInitialPositionAfterOneRotationCycleOutOfBoundariesOnTheTop(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/position/outofbounds/top/pos_10");
        this.tetrisBoard.setPiece(this.piece);
    }

    //#endregion

    //#region Test: IllegalArgumentException thrown because of piece set out of boundaries on the left

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 0
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInInitialPositionOutOfBoundariesOnTheLeft(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/position/outofbounds/left/pos_00");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 1
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInPositionOneOutOfBoundariesOnTheLeft(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/position/outofbounds/left/pos_01");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 2
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInPositionTwoOutOfBoundariesOnTheLeft(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/position/outofbounds/left/pos_02");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 3
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInPositionThreeOutOfBoundariesOnTheLeft(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/position/outofbounds/left/pos_03");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 0 after one rotation cycle
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInInitialPositionAfterOneRotationCycleOutOfBoundariesOnTheLeft(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/position/outofbounds/left/pos_10");
        this.tetrisBoard.setPiece(this.piece);
    }

    //#endregion

    //#region Test: IllegalArgumentException thrown because of piece set out of boundaries on the right

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 0
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInInitialPositionOutOfBoundariesOnTheRight(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/position/outofbounds/right/pos_00");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 1
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInPositionOneOutOfBoundariesOnTheRight(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/position/outofbounds/right/pos_01");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 2
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInPositionTwoOutOfBoundariesOnTheRight(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/position/outofbounds/right/pos_02");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 3
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInPositionThreeOutOfBoundariesOnTheRight(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/position/outofbounds/right/pos_03");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 0 after one rotation cycle
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInInitialPositionAfterOneRotationCycleOutOfBoundariesOnTheRight(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/position/outofbounds/right/pos_10");
        this.tetrisBoard.setPiece(this.piece);
    }

    //#endregion

    //#region Test: IllegalArgumentException thrown because of piece set out of boundaries on the bottom

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 0
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInInitialPositionOutOfBoundariesOnTheBottom(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/position/outofbounds/bottom/pos_00");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 1
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInPositionOneOutOfBoundariesOnTheBottom(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/position/outofbounds/bottom/pos_01");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 2
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInPositionTwoOutOfBoundariesOnTheBottom(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/position/outofbounds/bottom/pos_02");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 3
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInPositionThreeOutOfBoundariesOnTheBottom(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/position/outofbounds/bottom/pos_03");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 0 after one rotation cycle
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInInitialPositionAfterOneRotationCycleOutOfBoundariesOnTheBottom(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/position/outofbounds/bottom/pos_10");
        this.tetrisBoard.setPiece(this.piece);
    }

    //#endregion

    //region Test: Rotation allowed

    //Test rotation allowed in position 0
    @Test
    public void shouldRotatePieceToPositionOne(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/rotation/allowed/pos_00");
        this.shouldRotatePiece(this.piece, this.piece.rotate());
    }

    //Test rotation allowed in position 1
    @Test
    public void shouldRotatePieceToPositionTwo(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/rotation/allowed/pos_01");
        this.shouldRotatePiece(this.piece, this.piece.rotate());
    }

    //Test rotation allowed in position 2
    @Test
    public void shouldRotatePieceToPositionThree(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/rotation/allowed/pos_02");
        this.shouldRotatePiece(this.piece, this.piece.rotate());
    }

    //Test rotation allowed in position 3
    @Test
    public void shouldRotatePieceToInitialPosition(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/rotation/allowed/pos_03");
        this.shouldRotatePiece(this.piece, this.piece.rotate());
    }

    //Test rotation allowed in position 0 after one rotation cycle
    @Test
    public void shouldRotatePieceToPositionOneAfterOneRotationCycle(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/rotation/allowed/pos_10");
        this.shouldRotatePiece(this.piece, this.piece.rotate());
    }

    //endregion

    //region Test: Rotation not allowed because of boundary

    //Test rotation not allowed in position 1
    @Test
    public void shouldNotRotatePieceToPositionTwoBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/rotation/boundary/pos_01");
        this.shouldNotRotatePiece(this.piece);
    }

    //Test rotation not allowed in position 3
    @Test
    public void shouldNotRotatePieceToInitialPositionBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/rotation/boundary/pos_03");
        this.shouldNotRotatePiece(this.piece);
    }

    //endregion

    //region Test: Rotation not allowed because of obstacle

    //Test rotation not allowed in position 0
    @Test
    public void shouldNotRotatePieceToPositionOneBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/rotation/obstacle/pos_00");
        this.shouldNotRotatePiece(this.piece);
    }

    //Test rotation not allowed in position 1
    @Test
    public void shouldNotRotatePieceToPositionTwoBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/rotation/obstacle/pos_01");
        this.shouldNotRotatePiece(this.piece);
    }

    //Test rotation not allowed in position 2
    @Test
    public void shouldNotRotatePieceToPositionThreeBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/rotation/obstacle/pos_02");
        this.shouldNotRotatePiece(this.piece);
    }

    //Test rotation not allowed in position 3
    @Test
    public void shouldNotRotatePieceToInitialPositionBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/rotation/obstacle/pos_03");
        this.shouldNotRotatePiece(this.piece);
    }

    //Test rotation not allowed in position 0 after one rotation cycle
    @Test
    public void shouldNotRotatePieceToPositionOneAfterOneRotationCycleBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/rotation/obstacle/pos_10");
        this.shouldNotRotatePiece(this.piece);
    }

    //endregion

    //#region Test: Moving to left allowed

    //Test moveLeft allowed in position 0
    @Test
    public void shouldMovePieceToLeftInInitialPosition(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/left/allowed/pos_00");
        this.shouldMovePieceToLeft(this.piece, this.piece.moveLeft());
    }

    //Test moveLeft allowed in position 1
    @Test
    public void shouldMovePieceToLeftInPositionOne(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/left/allowed/pos_01");
        this.shouldMovePieceToLeft(this.piece, this.piece.moveLeft());
    }

    //Test moveLeft allowed in position 2
    @Test
    public void shouldMovePieceToLeftInPositionTwo(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/left/allowed/pos_02");
        this.shouldMovePieceToLeft(this.piece, this.piece.moveLeft());
    }

    //Test moveLeft allowed in position 3
    @Test
    public void shouldMovePieceToLeftInPositionThree(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/left/allowed/pos_03");
        this.shouldMovePieceToLeft(this.piece, this.piece.moveLeft());
    }

    //Test moveLeft allowed in position 0 after one rotation cycle
    @Test
    public void shouldMovePieceToLeftAfterOneRotationCycle(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/left/allowed/pos_10");
        this.shouldMovePieceToLeft(this.piece, this.piece.moveLeft());
    }

    //endregion

    //#region Test: Moving to left not allowed because of boundary

    //Test moveLeft not allowed in position 0
    @Test
    public void shouldNotMovePieceToLeftInInitialPositionBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/left/boundary/pos_00");
        this.shouldNotMovePieceToLeft(this.piece);
    }

    //Test moveLeft not allowed in position 1
    @Test
    public void shouldNotMovePieceToLeftInPositionOneBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/left/boundary/pos_01");
        this.shouldNotMovePieceToLeft(this.piece);
    }

    //Test moveLeft not allowed in position 2
    @Test
    public void shouldNotMovePieceToLeftInPositionTwoBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/left/boundary/pos_02");
        this.shouldNotMovePieceToLeft(this.piece);
    }

    //Test moveLeft not allowed in position 3
    @Test
    public void shouldNotMovePieceToLeftInPositionThreeBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/left/boundary/pos_03");
        this.shouldNotMovePieceToLeft(this.piece);
    }

    //Test moveLeft not allowed in position 0 after one rotation cycle
    @Test
    public void shouldNotMovePieceToLeftInInitialPositionAfterOneRotationCycleBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/left/boundary/pos_10");
        this.shouldNotMovePieceToLeft(this.piece);
    }

    //endregion

    //#region Test: Moving to left not allowed because of obstacle

    //Test moveLeft not allowed in position 0
    @Test
    public void shouldNotMovePieceToLeftInInitialPositionBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/left/obstacle/pos_00");
        this.shouldNotMovePieceToLeft(this.piece);
    }

    //Test moveLeft not allowed in position 1
    @Test
    public void shouldNotMovePieceToLeftInPositionOneBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/left/obstacle/pos_01");
        this.shouldNotMovePieceToLeft(this.piece);
    }

    //Test moveLeft not allowed in position 2
    @Test
    public void shouldNotMovePieceToLeftInPositionTwoBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/left/obstacle/pos_02");
        this.shouldNotMovePieceToLeft(this.piece);
    }

    //Test moveLeft not allowed in position 3
    @Test
    public void shouldNotMovePieceToLeftInPositionThreeBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/left/obstacle/pos_03");
        this.shouldNotMovePieceToLeft(this.piece);
    }

    //Test moveLeft not allowed in position 0 after one rotation cycle
    @Test
    public void shouldNotMovePieceToLeftInInitialPositionAfterOneRotationCycleBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/left/obstacle/pos_10");
        this.shouldNotMovePieceToLeft(this.piece);
    }

    //endregion

    //#region Test: Moving to right allowed

    //Test moveRight allowed in position 0
    @Test
    public void shouldMovePieceToRightPositionInInitialPosition(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/right/allowed/pos_00");
        this.shouldMovePieceToRight(this.piece, this.piece.moveRight());
    }

    //Test moveRight allowed in position 1
    @Test
    public void shouldMovePieceToRightPositionInPositionOne(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/right/allowed/pos_01");
        this.shouldMovePieceToRight(this.piece, this.piece.moveRight());
    }

    //Test moveRight allowed in position 2
    @Test
    public void shouldMovePieceToRightPositionInPositionTwo(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/right/allowed/pos_02");
        this.shouldMovePieceToRight(this.piece, this.piece.moveRight());
    }

    //Test moveRight allowed in position 3
    @Test
    public void shouldMovePieceToRightPositionInPositionThree(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/right/allowed/pos_03");
        this.shouldMovePieceToRight(this.piece, this.piece.moveRight());
    }

    //Test moveRight allowed in position 0 after one rotation cycle
    @Test
    public void shouldMovePieceToRightPositionAfterOneRotationCycle(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/right/allowed/pos_10");
        this.shouldMovePieceToRight(this.piece, this.piece.moveRight());
    }

    //endregion

    //#region Test: Moving to right not allowed because of boundary

    //Test moveRight not allowed in position 0
    @Test
    public void shouldNotMovePieceToRightInInitialPositionBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/right/boundary/pos_00");
        this.shouldNotMovePieceToRight(this.piece);
    }

    //Test moveRight not allowed in position 1
    @Test
    public void shouldNotMovePieceToRightInPositionOneBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/right/boundary/pos_01");
        this.shouldNotMovePieceToRight(this.piece);
    }

    //Test moveRight not allowed in position 2
    @Test
    public void shouldNotMovePieceToRightInPositionTwoBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/right/boundary/pos_02");
        this.shouldNotMovePieceToRight(this.piece);
    }

    //Test moveRight not allowed in position 3
    @Test
    public void shouldNotMovePieceToRightInPositionThreeBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/right/boundary/pos_03");
        this.shouldNotMovePieceToRight(this.piece);
    }

    //Test moveRight not allowed in position 0 after one rotation cycle
    @Test
    public void shouldNotMovePieceToRightInInitialPositionAfterOneRotationCycleBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/right/boundary/pos_10");
        this.shouldNotMovePieceToRight(this.piece);
    }

    //endregion

    //#region Test: Moving to right not allowed because of obstacle

    //Test moveRight not allowed in position 0
    @Test
    public void shouldNotMovePieceToRightInInitialPositionBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/right/obstacle/pos_00");
        this.shouldNotMovePieceToRight(this.piece);
    }

    //Test moveRight not allowed in position 1
    @Test
    public void shouldNotMovePieceToRightInPositionOneBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/right/obstacle/pos_01");
        this.shouldNotMovePieceToRight(this.piece);
    }

    //Test moveRight not allowed in position 2
    @Test
    public void shouldNotMovePieceToRightInPositionTwoBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/right/obstacle/pos_02");
        this.shouldNotMovePieceToRight(this.piece);
    }

    //Test moveRight not allowed in position 3
    @Test
    public void shouldNotMovePieceToRightInPositionThreeBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/right/obstacle/pos_03");
        this.shouldNotMovePieceToRight(this.piece);
    }

    //Test moveRight not allowed in position 0 after one rotation cycle
    @Test
    public void shouldNotMovePieceToRightInInitialPositionAfterOneRotationCycleBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/right/obstacle/pos_10");
        this.shouldNotMovePieceToRight(this.piece);
    }

    //endregion

    //#region Test: Moving to down allowed

    //Test moveDown allowed in position 0
    @Test
    public void shouldMovePieceDownInInitialPosition(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/down/allowed/pos_00");
        this.shouldMovePieceDown(this.piece, this.piece.moveDown());
    }

    //Test moveDown allowed in position 1
    @Test
    public void shouldMovePieceDownInPositionOne(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/down/allowed/pos_01");
        this.shouldMovePieceDown(this.piece, this.piece.moveDown());
    }

    //Test moveDown allowed in position 2
    @Test
    public void shouldMovePieceDownInPositionTwo(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/down/allowed/pos_02");
        this.shouldMovePieceDown(this.piece, this.piece.moveDown());
    }

    //Test moveDown allowed in position 3
    @Test
    public void shouldMovePieceDownInPositionThree(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/down/allowed/pos_03");
        this.shouldMovePieceDown(this.piece, this.piece.moveDown());
    }

    //Test moveDown allowed in position 0 after one rotation cycle
    @Test
    public void shouldMovePieceDownAfterOneRotationCycle(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/down/allowed/pos_10");
        this.shouldMovePieceDown(this.piece, this.piece.moveDown());
    }

    //endregion

    //#region Test: Moving to down not allowed because of boundary

    //Test moveDown allowed in position 0
    @Test
    public void shouldReleasePieceWhenMovingDownInInitialPositionBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/down/boundary/pos_00");
        this.shouldReleasePieceWhenMovingDown(this.piece);
    }

    //Test moveDown allowed in position 1
    @Test
    public void shouldReleasePieceWhenMovingDownInPositionOneBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/down/boundary/pos_01");
        this.shouldReleasePieceWhenMovingDown(this.piece);
    }

    //Test moveDown allowed in position 2
    @Test
    public void shouldReleasePieceWhenMovingDownInPositionTwoBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/down/boundary/pos_02");
        this.shouldReleasePieceWhenMovingDown(this.piece);
    }

    //Test moveDown allowed in position 3
    @Test
    public void shouldReleasePieceWhenMovingDownInPositionThreeBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/down/boundary/pos_03");
        this.shouldReleasePieceWhenMovingDown(this.piece);
    }

    //Test moveDown allowed in position 0 after one rotation cycle
    @Test
    public void shouldReleasePieceWhenMovingDownInInitialPositionAfterOneRotationCycleBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/down/boundary/pos_10");
        this.shouldReleasePieceWhenMovingDown(this.piece);
    }

    //endregion

    //#region Test: Moving to down not allowed because of obstacle

    //Test moveDown allowed in position 0
    @Test
    public void shouldReleasePieceWhenMovingDownInInitialPositionBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/down/obstacle/pos_00");
        this.shouldReleasePieceWhenMovingDown(this.piece);
    }

    //Test moveDown allowed in position 1
    @Test
    public void shouldReleasePieceWhenMovingDownInPositionOneBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/down/obstacle/pos_01");
        this.shouldReleasePieceWhenMovingDown(this.piece);
    }

    //Test moveDown allowed in position 2
    @Test
    public void shouldReleasePieceWhenMovingDownInPositionTwoBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/down/obstacle/pos_02");
        this.shouldReleasePieceWhenMovingDown(this.piece);
    }

    //Test moveDown allowed in position 3
    @Test
    public void shouldReleasePieceWhenMovingDownInPositionThreeBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/down/obstacle/pos_03");
        this.shouldReleasePieceWhenMovingDown(this.piece);
    }

    //Test moveDown allowed in position 0 after one rotation cycle
    @Test
    public void shouldReleasePieceWhenMovingDownInInitialPositionAfterOneRotationCycleBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/down/obstacle/pos_10");
        this.shouldReleasePieceWhenMovingDown(this.piece);
    }

    //endregion

    //#region Test: Rows rearranged covering 4 lines after piece released because of boundary

    //Test rows rearranged after releasePiece in position 1
    @Test
    public void shouldRearrangeBoardCoveringFourLinesWhenReleasingPieceInPositionOneBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/bottom/4_lines/pos_01");
    }

    //Test rows rearranged after releasePiece in position 3
    @Test
    public void shouldRearrangeBoardCoveringFourLinesWhenReleasingPieceInPositionThreeBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/bottom/4_lines/pos_03");
    }

    //endregion

    //#region Test: Rows rearranged covering 3 lines after piece released because of boundary

    //Test rows rearranged after releasePiece in position 1
    @Test
    public void shouldRearrangeBoardCoveringThreeLinesWhenReleasingPieceInPositionOneBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/bottom/3_lines/pos_01");
    }

    //Test rows rearranged after releasePiece in position 3
    @Test
    public void shouldRearrangeBoardCoveringThreeLinesWhenReleasingPieceInPositionThreeBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/bottom/3_lines/pos_03");
    }

    //endregion

    //#region Test: Rows rearranged covering 2 lines after piece released because of boundary

    //Test rows rearranged after releasePiece in position 1
    @Test
    public void shouldRearrangeBoardCoveringTwoLinesWhenReleasingPieceInPositionOneBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/bottom/2_lines/pos_01");
    }

    //Test rows rearranged after releasePiece in position 3
    @Test
    public void shouldRearrangeBoardCoveringTwoLinesWhenReleasingPieceInPositionThreeBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/bottom/2_lines/pos_03");
    }

    //endregion

    //#region Test: Rows rearranged covering 1 line after piece released because of boundary

    //Test rows rearranged after releasePiece in position 0
    @Test
    public void shouldRearrangeBoardCoveringOneLineWhenReleasingPieceInInitialPositionBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/bottom/1_line/pos_00");
    }

    //Test rows rearranged after releasePiece in position 1
    @Test
    public void shouldRearrangeBoardCoveringOneLineWhenReleasingPieceInPositionOneBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/bottom/1_line/pos_01");
    }

    //Test rows rearranged after releasePiece in position 2
    @Test
    public void shouldRearrangeBoardCoveringOneLineWhenReleasingPieceInPositionTwoBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/bottom/1_line/pos_02");
    }

    //Test rows rearranged after releasePiece in position 3
    @Test
    public void shouldRearrangeBoardCoveringOneLineWhenReleasingPieceInPositionThreeBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/bottom/1_line/pos_03");
    }

    //Test rows rearranged after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldRearrangeBoardCoveringOneLineWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/bottom/1_line/pos_10");
    }

    //#endregion

    //#region Test: Rows not rearranged covering 0 lines after piece released because of boundary

    //Test rows rearranged after releasePiece in position 0
    @Test
    public void shouldNotRearrangeBoardCoveringZeroLinesWhenReleasingPieceInInitialPositionBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/bottom/0_lines/pos_00");
    }

    //Test rows rearranged after releasePiece in position 1
    @Test
    public void shouldNotRearrangeBoardCoveringZeroLinesWhenReleasingPieceInPositionOneBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/bottom/0_lines/pos_01");
    }

    //Test rows rearranged after releasePiece in position 2
    @Test
    public void shouldNotRearrangeBoardCoveringZeroLinesWhenReleasingPieceInPositionTwoBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/bottom/0_lines/pos_02");
    }

    //Test rows rearranged after releasePiece in position 3
    @Test
    public void shouldNotRearrangeBoardCoveringZeroLinesWhenReleasingPieceInPositionThreeBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/bottom/0_lines/pos_03");
    }

    //Test rows rearranged after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotRearrangeBoardCoveringZeroLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/bottom/0_lines/pos_10");
    }

    //#endregion

    //#region Test: Rows rearranged covering 4 lines after piece released because of obstacle

    //Test rows rearranged after releasePiece in position 1
    @Test
    public void shouldRearrangeBoardCoveringFourLinesWhenReleasingPieceInPositionOneBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/middle/4_lines/pos_01");
    }

    //Test rows rearranged after releasePiece in position 3
    @Test
    public void shouldRearrangeBoardCoveringFourLinesWhenReleasingPieceInPositionThreeBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/middle/4_lines/pos_03");
    }

    //#endregion

    //#region Test: Rows rearranged covering 3 lines after piece released because of obstacle

    //Test rows rearranged after releasePiece in position 1
    @Test
    public void shouldRearrangeBoardCoveringThreeLinesWhenReleasingPieceInPositionOneBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/middle/3_lines/pos_01");
    }

    //Test rows rearranged after releasePiece in position 3
    @Test
    public void shouldRearrangeBoardCoveringThreeLinesWhenReleasingPieceInPositionThreeBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/middle/3_lines/pos_03");
    }

    //#endregion

    //#region Test: Rows rearranged covering 2 lines after piece released because of obstacle

    //Test rows rearranged after releasePiece in position 1
    @Test
    public void shouldRearrangeBoardCoveringTwoLinesWhenReleasingPieceInPositionOneBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/middle/2_lines/pos_01");
    }

    //Test rows rearranged after releasePiece in position 3
    @Test
    public void shouldRearrangeBoardCoveringTwoLinesWhenReleasingPieceInPositionThreeBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/middle/2_lines/pos_03");
    }

    //#endregion

    //#region Test: Rows rearranged covering 1 line after piece released because of obstacle

    //Test rows rearranged after releasePiece in position 0
    @Test
    public void shouldRearrangeBoardCoveringOneLineWhenReleasingPieceInInitialPositionBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/middle/1_line/pos_00");
    }

    //Test rows rearranged after releasePiece in position 1
    @Test
    public void shouldRearrangeBoardCoveringOneLineWhenReleasingPieceInPositionOneBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/middle/1_line/pos_01");
    }

    //Test rows rearranged after releasePiece in position 2
    @Test
    public void shouldRearrangeBoardCoveringOneLineWhenReleasingPieceInPositionTwoBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/middle/1_line/pos_02");
    }

    //Test rows rearranged after releasePiece in position 3
    @Test
    public void shouldRearrangeBoardCoveringOneLineWhenReleasingPieceInPositionThreeBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/middle/1_line/pos_03");
    }

    //Test rows rearranged after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldRearrangeBoardCoveringOneLineWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/middle/1_line/pos_10");
    }

    //#endregion

    //#region Test: Rows not rearranged covering 0 lines after piece released because of obstacle

    //Test rows not rearranged after releasePiece in position 0
    @Test
    public void shouldNotRearrangeBoardCoveringZeroLinesWhenReleasingPieceInInitialPositionBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/middle/0_lines/pos_00");
    }

    //Test rows not rearranged after releasePiece in position 1
    @Test
    public void shouldNotRearrangeBoardCoveringZeroLinesWhenReleasingPieceInPositionOneBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/middle/0_lines/pos_01");
    }

    //Test rows not rearranged after releasePiece in position 2
    @Test
    public void shouldNotRearrangeBoardCoveringZeroLinesWhenReleasingPieceInPositionTwoBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/middle/0_lines/pos_02");
    }

    //Test rows not rearranged after releasePiece in position 3
    @Test
    public void shouldNotRearrangeBoardCoveringZeroLinesWhenReleasingPieceInPositionThreeBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/middle/0_lines/pos_03");
    }

    //Test rows not rearranged after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotRearrangeBoardCoveringZeroLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/middle/0_lines/pos_10");
    }

    //#endregion

    //#region Test: Rows rearranged covering 4 lines after piece released because of obstacle on the top

    //Test rows rearranged after releasePiece in position 1
    @Test
    public void shouldRearrangeBoardCoveringFourLinesWhenReleasingPieceInPositionOneBecauseOfObstacleOnTheTop() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/top/4_lines/pos_01");
    }

    //Test rows rearranged after releasePiece in position 3
    @Test
    public void shouldRearrangeBoardCoveringFourLinesWhenReleasingPieceInPositionThreeBecauseOfObstacleOnTheTop() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/top/4_lines/pos_03");
    }

    //#endregion

    //#region Test: Rows rearranged covering 3 lines after piece released because of obstacle on the top

    //Test rows rearranged after releasePiece in position 1
    @Test
    public void shouldRearrangeBoardCoveringThreeLinesWhenReleasingPieceInPositionOneBecauseOfObstacleOnTheTop() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/top/3_lines/pos_01");
    }

    //Test rows rearranged after releasePiece in position 3
    @Test
    public void shouldRearrangeBoardCoveringThreeLinesWhenReleasingPieceInPositionThreeBecauseOfObstacleOnTheTop() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/top/3_lines/pos_03");
    }

    //#endregion

    //#region Test: Rows rearranged covering 2 lines after piece released because of obstacle on the top

    //Test rows rearranged after releasePiece in position 1
    @Test
    public void shouldRearrangeBoardCoveringTwoLinesWhenReleasingPieceInPositionOneBecauseOfObstacleOnTheTop() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/top/2_lines/pos_01");
    }

    //Test rows rearranged after releasePiece in position 3
    @Test
    public void shouldRearrangeBoardCoveringTwoLinesWhenReleasingPieceInPositionThreeBecauseOfObstacleOnTheTop() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/top/2_lines/pos_03");
    }

    //#endregion

    //#region Test: Rows rearranged covering 1 line after piece released because of obstacle on the top

    //Test rows rearranged after releasePiece in position 0
    @Test
    public void shouldRearrangeBoardCoveringOneLineWhenReleasingPieceInInitialPositionBecauseOfObstacleOnTheTop() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/top/1_line/pos_00");
    }

    //Test rows rearranged after releasePiece in position 1
    @Test
    public void shouldRearrangeBoardCoveringOneLineWhenReleasingPieceInPositionOneBecauseOfObstacleOnTheTop() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/top/1_line/pos_01");
    }

    //Test rows rearranged after releasePiece in position 2
    @Test
    public void shouldRearrangeBoardCoveringOneLineWhenReleasingPieceInPositionTwoBecauseOfObstacleOnTheTop() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/top/1_line/pos_02");
    }

    //Test rows rearranged after releasePiece in position 3
    @Test
    public void shouldRearrangeBoardCoveringOneLineWhenReleasingPieceInPositionThreeBecauseOfObstacleOnTheTop() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/top/1_line/pos_03");
    }

    //Test rows rearranged after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldRearrangeBoardCoveringOneLineWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacleOnTheTop() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/top/1_line/pos_10");
    }

    //#endregion

    //#region Test: Rows not rearranged covering 0 lines after piece released because of obstacle on the top

    //Test rows rearranged after releasePiece in position 0
    @Test
    public void shouldNotRearrangeBoardCoveringZeroLinesWhenReleasingPieceInInitialPositionBecauseOfObstacleOnTheTop() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/top/0_lines/pos_00");
    }

    //Test rows rearranged after releasePiece in position 1
    @Test
    public void shouldNotRearrangeBoardCoveringZeroLinesWhenReleasingPieceInPositionOneBecauseOfObstacleOnTheTop() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/top/0_lines/pos_01");
    }

    //Test rows rearranged after releasePiece in position 2
    @Test
    public void shouldNotRearrangeBoardCoveringZeroLinesWhenReleasingPieceInPositionTwoBecauseOfObstacleOnTheTop() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/top/0_lines/pos_02");
    }

    //Test rows rearranged after releasePiece in position 3
    @Test
    public void shouldNotRearrangeBoardCoveringZeroLinesWhenReleasingPieceInPositionThreeBecauseOfObstacleOnTheTop() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/top/0_lines/pos_03");
    }

    //Test rows rearranged after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotRearrangeBoardCoveringZeroLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacleOnTheTop() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/top/0_lines/pos_10");
    }

    //#endregion

    //#region Test: Listener notified with score covering 4 lines after piece released because of boundary

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyScoreListenerCoveringFourLinesWhenReleasingPieceInPositionOneBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/bottom/4_lines/pos_01");
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyScoreListenerCoveringFourLinesWhenReleasingPieceInPositionThreeBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/bottom/4_lines/pos_03");
    }

    //endregion

    //#region Test: Listener notified with score covering 3 lines after piece released because of boundary

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyScoreListenerCoveringThreeLinesWhenReleasingPieceInPositionOneBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/bottom/3_lines/pos_01");
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyScoreListenerCoveringThreeLinesWhenReleasingPieceInPositionThreeBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/bottom/3_lines/pos_03");
    }

    //endregion

    //#region Test: Listener notified with score covering 2 lines after piece released because of boundary

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyScoreListenerCoveringTwoLinesWhenReleasingPieceInPositionOneBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/bottom/2_lines/pos_01");
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyScoreListenerCoveringTwoLinesWhenReleasingPieceInPositionThreeBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/bottom/2_lines/pos_03");
    }

    //endregion

    //#region Test: Listener notified with score covering 1 line after piece released because of boundary

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyScoreListenerCoveringOneLineWhenReleasingPieceInInitialPositionBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/bottom/1_line/pos_00");
    }

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyScoreListenerCoveringOneLineWhenReleasingPieceInPositionOneBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/bottom/1_line/pos_01");
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyScoreListenerCoveringOneLineWhenReleasingPieceInPositionTwoBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/bottom/1_line/pos_02");
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyScoreListenerCoveringOneLineWhenReleasingPieceInPositionThreeBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/bottom/1_line/pos_03");
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyScoreListenerCoveringOneLineWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/bottom/1_line/pos_10");
    }

    //endregion

    //#region Test: Listener not notified with score covering 0 lines after piece released because of boundary

    //Test not notifyScored after releasePiece in position 0
    @Test
    public void shouldNotNotifyScoreListenerCoveringZeroLinesWhenReleasingPieceInInitialPositionBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/bottom/0_lines/pos_00");
    }

    //Test not notifyScored after releasePiece in position 1
    @Test
    public void shouldNotNotifyScoreListenerCoveringZeroLinesWhenReleasingPieceInPositionOneBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/bottom/0_lines/pos_01");
    }

    //Test not notifyScored after releasePiece in position 2
    @Test
    public void shouldNotNotifyScoreListenerCoveringZeroLinesWhenReleasingPieceInPositionTwoBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/bottom/0_lines/pos_02");
    }

    //Test not notifyScored after releasePiece in position 3
    @Test
    public void shouldNotNotifyScoreListenerCoveringZeroLinesWhenReleasingPieceInPositionThreeBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/bottom/0_lines/pos_03");
    }

    //Test not notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotNotifyScoreListenerCoveringZeroLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/bottom/0_lines/pos_10");
    }

    //endregion

    //#region Test: Listener notified with score covering 4 lines after piece released because of obstacle

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyScoreListenerCoveringFourLinesWhenReleasingPieceInPositionOneBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/middle/4_lines/pos_01");
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyScoreListenerCoveringFourLinesWhenReleasingPieceInPositionThreeBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/middle/4_lines/pos_03");
    }

    //endregion

    //#region Test: Listener notified with score covering 3 lines after piece released because of obstacle

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyScoreListenerCoveringThreeLinesWhenReleasingPieceInPositionOneBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/middle/3_lines/pos_01");
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyScoreListenerCoveringThreeLinesWhenReleasingPieceInPositionThreeBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/middle/3_lines/pos_03");
    }

    //endregion

    //#region Test: Listener notified with score covering 2 lines after piece released because of obstacle

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyScoreListenerCoveringTwoLinesWhenReleasingPieceInPositionOneBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/middle/2_lines/pos_01");
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyScoreListenerCoveringTwoLinesWhenReleasingPieceInPositionThreeBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/middle/2_lines/pos_03");
    }

    //endregion

    //#region Test: Listener notified with score covering 1 line after piece released because of obstacle

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyScoreListenerCoveringOneLineWhenReleasingPieceInInitialPositionBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/middle/1_line/pos_00");
    }

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyScoreListenerCoveringOneLineWhenReleasingPieceInPositionOneBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/middle/1_line/pos_01");
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyScoreListenerCoveringOneLineWhenReleasingPieceInPositionTwoBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/middle/1_line/pos_02");
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyScoreListenerCoveringOneLineWhenReleasingPieceInPositionThreeBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/middle/1_line/pos_03");
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyScoreListenerCoveringOneLineWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/middle/1_line/pos_10");
    }

    //endregion

    //#region Test: Listener not notified with score covering 0 lines after piece released because of obstacle

    //Test not notifyScored after releasePiece in position 0
    @Test
    public void shouldNotNotifyScoreListenerCoveringZeroLinesWhenReleasingPieceInInitialPositionBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/middle/0_lines/pos_00");
    }

    //Test not notifyScored after releasePiece in position 1
    @Test
    public void shouldNotNotifyScoreListenerCoveringZeroLinesWhenReleasingPieceInPositionOneBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/middle/0_lines/pos_01");
    }

    //Test not notifyScored after releasePiece in position 2
    @Test
    public void shouldNotNotifyScoreListenerCoveringZeroLinesWhenReleasingPieceInPositionTwoBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/middle/0_lines/pos_02");
    }

    //Test not notifyScored after releasePiece in position 3
    @Test
    public void shouldNotNotifyScoreListenerCoveringZeroLinesWhenReleasingPieceInPositionThreeBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/middle/0_lines/pos_03");
    }

    //Test not notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotNotifyScoreListenerCoveringZeroLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/middle/0_lines/pos_10");
    }

    //#endregion

    //#region Test: Listener notified with score covering 4 lines after piece released because of obstacle on the top

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyScoreListenerCoveringFourLinesWhenReleasingPieceInPositionOneBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/top/4_lines/pos_01");
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyScoreListenerCoveringFourLinesWhenReleasingPieceInPositionThreeBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/top/4_lines/pos_03");
    }

    //endregion

    //#region Test: Listener notified with score covering 3 lines after piece released because of obstacle on the top

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyScoreListenerCoveringThreeLinesWhenReleasingPieceInPositionOneBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/top/3_lines/pos_01");
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyScoreListenerCoveringThreeLinesWhenReleasingPieceInPositionThreeBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/top/3_lines/pos_03");
    }

    //endregion

    //#region Test: Listener notified with score covering 2 lines after piece released because of obstacle on the top

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyScoreListenerCoveringTwoLinesWhenReleasingPieceInPositionOneBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/top/2_lines/pos_01");
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyScoreListenerCoveringTwoLinesWhenReleasingPieceInPositionThreeBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/top/2_lines/pos_03");
    }

    //endregion

    //#region Test: Listener notified with score covering 1 line after piece released because of obstacle on the top

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyScoreListenerCoveringOneLineWhenReleasingPieceInInitialPositionBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/top/1_line/pos_00");
    }

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyScoreListenerCoveringOneLineWhenReleasingPieceInPositionOneBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/top/1_line/pos_01");
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyScoreListenerCoveringOneLineWhenReleasingPieceInPositionTwoBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/top/1_line/pos_02");
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyScoreListenerCoveringOneLineWhenReleasingPieceInPositionThreeBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/top/1_line/pos_03");
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyScoreListenerCoveringOneLineWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/top/1_line/pos_10");
    }

    //endregion

    //#region Test: Listener not notified with score covering 0 lines after piece released because of obstacle on the top

    //Test not notifyScored after releasePiece in position 0
    @Test
    public void shouldNotNotifyScoreListenerCoveringZeroLinesWhenReleasingPieceInInitialPositionBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/top/0_lines/pos_00");
    }

    //Test not notifyScored after releasePiece in position 1
    @Test
    public void shouldNotNotifyScoreListenerCoveringZeroLinesWhenReleasingPieceInPositionOneBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/top/0_lines/pos_01");
    }

    //Test not notifyScored after releasePiece in position 2
    @Test
    public void shouldNotNotifyScoreListenerCoveringZeroLinesWhenReleasingPieceInPositionTwoBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/top/0_lines/pos_02");
    }

    //Test not notifyScored after releasePiece in position 3
    @Test
    public void shouldNotNotifyScoreListenerCoveringZeroLinesWhenReleasingPieceInPositionThreeBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/top/0_lines/pos_03");
    }

    //Test not notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotNotifyScoreListenerCoveringZeroLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/top/0_lines/pos_10");
    }

    //#endregion

    //#region Test: Listener piece released notified when covering 4 lines after piece released because of boundary

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringFourLinesInPositionOneBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/bottom/4_lines/pos_01", times(1));
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringFourLinesInPositionThreeBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/bottom/4_lines/pos_03", times(1));
    }

    //endregion

    //#region Test: Listener piece released notified when covering 3 lines after piece released because of boundary

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringThreeLinesInPositionOneBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/bottom/3_lines/pos_01", times(1));
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringThreeLinesInPositionThreeBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/bottom/3_lines/pos_03", times(1));
    }

    //endregion

    //#region Test: Listener piece released notified when covering 2 lines after piece released because of boundary

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringTwoLinesInPositionOneBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/bottom/2_lines/pos_01", times(1));
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringTwoLinesInPositionThreeBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/bottom/2_lines/pos_03", times(1));
    }

    //endregion

    //#region Test: Listener piece released notified when covering 1 line after piece released because of boundary

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInInitialPositionBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/bottom/1_line/pos_00", times(1));
    }

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInPositionOneBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/bottom/1_line/pos_01", times(1));
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInPositionTwoBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/bottom/1_line/pos_02", times(1));
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInPositionThreeBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/bottom/1_line/pos_03", times(1));
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInInitialPositionAfterOneRotationCycleBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/bottom/1_line/pos_10", times(1));
    }

    //endregion

    //#region Test: Listener piece released notified when covering 0 lines after piece released because of boundary

    //Test not notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringZeroLinesInInitialPositionBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/bottom/0_lines/pos_00", times(1));
    }

    //Test not notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringZeroLinesInPositionOneBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/bottom/0_lines/pos_01", times(1));
    }

    //Test not notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringZeroLinesInPositionTwoBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/bottom/0_lines/pos_02", times(1));
    }

    //Test not notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringZeroLinesInPositionThreeBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/bottom/0_lines/pos_03", times(1));
    }

    //Test not notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringZeroLinesInInitialPositionAfterOneRotationCycleBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/bottom/0_lines/pos_10", times(1));
    }

    //endregion

    //#region Test: Listener piece released notified when covering 4 lines after piece released because of obstacle

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringFourLinesInPositionOneBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/middle/4_lines/pos_01", times(1));
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringFourLinesInPositionThreeBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/middle/4_lines/pos_03", times(1));
    }

    //endregion

    //#region Test: Listener piece released notified when covering 3 lines after piece released because of obstacle

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringThreeLinesInPositionOneBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/middle/3_lines/pos_01", times(1));
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringThreeLinesInPositionThreeBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/middle/3_lines/pos_03", times(1));
    }

    //endregion

    //#region Test: Listener piece released notified when covering 2 lines after piece released because of obstacle

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringTwoLinesInPositionOneBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/middle/2_lines/pos_01", times(1));
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringTwoLinesInPositionThreeBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/middle/2_lines/pos_03", times(1));
    }

    //endregion

    //#region Test: Listener piece released notified when covering 1 line after piece released because of obstacle

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInInitialPositionBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/middle/1_line/pos_00", times(1));
    }

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInPositionOneBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/middle/1_line/pos_01", times(1));
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInPositionTwoBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/middle/1_line/pos_02", times(1));
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInPositionThreeBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/middle/1_line/pos_03", times(1));
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInInitialPositionAfterOneRotationCycleBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/middle/1_line/pos_10", times(1));
    }

    //endregion

    //#region Test: Listener piece released notified when covering 0 lines after piece released because of obstacle

    //Test not notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringZeroLinesInInitialPositionBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/middle/0_lines/pos_00", times(1));
    }

    //Test not notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringZeroLinesInPositionOneBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/middle/0_lines/pos_01", times(1));
    }

    //Test not notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringZeroLinesInPositionTwoBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/middle/0_lines/pos_02", times(1));
    }

    //Test not notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringZeroLinesInPositionThreeBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/middle/0_lines/pos_03", times(1));
    }

    //Test not notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringZeroLinesInInitialPositionAfterOneRotationCycleBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/middle/0_lines/pos_10", times(1));
    }

    //endregion

    //#region Test: Listener piece released notified when covering 4 lines after piece released because of obstacle on the top

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringFourLinesInPositionOneBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/top/4_lines/pos_01", times(1));
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringFourLinesInPositionThreeBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/top/4_lines/pos_03", times(1));
    }

    //endregion

    //#region Test: Listener piece released notified when covering 3 lines after piece released because of obstacle on the top

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringThreeLinesInPositionOneBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/top/3_lines/pos_01", times(1));
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringThreeLinesInPositionThreeBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/top/3_lines/pos_03", times(1));
    }

    //endregion

    //#region Test: Listener piece released notified when covering 2 lines after piece released because of obstacle on the top

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringTwoLinesInPositionOneBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/top/2_lines/pos_01", times(1));
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringTwoLinesInPositionThreeBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/top/2_lines/pos_03", times(1));
    }

    //endregion

    //#region Test: Listener piece released notified when covering 1 line after piece released because of obstacle on the top

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInInitialPositionBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/top/1_line/pos_00", times(1));
    }

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInPositionOneBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/top/1_line/pos_01", times(1));
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInPositionTwoBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/top/1_line/pos_02", times(1));
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInPositionThreeBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/top/1_line/pos_03", times(1));
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInInitialPositionAfterOneRotationCycleBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/top/1_line/pos_10", times(1));
    }

    //endregion

    //#region Test: Listener piece released notified when covering 0 lines after piece released because of obstacle on the top

    //Test not notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringZeroLinesInInitialPositionBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/top/0_lines/pos_00", times(1));
    }

    //Test not notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringZeroLinesInPositionOneBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/top/0_lines/pos_01", times(1));
    }

    //Test not notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringZeroLinesInPositionTwoBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/top/0_lines/pos_02", times(1));
    }

    //Test not notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringZeroLinesInPositionThreeBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/top/0_lines/pos_03", times(1));
    }

    //Test not notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringZeroLinesInInitialPositionAfterOneRotationCycleBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/top/0_lines/pos_10", times(1));
    }

    //endregion

    //#region Test: Listener game over not notified when covering 4 lines after piece released because of boundary

    //Test Game Over not notified after releasePiece in position 1
    @Test
    public void shouldNotNotifyGameOverListenerCoveringFourLinesWhenReleasingPieceInPositionOneBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/bottom/4_lines/pos_01", never());
    }

    //Test Game Over not notified after releasePiece in position 3
    @Test
    public void shouldNotNotifyGameOverListenerCoveringFourLinesWhenReleasingPieceInPositionThreeBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/bottom/4_lines/pos_03", never());
    }

    //#endregion

    //#region Test: Listener game over not notified when covering 3 lines after piece released because of boundary

    //Test Game Over not notified after releasePiece in position 1
    @Test
    public void shouldNotNotifyGameOverListenerCoveringThreeLinesWhenReleasingPieceInPositionOneBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/bottom/3_lines/pos_01", never());
    }

    //Test Game Over not notified after releasePiece in position 3
    @Test
    public void shouldNotNotifyGameOverListenerCoveringThreeLinesWhenReleasingPieceInPositionThreeBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/bottom/3_lines/pos_03", never());
    }

    //#endregion

    //#region Test: Listener game over not notified when covering 2 lines after piece released because of boundary

    //Test Game Over not notified after releasePiece in position 1
    @Test
    public void shouldNotNotifyGameOverListenerCoveringTwoLinesWhenReleasingPieceInPositionOneBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/bottom/2_lines/pos_01", never());
    }

    //Test Game Over not notified after releasePiece in position 3
    @Test
    public void shouldNotNotifyGameOverListenerCoveringTwoLinesWhenReleasingPieceInPositionThreeBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/bottom/2_lines/pos_03", never());
    }

    //#endregion

    //#region Test: Listener game over not notified when covering 1 line after piece released because of boundary

    //Test Game Over not notified after releasePiece in position 0
    @Test
    public void shouldNotNotifyGameOverListenerCoveringOneLineWhenReleasingPieceInInitialPositionBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/bottom/1_line/pos_00", never());
    }

    //Test Game Over not notified after releasePiece in position 1
    @Test
    public void shouldNotNotifyGameOverListenerCoveringOneLineWhenReleasingPieceInPositionOneBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/bottom/1_line/pos_01", never());
    }

    //Test Game Over not notified after releasePiece in position 2
    @Test
    public void shouldNotNotifyGameOverListenerCoveringOneLineWhenReleasingPieceInPositionTwoBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/bottom/1_line/pos_02", never());
    }

    //Test Game Over not notified after releasePiece in position 3
    @Test
    public void shouldNotNotifyGameOverListenerCoveringOneLineWhenReleasingPieceInPositionThreeBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/bottom/1_line/pos_03", never());
    }

    //Test Game Over not notified after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotNotifyGameOverListenerCoveringOneLineWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/bottom/1_line/pos_10", never());
    }

    //#endregion

    //#region Test: Listener game over not notified when covering 0 lines after piece released because of boundary

    //Test Game Over not notified after releasePiece in position 0
    @Test
    public void shouldNotNotifyGameOverListenerCoveringZeroLinesWhenReleasingPieceInInitialPositionBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/bottom/0_lines/pos_00", never());
    }

    //Test Game Over not notified after releasePiece in position 1
    @Test
    public void shouldNotNotifyGameOverListenerCoveringZeroLinesWhenReleasingPieceInPositionOneBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/bottom/0_lines/pos_01", never());
    }

    //Test Game Over not notified after releasePiece in position 2
    @Test
    public void shouldNotNotifyGameOverListenerCoveringZeroLinesWhenReleasingPieceInPositionTwoBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/bottom/0_lines/pos_02", never());
    }

    //Test Game Over not notified after releasePiece in position 3
    @Test
    public void shouldNotNotifyGameOverListenerCoveringZeroLinesWhenReleasingPieceInPositionThreeBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/bottom/0_lines/pos_03", never());
    }

    //Test Game Over not notified after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotNotifyGameOverListenerCoveringZeroLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/bottom/0_lines/pos_10", never());
    }

    //#endregion

    //#region Test: Listener game over not notified when covering 4 lines after piece released because of obstacle

    //Test Game Over not notified after releasePiece in position 1
    @Test
    public void shouldNotNotifyGameOverListenerCoveringFourLinesWhenReleasingPieceInPositionOneBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/middle/4_lines/pos_01", never());
    }

    //Test Game Over not notified after releasePiece in position 3
    @Test
    public void shouldNotNotifyGameOverListenerCoveringFourLinesWhenReleasingPieceInPositionThreeBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/middle/4_lines/pos_03", never());
    }

    //#endregion

    //#region Test: Listener game over not notified when covering 3 lines after piece released because of obstacle

    //Test Game Over not notified after releasePiece in position 1
    @Test
    public void shouldNotNotifyGameOverListenerCoveringThreeLinesWhenReleasingPieceInPositionOneBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/middle/3_lines/pos_01", never());
    }

    //Test Game Over not notified after releasePiece in position 3
    @Test
    public void shouldNotNotifyGameOverListenerCoveringThreeLinesWhenReleasingPieceInPositionThreeBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/middle/3_lines/pos_03", never());
    }

    //#endregion

    //#region Test: Listener game over not notified when covering 2 lines after piece released because of obstacle

    //Test Game Over not notified after releasePiece in position 1
    @Test
    public void shouldNotNotifyGameOverListenerCoveringTwoLinesWhenReleasingPieceInPositionOneBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/middle/2_lines/pos_01", never());
    }

    //Test Game Over not notified after releasePiece in position 3
    @Test
    public void shouldNotNotifyGameOverListenerCoveringTwoLinesWhenReleasingPieceInPositionThreeBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/middle/2_lines/pos_03", never());
    }

    //#endregion

    //#region Test: Listener game over not notified when covering 1 line after piece released because of obstacle

    //Test Game Over not notified after releasePiece in position 0
    @Test
    public void shouldNotNotifyGameOverListenerCoveringOneLineWhenReleasingPieceInInitialPositionBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/middle/1_line/pos_00", never());
    }

    //Test Game Over not notified after releasePiece in position 1
    @Test
    public void shouldNotNotifyGameOverListenerCoveringOneLineWhenReleasingPieceInPositionOneBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/middle/1_line/pos_01", never());
    }

    //Test Game Over not notified after releasePiece in position 2
    @Test
    public void shouldNotNotifyGameOverListenerCoveringOneLineWhenReleasingPieceInPositionTwoBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/middle/1_line/pos_02", never());
    }

    //Test Game Over not notified after releasePiece in position 3
    @Test
    public void shouldNotNotifyGameOverListenerCoveringOneLineWhenReleasingPieceInPositionThreeBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/middle/1_line/pos_03", never());
    }

    //Test Game Over not notified after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotNotifyGameOverListenerCoveringOneLineWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/middle/1_line/pos_10", never());
    }

    //#endregion

    //#region Test: Listener game over not notified when covering 0 lines after piece released because of obstacle

    //Test Game Over not notified after releasePiece in position 0
    @Test
    public void shouldNotNotifyGameOverListenerCoveringZeroLinesWhenReleasingPieceInInitialPositionBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/middle/0_lines/pos_00", never());
    }

    //Test Game Over not notified after releasePiece in position 1
    @Test
    public void shouldNotNotifyGameOverListenerCoveringZeroLinesWhenReleasingPieceInPositionOneBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/middle/0_lines/pos_01", never());
    }

    //Test Game Over not notified after releasePiece in position 2
    @Test
    public void shouldNotNotifyGameOverListenerCoveringZeroLinesWhenReleasingPieceInPositionTwoBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/middle/0_lines/pos_02", never());
    }

    //Test Game Over not notified after releasePiece in position 3
    @Test
    public void shouldNotNotifyGameOverListenerCoveringZeroLinesWhenReleasingPieceInPositionThreeBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/middle/0_lines/pos_03", never());
    }

    //Test Game Over not notified after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotNotifyGameOverListenerCoveringZeroLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/middle/0_lines/pos_10", never());
    }

    //#endregion

    //#region Test: Listener game over not notified when covering 4 lines after piece released because of obstacle on the top

    //Test Game Over not notified after releasePiece in position 1
    @Test
    public void shouldNotNotifyGameOverListenerCoveringFourLinesWhenReleasingPieceInPositionOneBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/top/4_lines/pos_01", never());
    }

    //Test Game Over not notified after releasePiece in position 3
    @Test
    public void shouldNotNotifyGameOverListenerCoveringFourLinesWhenReleasingPieceInPositionThreeBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/top/4_lines/pos_03", never());
    }

    //#endregion

    //#region Test: Listener game over not notified when covering 3 lines after piece released because of obstacle on the top

    //Test Game Over not notified after releasePiece in position 1
    @Test
    public void shouldNotNotifyGameOverListenerCoveringThreeLinesWhenReleasingPieceInPositionOneBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/top/3_lines/pos_01", never());
    }

    //Test Game Over not notified after releasePiece in position 3
    @Test
    public void shouldNotNotifyGameOverListenerCoveringThreeLinesWhenReleasingPieceInPositionThreeBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/top/3_lines/pos_03", never());
    }

    //#endregion

    //#region Test: Listener game over not notified when covering 2 lines after piece released because of obstacle on the top

    //Test Game Over not notified after releasePiece in position 1
    @Test
    public void shouldNotNotifyGameOverListenerCoveringTwoLinesWhenReleasingPieceInPositionOneBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/top/2_lines/pos_01", never());
    }

    //Test Game Over not notified after releasePiece in position 3
    @Test
    public void shouldNotNotifyGameOverListenerCoveringTwoLinesWhenReleasingPieceInPositionThreeBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/top/2_lines/pos_03", never());
    }

    //#endregion

    //#region Test: Listener game over not notified when covering 1 line after piece released because of obstacle on the top

    //Test Game Over not notified after releasePiece in position 0
    @Test
    public void shouldNotNotifyGameOverListenerCoveringOneLineWhenReleasingPieceInInitialPositionBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/top/1_line/pos_00", never());
    }

    //Test Game Over not notified after releasePiece in position 1
    @Test
    public void shouldNotNotifyGameOverListenerCoveringOneLineWhenReleasingPieceInPositionOneBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/top/1_line/pos_01", never());
    }

    //Test Game Over not notified after releasePiece in position 2
    @Test
    public void shouldNotNotifyGameOverListenerCoveringOneLineWhenReleasingPieceInPositionTwoBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/top/1_line/pos_02", never());
    }

    //Test Game Over not notified after releasePiece in position 3
    @Test
    public void shouldNotNotifyGameOverListenerCoveringOneLineWhenReleasingPieceInPositionThreeBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/top/1_line/pos_03", never());
    }

    //Test Game Over not notified after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotNotifyGameOverListenerCoveringOneLineWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/top/1_line/pos_10", never());
    }

    //#endregion

    //#region Test: Listener game over not notified when covering 0 lines after piece released because of obstacle on the top

    //Test Game Over not notified after releasePiece in position 0
    @Test
    public void shouldNotNotifyGameOverListenerCoveringZeroLinesWhenReleasingPieceInInitialPositionBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/top/0_lines/pos_00", never());
    }

    //Test Game Over not notified after releasePiece in position 1
    @Test
    public void shouldNotNotifyGameOverListenerCoveringZeroLinesWhenReleasingPieceInPositionOneBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/top/0_lines/pos_01", never());
    }

    //Test Game Over not notified after releasePiece in position 2
    @Test
    public void shouldNotNotifyGameOverListenerCoveringZeroLinesWhenReleasingPieceInPositionTwoBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/top/0_lines/pos_02", never());
    }

    //Test Game Over not notified after releasePiece in position 3
    @Test
    public void shouldNotNotifyGameOverListenerCoveringZeroLinesWhenReleasingPieceInPositionThreeBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/top/0_lines/pos_03", never());
    }

    //Test Game Over not notified after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotNotifyGameOverListenerCoveringZeroLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/top/0_lines/pos_10", never());
    }

    //#endregion

    //region Test: Listener game over notified covering 1 line after piece released when game over occurred in the same turn with 2 hidden rows overlapped

    //Test Game Over notified after releasePiece in position 1
    @Test
    public void shouldNotifyGameOverListenerWhenReleasingPieceCoveringOneLineInPositionOneOverlappingTwoRows() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/gameover/2_rows/pos_01_score_1", times(1));
    }

    //Test Game Over notified after releasePiece in position 3
    @Test
    public void shouldNotifyGameOverListenerWhenReleasingPieceCoveringOneLineInPositionThreeOverlappingTwoRows() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/gameover/2_rows/pos_03_score_1", times(1));
    }

    //#endregion

    //#region Test: Listener game over notified covering 1 line after piece released when game over occurred in the same turn with 1 hidden row overlapped

    //Test Game Over notified after releasePiece in position 1
    @Test
    public void shouldNotifyGameOverListenerWhenReleasingPieceCoveringOneLineInPositionOneOverlappingOneRow() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/gameover/1_row/pos_01_score_1", times(1));
    }

    //Test Game Over notified after releasePiece in position 3
    @Test
    public void shouldNotifyGameOverListenerWhenReleasingPieceCoveringOneLineInPositionThreeOverlappingOneRow() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/gameover/1_row/pos_03_score_1", times(1));
    }

    //#endregion

    //#region Test: Listener game over notified with 4 hidden rows overlapped

    //Test Game Over notified after releasePiece in position 1
    @Test
    public void shouldNotifyGameOverListenerWhenReleasingPieceInPositionOneOverlappingFourRows() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/gameover/4_rows/pos_01_no_score", times(1));
    }

    //Test Game Over notified after releasePiece in position 3
    @Test
    public void shouldNotifyGameOverListenerWhenReleasingPieceInPositionThreeOverlappingFourRows() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/gameover/4_rows/pos_03_no_score", times(1));
    }

    //#endregion

    //#region Test: Listener game over notified with 3 hidden rows overlapped

    //Test Game Over notified after releasePiece in position 1
    @Test
    public void shouldNotifyGameOverListenerWhenReleasingPieceInPositionOneOverlappingThreeRows() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/gameover/3_rows/pos_01_no_score", times(1));
    }

    //Test Game Over notified after releasePiece in position 3
    @Test
    public void shouldNotifyGameOverListenerWhenReleasingPieceInPositionThreeOverlappingThreeRows() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/gameover/3_rows/pos_03_no_score", times(1));
    }

    //#endregion

    //#region Test: Listener game over notified with 2 hidden rows overlapped

    //Test Game Over notified after releasePiece in position 1
    @Test
    public void shouldNotifyGameOverListenerWhenReleasingPieceInPositionOneOverlappingTwoRows() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/gameover/2_rows/pos_01_no_score", times(1));
    }

    //Test Game Over notified after releasePiece in position 3
    @Test
    public void shouldNotifyGameOverListenerWhenReleasingPieceInPositionThreeOverlappingTwoRows() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/gameover/2_rows/pos_03_no_score", times(1));
    }

    //#endregion

    //#region Test: Listener game over notified with 1 hidden row overlapped

    //Test Game Over notified after releasePiece in position 0
    @Test
    public void shouldNotifyGameOverListenerWhenReleasingPieceInInitialPositionOverlappingOneRow() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/gameover/1_row/pos_00_no_score", times(1));
    }

    //Test Game Over notified after releasePiece in position 1
    @Test
    public void shouldNotifyGameOverListenerWhenReleasingPieceInPositionOneOverlappingOneRow() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/gameover/1_row/pos_01_no_score", times(1));
    }

    //Test Game Over notified after releasePiece in position 2
    @Test
    public void shouldNotifyGameOverListenerWhenReleasingPieceInPositionTwoOverlappingOneRow() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/gameover/1_row/pos_02_no_score", times(1));
    }

    //Test Game Over notified after releasePiece in position 3
    @Test
    public void shouldNotifyGameOverListenerWhenReleasingPieceInPositionThreeOverlappingOneRow() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/gameover/1_row/pos_03_no_score", times(1));
    }

    //Test Game Over notified after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyGameOverListenerWhenReleasingPieceAfterOneRotationCycleOverlappingOneRow() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/pipe/release/gameover/1_row/pos_10_no_score", times(1));
    }

    //#endregion

    //#region Test: Listener notified with score covering 1 line after piece released when game over occurred in the same turn with 2 hidden rows overlapped

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyScoreListenerWhenReleasingPieceCoveringOneLineInPositionOneOverlappingTwoRows() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/gameover/2_rows/pos_01_score_1");
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyScoreListenerWhenReleasingPieceCoveringOneLineInPositionThreeOverlappingTwoRows() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/gameover/2_rows/pos_03_score_1");
    }

    //#endregion

    //#region Test: Listener notified with score covering 1 line after piece released when game over occurred in the same turn with 1 hidden row overlapped

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyScoreListenerWhenReleasingPieceCoveringOneLineInPositionOneOverlappingOneRow() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/gameover/1_row/pos_01_score_1");
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyScoreListenerWhenReleasingPieceCoveringOneLineInPositionThreeOverlappingOneRow() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/gameover/1_row/pos_03_score_1");
    }

    //#endregion

    //#region Test: Listener not notified with score after piece released when game over occurred in the same turn with 4 hidden rows overlapped

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyScoreListenerWhenReleasingPieceInPositionOneOverlappingFourRows() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/gameover/4_rows/pos_01_no_score");
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyScoreListenerWhenReleasingPieceInPositionThreeOverlappingFourRows() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/gameover/4_rows/pos_03_no_score");
    }

    //#endregion

    //#region Test: Listener not notified with score after piece released when game over occurred in the same turn with 3 hidden rows overlapped

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyScoreListenerWhenReleasingPieceInPositionOneOverlappingThreeRows() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/gameover/3_rows/pos_01_no_score");
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyScoreListenerWhenReleasingPieceInPositionThreeOverlappingThreeRows() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/gameover/3_rows/pos_03_no_score");
    }

    //#endregion

    //#region Test: Listener not notified with score after piece released when game over occurred in the same turn with 2 hidden rows overlapped

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyScoreListenerWhenReleasingPieceInPositionOneOverlappingTwoRows() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/gameover/2_rows/pos_01_no_score");
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyScoreListenerWhenReleasingPieceInPositionThreeOverlappingTwoRows() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/gameover/2_rows/pos_03_no_score");
    }

    //#endregion

    //#region Test: Listener not notified with score after piece released when game over occurred in the same turn with 1 hidden row overlapped

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyScoreListenerWhenReleasingPieceInInitialPositionOverlappingOneRow() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/gameover/1_row/pos_00_no_score");
    }

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyScoreListenerWhenReleasingPieceInPositionOneOverlappingOneRow() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/gameover/1_row/pos_01_no_score");
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyScoreListenerWhenReleasingPieceInPositionTwoOverlappingOneRow() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/gameover/1_row/pos_02_no_score");
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyScoreListenerWhenReleasingPieceInPositionThreeOverlappingOneRow() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/gameover/1_row/pos_03_no_score");
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyScoreListenerWhenReleasingPieceInInitialPositionAfterOneRotationCycleOverlappingOneRow() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/pipe/release/gameover/1_row/pos_10_no_score");
    }

    //#endregion

    //#region Test: Rows rearranged covering 1 line after piece released when game over occurred in the same turn with 2 hidden rows overlapped

    //Test rows not rearranged after releasePiece in position 1
    @Test
    public void shouldRearrangeBoardWhenReleasingPieceCoveringOneLineInPositionOneOverlappingTwoRows() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/gameover/2_rows/pos_01_score_1");
    }

    //Test rows not rearranged after releasePiece in position 3
    @Test
    public void shouldRearrangeBoardWhenReleasingPieceCoveringOneLineInPositionThreeOverlappingTwoRows() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/gameover/2_rows/pos_03_score_1");
    }

    //#endregion

    //#region Test: Rows rearranged covering 1 line after piece released when game over occurred in the same turn with 1 hidden row overlapped

    //Test rows not rearranged after releasePiece in position 1
    @Test
    public void shouldRearrangeBoardWhenReleasingPieceCoveringOneLineInPositionOneOverlappingOneRow() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/gameover/1_row/pos_01_score_1");
    }

    //Test rows not rearranged after releasePiece in position 3
    @Test
    public void shouldRearrangeBoardWhenReleasingPieceCoveringOneLineInPositionThreeOverlappingOneRow() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/gameover/1_row/pos_03_score_1");
    }

    //#endregion

    //#region Test: Rows not rearranged when game over occurred with 2 hidden rows overlapped

    //Test rows not rearranged after releasePiece in position 1
    @Test
    public void shouldNotRearrangeBoardWhenReleasingPieceInPositionOneOverlappingTwoRows() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/gameover/2_rows/pos_01_no_score");
    }

    //Test rows not rearranged after releasePiece in position 3
    @Test
    public void shouldNotRearrangeBoardWhenReleasingPieceInPositionThreeOverlappingTwoRows() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/gameover/2_rows/pos_03_no_score");
    }

    //#endregion

    //#region Test: Rows not rearranged when game over occurred with 1 hidden row overlapped

    //Test rows not rearranged after releasePiece in position 0
    @Test
    public void shouldNotRearrangeBoardWhenReleasingPieceInInitialPositionOverlappingOneRow() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/gameover/1_row/pos_00_no_score");
    }

    //Test rows not rearranged after releasePiece in position 1
    @Test
    public void shouldNotRearrangeBoardWhenReleasingPieceInPositionOneOverlappingOneRow() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/gameover/1_row/pos_01_no_score");
    }

    //Test rows not rearranged after releasePiece in position 2
    @Test
    public void shouldNotRearrangeBoardWhenReleasingPieceInPositionTwoOverlappingOneRow() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/gameover/1_row/pos_02_no_score");
    }

    //Test rows not rearranged after releasePiece in position 3
    @Test
    public void shouldNotRearrangeBoardWhenReleasingPieceInPositionThreeOverlappingOneRow() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/gameover/1_row/pos_03_no_score");
    }

    //Test rows not rearranged after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotRearrangeBoardWhenReleasingPieceInInitialPositionAfterOneRotationCycleOverlappingOneRow() {
        this.assertRearrangeUseCaseFromFile("/tetris/pipe/release/gameover/1_row/pos_10_no_score");
    }

    //#endregion

    //#region Test: Listener piece released not notified covering 1 line after piece released when game over occurred in the same turn with 2 hidden rows overlapped

    //Test pieceReleased notified after releasePiece in position 1
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInPositionOneOverlappingTwoRows() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/gameover/2_rows/pos_01_score_1", never());
    }

    //Test pieceReleased notified after releasePiece in position 3
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInPositionThreeOverlappingTwoRows() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/gameover/2_rows/pos_03_score_1", never());
    }

    //#endregion

    //#region Test: Listener piece released not notified covering 1 line after piece released when game over occurred in the same turn with 1 hidden row overlapped

    //Test pieceReleased notified after releasePiece in position 1
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInPositionOneOverlappingOneRow() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/gameover/1_row/pos_01_score_1", never());
    }

    //Test pieceReleased notified after releasePiece in position 3
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInPositionThreeOverlappingOneRow() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/gameover/1_row/pos_03_score_1", never());
    }

    //#endregion

    //#region Test: Listener piece released not notified after piece released when game over occurred in the same turn with 2 hidden rows overlapped

    //Test pieceReleased notified after releasePiece in position 1
    @Test
    public void shouldNotifyListenerWhenPieceReleasedInPositionOneOverlappingTwoRows() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/gameover/2_rows/pos_01_no_score", never());
    }

    //Test pieceReleased notified after releasePiece in position 3
    @Test
    public void shouldNotifyListenerWhenPieceReleasedInPositionThreeOverlappingTwoRows() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/gameover/2_rows/pos_03_no_score", never());
    }

    //#endregion

    //#region Test: Listener piece released not notified after piece released when game over occurred in the same turn with 1 hidden row overlapped

    //Test pieceReleased notified after releasePiece in position 0
    @Test
    public void shouldNotifyListenerWhenPieceReleasedInInitialPositionOverlappingOneRow() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/gameover/1_row/pos_00_no_score", never());
    }

    //Test pieceReleased notified after releasePiece in position 1
    @Test
    public void shouldNotifyListenerWhenPieceReleasedInPositionOneOverlappingOneRow() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/gameover/1_row/pos_01_no_score", never());
    }

    //Test pieceReleased notified after releasePiece in position 2
    @Test
    public void shouldNotifyListenerWhenPieceReleasedInPositionTwoOverlappingOneRow() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/gameover/1_row/pos_02_no_score", never());
    }

    //Test pieceReleased notified after releasePiece in position 3
    @Test
    public void shouldNotifyListenerWhenPieceReleasedInPositionThreeOverlappingOneRow() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/gameover/1_row/pos_03_no_score", never());
    }

    //Test pieceReleased notified after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyListenerWhenPieceReleasedInInitialPositionAfterOneRotationCycleOverlappingOneRow() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/pipe/release/gameover/1_row/pos_10_no_score", never());
    }

    //#endregion

    //#region Test: Listener piece rotated notified when rotation allowed

    //Test piece rotated notification received when rotation allowed in position 0
    @Test
    public void shouldNotifyPieceRotatedListenerWhenPieceRotatedInInitialPosition(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/rotation/allowed/pos_00");
        this.shouldNotifyPieceRotatedListenerWhenPieceRotationExecuted(this.piece);
    }

    //Test piece rotated notification received when rotation allowed in position 1
    @Test
    public void shouldNotifyPieceRotatedListenerWhenPieceRotatedInPositionOne(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/rotation/allowed/pos_01");
        this.shouldNotifyPieceRotatedListenerWhenPieceRotationExecuted(this.piece);
    }

    //Test piece rotated notification received when rotation allowed in position 2
    @Test
    public void shouldNotifyPieceRotatedListenerWhenPieceRotatedInPositionTwo(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/rotation/allowed/pos_02");
        this.shouldNotifyPieceRotatedListenerWhenPieceRotationExecuted(this.piece);
    }

    //Test piece rotated notification received when rotation allowed in position 3
    @Test
    public void shouldNotifyPieceRotatedListenerWhenPieceRotatedInPositionThree(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/rotation/allowed/pos_03");
        this.shouldNotifyPieceRotatedListenerWhenPieceRotationExecuted(this.piece);
    }

    //Test piece rotated notification received when rotation allowed in position 0 after one rotation cycle
    @Test
    public void shouldNotifyPieceRotatedListenerWhenPieceRotatedAfterOneRotationCycle(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/rotation/allowed/pos_10");
        this.shouldNotifyPieceRotatedListenerWhenPieceRotationExecuted(this.piece);
    }

    //endregion

    //#region Test: Listener piece moved notified when moving to left allowed

    //Test piece moved notification received when moveLeft allowed in position 0
    @Test
    public void shouldNotifyPieceMovedListenerWhenPieceMovedToLeftInInitialPosition(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/left/allowed/pos_00");
        this.shouldNotifyPieceMovedListenerWhenPieceMoveExecuted(this.piece, () -> {
            this.tetrisBoard.moveLeft();
            return null;
        });
    }

    //Test piece moved notification received when moveLeft allowed in position 1
    @Test
    public void shouldNotifyPieceMovedListenerWhenPieceMovedToLeftInPositionOne(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/left/allowed/pos_01");
        this.shouldNotifyPieceMovedListenerWhenPieceMoveExecuted(this.piece, () -> {
            this.tetrisBoard.moveLeft();
            return null;
        });
    }

    //Test piece moved notification received when moveLeft allowed in position 2
    @Test
    public void shouldNotifyPieceMovedListenerWhenPieceMovedToLeftInPositionTwo(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/left/allowed/pos_02");
        this.shouldNotifyPieceMovedListenerWhenPieceMoveExecuted(this.piece, () -> {
            this.tetrisBoard.moveLeft();
            return null;
        });
    }

    //Test piece moved notification received when moveLeft allowed in position 3
    @Test
    public void shouldNotifyPieceMovedListenerWhenPieceMovedToLeftInPositionThree(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/left/allowed/pos_03");
        this.shouldNotifyPieceMovedListenerWhenPieceMoveExecuted(this.piece, () -> {
            this.tetrisBoard.moveLeft();
            return null;
        });
    }

    //Test piece moved notification received when moveLeft allowed in position 0 after one rotation cycle
    @Test
    public void shouldNotifyPieceMovedListenerWhenPieceMovedToLeftAfterOneRotationCycle(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/left/allowed/pos_10");
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
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/right/allowed/pos_00");
        this.shouldNotifyPieceMovedListenerWhenPieceMoveExecuted(this.piece, () -> {
            this.tetrisBoard.moveRight();
            return null;
        });
    }

    //Test piece moved notification received when moveRight allowed in position 1
    @Test
    public void shouldNotifyPieceMovedListenerWhenPieceMovedToRightInPositionOne(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/right/allowed/pos_01");
        this.shouldNotifyPieceMovedListenerWhenPieceMoveExecuted(this.piece, () -> {
            this.tetrisBoard.moveRight();
            return null;
        });
    }

    //Test piece moved notification received when moveRight allowed in position 2
    @Test
    public void shouldNotifyPieceMovedListenerWhenPieceMovedToRightInPositionTwo(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/right/allowed/pos_02");
        this.shouldNotifyPieceMovedListenerWhenPieceMoveExecuted(this.piece, () -> {
            this.tetrisBoard.moveRight();
            return null;
        });
    }

    //Test piece moved notification received when moveRight allowed in position 3
    @Test
    public void shouldNotifyPieceMovedListenerWhenPieceMovedToRightInPositionThree(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/right/allowed/pos_03");
        this.shouldNotifyPieceMovedListenerWhenPieceMoveExecuted(this.piece, () -> {
            this.tetrisBoard.moveRight();
            return null;
        });
    }

    //Test piece moved notification received when moveRight allowed in position 0 after one rotation cycle
    @Test
    public void shouldNotifyPieceMovedListenerWhenPieceMovedToRightAfterOneRotationCycle(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/right/allowed/pos_10");
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
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/down/allowed/pos_00");
        this.shouldNotifyPieceMovedListenerWhenPieceMoveExecuted(this.piece, () -> {
            this.tetrisBoard.moveDown();
            return null;
        });
    }

    //Test piece moved notification received when moveDown allowed in position 1
    @Test
    public void shouldNotifyPieceMovedListenerWhenPieceMovedDownInPositionOne(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/down/allowed/pos_01");
        this.shouldNotifyPieceMovedListenerWhenPieceMoveExecuted(this.piece, () -> {
            this.tetrisBoard.moveDown();
            return null;
        });
    }

    //Test piece moved notification received when moveDown allowed in position 2
    @Test
    public void shouldNotifyPieceMovedListenerWhenPieceMovedDownInPositionTwo(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/down/allowed/pos_02");
        this.shouldNotifyPieceMovedListenerWhenPieceMoveExecuted(this.piece, () -> {
            this.tetrisBoard.moveDown();
            return null;
        });
    }

    //Test piece moved notification received when moveDown allowed in position 3
    @Test
    public void shouldNotifyPieceMovedListenerWhenPieceMovedDownInPositionThree(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/down/allowed/pos_03");
        this.shouldNotifyPieceMovedListenerWhenPieceMoveExecuted(this.piece, () -> {
            this.tetrisBoard.moveDown();
            return null;
        });
    }

    //Test piece moved notification received when moveDown allowed in position 0 after one rotation cycle
    @Test
    public void shouldNotifyPieceMovedListenerWhenPieceMovedDownAfterOneRotationCycle(){
        this.loadBoardAndPieceFromFile("/tetris/pipe/move/down/allowed/pos_10");
        this.shouldNotifyPieceMovedListenerWhenPieceMoveExecuted(this.piece, () -> {
            this.tetrisBoard.moveDown();
            return null;
        });
    }

    //endregion
}
