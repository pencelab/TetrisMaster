package com.pencelab.tetrismaster.game.mechanics;

import com.pencelab.tetrismaster.pieces.*;
import com.pencelab.tetrismaster.stage.IBoard;
import com.pencelab.tetrismaster.stage.TetrisBoard;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest(TetrisBoard.class)
public class TetrisMechanicsTest {

    @Mock
    private IBoard board;

    private TetrisMechanics tetrisMechanics;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        this.tetrisMechanics = new TetrisMechanics(this.board);
    }

    @Test
    public void shouldUpdateScoreForOneLine() {
        this.tetrisMechanics.updateStats(1);
        int score = Whitebox.getInternalState(this.tetrisMechanics, "score");
        assertEquals(10, score);
    }

    @Test
    public void shouldUpdateScoreForTwoLines() {
        this.tetrisMechanics.updateStats(2);
        int score = Whitebox.getInternalState(this.tetrisMechanics, "score");
        assertEquals(25, score);
    }

    @Test
    public void shouldUpdateScoreForThreeLines() {
        this.tetrisMechanics.updateStats(3);
        int score = Whitebox.getInternalState(this.tetrisMechanics, "score");
        assertEquals(45, score);
    }

    @Test
    public void shouldUpdateScoreForFourLines() {
        this.tetrisMechanics.updateStats(4);
        int score = Whitebox.getInternalState(this.tetrisMechanics, "score");
        assertEquals(70, score);
    }

    @Test(expected = IllegalStateException.class)
    public void shouldThrowExceptionWhenUpdatingStatsForZeroLines() {
        this.tetrisMechanics.updateStats(0);
    }

    @Test(expected = IllegalStateException.class)
    public void shouldThrowExceptionWhenUpdatingStatsForFiveLines() {
        this.tetrisMechanics.updateStats(5);
    }

    @Test
    public void shouldUpdateLevelWithTenLinesPerLevelForTheFirstThreeHundredLines() {
        int linesPerLevel = 10;
        for(int lines = 1; lines <= 300; lines++){
            int expected = lines / linesPerLevel + 1;
            this.tetrisMechanics.updateStats(1);
            int level = Whitebox.getInternalState(this.tetrisMechanics, "level");
            assertEquals(expected, level);
        }
    }

    @Test
    public void shouldUpdateLinesForForTheFirstThreeHundredLines() {
        for(int i = 1; i <= 300; i++){
            this.tetrisMechanics.updateStats(1);
            int lines = Whitebox.getInternalState(this.tetrisMechanics, "lines");
            assertEquals(i, lines);
        }
    }

    @Test
    public void shouldUpdateGravityWaitTimeForLevelOne() {
        Whitebox.setInternalState(this.tetrisMechanics, "level", 1);
        this.tetrisMechanics.updateGravityWaitTime();
        long gravityWaitTime = Whitebox.getInternalState(this.tetrisMechanics, "gravityWaitTime");
        assertEquals(2000, gravityWaitTime);
    }

    @Test
    public void shouldUpdateGravityWaitTimeForLevelTwo() {
        Whitebox.setInternalState(this.tetrisMechanics, "level", 2);
        this.tetrisMechanics.updateGravityWaitTime();
        long gravityWaitTime = Whitebox.getInternalState(this.tetrisMechanics, "gravityWaitTime");
        assertEquals(1500, gravityWaitTime);
    }

    @Test
    public void shouldUpdateGravityWaitTimeForLevelThree() {
        Whitebox.setInternalState(this.tetrisMechanics, "level", 3);
        this.tetrisMechanics.updateGravityWaitTime();
        long gravityWaitTime = Whitebox.getInternalState(this.tetrisMechanics, "gravityWaitTime");
        assertEquals(1125, gravityWaitTime);
    }

    @Test
    public void shouldUpdateGravityWaitTimeForLevelFour() {
        Whitebox.setInternalState(this.tetrisMechanics, "level", 4);
        this.tetrisMechanics.updateGravityWaitTime();
        long gravityWaitTime = Whitebox.getInternalState(this.tetrisMechanics, "gravityWaitTime");
        assertEquals(843, gravityWaitTime);
    }

    @Test
    public void shouldUpdateGravityWaitTimeForLevelFive() {
        Whitebox.setInternalState(this.tetrisMechanics, "level", 5);
        this.tetrisMechanics.updateGravityWaitTime();
        long gravityWaitTime = Whitebox.getInternalState(this.tetrisMechanics, "gravityWaitTime");
        assertEquals(632, gravityWaitTime);
    }

    @Test
    public void shouldUpdateGravityWaitTimeForLevelSix() {
        Whitebox.setInternalState(this.tetrisMechanics, "level", 6);
        this.tetrisMechanics.updateGravityWaitTime();
        long gravityWaitTime = Whitebox.getInternalState(this.tetrisMechanics, "gravityWaitTime");
        assertEquals(474, gravityWaitTime);
    }

    @Test
    public void shouldUpdateGravityWaitTimeForLevelSeven() {
        Whitebox.setInternalState(this.tetrisMechanics, "level", 7);
        this.tetrisMechanics.updateGravityWaitTime();
        long gravityWaitTime = Whitebox.getInternalState(this.tetrisMechanics, "gravityWaitTime");
        assertEquals(355, gravityWaitTime);
    }

    @Test
    public void shouldUpdateGravityWaitTimeForLevelEight() {
        Whitebox.setInternalState(this.tetrisMechanics, "level", 8);
        this.tetrisMechanics.updateGravityWaitTime();
        long gravityWaitTime = Whitebox.getInternalState(this.tetrisMechanics, "gravityWaitTime");
        assertEquals(266, gravityWaitTime);
    }

    @Test
    public void shouldUpdateGravityWaitTimeForLevelNine() {
        Whitebox.setInternalState(this.tetrisMechanics, "level", 9);
        this.tetrisMechanics.updateGravityWaitTime();
        long gravityWaitTime = Whitebox.getInternalState(this.tetrisMechanics, "gravityWaitTime");
        assertEquals(200, gravityWaitTime);
    }

    @Test
    public void shouldUpdateGravityWaitTimeForLevelTen() {
        Whitebox.setInternalState(this.tetrisMechanics, "level", 10);
        this.tetrisMechanics.updateGravityWaitTime();
        long gravityWaitTime = Whitebox.getInternalState(this.tetrisMechanics, "gravityWaitTime");
        assertEquals(150, gravityWaitTime);
    }

    /*@Test
    public void shouldGetValidRandomPieceIndex() {
        int index;
        for(int i = 0; i < 100; i++){
            index = this.tetrisMechanics.getRandomPieceIndex();
            assertTrue(0 <= index && index <= Globals.TetrisPiece.values().length - 1);
        }
    }

    @Test
    public void shouldBuildPieceCorrespondingToSquare() {
        assertTrue(this.tetrisMechanics.buildPiece(Globals.TetrisPiece.SQUARE.ordinal()) instanceof Square);
    }

    @Test
    public void shouldBuildPieceCorrespondingToPipe() {
        assertTrue(this.tetrisMechanics.buildPiece(Globals.TetrisPiece.PIPE.ordinal()) instanceof Pipe);
    }

    @Test
    public void shouldBuildPieceCorrespondingToT() {
        assertTrue(this.tetrisMechanics.buildPiece(Globals.TetrisPiece.T.ordinal()) instanceof T);
    }

    @Test
    public void shouldBuildPieceCorrespondingToL() {
        assertTrue(this.tetrisMechanics.buildPiece(Globals.TetrisPiece.L.ordinal()) instanceof L);
    }

    @Test
    public void shouldBuildPieceCorrespondingToLR() {
        assertTrue(this.tetrisMechanics.buildPiece(Globals.TetrisPiece.LR.ordinal()) instanceof LR);
    }

    @Test
    public void shouldBuildPieceCorrespondingToZ() {
        assertTrue(this.tetrisMechanics.buildPiece(Globals.TetrisPiece.Z.ordinal()) instanceof Z);
    }

    @Test
    public void shouldBuildPieceCorrespondingToZR() {
        assertTrue(this.tetrisMechanics.buildPiece(Globals.TetrisPiece.ZR.ordinal()) instanceof ZR);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenBuildingPieceBecauseOfInvalidIndexValue() {
        this.tetrisMechanics.buildPiece(Globals.TetrisPiece.values().length);
    }*/

    /*@Test
    public void shouldCallBoardSetPieceWhenInitMethodCalled(){
        this.tetrisMechanics.init();
        verify(this.board, times(1)).setPiece(any(Piece.class));
    }

    @Test
    public void shouldSetNextPieceWhenInitMethodCalled(){
        TetrisMechanics mechanicsSpy = spy(this.tetrisMechanics);
        mechanicsSpy.init();
        verify(mechanicsSpy, times(1)).setNextPiece(any(IPiece.class));
    }

    @Test
    public void shouldSetGravityWaitTimeWhenInitMethodCalled(){
        TetrisMechanics mechanicsSpy = spy(this.tetrisMechanics);
        mechanicsSpy.init();
        verify(mechanicsSpy, times(1)).setGravityWaitTime(anyLong());
    }

    @Test
    public void shouldSwitchGameOverFlagToFalseWhenInitMethodCalled(){
        TetrisMechanics mechanicsSpy = spy(this.tetrisMechanics);
        mechanicsSpy.init();
        verify(mechanicsSpy, times(1)).setGameOver(false);
    }

    @Test
    public void shouldSwitchPausedFlagToTrueWhenPauseMethodCalled(){
        TetrisMechanics mechanicsSpy = spy(this.tetrisMechanics);
        mechanicsSpy.pause();
        verify(mechanicsSpy, times(1)).setPaused(true);
    }

    @Test
    public void shouldSwitchPausedFlagToFalseWhenResumeMethodCalled(){
        TetrisMechanics mechanicsSpy = spy(this.tetrisMechanics);
        mechanicsSpy.resume();
        verify(mechanicsSpy, times(1)).setPaused(false);
    }

    @Test
    public void shouldSwitchGameOverFlagToTrueWhenFinishMethodCalled(){
        TetrisMechanics mechanicsSpy = spy(this.tetrisMechanics);
        mechanicsSpy.finish();
        verify(mechanicsSpy, times(1)).setGameOver(true);
    }

    @Test
    public void shouldCallBoardMoveLeftWhenMoveLeftCalledGivenNotGameOverAndNotPaused(){
        TetrisMechanics mechanicsSpy = spy(this.tetrisMechanics);
        when(mechanicsSpy.isGameOver()).thenReturn(false);
        when(mechanicsSpy.isPaused()).thenReturn(false);
        mechanicsSpy.moveLeft();
        verify(this.board, times(1)).moveLeft();
    }

    @Test
    public void shouldNotCallBoardMoveLeftWhenMoveLeftCalledGivenGameOverAndNotPaused(){
        TetrisMechanics mechanicsSpy = spy(this.tetrisMechanics);
        when(mechanicsSpy.isGameOver()).thenReturn(true);
        when(mechanicsSpy.isPaused()).thenReturn(false);
        mechanicsSpy.moveLeft();
        verify(this.board, never()).moveLeft();
    }

    @Test
    public void shouldNotCallBoardMoveLeftWhenMoveLeftCalledGivenNotGameOverAndPaused(){
        TetrisMechanics mechanicsSpy = spy(this.tetrisMechanics);
        when(mechanicsSpy.isGameOver()).thenReturn(false);
        when(mechanicsSpy.isPaused()).thenReturn(true);
        mechanicsSpy.moveLeft();
        verify(this.board, never()).moveLeft();
    }

    @Test
    public void shouldNotCallBoardMoveLeftWhenMoveLeftCalledGivenGameOverPaused(){
        TetrisMechanics mechanicsSpy = spy(this.tetrisMechanics);
        when(mechanicsSpy.isGameOver()).thenReturn(true);
        when(mechanicsSpy.isPaused()).thenReturn(true);
        mechanicsSpy.moveLeft();
        verify(this.board, never()).moveLeft();
    }

    @Test
    public void shouldCallBoardMoveLeftWhenMoveRightCalledGivenNotGameOverAndNotPaused(){
        TetrisMechanics mechanicsSpy = spy(this.tetrisMechanics);
        when(mechanicsSpy.isGameOver()).thenReturn(false);
        when(mechanicsSpy.isPaused()).thenReturn(false);
        mechanicsSpy.moveRight();
        verify(this.board, times(1)).moveRight();
    }

    @Test
    public void shouldNotCallBoardMoveLeftWhenMoveRightCalledGivenGameOverAndNotPaused(){
        TetrisMechanics mechanicsSpy = spy(this.tetrisMechanics);
        when(mechanicsSpy.isGameOver()).thenReturn(true);
        when(mechanicsSpy.isPaused()).thenReturn(false);
        mechanicsSpy.moveRight();
        verify(this.board, never()).moveRight();
    }

    @Test
    public void shouldNotCallBoardMoveLeftWhenMoveRightCalledGivenNotGameOverAndPaused(){
        TetrisMechanics mechanicsSpy = spy(this.tetrisMechanics);
        when(mechanicsSpy.isGameOver()).thenReturn(false);
        when(mechanicsSpy.isPaused()).thenReturn(true);
        mechanicsSpy.moveRight();
        verify(this.board, never()).moveRight();
    }

    @Test
    public void shouldNotCallBoardMoveLeftWhenMoveRightCalledGivenGameOverPaused(){
        TetrisMechanics mechanicsSpy = spy(this.tetrisMechanics);
        when(mechanicsSpy.isGameOver()).thenReturn(true);
        when(mechanicsSpy.isPaused()).thenReturn(true);
        mechanicsSpy.moveRight();
        verify(this.board, never()).moveRight();
    }

    @Test
    public void shouldCallBoardMoveLeftWhenMoveDownCalledGivenNotGameOverAndNotPaused(){
        TetrisMechanics mechanicsSpy = spy(this.tetrisMechanics);
        when(mechanicsSpy.isGameOver()).thenReturn(false);
        when(mechanicsSpy.isPaused()).thenReturn(false);
        mechanicsSpy.moveDown();
        verify(this.board, times(1)).moveDown();
    }

    @Test
    public void shouldNotCallBoardMoveLeftWhenMoveDownCalledGivenGameOverAndNotPaused(){
        TetrisMechanics mechanicsSpy = spy(this.tetrisMechanics);
        when(mechanicsSpy.isGameOver()).thenReturn(true);
        when(mechanicsSpy.isPaused()).thenReturn(false);
        mechanicsSpy.moveDown();
        verify(this.board, never()).moveDown();
    }

    @Test
    public void shouldNotCallBoardMoveLeftWhenMoveDownCalledGivenNotGameOverAndPaused(){
        TetrisMechanics mechanicsSpy = spy(this.tetrisMechanics);
        when(mechanicsSpy.isGameOver()).thenReturn(false);
        when(mechanicsSpy.isPaused()).thenReturn(true);
        mechanicsSpy.moveDown();
        verify(this.board, never()).moveDown();
    }

    @Test
    public void shouldNotCallBoardMoveLeftWhenMoveDownCalledGivenGameOverPaused(){
        TetrisMechanics mechanicsSpy = spy(this.tetrisMechanics);
        when(mechanicsSpy.isGameOver()).thenReturn(true);
        when(mechanicsSpy.isPaused()).thenReturn(true);
        mechanicsSpy.moveDown();
        verify(this.board, never()).moveDown();
    }

    @Test
    public void shouldCallBoardSetPieceWhenReleaseMethodCalled(){
        this.tetrisMechanics.fetchPieces();
        verify(this.board, times(1)).setPiece(any(Piece.class));
    }

    @Test
    public void shouldSetNextPieceWhenReleaseMethodCalled(){
        TetrisMechanics mechanicsSpy = spy(this.tetrisMechanics);
        mechanicsSpy.fetchPieces();
        verify(mechanicsSpy, times(1)).setNextPiece(any(IPiece.class));
    }

    @Test
    public void shouldAddBoardListener(){
        IBoard.Listener listenerMock = mock(IBoard.Listener.class);
        this.tetrisMechanics.addBoardListener(listenerMock);
        verify(this.board, times(1)).addListener(listenerMock);
    }

    @Test
    public void shouldRemoveBoardListener(){
        IBoard.Listener listenerMock = mock(IBoard.Listener.class);
        this.tetrisMechanics.removeBoardListener(listenerMock);
        verify(this.board, times(1)).removeListener(listenerMock);
    }

    @Test
    public void shouldRemoveAllListeners(){
        this.tetrisMechanics.clearBoardListeners();
        verify(this.board, times(1)).clearAllListeners();
    }*/
}