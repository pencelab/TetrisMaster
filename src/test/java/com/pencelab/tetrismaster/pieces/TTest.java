package com.pencelab.tetrismaster.pieces;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TTest {

    private Piece piece;

    @Before
    public void setUp() {
        this.piece = new T.Builder().build();
    }

    @Test
    public void shouldRotateFromPositionZeroToPositionOne() {
        IPiece.ISquareUnit[] squareUnits = this.piece.getSquareUnits();
        IPiece.ISquareUnit[] newSquareUnits = this.piece.rotate().getSquareUnits();

        assertEquals(squareUnits[0].getX() + 2, newSquareUnits[0].getX());
        assertEquals(squareUnits[0].getY() + 1, newSquareUnits[0].getY());

        assertEquals(squareUnits[1].getX() + 1, newSquareUnits[1].getX());
        assertEquals(squareUnits[1].getY(), newSquareUnits[1].getY());

        assertEquals(squareUnits[2].getX(), newSquareUnits[2].getX());
        assertEquals(squareUnits[2].getY() - 1, newSquareUnits[2].getY());

        assertEquals(squareUnits[3].getX(), newSquareUnits[3].getX());
        assertEquals(squareUnits[3].getY() + 1, newSquareUnits[3].getY());
    }

    @Test
    public void shouldRotateFromPositionOneToPositionTwo() {
        Piece rotatedPiece = this.piece.rotate();
        IPiece.ISquareUnit[] squareUnits = rotatedPiece.getSquareUnits();
        IPiece.ISquareUnit[] newSquareUnits = rotatedPiece.rotate().getSquareUnits();

        assertEquals(squareUnits[0].getX() - 1, newSquareUnits[0].getX());
        assertEquals(squareUnits[0].getY() + 1, newSquareUnits[0].getY());

        assertEquals(squareUnits[1].getX(), newSquareUnits[1].getX());
        assertEquals(squareUnits[1].getY(), newSquareUnits[1].getY());

        assertEquals(squareUnits[2].getX() + 1, newSquareUnits[2].getX());
        assertEquals(squareUnits[2].getY() - 1, newSquareUnits[2].getY());

        assertEquals(squareUnits[3].getX() - 1, newSquareUnits[3].getX());
        assertEquals(squareUnits[3].getY() - 1, newSquareUnits[3].getY());
    }

    @Test
    public void shouldRotateFromPositionTwoToPositionThree() {
        Piece rotatedPiece = this.piece.rotate().rotate();
        IPiece.ISquareUnit[] squareUnits = rotatedPiece.getSquareUnits();
        IPiece.ISquareUnit[] newSquareUnits = rotatedPiece.rotate().getSquareUnits();

        assertEquals(squareUnits[0].getX() - 1, newSquareUnits[0].getX());
        assertEquals(squareUnits[0].getY(), newSquareUnits[0].getY());

        assertEquals(squareUnits[1].getX(), newSquareUnits[1].getX());
        assertEquals(squareUnits[1].getY() + 1, newSquareUnits[1].getY());

        assertEquals(squareUnits[2].getX() + 1, newSquareUnits[2].getX());
        assertEquals(squareUnits[2].getY() + 2, newSquareUnits[2].getY());

        assertEquals(squareUnits[3].getX() + 1, newSquareUnits[3].getX());
        assertEquals(squareUnits[3].getY(), newSquareUnits[3].getY());
    }

    @Test
    public void shouldRotateFromPositionThreeToPositionZero() {
        Piece rotatedPiece = this.piece.rotate().rotate().rotate();
        IPiece.ISquareUnit[] squareUnits = rotatedPiece.getSquareUnits();
        IPiece.ISquareUnit[] newSquareUnits = rotatedPiece.rotate().getSquareUnits();

        assertEquals(squareUnits[0].getX(), newSquareUnits[0].getX());
        assertEquals(squareUnits[0].getY() - 2, newSquareUnits[0].getY());

        assertEquals(squareUnits[1].getX() - 1, newSquareUnits[1].getX());
        assertEquals(squareUnits[1].getY() - 1, newSquareUnits[1].getY());

        assertEquals(squareUnits[2].getX() - 2, newSquareUnits[2].getX());
        assertEquals(squareUnits[2].getY(), newSquareUnits[2].getY());

        assertEquals(squareUnits[3].getX(), newSquareUnits[3].getX());
        assertEquals(squareUnits[3].getY(), newSquareUnits[3].getY());
    }

    @Test
    public void shouldRotateFromPositionZeroToPositionZero(){
        IPiece.ISquareUnit[] squareUnits = this.piece.getSquareUnits();
        IPiece.ISquareUnit[] newSquareUnits = this.piece.rotate().rotate().rotate().rotate().getSquareUnits();

        this.shouldHaveEqualSquareUnits(squareUnits, newSquareUnits);
    }

    @Test
    public void shouldRotateFromPositionOneToPositionOne(){
        Piece rotatedPiece = this.piece.rotate();
        IPiece.ISquareUnit[] squareUnits = rotatedPiece.getSquareUnits();
        IPiece.ISquareUnit[] newSquareUnits = rotatedPiece.rotate().rotate().rotate().rotate().getSquareUnits();

        this.shouldHaveEqualSquareUnits(squareUnits, newSquareUnits);
    }

    @Test
    public void shouldRotateFromPositionTwoToPositionTwo(){
        Piece rotatedPiece = this.piece.rotate().rotate();
        IPiece.ISquareUnit[] squareUnits = rotatedPiece.getSquareUnits();
        IPiece.ISquareUnit[] newSquareUnits = rotatedPiece.rotate().rotate().rotate().rotate().getSquareUnits();

        this.shouldHaveEqualSquareUnits(squareUnits, newSquareUnits);
    }

    @Test
    public void shouldRotateFromPositionThreeToPositionThree(){
        Piece rotatedPiece = this.piece.rotate().rotate().rotate();
        IPiece.ISquareUnit[] squareUnits = rotatedPiece.getSquareUnits();
        IPiece.ISquareUnit[] newSquareUnits = rotatedPiece.rotate().rotate().rotate().rotate().getSquareUnits();

        this.shouldHaveEqualSquareUnits(squareUnits, newSquareUnits);
    }

    private void shouldHaveEqualSquareUnits(IPiece.ISquareUnit[] squareUnits, IPiece.ISquareUnit[] newSquareUnits){
        assertEquals(squareUnits.length, newSquareUnits.length);
        for (int i = 0; i < squareUnits.length; i++) {
            assertEquals(squareUnits[i].getX(), newSquareUnits[i].getX());
            assertEquals(squareUnits[i].getY(), newSquareUnits[i].getY());
        }
    }

    @Test
    public void shouldMoveToLeft() {
        IPiece.ISquareUnit[] squareUnits = this.piece.getSquareUnits();
        int units = squareUnits.length;

        IPiece.ISquareUnit[] newSquareUnits = this.piece.moveLeft().getSquareUnits();

        for (int i = 0; i < units; i++) {
            assertEquals(squareUnits[i].getX() - 1, newSquareUnits[i].getX());
            assertEquals(squareUnits[i].getY(), newSquareUnits[i].getY());
        }
    }

    @Test
    public void shouldMoveToRight() {
        IPiece.ISquareUnit[] squareUnits = this.piece.getSquareUnits();
        int units = squareUnits.length;

        IPiece.ISquareUnit[] newSquareUnits = this.piece.moveRight().getSquareUnits();

        for (int i = 0; i < units; i++) {
            assertEquals(squareUnits[i].getX() + 1, newSquareUnits[i].getX());
            assertEquals(squareUnits[i].getY(), newSquareUnits[i].getY());
        }
    }

    @Test
    public void shouldMoveDown() {
        IPiece.ISquareUnit[] squareUnits = this.piece.getSquareUnits();
        int units = squareUnits.length;

        IPiece.ISquareUnit[] newSquareUnits = this.piece.moveDown().getSquareUnits();

        for (int i = 0; i < units; i++) {
            assertEquals(squareUnits[i].getX(), newSquareUnits[i].getX());
            assertEquals(squareUnits[i].getY() + 1, newSquareUnits[i].getY());
        }
    }

    @Test
    public void shouldGetNotNullLinkedSquareUnitsInPositionZero(){
        IPiece.ISquareUnit[] squareUnits = this.piece.getLinkedSquareUnits();
        assertEquals(squareUnits[1], ((Piece.LinkedSquareUnit)squareUnits[0]).getBottomSquareUnit());
        assertEquals(squareUnits[0], ((Piece.LinkedSquareUnit)squareUnits[1]).getTopSquareUnit());
        assertEquals(squareUnits[3], ((Piece.LinkedSquareUnit)squareUnits[1]).getRightSquareUnit());
        assertEquals(squareUnits[2], ((Piece.LinkedSquareUnit)squareUnits[1]).getBottomSquareUnit());
        assertEquals(squareUnits[1], ((Piece.LinkedSquareUnit)squareUnits[2]).getTopSquareUnit());
        assertEquals(squareUnits[1], ((Piece.LinkedSquareUnit)squareUnits[3]).getLeftSquareUnit());
    }

    @Test
    public void shouldGetNullLinkedSquareUnitsInPositionZero(){
        IPiece.ISquareUnit[] squareUnits = this.piece.getLinkedSquareUnits();
        assertNull(((Piece.LinkedSquareUnit)squareUnits[0]).getLeftSquareUnit());
        assertNull(((Piece.LinkedSquareUnit)squareUnits[0]).getTopSquareUnit());
        assertNull(((Piece.LinkedSquareUnit)squareUnits[0]).getRightSquareUnit());
        assertNull(((Piece.LinkedSquareUnit)squareUnits[1]).getLeftSquareUnit());
        assertNull(((Piece.LinkedSquareUnit)squareUnits[2]).getLeftSquareUnit());
        assertNull(((Piece.LinkedSquareUnit)squareUnits[2]).getRightSquareUnit());
        assertNull(((Piece.LinkedSquareUnit)squareUnits[2]).getBottomSquareUnit());
        assertNull(((Piece.LinkedSquareUnit)squareUnits[3]).getTopSquareUnit());
        assertNull(((Piece.LinkedSquareUnit)squareUnits[3]).getRightSquareUnit());
        assertNull(((Piece.LinkedSquareUnit)squareUnits[3]).getBottomSquareUnit());
    }

    @Test
    public void shouldGetNotNullLinkedSquareUnitsInPositionOne(){
        IPiece.ISquareUnit[] squareUnits = this.piece.rotate().getLinkedSquareUnits();
        assertEquals(squareUnits[1], ((Piece.LinkedSquareUnit)squareUnits[0]).getLeftSquareUnit());
        assertEquals(squareUnits[2], ((Piece.LinkedSquareUnit)squareUnits[1]).getLeftSquareUnit());
        assertEquals(squareUnits[0], ((Piece.LinkedSquareUnit)squareUnits[1]).getRightSquareUnit());
        assertEquals(squareUnits[3], ((Piece.LinkedSquareUnit)squareUnits[1]).getBottomSquareUnit());
        assertEquals(squareUnits[1], ((Piece.LinkedSquareUnit)squareUnits[2]).getRightSquareUnit());
        assertEquals(squareUnits[1], ((Piece.LinkedSquareUnit)squareUnits[3]).getTopSquareUnit());
    }

    @Test
    public void shouldGetNullLinkedSquareUnitsInPositionOne(){
        IPiece.ISquareUnit[] squareUnits = this.piece.rotate().getLinkedSquareUnits();
        assertNull(((Piece.LinkedSquareUnit)squareUnits[0]).getTopSquareUnit());
        assertNull(((Piece.LinkedSquareUnit)squareUnits[0]).getRightSquareUnit());
        assertNull(((Piece.LinkedSquareUnit)squareUnits[0]).getBottomSquareUnit());
        assertNull(((Piece.LinkedSquareUnit)squareUnits[1]).getTopSquareUnit());
        assertNull(((Piece.LinkedSquareUnit)squareUnits[2]).getLeftSquareUnit());
        assertNull(((Piece.LinkedSquareUnit)squareUnits[2]).getTopSquareUnit());
        assertNull(((Piece.LinkedSquareUnit)squareUnits[2]).getBottomSquareUnit());
        assertNull(((Piece.LinkedSquareUnit)squareUnits[3]).getLeftSquareUnit());
        assertNull(((Piece.LinkedSquareUnit)squareUnits[3]).getRightSquareUnit());
        assertNull(((Piece.LinkedSquareUnit)squareUnits[3]).getBottomSquareUnit());
    }

    @Test
    public void shouldGetNotNullLinkedSquareUnitsInPositionTwo(){
        IPiece.ISquareUnit[] squareUnits = this.piece.rotate().rotate().getLinkedSquareUnits();
        assertEquals(squareUnits[1], ((Piece.LinkedSquareUnit)squareUnits[0]).getTopSquareUnit());
        assertEquals(squareUnits[3], ((Piece.LinkedSquareUnit)squareUnits[1]).getLeftSquareUnit());
        assertEquals(squareUnits[2], ((Piece.LinkedSquareUnit)squareUnits[1]).getTopSquareUnit());
        assertEquals(squareUnits[0], ((Piece.LinkedSquareUnit)squareUnits[1]).getBottomSquareUnit());
        assertEquals(squareUnits[1], ((Piece.LinkedSquareUnit)squareUnits[2]).getBottomSquareUnit());
        assertEquals(squareUnits[1], ((Piece.LinkedSquareUnit)squareUnits[3]).getRightSquareUnit());
    }

    @Test
    public void shouldGetNullLinkedSquareUnitsInPositionTwo(){
        IPiece.ISquareUnit[] squareUnits = this.piece.rotate().rotate().getLinkedSquareUnits();
        assertNull(((Piece.LinkedSquareUnit)squareUnits[0]).getLeftSquareUnit());
        assertNull(((Piece.LinkedSquareUnit)squareUnits[0]).getRightSquareUnit());
        assertNull(((Piece.LinkedSquareUnit)squareUnits[0]).getBottomSquareUnit());
        assertNull(((Piece.LinkedSquareUnit)squareUnits[1]).getRightSquareUnit());
        assertNull(((Piece.LinkedSquareUnit)squareUnits[2]).getLeftSquareUnit());
        assertNull(((Piece.LinkedSquareUnit)squareUnits[2]).getTopSquareUnit());
        assertNull(((Piece.LinkedSquareUnit)squareUnits[2]).getRightSquareUnit());
        assertNull(((Piece.LinkedSquareUnit)squareUnits[3]).getLeftSquareUnit());
        assertNull(((Piece.LinkedSquareUnit)squareUnits[3]).getTopSquareUnit());
        assertNull(((Piece.LinkedSquareUnit)squareUnits[3]).getBottomSquareUnit());
    }

    @Test
    public void shouldGetNotNullLinkedSquareUnitsInPositionThree(){
        IPiece.ISquareUnit[] squareUnits = this.piece.rotate().rotate().rotate().getLinkedSquareUnits();
        assertEquals(squareUnits[1], ((Piece.LinkedSquareUnit)squareUnits[0]).getRightSquareUnit());
        assertEquals(squareUnits[0], ((Piece.LinkedSquareUnit)squareUnits[1]).getLeftSquareUnit());
        assertEquals(squareUnits[3], ((Piece.LinkedSquareUnit)squareUnits[1]).getTopSquareUnit());
        assertEquals(squareUnits[2], ((Piece.LinkedSquareUnit)squareUnits[1]).getRightSquareUnit());
        assertEquals(squareUnits[1], ((Piece.LinkedSquareUnit)squareUnits[2]).getLeftSquareUnit());
        assertEquals(squareUnits[1], ((Piece.LinkedSquareUnit)squareUnits[3]).getBottomSquareUnit());
    }

    @Test
    public void shouldGetNullLinkedSquareUnitsInPositionThree(){
        IPiece.ISquareUnit[] squareUnits = this.piece.rotate().rotate().rotate().getLinkedSquareUnits();
        assertNull(((Piece.LinkedSquareUnit)squareUnits[0]).getLeftSquareUnit());
        assertNull(((Piece.LinkedSquareUnit)squareUnits[0]).getTopSquareUnit());
        assertNull(((Piece.LinkedSquareUnit)squareUnits[0]).getBottomSquareUnit());
        assertNull(((Piece.LinkedSquareUnit)squareUnits[1]).getBottomSquareUnit());
        assertNull(((Piece.LinkedSquareUnit)squareUnits[2]).getTopSquareUnit());
        assertNull(((Piece.LinkedSquareUnit)squareUnits[2]).getRightSquareUnit());
        assertNull(((Piece.LinkedSquareUnit)squareUnits[2]).getBottomSquareUnit());
        assertNull(((Piece.LinkedSquareUnit)squareUnits[3]).getLeftSquareUnit());
        assertNull(((Piece.LinkedSquareUnit)squareUnits[3]).getTopSquareUnit());
        assertNull(((Piece.LinkedSquareUnit)squareUnits[3]).getRightSquareUnit());
    }

    @Test
    public void shouldGetNotNullLinkedSquareUnitsInPositionZeroAfterOneRotationCycle(){
        IPiece.ISquareUnit[] squareUnits = this.piece.rotate().rotate().rotate().rotate().getLinkedSquareUnits();
        assertEquals(squareUnits[1], ((Piece.LinkedSquareUnit)squareUnits[0]).getBottomSquareUnit());
        assertEquals(squareUnits[0], ((Piece.LinkedSquareUnit)squareUnits[1]).getTopSquareUnit());
        assertEquals(squareUnits[3], ((Piece.LinkedSquareUnit)squareUnits[1]).getRightSquareUnit());
        assertEquals(squareUnits[2], ((Piece.LinkedSquareUnit)squareUnits[1]).getBottomSquareUnit());
        assertEquals(squareUnits[1], ((Piece.LinkedSquareUnit)squareUnits[2]).getTopSquareUnit());
        assertEquals(squareUnits[1], ((Piece.LinkedSquareUnit)squareUnits[3]).getLeftSquareUnit());
    }

    @Test
    public void shouldGetNullLinkedSquareUnitsInPositionZeroAfterOneRotationCycle(){
        IPiece.ISquareUnit[] squareUnits = this.piece.rotate().rotate().rotate().rotate().getLinkedSquareUnits();
        assertNull(((Piece.LinkedSquareUnit)squareUnits[0]).getLeftSquareUnit());
        assertNull(((Piece.LinkedSquareUnit)squareUnits[0]).getTopSquareUnit());
        assertNull(((Piece.LinkedSquareUnit)squareUnits[0]).getRightSquareUnit());
        assertNull(((Piece.LinkedSquareUnit)squareUnits[1]).getLeftSquareUnit());
        assertNull(((Piece.LinkedSquareUnit)squareUnits[2]).getLeftSquareUnit());
        assertNull(((Piece.LinkedSquareUnit)squareUnits[2]).getRightSquareUnit());
        assertNull(((Piece.LinkedSquareUnit)squareUnits[2]).getBottomSquareUnit());
        assertNull(((Piece.LinkedSquareUnit)squareUnits[3]).getTopSquareUnit());
        assertNull(((Piece.LinkedSquareUnit)squareUnits[3]).getRightSquareUnit());
        assertNull(((Piece.LinkedSquareUnit)squareUnits[3]).getBottomSquareUnit());
    }

}