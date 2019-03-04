package com.pencelab.tetrismaster.stage;

import com.pencelab.tetrismaster.pieces.Piece;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.powermock.reflect.Whitebox;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class LROnTetrisBoardTest extends PieceOnTetrisBoardTest {

    //#region Test: Position allowed

    //Test positioning allowed in position 0
    @Test
    public void shouldPositionPieceInInitialPosition(){
        this.loadBoardAndPieceFromFile("/tetris/lr/position/allowed/pos_00");
        this.tetrisBoard.setPiece(this.piece);
        Piece privatePiece = Whitebox.getInternalState(this.tetrisBoard, "piece");
        assertEquals(this.piece, privatePiece);
    }

    //Test positioning allowed in position 0
    @Test
    public void shouldPositionPieceInPositionOne(){
        this.loadBoardAndPieceFromFile("/tetris/lr/position/allowed/pos_01");
        this.tetrisBoard.setPiece(this.piece);
        Piece privatePiece = Whitebox.getInternalState(this.tetrisBoard, "piece");
        assertEquals(this.piece, privatePiece);
    }

    //Test positioning allowed in position 0
    @Test
    public void shouldPositionPieceInPositionTwo(){
        this.loadBoardAndPieceFromFile("/tetris/lr/position/allowed/pos_02");
        this.tetrisBoard.setPiece(this.piece);
        Piece privatePiece = Whitebox.getInternalState(this.tetrisBoard, "piece");
        assertEquals(this.piece, privatePiece);
    }

    //Test positioning allowed in position 0
    @Test
    public void shouldPositionPieceInPositionThree(){
        this.loadBoardAndPieceFromFile("/tetris/lr/position/allowed/pos_03");
        this.tetrisBoard.setPiece(this.piece);
        Piece privatePiece = Whitebox.getInternalState(this.tetrisBoard, "piece");
        assertEquals(this.piece, privatePiece);
    }

    //Test positioning allowed in position 0 after one rotation cycle
    @Test
    public void shouldPositionPieceInInitialPositionAfterOneRotationCycle(){
        this.loadBoardAndPieceFromFile("/tetris/lr/position/allowed/pos_10");
        this.tetrisBoard.setPiece(this.piece);
        Piece privatePiece = Whitebox.getInternalState(this.tetrisBoard, "piece");
        assertEquals(this.piece, privatePiece);
    }

    //#endregion

    //#region Test: IllegalArgumentException thrown because of piece set on an occupied field

    //Test IllegalArgumentException thrown because of piece set on an occupied field in position 0
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInInitialPositionOnAnOccupiedField(){
        this.loadBoardAndPieceFromFile("/tetris/lr/position/occupiedfield/pos_00");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set on an occupied field in position 1
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInPositionOneOnAnOccupiedField(){
        this.loadBoardAndPieceFromFile("/tetris/lr/position/occupiedfield/pos_01");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set on an occupied field in position 2
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInPositionTwoOnAnOccupiedField(){
        this.loadBoardAndPieceFromFile("/tetris/lr/position/occupiedfield/pos_02");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set on an occupied field in position 3
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInPositionThreeOnAnOccupiedField(){
        this.loadBoardAndPieceFromFile("/tetris/lr/position/occupiedfield/pos_03");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set on an occupied field in position 0 after one rotation cycle
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInInitialPositionAfterOneRotationCycleOnAnOccupiedField(){
        this.loadBoardAndPieceFromFile("/tetris/lr/position/occupiedfield/pos_10");
        this.tetrisBoard.setPiece(this.piece);
    }

    //#endregion

    //#region Test: IllegalArgumentException thrown because of piece set out of boundaries on the top

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 0
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInInitialPositionOutOfBoundariesOnTheTop(){
        this.loadBoardAndPieceFromFile("/tetris/lr/position/outofbounds/top/pos_00");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 1
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInPositionOneOutOfBoundariesOnTheTop(){
        this.loadBoardAndPieceFromFile("/tetris/lr/position/outofbounds/top/pos_01");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 2
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInPositionTwoOutOfBoundariesOnTheTop(){
        this.loadBoardAndPieceFromFile("/tetris/lr/position/outofbounds/top/pos_02");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 3
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInPositionThreeOutOfBoundariesOnTheTop(){
        this.loadBoardAndPieceFromFile("/tetris/lr/position/outofbounds/top/pos_03");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 0 after one rotation cycle
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInInitialPositionAfterOneRotationCycleOutOfBoundariesOnTheTop(){
        this.loadBoardAndPieceFromFile("/tetris/lr/position/outofbounds/top/pos_10");
        this.tetrisBoard.setPiece(this.piece);
    }

    //#endregion

    //#region Test: IllegalArgumentException thrown because of piece set out of boundaries on the left

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 0
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInInitialPositionOutOfBoundariesOnTheLeft(){
        this.loadBoardAndPieceFromFile("/tetris/lr/position/outofbounds/left/pos_00");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 1
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInPositionOneOutOfBoundariesOnTheLeft(){
        this.loadBoardAndPieceFromFile("/tetris/lr/position/outofbounds/left/pos_01");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 2
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInPositionTwoOutOfBoundariesOnTheLeft(){
        this.loadBoardAndPieceFromFile("/tetris/lr/position/outofbounds/left/pos_02");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 3
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInPositionThreeOutOfBoundariesOnTheLeft(){
        this.loadBoardAndPieceFromFile("/tetris/lr/position/outofbounds/left/pos_03");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 0 after one rotation cycle
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInInitialPositionAfterOneRotationCycleOutOfBoundariesOnTheLeft(){
        this.loadBoardAndPieceFromFile("/tetris/lr/position/outofbounds/left/pos_10");
        this.tetrisBoard.setPiece(this.piece);
    }

    //#endregion

    //#region Test: IllegalArgumentException thrown because of piece set out of boundaries on the right

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 0
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInInitialPositionOutOfBoundariesOnTheRight(){
        this.loadBoardAndPieceFromFile("/tetris/lr/position/outofbounds/right/pos_00");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 1
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInPositionOneOutOfBoundariesOnTheRight(){
        this.loadBoardAndPieceFromFile("/tetris/lr/position/outofbounds/right/pos_01");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 2
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInPositionTwoOutOfBoundariesOnTheRight(){
        this.loadBoardAndPieceFromFile("/tetris/lr/position/outofbounds/right/pos_02");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 3
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInPositionThreeOutOfBoundariesOnTheRight(){
        this.loadBoardAndPieceFromFile("/tetris/lr/position/outofbounds/right/pos_03");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 0 after one rotation cycle
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInInitialPositionAfterOneRotationCycleOutOfBoundariesOnTheRight(){
        this.loadBoardAndPieceFromFile("/tetris/lr/position/outofbounds/right/pos_10");
        this.tetrisBoard.setPiece(this.piece);
    }

    //#endregion

    //#region Test: IllegalArgumentException thrown because of piece set out of boundaries on the bottom

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 0
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInInitialPositionOutOfBoundariesOnTheBottom(){
        this.loadBoardAndPieceFromFile("/tetris/lr/position/outofbounds/bottom/pos_00");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 1
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInPositionOneOutOfBoundariesOnTheBottom(){
        this.loadBoardAndPieceFromFile("/tetris/lr/position/outofbounds/bottom/pos_01");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 2
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInPositionTwoOutOfBoundariesOnTheBottom(){
        this.loadBoardAndPieceFromFile("/tetris/lr/position/outofbounds/bottom/pos_02");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 3
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInPositionThreeOutOfBoundariesOnTheBottom(){
        this.loadBoardAndPieceFromFile("/tetris/lr/position/outofbounds/bottom/pos_03");
        this.tetrisBoard.setPiece(this.piece);
    }

    //Test IllegalArgumentException thrown because of piece set out of boundaries in position 0 after one rotation cycle
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenPositioningPieceInInitialPositionAfterOneRotationCycleOutOfBoundariesOnTheBottom(){
        this.loadBoardAndPieceFromFile("/tetris/lr/position/outofbounds/bottom/pos_10");
        this.tetrisBoard.setPiece(this.piece);
    }

    //#endregion

    //region Test: Rotation allowed

    //Test rotation allowed in position 0
    @Test
    public void shouldRotatePieceToPositionOne(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/rotation/allowed/pos_00");
        this.shouldRotatePiece(this.piece, this.piece.rotate());
    }

    //Test rotation allowed in position 1
    @Test
    public void shouldRotatePieceToPositionTwo(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/rotation/allowed/pos_01");
        this.shouldRotatePiece(this.piece, this.piece.rotate());
    }

    //Test rotation allowed in position 2
    @Test
    public void shouldRotatePieceToPositionThree(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/rotation/allowed/pos_02");
        this.shouldRotatePiece(this.piece, this.piece.rotate());
    }

    //Test rotation allowed in position 3
    @Test
    public void shouldRotatePieceToInitialPosition(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/rotation/allowed/pos_03");
        this.shouldRotatePiece(this.piece, this.piece.rotate());
    }

    //Test rotation allowed in position 0 after one rotation cycle
    @Test
    public void shouldRotatePieceToPositionOneAfterOneRotationCycle(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/rotation/allowed/pos_10");
        this.shouldRotatePiece(this.piece, this.piece.rotate());
    }

    //endregion

    //region Test: Rotation not allowed because of boundary

    //Test rotation not allowed in position 0
    @Test
    public void shouldNotRotatePieceToPositionOneBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/rotation/boundary/pos_00");
        this.shouldNotRotatePiece(this.piece);
    }

    //Test rotation not allowed in position 2
    @Test
    public void shouldNotRotatePieceToPositionThreeBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/rotation/boundary/pos_02");
        this.shouldNotRotatePiece(this.piece);
    }

    //Test rotation not allowed in position 0 after one rotation cycle
    @Test
    public void shouldNotRotatePieceToPositionOneAfterOneRotationCycleBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/rotation/boundary/pos_10");
        this.shouldNotRotatePiece(this.piece);
    }

    //endregion

    //region Test: Rotation not allowed because of obstacle

    //Test rotation not allowed in position 0
    @Test
    public void shouldNotRotatePieceToPositionOneBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/rotation/obstacle/pos_00");
        this.shouldNotRotatePiece(this.piece);
    }

    //Test rotation not allowed in position 1
    @Test
    public void shouldNotRotatePieceToPositionTwoBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/rotation/obstacle/pos_01");
        this.shouldNotRotatePiece(this.piece);
    }

    //Test rotation not allowed in position 2
    @Test
    public void shouldNotRotatePieceToPositionThreeBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/rotation/obstacle/pos_02");
        this.shouldNotRotatePiece(this.piece);
    }

    //Test rotation not allowed in position 3
    @Test
    public void shouldNotRotatePieceToInitialPositionBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/rotation/obstacle/pos_03");
        this.shouldNotRotatePiece(this.piece);
    }

    //Test rotation not allowed in position 0 after one rotation cycle
    @Test
    public void shouldNotRotatePieceToPositionOneAfterOneRotationCycleBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/rotation/obstacle/pos_10");
        this.shouldNotRotatePiece(this.piece);
    }

    //endregion

    //#region Test: Moving to left allowed

    //Test moveLeft allowed in position 0
    @Test
    public void shouldMovePieceToLeftInInitialPosition(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/left/allowed/pos_00");
        this.shouldMovePieceToLeft(this.piece, this.piece.moveLeft());
    }

    //Test moveLeft allowed in position 1
    @Test
    public void shouldMovePieceToLeftInPositionOne(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/left/allowed/pos_01");
        this.shouldMovePieceToLeft(this.piece, this.piece.moveLeft());
    }

    //Test moveLeft allowed in position 2
    @Test
    public void shouldMovePieceToLeftInPositionTwo(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/left/allowed/pos_02");
        this.shouldMovePieceToLeft(this.piece, this.piece.moveLeft());
    }

    //Test moveLeft allowed in position 3
    @Test
    public void shouldMovePieceToLeftInPositionThree(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/left/allowed/pos_03");
        this.shouldMovePieceToLeft(this.piece, this.piece.moveLeft());
    }

    //Test moveLeft allowed in position 0 after one rotation cycle
    @Test
    public void shouldMovePieceToLeftAfterOneRotationCycle(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/left/allowed/pos_10");
        this.shouldMovePieceToLeft(this.piece, this.piece.moveLeft());
    }

    //endregion

    //#region Test: Moving to left not allowed because of boundary

    //Test moveLeft not allowed in position 0
    @Test
    public void shouldNotMovePieceToLeftInInitialPositionBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/left/boundary/pos_00");
        this.shouldNotMovePieceToLeft(this.piece);
    }

    //Test moveLeft not allowed in position 1
    @Test
    public void shouldNotMovePieceToLeftInPositionOneBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/left/boundary/pos_01");
        this.shouldNotMovePieceToLeft(this.piece);
    }

    //Test moveLeft not allowed in position 2
    @Test
    public void shouldNotMovePieceToLeftInPositionTwoBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/left/boundary/pos_02");
        this.shouldNotMovePieceToLeft(this.piece);
    }

    //Test moveLeft not allowed in position 3
    @Test
    public void shouldNotMovePieceToLeftInPositionThreeBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/left/boundary/pos_03");
        this.shouldNotMovePieceToLeft(this.piece);
    }

    //Test moveLeft not allowed in position 0 after one rotation cycle
    @Test
    public void shouldNotMovePieceToLeftInInitialPositionAfterOneRotationCycleBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/left/boundary/pos_10");
        this.shouldNotMovePieceToLeft(this.piece);
    }

    //endregion

    //#region Test: Moving to left not allowed because of obstacle

    //Test moveLeft not allowed in position 0
    @Test
    public void shouldNotMovePieceToLeftInInitialPositionBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/left/obstacle/pos_00");
        this.shouldNotMovePieceToLeft(this.piece);
    }

    //Test moveLeft not allowed in position 1
    @Test
    public void shouldNotMovePieceToLeftInPositionOneBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/left/obstacle/pos_01");
        this.shouldNotMovePieceToLeft(this.piece);
    }

    //Test moveLeft not allowed in position 2
    @Test
    public void shouldNotMovePieceToLeftInPositionTwoBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/left/obstacle/pos_02");
        this.shouldNotMovePieceToLeft(this.piece);
    }

    //Test moveLeft not allowed in position 3
    @Test
    public void shouldNotMovePieceToLeftInPositionThreeBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/left/obstacle/pos_03");
        this.shouldNotMovePieceToLeft(this.piece);
    }

    //Test moveLeft not allowed in position 0 after one rotation cycle
    @Test
    public void shouldNotMovePieceToLeftInInitialPositionAfterOneRotationCycleBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/left/obstacle/pos_10");
        this.shouldNotMovePieceToLeft(this.piece);
    }

    //endregion

    //#region Test: Moving to right allowed

    //Test moveRight allowed in position 0
    @Test
    public void shouldMovePieceToRightPositionInInitialPosition(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/right/allowed/pos_00");
        this.shouldMovePieceToRight(this.piece, this.piece.moveRight());
    }

    //Test moveRight allowed in position 1
    @Test
    public void shouldMovePieceToRightPositionInPositionOne(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/right/allowed/pos_01");
        this.shouldMovePieceToRight(this.piece, this.piece.moveRight());
    }

    //Test moveRight allowed in position 2
    @Test
    public void shouldMovePieceToRightPositionInPositionTwo(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/right/allowed/pos_02");
        this.shouldMovePieceToRight(this.piece, this.piece.moveRight());
    }

    //Test moveRight allowed in position 3
    @Test
    public void shouldMovePieceToRightPositionInPositionThree(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/right/allowed/pos_03");
        this.shouldMovePieceToRight(this.piece, this.piece.moveRight());
    }

    //Test moveRight allowed in position 0 after one rotation cycle
    @Test
    public void shouldMovePieceToRightPositionAfterOneRotationCycle(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/right/allowed/pos_10");
        this.shouldMovePieceToRight(this.piece, this.piece.moveRight());
    }

    //endregion

    //#region Test: Moving to right not allowed because of boundary

    //Test moveRight not allowed in position 0
    @Test
    public void shouldNotMovePieceToRightInInitialPositionBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/right/boundary/pos_00");
        this.shouldNotMovePieceToRight(this.piece);
    }

    //Test moveRight not allowed in position 1
    @Test
    public void shouldNotMovePieceToRightInPositionOneBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/right/boundary/pos_01");
        this.shouldNotMovePieceToRight(this.piece);
    }

    //Test moveRight not allowed in position 2
    @Test
    public void shouldNotMovePieceToRightInPositionTwoBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/right/boundary/pos_02");
        this.shouldNotMovePieceToRight(this.piece);
    }

    //Test moveRight not allowed in position 3
    @Test
    public void shouldNotMovePieceToRightInPositionThreeBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/right/boundary/pos_03");
        this.shouldNotMovePieceToRight(this.piece);
    }

    //Test moveRight not allowed in position 0 after one rotation cycle
    @Test
    public void shouldNotMovePieceToRightInInitialPositionAfterOneRotationCycleBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/right/boundary/pos_10");
        this.shouldNotMovePieceToRight(this.piece);
    }

    //endregion

    //#region Test: Moving to right not allowed because of obstacle

    //Test moveRight not allowed in position 0
    @Test
    public void shouldNotMovePieceToRightInInitialPositionBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/right/obstacle/pos_00");
        this.shouldNotMovePieceToRight(this.piece);
    }

    //Test moveRight not allowed in position 1
    @Test
    public void shouldNotMovePieceToRightInPositionOneBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/right/obstacle/pos_01");
        this.shouldNotMovePieceToRight(this.piece);
    }

    //Test moveRight not allowed in position 2
    @Test
    public void shouldNotMovePieceToRightInPositionTwoBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/right/obstacle/pos_02");
        this.shouldNotMovePieceToRight(this.piece);
    }

    //Test moveRight not allowed in position 3
    @Test
    public void shouldNotMovePieceToRightInPositionThreeBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/right/obstacle/pos_03");
        this.shouldNotMovePieceToRight(this.piece);
    }

    //Test moveRight not allowed in position 0 after one rotation cycle
    @Test
    public void shouldNotMovePieceToRightInInitialPositionAfterOneRotationCycleBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/right/obstacle/pos_10");
        this.shouldNotMovePieceToRight(this.piece);
    }

    //endregion

    //#region Test: Moving to down allowed

    //Test moveDown allowed in position 0
    @Test
    public void shouldMovePieceDownInInitialPosition(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/down/allowed/pos_00");
        this.shouldMovePieceDown(this.piece, this.piece.moveDown());
    }

    //Test moveDown allowed in position 1
    @Test
    public void shouldMovePieceDownInPositionOne(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/down/allowed/pos_01");
        this.shouldMovePieceDown(this.piece, this.piece.moveDown());
    }

    //Test moveDown allowed in position 2
    @Test
    public void shouldMovePieceDownInPositionTwo(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/down/allowed/pos_02");
        this.shouldMovePieceDown(this.piece, this.piece.moveDown());
    }

    //Test moveDown allowed in position 3
    @Test
    public void shouldMovePieceDownInPositionThree(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/down/allowed/pos_03");
        this.shouldMovePieceDown(this.piece, this.piece.moveDown());
    }

    //Test moveDown allowed in position 0 after one rotation cycle
    @Test
    public void shouldMovePieceDownAfterOneRotationCycle(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/down/allowed/pos_10");
        this.shouldMovePieceDown(this.piece, this.piece.moveDown());
    }

    //endregion

    //#region Test: Moving to down not allowed because of boundary

    //Test moveDown allowed in position 0
    @Test
    public void shouldReleasePieceWhenMovingDownInInitialPositionBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/down/boundary/pos_00");
        this.shouldReleasePieceWhenMovingDown(this.piece);
    }

    //Test moveDown allowed in position 1
    @Test
    public void shouldReleasePieceWhenMovingDownInPositionOneBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/down/boundary/pos_01");
        this.shouldReleasePieceWhenMovingDown(this.piece);
    }

    //Test moveDown allowed in position 2
    @Test
    public void shouldReleasePieceWhenMovingDownInPositionTwoBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/down/boundary/pos_02");
        this.shouldReleasePieceWhenMovingDown(this.piece);
    }

    //Test moveDown allowed in position 3
    @Test
    public void shouldReleasePieceWhenMovingDownInPositionThreeBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/down/boundary/pos_03");
        this.shouldReleasePieceWhenMovingDown(this.piece);
    }

    //Test moveDown allowed in position 0 after one rotation cycle
    @Test
    public void shouldReleasePieceWhenMovingDownInInitialPositionAfterOneRotationCycleBecauseOfBoundary(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/down/boundary/pos_10");
        this.shouldReleasePieceWhenMovingDown(this.piece);
    }

    //endregion

    //#region Test: Moving to down not allowed because of obstacle

    //Test moveDown allowed in position 0
    @Test
    public void shouldReleasePieceWhenMovingDownInInitialPositionBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/down/obstacle/pos_00");
        this.shouldReleasePieceWhenMovingDown(this.piece);
    }

    //Test moveDown allowed in position 1
    @Test
    public void shouldReleasePieceWhenMovingDownInPositionOneBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/down/obstacle/pos_01");
        this.shouldReleasePieceWhenMovingDown(this.piece);
    }

    //Test moveDown allowed in position 2
    @Test
    public void shouldReleasePieceWhenMovingDownInPositionTwoBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/down/obstacle/pos_02");
        this.shouldReleasePieceWhenMovingDown(this.piece);
    }

    //Test moveDown allowed in position 3
    @Test
    public void shouldReleasePieceWhenMovingDownInPositionThreeBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/down/obstacle/pos_03");
        this.shouldReleasePieceWhenMovingDown(this.piece);
    }

    //Test moveDown allowed in position 0 after one rotation cycle
    @Test
    public void shouldReleasePieceWhenMovingDownInInitialPositionAfterOneRotationCycleBecauseOfObstacle(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/down/obstacle/pos_10");
        this.shouldReleasePieceWhenMovingDown(this.piece);
    }

    //endregion

    //#region Test: Rows rearranged covering 3 lines after piece released because of boundary

    //Test rows rearranged after releasePiece in position 0
    @Test
    public void shouldRearrangeBoardCoveringThreeLinesWhenReleasingPieceInInitialPositionBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/bottom/3_lines/pos_00");
    }

    //Test rows rearranged after releasePiece in position 2
    @Test
    public void shouldRearrangeBoardCoveringThreeLinesWhenReleasingPieceInPositionTwoBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/bottom/3_lines/pos_02");
    }

    //Test rows rearranged after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldRearrangeBoardCoveringThreeLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/bottom/3_lines/pos_10");
    }

    //endregion

    //#region Test: Rows rearranged covering 2 lines after piece released because of boundary

    //Test rows rearranged after releasePiece in position 1
    @Test
    public void shouldRearrangeBoardCoveringTwoLinesWhenReleasingPieceInInitialPositionBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/bottom/2_lines/pos_00");
    }

    //Test rows rearranged after releasePiece in position 1
    @Test
    public void shouldRearrangeBoardCoveringTwoLinesWhenReleasingPieceInPositionOneBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/bottom/2_lines/pos_01");
    }

    //Test rows rearranged after releasePiece in position 2
    @Test
    public void shouldRearrangeBoardCoveringTwoLinesWhenReleasingPieceInPositionTwoBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/bottom/2_lines/pos_02");
    }

    //Test rows rearranged after releasePiece in position 3
    @Test
    public void shouldRearrangeBoardCoveringTwoLinesWhenReleasingPieceInPositionThreeBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/bottom/2_lines/pos_03");
    }

    //Test rows rearranged after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldRearrangeBoardCoveringTwoLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/bottom/2_lines/pos_10");
    }

    //endregion

    //#region Test: Rows rearranged covering 1 line after piece released because of boundary

    //Test rows rearranged after releasePiece in position 0
    @Test
    public void shouldRearrangeBoardCoveringOneLineWhenReleasingPieceInInitialPositionBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/bottom/1_line/pos_00");
    }

    //Test rows rearranged after releasePiece in position 1
    @Test
    public void shouldRearrangeBoardCoveringOneLineWhenReleasingPieceInPositionOneBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/bottom/1_line/pos_01");
    }

    //Test rows rearranged after releasePiece in position 2
    @Test
    public void shouldRearrangeBoardCoveringOneLineWhenReleasingPieceInPositionTwoBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/bottom/1_line/pos_02");
    }

    //Test rows rearranged after releasePiece in position 3
    @Test
    public void shouldRearrangeBoardCoveringOneLineWhenReleasingPieceInPositionThreeBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/bottom/1_line/pos_03");
    }

    //Test rows rearranged after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldRearrangeBoardCoveringOneLineWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/bottom/1_line/pos_10");
    }

    //#endregion

    //#region Test: Rows not rearranged covering 0 lines after piece released because of boundary

    //Test rows rearranged after releasePiece in position 0
    @Test
    public void shouldNotRearrangeBoardCoveringZeroLinesWhenReleasingPieceInInitialPositionBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/bottom/0_lines/pos_00");
    }

    //Test rows rearranged after releasePiece in position 1
    @Test
    public void shouldNotRearrangeBoardCoveringZeroLinesWhenReleasingPieceInPositionOneBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/bottom/0_lines/pos_01");
    }

    //Test rows rearranged after releasePiece in position 2
    @Test
    public void shouldNotRearrangeBoardCoveringZeroLinesWhenReleasingPieceInPositionTwoBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/bottom/0_lines/pos_02");
    }

    //Test rows rearranged after releasePiece in position 3
    @Test
    public void shouldNotRearrangeBoardCoveringZeroLinesWhenReleasingPieceInPositionThreeBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/bottom/0_lines/pos_03");
    }

    //Test rows rearranged after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotRearrangeBoardCoveringZeroLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfBoundary() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/bottom/0_lines/pos_10");
    }

    //#endregion

    //#region Test: Rows rearranged covering 3 lines after piece released because of obstacle

    //Test rows rearranged after releasePiece in position 0
    @Test
    public void shouldRearrangeBoardCoveringThreeLinesWhenReleasingPieceInInitialPositionBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/middle/3_lines/pos_00");
    }

    //Test rows rearranged after releasePiece in position 2
    @Test
    public void shouldRearrangeBoardCoveringThreeLinesWhenReleasingPieceInPositionTwoBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/middle/3_lines/pos_02");
    }

    //Test rows rearranged after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldRearrangeBoardCoveringThreeLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/middle/3_lines/pos_10");
    }

    //#endregion

    //#region Test: Rows rearranged covering 2 lines after piece released because of obstacle

    //Test rows rearranged after releasePiece in position 0
    @Test
    public void shouldRearrangeBoardCoveringTwoLinesWhenReleasingPieceInInitialPositionBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/middle/2_lines/pos_00");
    }

    //Test rows rearranged after releasePiece in position 1
    @Test
    public void shouldRearrangeBoardCoveringTwoLinesWhenReleasingPieceInPositionOneBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/middle/2_lines/pos_01");
    }

    //Test rows rearranged after releasePiece in position 2
    @Test
    public void shouldRearrangeBoardCoveringTwoLinesWhenReleasingPieceInPositionTwoBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/middle/2_lines/pos_02");
    }

    //Test rows rearranged after releasePiece in position 3
    @Test
    public void shouldRearrangeBoardCoveringTwoLinesWhenReleasingPieceInPositionThreeBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/middle/2_lines/pos_03");
    }

    //Test rows rearranged after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldRearrangeBoardCoveringTwoLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/middle/2_lines/pos_10");
    }

    //#endregion

    //#region Test: Rows rearranged covering 1 line after piece released because of obstacle

    //Test rows rearranged after releasePiece in position 0
    @Test
    public void shouldRearrangeBoardCoveringOneLineWhenReleasingPieceInInitialPositionBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/middle/1_line/pos_00");
    }

    //Test rows rearranged after releasePiece in position 1
    @Test
    public void shouldRearrangeBoardCoveringOneLineWhenReleasingPieceInPositionOneBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/middle/1_line/pos_01");
    }

    //Test rows rearranged after releasePiece in position 2
    @Test
    public void shouldRearrangeBoardCoveringOneLineWhenReleasingPieceInPositionTwoBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/middle/1_line/pos_02");
    }

    //Test rows rearranged after releasePiece in position 3
    @Test
    public void shouldRearrangeBoardCoveringOneLineWhenReleasingPieceInPositionThreeBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/middle/1_line/pos_03");
    }

    //Test rows rearranged after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldRearrangeBoardCoveringOneLineWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/middle/1_line/pos_10");
    }

    //#endregion

    //#region Test: Rows not rearranged covering 0 lines after piece released because of obstacle

    //Test rows not rearranged after releasePiece in position 0
    @Test
    public void shouldNotRearrangeBoardCoveringZeroLinesWhenReleasingPieceInInitialPositionBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/middle/0_lines/pos_00");
    }

    //Test rows not rearranged after releasePiece in position 1
    @Test
    public void shouldNotRearrangeBoardCoveringZeroLinesWhenReleasingPieceInPositionOneBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/middle/0_lines/pos_01");
    }

    //Test rows not rearranged after releasePiece in position 2
    @Test
    public void shouldNotRearrangeBoardCoveringZeroLinesWhenReleasingPieceInPositionTwoBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/middle/0_lines/pos_02");
    }

    //Test rows not rearranged after releasePiece in position 3
    @Test
    public void shouldNotRearrangeBoardCoveringZeroLinesWhenReleasingPieceInPositionThreeBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/middle/0_lines/pos_03");
    }

    //Test rows not rearranged after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotRearrangeBoardCoveringZeroLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacle() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/middle/0_lines/pos_10");
    }

    //#endregion

    //#region Test: Rows rearranged covering 3 lines after piece released because of obstacle on the top

    //Test rows rearranged after releasePiece in position 0
    @Test
    public void shouldRearrangeBoardCoveringThreeLinesWhenReleasingPieceInInitialPositionBecauseOfObstacleOnTheTop() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/top/3_lines/pos_00");
    }

    //Test rows rearranged after releasePiece in position 2
    @Test
    public void shouldRearrangeBoardCoveringThreeLinesWhenReleasingPieceInPositionTwoBecauseOfObstacleOnTheTop() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/top/3_lines/pos_02");
    }

    //Test rows rearranged after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldRearrangeBoardCoveringThreeLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacleOnTheTop() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/top/3_lines/pos_10");
    }

    //#endregion

    //#region Test: Rows rearranged covering 2 lines after piece released because of obstacle on the top

    //Test rows rearranged after releasePiece in position 0
    @Test
    public void shouldRearrangeBoardCoveringTwoLinesWhenReleasingPieceInInitialPositionBecauseOfObstacleOnTheTop() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/top/2_lines/pos_00");
    }

    //Test rows rearranged after releasePiece in position 2
    @Test
    public void shouldRearrangeBoardCoveringTwoLinesWhenReleasingPieceInPositionTwoBecauseOfObstacleOnTheTop() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/top/2_lines/pos_02");
    }

    //Test rows rearranged after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldRearrangeBoardCoveringTwoLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacleOnTheTop() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/top/2_lines/pos_10");
    }

    //#endregion

    //#region Test: Rows rearranged covering 1 line after piece released because of obstacle on the top

    //Test rows rearranged after releasePiece in position 0
    @Test
    public void shouldRearrangeBoardCoveringOneLineWhenReleasingPieceInInitialPositionBecauseOfObstacleOnTheTop() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/top/1_line/pos_00");
    }

    //Test rows rearranged after releasePiece in position 1
    @Test
    public void shouldRearrangeBoardCoveringOneLineWhenReleasingPieceInPositionOneBecauseOfObstacleOnTheTop() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/top/1_line/pos_01");
    }

    //Test rows rearranged after releasePiece in position 2
    @Test
    public void shouldRearrangeBoardCoveringOneLineWhenReleasingPieceInPositionTwoBecauseOfObstacleOnTheTop() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/top/1_line/pos_02");
    }

    //Test rows rearranged after releasePiece in position 3
    @Test
    public void shouldRearrangeBoardCoveringOneLineWhenReleasingPieceInPositionThreeBecauseOfObstacleOnTheTop() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/top/1_line/pos_03");
    }

    //Test rows rearranged after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldRearrangeBoardCoveringOneLineWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacleOnTheTop() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/top/1_line/pos_10");
    }

    //#endregion

    //#region Test: Rows not rearranged covering 0 lines after piece released because of obstacle on the top

    //Test rows rearranged after releasePiece in position 0
    @Test
    public void shouldNotRearrangeBoardCoveringZeroLinesWhenReleasingPieceInInitialPositionBecauseOfObstacleOnTheTop() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/top/0_lines/pos_00");
    }

    //Test rows rearranged after releasePiece in position 1
    @Test
    public void shouldNotRearrangeBoardCoveringZeroLinesWhenReleasingPieceInPositionOneBecauseOfObstacleOnTheTop() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/top/0_lines/pos_01");
    }

    //Test rows rearranged after releasePiece in position 2
    @Test
    public void shouldNotRearrangeBoardCoveringZeroLinesWhenReleasingPieceInPositionTwoBecauseOfObstacleOnTheTop() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/top/0_lines/pos_02");
    }

    //Test rows rearranged after releasePiece in position 3
    @Test
    public void shouldNotRearrangeBoardCoveringZeroLinesWhenReleasingPieceInPositionThreeBecauseOfObstacleOnTheTop() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/top/0_lines/pos_03");
    }

    //Test rows rearranged after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotRearrangeBoardCoveringZeroLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacleOnTheTop() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/top/0_lines/pos_10");
    }

    //#endregion

    //#region Test: Listener notified with score covering 3 lines after piece released because of boundary

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyScoreListenerCoveringThreeLinesWhenReleasingPieceInInitialPositionBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/bottom/3_lines/pos_00");
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyScoreListenerCoveringThreeLinesWhenReleasingPieceInPositionTwoBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/bottom/3_lines/pos_02");
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyScoreListenerCoveringThreeLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/bottom/3_lines/pos_10");
    }

    //endregion

    //#region Test: Listener notified with score covering 2 lines after piece released because of boundary

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyScoreListenerCoveringTwoLinesWhenReleasingPieceInInitialPositionBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/bottom/2_lines/pos_00");
    }

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyScoreListenerCoveringTwoLinesWhenReleasingPieceInPositionOneBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/bottom/2_lines/pos_01");
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyScoreListenerCoveringTwoLinesWhenReleasingPieceInPositionTwoBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/bottom/2_lines/pos_02");
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyScoreListenerCoveringTwoLinesWhenReleasingPieceInPositionThreeBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/bottom/2_lines/pos_03");
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyScoreListenerCoveringTwoLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/bottom/2_lines/pos_10");
    }

    //endregion

    //#region Test: Listener notified with score covering 1 line after piece released because of boundary

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyScoreListenerCoveringOneLineWhenReleasingPieceInInitialPositionBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/bottom/1_line/pos_00");
    }

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyScoreListenerCoveringOneLineWhenReleasingPieceInPositionOneBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/bottom/1_line/pos_01");
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyScoreListenerCoveringOneLineWhenReleasingPieceInPositionTwoBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/bottom/1_line/pos_02");
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyScoreListenerCoveringOneLineWhenReleasingPieceInPositionThreeBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/bottom/1_line/pos_03");
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyScoreListenerCoveringOneLineWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/bottom/1_line/pos_10");
    }

    //endregion

    //#region Test: Listener not notified with score covering 0 lines after piece released because of boundary

    //Test not notifyScored after releasePiece in position 0
    @Test
    public void shouldNotNotifyScoreListenerCoveringZeroLinesWhenReleasingPieceInInitialPositionBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/bottom/0_lines/pos_00");
    }

    //Test not notifyScored after releasePiece in position 1
    @Test
    public void shouldNotNotifyScoreListenerCoveringZeroLinesWhenReleasingPieceInPositionOneBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/bottom/0_lines/pos_01");
    }

    //Test not notifyScored after releasePiece in position 2
    @Test
    public void shouldNotNotifyScoreListenerCoveringZeroLinesWhenReleasingPieceInPositionTwoBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/bottom/0_lines/pos_02");
    }

    //Test not notifyScored after releasePiece in position 3
    @Test
    public void shouldNotNotifyScoreListenerCoveringZeroLinesWhenReleasingPieceInPositionThreeBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/bottom/0_lines/pos_03");
    }

    //Test not notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotNotifyScoreListenerCoveringZeroLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfBoundary() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/bottom/0_lines/pos_10");
    }

    //endregion

    //#region Test: Listener notified with score covering 3 lines after piece released because of obstacle

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyScoreListenerCoveringThreeLinesWhenReleasingPieceInInitialPositionBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/middle/3_lines/pos_00");
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyScoreListenerCoveringThreeLinesWhenReleasingPieceInPositionTwoBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/middle/3_lines/pos_02");
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyScoreListenerCoveringThreeLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/middle/3_lines/pos_10");
    }

    //endregion

    //#region Test: Listener notified with score covering 2 lines after piece released because of obstacle

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyScoreListenerCoveringTwoLinesWhenReleasingPieceInInitialPositionBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/middle/2_lines/pos_00");
    }

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyScoreListenerCoveringTwoLinesWhenReleasingPieceInPositionOneBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/middle/2_lines/pos_01");
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyScoreListenerCoveringTwoLinesWhenReleasingPieceInPositionTwoBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/middle/2_lines/pos_02");
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyScoreListenerCoveringTwoLinesWhenReleasingPieceInPositionThreeBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/middle/2_lines/pos_03");
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyScoreListenerCoveringTwoLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/middle/2_lines/pos_10");
    }

    //endregion

    //#region Test: Listener notified with score covering 1 line after piece released because of obstacle

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyScoreListenerCoveringOneLineWhenReleasingPieceInInitialPositionBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/middle/1_line/pos_00");
    }

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyScoreListenerCoveringOneLineWhenReleasingPieceInPositionOneBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/middle/1_line/pos_01");
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyScoreListenerCoveringOneLineWhenReleasingPieceInPositionTwoBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/middle/1_line/pos_02");
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyScoreListenerCoveringOneLineWhenReleasingPieceInPositionThreeBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/middle/1_line/pos_03");
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyScoreListenerCoveringOneLineWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/middle/1_line/pos_10");
    }

    //endregion

    //#region Test: Listener not notified with score covering 0 lines after piece released because of obstacle

    //Test not notifyScored after releasePiece in position 0
    @Test
    public void shouldNotNotifyScoreListenerCoveringZeroLinesWhenReleasingPieceInInitialPositionBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/middle/0_lines/pos_00");
    }

    //Test not notifyScored after releasePiece in position 1
    @Test
    public void shouldNotNotifyScoreListenerCoveringZeroLinesWhenReleasingPieceInPositionOneBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/middle/0_lines/pos_01");
    }

    //Test not notifyScored after releasePiece in position 2
    @Test
    public void shouldNotNotifyScoreListenerCoveringZeroLinesWhenReleasingPieceInPositionTwoBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/middle/0_lines/pos_02");
    }

    //Test not notifyScored after releasePiece in position 3
    @Test
    public void shouldNotNotifyScoreListenerCoveringZeroLinesWhenReleasingPieceInPositionThreeBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/middle/0_lines/pos_03");
    }

    //Test not notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotNotifyScoreListenerCoveringZeroLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacle() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/middle/0_lines/pos_10");
    }

    //#endregion

    //#region Test: Listener notified with score covering 3 lines after piece released because of obstacle on the top

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyScoreListenerCoveringThreeLinesWhenReleasingPieceInInitialPositionBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/top/3_lines/pos_00");
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyScoreListenerCoveringThreeLinesWhenReleasingPieceInPositionTwoBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/top/3_lines/pos_02");
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyScoreListenerCoveringThreeLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/top/3_lines/pos_10");
    }

    //endregion

    //#region Test: Listener notified with score covering 2 lines after piece released because of obstacle on the top

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyScoreListenerCoveringTwoLinesWhenReleasingPieceInInitialPositionBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/top/2_lines/pos_00");
    }

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyScoreListenerCoveringTwoLinesWhenReleasingPieceInPositionOneBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/top/2_lines/pos_01");
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyScoreListenerCoveringTwoLinesWhenReleasingPieceInPositionTwoBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/top/2_lines/pos_02");
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyScoreListenerCoveringTwoLinesWhenReleasingPieceInPositionThreeBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/top/2_lines/pos_03");
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyScoreListenerCoveringTwoLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/top/2_lines/pos_10");
    }

    //endregion

    //#region Test: Listener notified with score covering 1 line after piece released because of obstacle on the top

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyScoreListenerCoveringOneLineWhenReleasingPieceInInitialPositionBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/top/1_line/pos_00");
    }

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyScoreListenerCoveringOneLineWhenReleasingPieceInPositionOneBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/top/1_line/pos_01");
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyScoreListenerCoveringOneLineWhenReleasingPieceInPositionTwoBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/top/1_line/pos_02");
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyScoreListenerCoveringOneLineWhenReleasingPieceInPositionThreeBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/top/1_line/pos_03");
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyScoreListenerCoveringOneLineWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/top/1_line/pos_10");
    }

    //endregion

    //#region Test: Listener not notified with score covering 0 lines after piece released because of obstacle on the top

    //Test not notifyScored after releasePiece in position 0
    @Test
    public void shouldNotNotifyScoreListenerCoveringZeroLinesWhenReleasingPieceInInitialPositionBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/top/0_lines/pos_00");
    }

    //Test not notifyScored after releasePiece in position 1
    @Test
    public void shouldNotNotifyScoreListenerCoveringZeroLinesWhenReleasingPieceInPositionOneBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/top/0_lines/pos_01");
    }

    //Test not notifyScored after releasePiece in position 2
    @Test
    public void shouldNotNotifyScoreListenerCoveringZeroLinesWhenReleasingPieceInPositionTwoBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/top/0_lines/pos_02");
    }

    //Test not notifyScored after releasePiece in position 3
    @Test
    public void shouldNotNotifyScoreListenerCoveringZeroLinesWhenReleasingPieceInPositionThreeBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/top/0_lines/pos_03");
    }

    //Test not notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotNotifyScoreListenerCoveringZeroLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacleOnTheTop() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/top/0_lines/pos_10");
    }

    //#endregion

    //#region Test: Listener piece released notified when covering 3 lines after piece released because of boundary

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringThreeLinesInInitialPositionBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/bottom/3_lines/pos_00", times(1));
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringThreeLinesInPositionTwoBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/bottom/3_lines/pos_02", times(1));
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringThreeLinesInInitialPositionAfterOneRotationCycleBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/bottom/3_lines/pos_10", times(1));
    }

    //endregion

    //#region Test: Listener piece released notified when covering 2 lines after piece released because of boundary

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringTwoLinesInInitialPositionBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/bottom/2_lines/pos_00", times(1));
    }

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringTwoLinesInPositionOneBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/bottom/2_lines/pos_01", times(1));
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringTwoLinesInPositionTwoBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/bottom/2_lines/pos_02", times(1));
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringTwoLinesInPositionThreeBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/bottom/2_lines/pos_03", times(1));
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringTwoLinesInInitialPositionAfterOneRotationCycleBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/bottom/2_lines/pos_10", times(1));
    }

    //endregion

    //#region Test: Listener piece released notified when covering 1 line after piece released because of boundary

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInInitialPositionBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/bottom/1_line/pos_00", times(1));
    }

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInPositionOneBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/bottom/1_line/pos_01", times(1));
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInPositionTwoBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/bottom/1_line/pos_02", times(1));
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInPositionThreeBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/bottom/1_line/pos_03", times(1));
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInInitialPositionAfterOneRotationCycleBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/bottom/1_line/pos_10", times(1));
    }

    //endregion

    //#region Test: Listener piece released notified when covering 0 lines after piece released because of boundary

    //Test not notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringZeroLinesInInitialPositionBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/bottom/0_lines/pos_00", times(1));
    }

    //Test not notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringZeroLinesInPositionOneBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/bottom/0_lines/pos_01", times(1));
    }

    //Test not notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringZeroLinesInPositionTwoBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/bottom/0_lines/pos_02", times(1));
    }

    //Test not notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringZeroLinesInPositionThreeBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/bottom/0_lines/pos_03", times(1));
    }

    //Test not notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringZeroLinesInInitialPositionAfterOneRotationCycleBecauseOfBoundary() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/bottom/0_lines/pos_10", times(1));
    }

    //endregion

    //#region Test: Listener piece released notified when covering 3 lines after piece released because of obstacle

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringThreeLinesInInitialPositionBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/middle/3_lines/pos_00", times(1));
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringThreeLinesInPositionTwoBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/middle/3_lines/pos_02", times(1));
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringThreeLinesInInitialPositionAfterOneRotationCycleBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/middle/3_lines/pos_10", times(1));
    }

    //endregion

    //#region Test: Listener piece released notified when covering 2 lines after piece released because of obstacle

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringTwoLinesInInitialPositionBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/middle/2_lines/pos_00", times(1));
    }

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringTwoLinesInPositionOneBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/middle/2_lines/pos_01", times(1));
    }

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringTwoLinesInPositionTwoBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/middle/2_lines/pos_02", times(1));
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringTwoLinesInPositionThreeBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/middle/2_lines/pos_03", times(1));
    }

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringTwoLinesInInitialPositionAfterOneRotationCycleBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/middle/2_lines/pos_10", times(1));
    }

    //endregion

    //#region Test: Listener piece released notified when covering 1 line after piece released because of obstacle

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInInitialPositionBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/middle/1_line/pos_00", times(1));
    }

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInPositionOneBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/middle/1_line/pos_01", times(1));
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInPositionTwoBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/middle/1_line/pos_02", times(1));
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInPositionThreeBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/middle/1_line/pos_03", times(1));
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInInitialPositionAfterOneRotationCycleBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/middle/1_line/pos_10", times(1));
    }

    //endregion

    //#region Test: Listener piece released notified when covering 0 lines after piece released because of obstacle

    //Test not notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringZeroLinesInInitialPositionBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/middle/0_lines/pos_00", times(1));
    }

    //Test not notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringZeroLinesInPositionOneBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/middle/0_lines/pos_01", times(1));
    }

    //Test not notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringZeroLinesInPositionTwoBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/middle/0_lines/pos_02", times(1));
    }

    //Test not notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringZeroLinesInPositionThreeBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/middle/0_lines/pos_03", times(1));
    }

    //Test not notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringZeroLinesInInitialPositionAfterOneRotationCycleBecauseOfObstacle() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/middle/0_lines/pos_10", times(1));
    }

    //endregion

    //#region Test: Listener piece released notified when covering 3 lines after piece released because of obstacle on the top

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringThreeLinesInInitialPositionBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/top/3_lines/pos_00", times(1));
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringThreeLinesInPositionTwoBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/top/3_lines/pos_02", times(1));
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringThreeLinesInInitialPositionAfterOneRotationCycleBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/top/3_lines/pos_10", times(1));
    }

    //endregion

    //#region Test: Listener piece released notified when covering 2 lines after piece released because of obstacle on the top

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringTwoLinesInInitialPositionBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/top/2_lines/pos_00", times(1));
    }

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringTwoLinesInPositionOneBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/top/2_lines/pos_01", times(1));
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringTwoLinesInPositionTwoBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/top/2_lines/pos_02", times(1));
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringTwoLinesInPositionThreeBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/top/2_lines/pos_03", times(1));
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringTwoLinesInInitialPositionAfterOneRotationCycleBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/top/2_lines/pos_10", times(1));
    }

    //endregion

    //#region Test: Listener piece released notified when covering 1 line after piece released because of obstacle on the top

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInInitialPositionBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/top/1_line/pos_00", times(1));
    }

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInPositionOneBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/top/1_line/pos_01", times(1));
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInPositionTwoBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/top/1_line/pos_02", times(1));
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInPositionThreeBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/top/1_line/pos_03", times(1));
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInInitialPositionAfterOneRotationCycleBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/top/1_line/pos_10", times(1));
    }

    //endregion

    //#region Test: Listener piece released notified when covering 0 lines after piece released because of obstacle on the top

    //Test not notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringZeroLinesInInitialPositionBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/top/0_lines/pos_00", times(1));
    }

    //Test not notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringZeroLinesInPositionOneBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/top/0_lines/pos_01", times(1));
    }

    //Test not notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringZeroLinesInPositionTwoBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/top/0_lines/pos_02", times(1));
    }

    //Test not notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringZeroLinesInPositionThreeBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/top/0_lines/pos_03", times(1));
    }

    //Test not notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringZeroLinesInInitialPositionAfterOneRotationCycleBecauseOfObstacleOnTheTop() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/top/0_lines/pos_10", times(1));
    }

    //endregion

    //#region Test: Listener game over not notified when covering 3 lines after piece released because of boundary

    //Test Game Over not notified after releasePiece in position 0
    @Test
    public void shouldNotNotifyGameOverListenerCoveringThreeLinesWhenReleasingPieceInInitialPositionBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/bottom/3_lines/pos_00", never());
    }

    //Test Game Over not notified after releasePiece in position 2
    @Test
    public void shouldNotNotifyGameOverListenerCoveringThreeLinesWhenReleasingPieceInPositionTwoBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/bottom/3_lines/pos_02", never());
    }

    //Test Game Over not notified after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotNotifyGameOverListenerCoveringThreeLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/bottom/3_lines/pos_10", never());
    }

    //#endregion

    //#region Test: Listener game over not notified when covering 2 lines after piece released because of boundary

    //Test Game Over not notified after releasePiece in position 0
    @Test
    public void shouldNotNotifyGameOverListenerCoveringTwoLinesWhenReleasingPieceInInitialPositionBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/bottom/2_lines/pos_00", never());
    }

    //Test Game Over not notified after releasePiece in position 1
    @Test
    public void shouldNotNotifyGameOverListenerCoveringTwoLinesWhenReleasingPieceInPositionOneBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/bottom/2_lines/pos_01", never());
    }

    //Test Game Over not notified after releasePiece in position 2
    @Test
    public void shouldNotNotifyGameOverListenerCoveringTwoLinesWhenReleasingPieceInPositionTwoBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/bottom/2_lines/pos_01", never());
    }

    //Test Game Over not notified after releasePiece in position 3
    @Test
    public void shouldNotNotifyGameOverListenerCoveringTwoLinesWhenReleasingPieceInPositionThreeBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/bottom/2_lines/pos_03", never());
    }

    //Test Game Over not notified after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotNotifyGameOverListenerCoveringTwoLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/bottom/2_lines/pos_01", never());
    }

    //#endregion

    //#region Test: Listener game over not notified when covering 1 line after piece released because of boundary

    //Test Game Over not notified after releasePiece in position 0
    @Test
    public void shouldNotNotifyGameOverListenerCoveringOneLineWhenReleasingPieceInInitialPositionBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/bottom/1_line/pos_00", never());
    }

    //Test Game Over not notified after releasePiece in position 1
    @Test
    public void shouldNotNotifyGameOverListenerCoveringOneLineWhenReleasingPieceInPositionOneBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/bottom/1_line/pos_01", never());
    }

    //Test Game Over not notified after releasePiece in position 2
    @Test
    public void shouldNotNotifyGameOverListenerCoveringOneLineWhenReleasingPieceInPositionTwoBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/bottom/1_line/pos_02", never());
    }

    //Test Game Over not notified after releasePiece in position 3
    @Test
    public void shouldNotNotifyGameOverListenerCoveringOneLineWhenReleasingPieceInPositionThreeBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/bottom/1_line/pos_03", never());
    }

    //Test Game Over not notified after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotNotifyGameOverListenerCoveringOneLineWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/bottom/1_line/pos_10", never());
    }

    //#endregion

    //#region Test: Listener game over not notified when covering 0 lines after piece released because of boundary

    //Test Game Over not notified after releasePiece in position 0
    @Test
    public void shouldNotNotifyGameOverListenerCoveringZeroLinesWhenReleasingPieceInInitialPositionBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/bottom/0_lines/pos_00", never());
    }

    //Test Game Over not notified after releasePiece in position 1
    @Test
    public void shouldNotNotifyGameOverListenerCoveringZeroLinesWhenReleasingPieceInPositionOneBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/bottom/0_lines/pos_01", never());
    }

    //Test Game Over not notified after releasePiece in position 2
    @Test
    public void shouldNotNotifyGameOverListenerCoveringZeroLinesWhenReleasingPieceInPositionTwoBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/bottom/0_lines/pos_02", never());
    }

    //Test Game Over not notified after releasePiece in position 3
    @Test
    public void shouldNotNotifyGameOverListenerCoveringZeroLinesWhenReleasingPieceInPositionThreeBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/bottom/0_lines/pos_03", never());
    }

    //Test Game Over not notified after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotNotifyGameOverListenerCoveringZeroLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfBoundary() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/bottom/0_lines/pos_10", never());
    }

    //#endregion

    //#region Test: Listener game over not notified when covering 3 lines after piece released because of obstacle

    //Test Game Over not notified after releasePiece in position 0
    @Test
    public void shouldNotNotifyGameOverListenerCoveringThreeLinesWhenReleasingPieceInInitialPositionBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/middle/3_lines/pos_00", never());
    }

    //Test Game Over not notified after releasePiece in position 2
    @Test
    public void shouldNotNotifyGameOverListenerCoveringThreeLinesWhenReleasingPieceInPositionTwoBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/middle/3_lines/pos_02", never());
    }

    //Test Game Over not notified after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotNotifyGameOverListenerCoveringThreeLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/middle/3_lines/pos_10", never());
    }

    //#endregion

    //#region Test: Listener game over not notified when covering 2 lines after piece released because of obstacle

    //Test Game Over not notified after releasePiece in position 0
    @Test
    public void shouldNotNotifyGameOverListenerCoveringTwoLinesWhenReleasingPieceInInitialPositionBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/middle/2_lines/pos_00", never());
    }

    //Test Game Over not notified after releasePiece in position 1
    @Test
    public void shouldNotNotifyGameOverListenerCoveringTwoLinesWhenReleasingPieceInPositionOneBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/middle/2_lines/pos_01", never());
    }

    //Test Game Over not notified after releasePiece in position 2
    @Test
    public void shouldNotNotifyGameOverListenerCoveringTwoLinesWhenReleasingPieceInPositionTwoBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/middle/2_lines/pos_02", never());
    }

    //Test Game Over not notified after releasePiece in position 3
    @Test
    public void shouldNotNotifyGameOverListenerCoveringTwoLinesWhenReleasingPieceInPositionThreeBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/middle/2_lines/pos_03", never());
    }

    //Test Game Over not notified after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotNotifyGameOverListenerCoveringTwoLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/middle/2_lines/pos_10", never());
    }

    //#endregion

    //#region Test: Listener game over not notified when covering 1 line after piece released because of obstacle

    //Test Game Over not notified after releasePiece in position 0
    @Test
    public void shouldNotNotifyGameOverListenerCoveringOneLineWhenReleasingPieceInInitialPositionBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/middle/1_line/pos_00", never());
    }

    //Test Game Over not notified after releasePiece in position 1
    @Test
    public void shouldNotNotifyGameOverListenerCoveringOneLineWhenReleasingPieceInPositionOneBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/middle/1_line/pos_01", never());
    }

    //Test Game Over not notified after releasePiece in position 2
    @Test
    public void shouldNotNotifyGameOverListenerCoveringOneLineWhenReleasingPieceInPositionTwoBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/middle/1_line/pos_02", never());
    }

    //Test Game Over not notified after releasePiece in position 3
    @Test
    public void shouldNotNotifyGameOverListenerCoveringOneLineWhenReleasingPieceInPositionThreeBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/middle/1_line/pos_03", never());
    }

    //Test Game Over not notified after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotNotifyGameOverListenerCoveringOneLineWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/middle/1_line/pos_10", never());
    }

    //#endregion

    //#region Test: Listener game over not notified when covering 0 lines after piece released because of obstacle

    //Test Game Over not notified after releasePiece in position 0
    @Test
    public void shouldNotNotifyGameOverListenerCoveringZeroLinesWhenReleasingPieceInInitialPositionBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/middle/0_lines/pos_00", never());
    }

    //Test Game Over not notified after releasePiece in position 1
    @Test
    public void shouldNotNotifyGameOverListenerCoveringZeroLinesWhenReleasingPieceInPositionOneBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/middle/0_lines/pos_01", never());
    }

    //Test Game Over not notified after releasePiece in position 2
    @Test
    public void shouldNotNotifyGameOverListenerCoveringZeroLinesWhenReleasingPieceInPositionTwoBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/middle/0_lines/pos_02", never());
    }

    //Test Game Over not notified after releasePiece in position 3
    @Test
    public void shouldNotNotifyGameOverListenerCoveringZeroLinesWhenReleasingPieceInPositionThreeBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/middle/0_lines/pos_03", never());
    }

    //Test Game Over not notified after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotNotifyGameOverListenerCoveringZeroLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacle() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/middle/0_lines/pos_10", never());
    }

    //#endregion

    //#region Test: Listener game over not notified when covering 3 lines after piece released because of obstacle on the top

    //Test Game Over not notified after releasePiece in position 0
    @Test
    public void shouldNotNotifyGameOverListenerCoveringThreeLinesWhenReleasingPieceInInitialPositionBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/top/3_lines/pos_00", never());
    }

    //Test Game Over not notified after releasePiece in position 2
    @Test
    public void shouldNotNotifyGameOverListenerCoveringThreeLinesWhenReleasingPieceInPositionTwoBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/top/3_lines/pos_02", never());
    }

    //Test Game Over not notified after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotNotifyGameOverListenerCoveringThreeLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/top/3_lines/pos_10", never());
    }

    //#endregion

    //#region Test: Listener game over not notified when covering 2 lines after piece released because of obstacle on the top

    //Test Game Over not notified after releasePiece in position 0
    @Test
    public void shouldNotNotifyGameOverListenerCoveringTwoLinesWhenReleasingPieceInInitialPositionBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/top/2_lines/pos_00", never());
    }

    //Test Game Over not notified after releasePiece in position 1
    @Test
    public void shouldNotNotifyGameOverListenerCoveringTwoLinesWhenReleasingPieceInPositionOneBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/top/2_lines/pos_01", never());
    }

    //Test Game Over not notified after releasePiece in position 2
    @Test
    public void shouldNotNotifyGameOverListenerCoveringTwoLinesWhenReleasingPieceInPositionTwoBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/top/2_lines/pos_02", never());
    }

    //Test Game Over not notified after releasePiece in position 3
    @Test
    public void shouldNotNotifyGameOverListenerCoveringTwoLinesWhenReleasingPieceInPositionThreeBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/top/2_lines/pos_03", never());
    }

    //Test Game Over not notified after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotNotifyGameOverListenerCoveringTwoLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/top/2_lines/pos_10", never());
    }

    //#endregion

    //#region Test: Listener game over not notified when covering 1 line after piece released because of obstacle on the top

    //Test Game Over not notified after releasePiece in position 0
    @Test
    public void shouldNotNotifyGameOverListenerCoveringOneLineWhenReleasingPieceInInitialPositionBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/top/1_line/pos_00", never());
    }

    //Test Game Over not notified after releasePiece in position 1
    @Test
    public void shouldNotNotifyGameOverListenerCoveringOneLineWhenReleasingPieceInPositionOneBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/top/1_line/pos_01", never());
    }

    //Test Game Over not notified after releasePiece in position 2
    @Test
    public void shouldNotNotifyGameOverListenerCoveringOneLineWhenReleasingPieceInPositionTwoBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/top/1_line/pos_02", never());
    }

    //Test Game Over not notified after releasePiece in position 3
    @Test
    public void shouldNotNotifyGameOverListenerCoveringOneLineWhenReleasingPieceInPositionThreeBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/top/1_line/pos_03", never());
    }

    //Test Game Over not notified after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotNotifyGameOverListenerCoveringOneLineWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/top/1_line/pos_10", never());
    }

    //#endregion

    //#region Test: Listener game over not notified when covering 0 lines after piece released because of obstacle on the top

    //Test Game Over not notified after releasePiece in position 0
    @Test
    public void shouldNotNotifyGameOverListenerCoveringZeroLinesWhenReleasingPieceInInitialPositionBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/top/0_lines/pos_00", never());
    }

    //Test Game Over not notified after releasePiece in position 1
    @Test
    public void shouldNotNotifyGameOverListenerCoveringZeroLinesWhenReleasingPieceInPositionOneBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/top/0_lines/pos_01", never());
    }

    //Test Game Over not notified after releasePiece in position 2
    @Test
    public void shouldNotNotifyGameOverListenerCoveringZeroLinesWhenReleasingPieceInPositionTwoBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/top/0_lines/pos_02", never());
    }

    //Test Game Over not notified after releasePiece in position 3
    @Test
    public void shouldNotNotifyGameOverListenerCoveringZeroLinesWhenReleasingPieceInPositionThreeBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/top/0_lines/pos_03", never());
    }

    //Test Game Over not notified after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotNotifyGameOverListenerCoveringZeroLinesWhenReleasingPieceInInitialPositionAfterOneRotationCycleBecauseOfObstacleOnTheTop() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/top/0_lines/pos_10", never());
    }

    //#endregion

    //#region Test: Listener game over notified covering 1 line after piece released when game over occurred in the same turn with 1 hidden row overlapped

    //Test Game Over notified after releasePiece in position 0
    @Test
    public void shouldNotifyGameOverListenerWhenReleasingPieceCoveringOneLineInInitialPositionOverlappingOneRow() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/gameover/1_row/pos_00_score_1", times(1));
    }

    //Test Game Over notified after releasePiece in position 2
    @Test
    public void shouldNotifyGameOverListenerWhenReleasingPieceCoveringOneLineInPositionTwoOverlappingOneRow() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/gameover/1_row/pos_02_score_1", times(1));
    }

    //Test Game Over notified after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyGameOverListenerWhenReleasingPieceCoveringOneLineInInitialPositionAfterOneRotationCycleOverlappingOneRow() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/gameover/1_row/pos_10_score_1", times(1));
    }

    //#endregion

    //#region Test: Listener game over notified with 3 hidden rows overlapped

    //Test Game Over notified after releasePiece in position 0
    @Test
    public void shouldNotifyGameOverListenerWhenReleasingPieceInInitialPositionOverlappingThreeRows() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/gameover/3_rows/pos_00_no_score", times(1));
    }

    //Test Game Over notified after releasePiece in position 2
    @Test
    public void shouldNotifyGameOverListenerWhenReleasingPieceInPositionTwoOverlappingThreeRows() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/gameover/3_rows/pos_02_no_score", times(1));
    }

    //Test Game Over notified after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyGameOverListenerWhenReleasingPieceInInitialPositionAfterOneRotationCycleOverlappingThreeRows() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/gameover/3_rows/pos_10_no_score", times(1));
    }

    //#endregion

    //#region Test: Listener game over notified with 2 hidden rows overlapped

    //Test Game Over notified after releasePiece in position 0
    @Test
    public void shouldNotifyGameOverListenerWhenReleasingPieceInInitialPositionOverlappingTwoRows() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/gameover/2_rows/pos_00_no_score", times(1));
    }

    //Test Game Over notified after releasePiece in position 1
    @Test
    public void shouldNotifyGameOverListenerWhenReleasingPieceInPositionOneOverlappingTwoRows() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/gameover/2_rows/pos_01_no_score", times(1));
    }

    //Test Game Over notified after releasePiece in position 2
    @Test
    public void shouldNotifyGameOverListenerWhenReleasingPieceInPositionTwoOverlappingTwoRows() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/gameover/2_rows/pos_02_no_score", times(1));
    }

    //Test Game Over notified after releasePiece in position 3
    @Test
    public void shouldNotifyGameOverListenerWhenReleasingPieceInPositionThreeOverlappingTwoRows() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/gameover/2_rows/pos_03_no_score", times(1));
    }

    //Test Game Over notified after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyGameOverListenerWhenReleasingPieceInInitialPositionAfterOneRotationCycleOverlappingTwoRows() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/gameover/2_rows/pos_10_no_score", times(1));
    }

    //#endregion

    //#region Test: Listener game over notified with 1 hidden row overlapped

    //Test Game Over notified after releasePiece in position 0
    @Test
    public void shouldNotifyGameOverListenerWhenReleasingPieceInInitialPositionOverlappingOneRow() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/gameover/1_row/pos_00_no_score", times(1));
    }

    //Test Game Over notified after releasePiece in position 1
    @Test
    public void shouldNotifyGameOverListenerWhenReleasingPieceInPositionOneOverlappingOneRow() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/gameover/1_row/pos_01_no_score", times(1));
    }

    //Test Game Over notified after releasePiece in position 2
    @Test
    public void shouldNotifyGameOverListenerWhenReleasingPieceInPositionTwoOverlappingOneRow() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/gameover/1_row/pos_02_no_score", times(1));
    }

    //Test Game Over notified after releasePiece in position 3
    @Test
    public void shouldNotifyGameOverListenerWhenReleasingPieceInPositionThreeOverlappingOneRow() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/gameover/1_row/pos_03_no_score", times(1));
    }

    //Test Game Over notified after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyGameOverListenerWhenReleasingPieceAfterOneRotationCycleOverlappingOneRow() {
        this.verifyGameOverNotificationUseCaseFromFile("/tetris/lr/release/gameover/1_row/pos_10_no_score", times(1));
    }

    //#endregion

    //#region Test: Listener notified with score covering 1 line after piece released when game over occurred in the same turn with 1 hidden row overlapped

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyScoreListenerWhenReleasingPieceCoveringOneLineInInitialPositionOverlappingOneRow() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/gameover/1_row/pos_00_score_1");
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyScoreListenerWhenReleasingPieceCoveringOneLineInPositionTwoOverlappingOneRow() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/gameover/1_row/pos_02_score_1");
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyScoreListenerWhenReleasingPieceCoveringOneLineInInitialPositionAfterOneRotationCycleOverlappingOneRow() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/gameover/1_row/pos_10_score_1");
    }

    //#endregion

    //#region Test: Listener not notified with score after piece released when game over occurred in the same turn with 3 hidden rows overlapped

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyScoreListenerWhenReleasingPieceInInitialPositionOverlappingThreeRows() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/gameover/3_rows/pos_00_no_score");
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyScoreListenerWhenReleasingPieceInPositionTwoOverlappingThreeRows() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/gameover/3_rows/pos_02_no_score");
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyScoreListenerWhenReleasingPieceInInitialPositionAfterOneRotationCycleOverlappingThreeRows() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/gameover/3_rows/pos_10_no_score");
    }

    //#endregion

    //#region Test: Listener not notified with score after piece released when game over occurred in the same turn with 2 hidden rows overlapped

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyScoreListenerWhenReleasingPieceInInitialPositionOverlappingTwoRows() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/gameover/2_rows/pos_00_no_score");
    }

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyScoreListenerWhenReleasingPieceInPositionOneOverlappingTwoRows() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/gameover/2_rows/pos_01_no_score");
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyScoreListenerWhenReleasingPieceInPositionTwoOverlappingTwoRows() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/gameover/2_rows/pos_02_no_score");
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyScoreListenerWhenReleasingPieceInPositionThreeOverlappingTwoRows() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/gameover/2_rows/pos_03_no_score");
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyScoreListenerWhenReleasingPieceInInitialPositionAfterOneRotationCycleOverlappingTwoRows() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/gameover/2_rows/pos_10_no_score");
    }

    //#endregion

    //#region Test: Listener not notified with score after piece released when game over occurred in the same turn with 1 hidden row overlapped

    //Test notifyScored after releasePiece in position 0
    @Test
    public void shouldNotifyScoreListenerWhenReleasingPieceInInitialPositionOverlappingOneRow() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/gameover/1_row/pos_00_no_score");
    }

    //Test notifyScored after releasePiece in position 1
    @Test
    public void shouldNotifyScoreListenerWhenReleasingPieceInPositionOneOverlappingOneRow() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/gameover/1_row/pos_01_no_score");
    }

    //Test notifyScored after releasePiece in position 2
    @Test
    public void shouldNotifyScoreListenerWhenReleasingPieceInPositionTwoOverlappingOneRow() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/gameover/1_row/pos_02_no_score");
    }

    //Test notifyScored after releasePiece in position 3
    @Test
    public void shouldNotifyScoreListenerWhenReleasingPieceInPositionThreeOverlappingOneRow() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/gameover/1_row/pos_03_no_score");
    }

    //Test notifyScored after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyScoreListenerWhenReleasingPieceInInitialPositionAfterOneRotationCycleOverlappingOneRow() {
        this.verifyScoreNotificationUseCaseFromFile("/tetris/lr/release/gameover/1_row/pos_10_no_score");
    }

    //#endregion

    //#region Test: Rows rearranged covering 1 line after piece released when game over occurred in the same turn with 1 hidden row overlapped

    //Test rows not rearranged after releasePiece in position 0
    @Test
    public void shouldRearrangeBoardWhenReleasingPieceCoveringOneLineInInitialPositionOverlappingOneRow() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/gameover/1_row/pos_00_score_1");
    }

    //Test rows not rearranged after releasePiece in position 2
    @Test
    public void shouldRearrangeBoardWhenReleasingPieceCoveringOneLineInPositionTwoOverlappingOneRow() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/gameover/1_row/pos_02_score_1");
    }

    //Test rows not rearranged after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldRearrangeBoardWhenReleasingPieceCoveringOneLineInInitialPositionAfterOneRotationCycleOverlappingOneRow() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/gameover/1_row/pos_10_score_1");
    }

    //#endregion

    //#region Test: Rows not rearranged when game over occurred with 2 hidden rows overlapped

    //Test rows not rearranged after releasePiece in position 0
    @Test
    public void shouldNotRearrangeBoardWhenReleasingPieceInInitialPositionOverlappingTwoRows() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/gameover/2_rows/pos_00_no_score");
    }

    //Test rows not rearranged after releasePiece in position 1
    @Test
    public void shouldNotRearrangeBoardWhenReleasingPieceInPositionOneOverlappingTwoRows() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/gameover/2_rows/pos_01_no_score");
    }

    //Test rows not rearranged after releasePiece in position 2
    @Test
    public void shouldNotRearrangeBoardWhenReleasingPieceInPositionTwoOverlappingTwoRows() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/gameover/2_rows/pos_02_no_score");
    }

    //Test rows not rearranged after releasePiece in position 3
    @Test
    public void shouldNotRearrangeBoardWhenReleasingPieceInPositionThreeOverlappingTwoRows() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/gameover/2_rows/pos_03_no_score");
    }

    //Test rows not rearranged after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotRearrangeBoardWhenReleasingPieceInInitialPositionAfterOneRotationCycleOverlappingTwoRows() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/gameover/2_rows/pos_10_no_score");
    }

    //#endregion

    //#region Test: Rows not rearranged when game over occurred with 1 hidden row overlapped

    //Test rows not rearranged after releasePiece in position 0
    @Test
    public void shouldNotRearrangeBoardWhenReleasingPieceInInitialPositionOverlappingOneRow() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/gameover/1_row/pos_00_no_score");
    }

    //Test rows not rearranged after releasePiece in position 1
    @Test
    public void shouldNotRearrangeBoardWhenReleasingPieceInPositionOneOverlappingOneRow() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/gameover/1_row/pos_01_no_score");
    }

    //Test rows not rearranged after releasePiece in position 2
    @Test
    public void shouldNotRearrangeBoardWhenReleasingPieceInPositionTwoOverlappingOneRow() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/gameover/1_row/pos_02_no_score");
    }

    //Test rows not rearranged after releasePiece in position 3
    @Test
    public void shouldNotRearrangeBoardWhenReleasingPieceInPositionThreeOverlappingOneRow() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/gameover/1_row/pos_03_no_score");
    }

    //Test rows not rearranged after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotRearrangeBoardWhenReleasingPieceInInitialPositionAfterOneRotationCycleOverlappingOneRow() {
        this.assertRearrangeUseCaseFromFile("/tetris/lr/release/gameover/1_row/pos_10_no_score");
    }

    //#endregion

    //#region Test: Listener piece released not notified covering 1 line after piece released when game over occurred in the same turn with 1 hidden row overlapped

    //Test pieceReleased notified after releasePiece in position 0
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInInitialPositionOverlappingOneRow() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/gameover/1_row/pos_00_score_1", never());
    }

    //Test pieceReleased notified after releasePiece in position 2
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInPositionTwoOverlappingOneRow() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/gameover/1_row/pos_02_score_1", never());
    }

    //Test pieceReleased notified after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyListenerWhenPieceReleasedCoveringOneLineInInitialPositionAfterOneRotationCycleOverlappingOneRow() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/gameover/1_row/pos_10_score_1", never());
    }

    //#endregion

    //#region Test: Listener piece released not notified after piece released when game over occurred in the same turn with 2 hidden rows overlapped

    //Test pieceReleased notified after releasePiece in position 0
    @Test
    public void shouldNotifyListenerWhenPieceReleasedInInitialPositionOverlappingTwoRows() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/gameover/2_rows/pos_00_no_score", never());
    }

    //Test pieceReleased notified after releasePiece in position 1
    @Test
    public void shouldNotifyListenerWhenPieceReleasedInPositionOneOverlappingTwoRows() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/gameover/2_rows/pos_01_no_score", never());
    }

    //Test pieceReleased notified after releasePiece in position 2
    @Test
    public void shouldNotifyListenerWhenPieceReleasedInPositionTwoOverlappingTwoRows() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/gameover/2_rows/pos_02_no_score", never());
    }

    //Test pieceReleased notified after releasePiece in position 3
    @Test
    public void shouldNotifyListenerWhenPieceReleasedInPositionThreeOverlappingTwoRows() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/gameover/2_rows/pos_03_no_score", never());
    }

    //Test pieceReleased notified after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyListenerWhenPieceReleasedInInitialPositionAfterOneRotationCycleOverlappingTwoRows() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/gameover/2_rows/pos_10_no_score", never());
    }

    //#endregion

    //#region Test: Listener piece released not notified after piece released when game over occurred in the same turn with 1 hidden row overlapped

    //Test pieceReleased notified after releasePiece in position 0
    @Test
    public void shouldNotifyListenerWhenPieceReleasedInInitialPositionOverlappingOneRow() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/gameover/1_row/pos_00_no_score", never());
    }

    //Test pieceReleased notified after releasePiece in position 1
    @Test
    public void shouldNotifyListenerWhenPieceReleasedInPositionOneOverlappingOneRow() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/gameover/1_row/pos_01_no_score", never());
    }

    //Test pieceReleased notified after releasePiece in position 2
    @Test
    public void shouldNotifyListenerWhenPieceReleasedInPositionTwoOverlappingOneRow() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/gameover/1_row/pos_02_no_score", never());
    }

    //Test pieceReleased notified after releasePiece in position 3
    @Test
    public void shouldNotifyListenerWhenPieceReleasedInPositionThreeOverlappingOneRow() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/gameover/1_row/pos_03_no_score", never());
    }

    //Test pieceReleased notified after releasePiece in position 0 after one rotation cycle
    @Test
    public void shouldNotifyListenerWhenPieceReleasedInInitialPositionAfterOneRotationCycleOverlappingOneRow() {
        this.verifyPieceReleasedNotificationUseCaseFromFile("/tetris/lr/release/gameover/1_row/pos_10_no_score", never());
    }

    //#endregion

    //#region Test: Listener piece rotated notified when rotation allowed

    //Test piece rotated notification received when rotation allowed in position 0
    @Test
    public void shouldNotifyPieceRotatedListenerWhenPieceRotatedInInitialPosition(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/rotation/allowed/pos_00");
        this.shouldNotifyPieceRotatedListenerWhenPieceRotationExecuted(this.piece);
    }

    //Test piece rotated notification received when rotation allowed in position 1
    @Test
    public void shouldNotifyPieceRotatedListenerWhenPieceRotatedInPositionOne(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/rotation/allowed/pos_01");
        this.shouldNotifyPieceRotatedListenerWhenPieceRotationExecuted(this.piece);
    }

    //Test piece rotated notification received when rotation allowed in position 2
    @Test
    public void shouldNotifyPieceRotatedListenerWhenPieceRotatedInPositionTwo(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/rotation/allowed/pos_02");
        this.shouldNotifyPieceRotatedListenerWhenPieceRotationExecuted(this.piece);
    }

    //Test piece rotated notification received when rotation allowed in position 3
    @Test
    public void shouldNotifyPieceRotatedListenerWhenPieceRotatedInPositionThree(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/rotation/allowed/pos_03");
        this.shouldNotifyPieceRotatedListenerWhenPieceRotationExecuted(this.piece);
    }

    //Test piece rotated notification received when rotation allowed in position 0 after one rotation cycle
    @Test
    public void shouldNotifyPieceRotatedListenerWhenPieceRotatedAfterOneRotationCycle(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/rotation/allowed/pos_10");
        this.shouldNotifyPieceRotatedListenerWhenPieceRotationExecuted(this.piece);
    }

    //endregion

    //#region Test: Listener piece moved notified when moving to left allowed

    //Test piece moved notification received when moveLeft allowed in position 0
    @Test
    public void shouldNotifyPieceMovedListenerWhenPieceMovedToLeftInInitialPosition(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/left/allowed/pos_00");
        this.shouldNotifyPieceMovedListenerWhenPieceMoveExecuted(this.piece, () -> {
            this.tetrisBoard.moveLeft();
            return null;
        });
    }

    //Test piece moved notification received when moveLeft allowed in position 1
    @Test
    public void shouldNotifyPieceMovedListenerWhenPieceMovedToLeftInPositionOne(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/left/allowed/pos_01");
        this.shouldNotifyPieceMovedListenerWhenPieceMoveExecuted(this.piece, () -> {
            this.tetrisBoard.moveLeft();
            return null;
        });
    }

    //Test piece moved notification received when moveLeft allowed in position 2
    @Test
    public void shouldNotifyPieceMovedListenerWhenPieceMovedToLeftInPositionTwo(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/left/allowed/pos_02");
        this.shouldNotifyPieceMovedListenerWhenPieceMoveExecuted(this.piece, () -> {
            this.tetrisBoard.moveLeft();
            return null;
        });
    }

    //Test piece moved notification received when moveLeft allowed in position 3
    @Test
    public void shouldNotifyPieceMovedListenerWhenPieceMovedToLeftInPositionThree(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/left/allowed/pos_03");
        this.shouldNotifyPieceMovedListenerWhenPieceMoveExecuted(this.piece, () -> {
            this.tetrisBoard.moveLeft();
            return null;
        });
    }

    //Test piece moved notification received when moveLeft allowed in position 0 after one rotation cycle
    @Test
    public void shouldNotifyPieceMovedListenerWhenPieceMovedToLeftAfterOneRotationCycle(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/left/allowed/pos_10");
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
        this.loadBoardAndPieceFromFile("/tetris/lr/move/right/allowed/pos_00");
        this.shouldNotifyPieceMovedListenerWhenPieceMoveExecuted(this.piece, () -> {
            this.tetrisBoard.moveRight();
            return null;
        });
    }

    //Test piece moved notification received when moveRight allowed in position 1
    @Test
    public void shouldNotifyPieceMovedListenerWhenPieceMovedToRightInPositionOne(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/right/allowed/pos_01");
        this.shouldNotifyPieceMovedListenerWhenPieceMoveExecuted(this.piece, () -> {
            this.tetrisBoard.moveRight();
            return null;
        });
    }

    //Test piece moved notification received when moveRight allowed in position 2
    @Test
    public void shouldNotifyPieceMovedListenerWhenPieceMovedToRightInPositionTwo(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/right/allowed/pos_02");
        this.shouldNotifyPieceMovedListenerWhenPieceMoveExecuted(this.piece, () -> {
            this.tetrisBoard.moveRight();
            return null;
        });
    }

    //Test piece moved notification received when moveRight allowed in position 3
    @Test
    public void shouldNotifyPieceMovedListenerWhenPieceMovedToRightInPositionThree(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/right/allowed/pos_03");
        this.shouldNotifyPieceMovedListenerWhenPieceMoveExecuted(this.piece, () -> {
            this.tetrisBoard.moveRight();
            return null;
        });
    }

    //Test piece moved notification received when moveRight allowed in position 0 after one rotation cycle
    @Test
    public void shouldNotifyPieceMovedListenerWhenPieceMovedToRightAfterOneRotationCycle(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/right/allowed/pos_10");
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
        this.loadBoardAndPieceFromFile("/tetris/lr/move/down/allowed/pos_00");
        this.shouldNotifyPieceMovedListenerWhenPieceMoveExecuted(this.piece, () -> {
            this.tetrisBoard.moveDown();
            return null;
        });
    }

    //Test piece moved notification received when moveDown allowed in position 1
    @Test
    public void shouldNotifyPieceMovedListenerWhenPieceMovedDownInPositionOne(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/down/allowed/pos_01");
        this.shouldNotifyPieceMovedListenerWhenPieceMoveExecuted(this.piece, () -> {
            this.tetrisBoard.moveDown();
            return null;
        });
    }

    //Test piece moved notification received when moveDown allowed in position 2
    @Test
    public void shouldNotifyPieceMovedListenerWhenPieceMovedDownInPositionTwo(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/down/allowed/pos_02");
        this.shouldNotifyPieceMovedListenerWhenPieceMoveExecuted(this.piece, () -> {
            this.tetrisBoard.moveDown();
            return null;
        });
    }

    //Test piece moved notification received when moveDown allowed in position 3
    @Test
    public void shouldNotifyPieceMovedListenerWhenPieceMovedDownInPositionThree(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/down/allowed/pos_03");
        this.shouldNotifyPieceMovedListenerWhenPieceMoveExecuted(this.piece, () -> {
            this.tetrisBoard.moveDown();
            return null;
        });
    }

    //Test piece moved notification received when moveDown allowed in position 0 after one rotation cycle
    @Test
    public void shouldNotifyPieceMovedListenerWhenPieceMovedDownAfterOneRotationCycle(){
        this.loadBoardAndPieceFromFile("/tetris/lr/move/down/allowed/pos_10");
        this.shouldNotifyPieceMovedListenerWhenPieceMoveExecuted(this.piece, () -> {
            this.tetrisBoard.moveDown();
            return null;
        });
    }

    //endregion
}
