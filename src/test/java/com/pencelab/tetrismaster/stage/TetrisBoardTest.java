package com.pencelab.tetrismaster.stage;

import com.pencelab.tetrismaster.pieces.IPiece;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.powermock.reflect.Whitebox;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class TetrisBoardTest {

    private IPiece.ISquareUnit[][] squareUnits;
    private IBoard board;

    @Mock
    private IBoard.Listener listener;

    @Before
    public void setUp() {
        this.squareUnits = new IPiece.ISquareUnit[TetrisBoard.ROWS][TetrisBoard.COLUMNS];
        this.board = new TetrisBoard(this.squareUnits);
    }

    @Test
    public void shouldAddListener() {
        List<IBoard.Listener> listeners = Whitebox.getInternalState(this.board, "listeners");
        assertFalse(listeners.contains(this.listener));
        this.board.addListener(this.listener);
        assertTrue(listeners.contains(this.listener));
    }

    @Test
    public void shouldRemoveListener() {
        List<IBoard.Listener> listeners = Whitebox.getInternalState(this.board, "listeners");
        assertFalse(listeners.contains(this.listener));
        this.board.addListener(this.listener);
        assertTrue(listeners.contains(this.listener));
        this.board.removeListener(this.listener);
        assertFalse(listeners.contains(this.listener));
    }

    @Test
    public void shouldRemoveAllListeners() {
        IBoard.Listener listener1 = Mockito.mock(IBoard.Listener.class);
        IBoard.Listener listener2 = Mockito.mock(IBoard.Listener.class);
        IBoard.Listener listener3 = Mockito.mock(IBoard.Listener.class);
        List<IBoard.Listener> listeners = Whitebox.getInternalState(this.board, "listeners");
        assertTrue(listeners.isEmpty());
        this.board.addListener(listener1);
        this.board.addListener(listener2);
        this.board.addListener(listener3);
        assertEquals(3, listeners.size());
        this.board.clearAllListeners();
        assertTrue(listeners.isEmpty());
    }
}