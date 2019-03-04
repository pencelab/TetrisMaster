package com.pencelab.tetrismaster.game;

import com.pencelab.tetrismaster.game.mechanics.IMechanics;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.reflect.Whitebox;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
@PrepareForTest(Game.class)
public class GameTest {

    private Game game;

    @Mock
    private IMechanics mechanics;

    @Mock
    private IGame.Listener listener;

    @Before
    public void setUp() {
        this.game = new Game(this.mechanics);
        this.game.addListener(listener);
    }

    @Test
    public void shouldAddListener(){
        List<IGame.Listener> listeners = Whitebox.getInternalState(this.game, "listeners");
        assertTrue(listeners.contains(this.listener));
    }

    @Test
    public void shouldRemoveListener(){
        List<IGame.Listener> listeners = Whitebox.getInternalState(this.game, "listeners");
        assertTrue(listeners.contains(this.listener));
        this.game.removeListener(this.listener);
        assertFalse(listeners.contains(this.listener));
    }

    @Test
    public void shouldRemoveAllListeners(){
        IGame.Listener listener1 = mock(IGame.Listener.class);
        IGame.Listener listener2 = mock(IGame.Listener.class);
        IGame.Listener listener3 = mock(IGame.Listener.class);
        this.game.addListener(listener1);
        this.game.addListener(listener2);
        this.game.addListener(listener3);
        List<IGame.Listener> listeners = Whitebox.getInternalState(this.game, "listeners");
        assertEquals(4, listeners.size());
        this.game.clearAllListeners();
        assertEquals(0, listeners.size());
    }

    @Test
    public void shouldCallMechanicsInitMethodWhenStartingGame(){
        this.game.start();
        verify(this.mechanics, times(1)).init();
    }

    @Test
    public void shouldCallMechanicsFinishMethodWhenStoppingGame(){
        this.game.stop();
        verify(this.mechanics, times(1)).finish();
    }

    @Test
    public void shouldNotifyGameOverToListenerWhenStoppingGame(){
        this.game.stop();
        verify(this.listener, times(1)).gameOver();
    }

    @Test
    public void shouldCallMechanicsRemoveListenerMethodWhenStoppingGame(){
        this.game.stop();
        verify(this.mechanics, times(1)).removeBoardListener(this.game);
    }

    @Test
    public void shouldCallMechanicsResumeMethodWhenResumingGame(){
        this.game.resume();
        verify(this.mechanics, times(1)).resume();
    }

    @Test
    public void shouldNotifyGameResumedToListenerWhenResumingGame(){
        this.game.resume();
        verify(this.listener, times(1)).resumed();
    }

    @Test
    public void shouldCallMechanicsPauseMethodWhenPausingGame(){
        this.game.pause();
        verify(this.mechanics, times(1)).pause();
    }

    @Test
    public void shouldNotifyGamePausedToListenerWhenPausingGame(){
        this.game.pause();
        verify(this.listener, times(1)).paused();
    }

    @Test
    public void shouldNotifyPieceMovedToListenerWhenPieceMovedNotificationReceived(){
        this.game.pieceMoved();
        verify(this.listener, times(1)).pieceMoved();
    }

    @Test
    public void shouldNotNotifyPieceReleasedToListenerWhenPieceMovedNotificationReceived(){
        this.game.pieceMoved();
        verify(this.listener, never()).pieceReleased();
    }

    @Test
    public void shouldNotifyPieceReleasedToListenerWhenPieceReleasedNotificationReceived(){
        this.game.pieceReleased();
        verify(this.listener, times(1)).pieceReleased();
    }

    @Test
    public void shouldCallMechanicsReleaseMethodWhenPieceReleasedNotificationReceived(){
        this.game.pieceReleased();
        verify(this.mechanics, times(1)).fetchPieces();
    }

    @Test
    public void shouldNotifyScoredToListenerWhenScoredNotificationReceived(){
        this.game.scored(4);
        verify(this.listener, times(1)).scored(anyInt());
    }

    @Test
    public void shouldCallMechanicsUpdateStatsWhenScoredNotificationReceived(){
        this.game.scored(4);
        verify(this.mechanics, times(1)).updateStats(any());
    }

    @Test
    public void shouldCallMechanicsUpdateGravityWaitTimeWhenScoredNotificationReceived(){
        this.game.scored(4);
        verify(this.mechanics, times(1)).updateGravityWaitTime();
    }

    @Test
    public void shouldCallMechanicsFinishMethodWhenGameOverNotificationReceived(){
        this.game.gameOver();
        verify(this.mechanics, times(1)).finish();
    }

    @Test
    public void shouldNotifyGameOverToListenerWhenGameOverNotificationReceived(){
        this.game.gameOver();
        verify(this.listener, times(1)).gameOver();
    }

    @Test
    public void shouldCallMechanicsRotateMethodWhenGameRotateMethodIsCalled() {
        this.game.rotate();
        verify(this.mechanics, times(1)).rotate();
    }

    @Test
    public void shouldCallMechanicsMoveDownMethodWhenGameMoveDownMethodIsCalled() {
        this.game.moveDown();
        verify(this.mechanics, times(1)).moveDown();
    }

    @Test
    public void shouldCallMechanicsMoveLeftMethodWhenGameMoveLeftMethodIsCalled() {
        this.game.moveLeft();
        verify(this.mechanics, times(1)).moveLeft();
    }

    @Test
    public void shouldCallMechanicsMoveRightMethodWhenGameMoveRightMethodIsCalled() {
        this.game.moveRight();
        verify(this.mechanics, times(1)).moveRight();
    }
}