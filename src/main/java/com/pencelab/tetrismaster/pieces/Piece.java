package com.pencelab.tetrismaster.pieces;

import java.awt.Color;

public abstract class Piece<T extends Piece> implements IPiece {

    private static final int POSITIONS = 4;

    protected final ISquareUnit[] squareUnits;
    protected final byte position;
    protected abstract T self(final ISquareUnit[] squareUnits, final byte position);
    protected abstract ISquareUnit[] getRotatedSquareUnitsToPositionZero();
    protected abstract ISquareUnit[] getRotatedSquareUnitsToPositionOne();
    protected abstract ISquareUnit[] getRotatedSquareUnitsToPositionTwo();
    protected abstract ISquareUnit[] getRotatedSquareUnitsToPositionThree();
    protected abstract ISquareUnit[] getLinkedSquareUnitsInPositionZero();
    protected abstract ISquareUnit[] getLinkedSquareUnitsInPositionOne();
    protected abstract ISquareUnit[] getLinkedSquareUnitsInPositionTwo();
    protected abstract ISquareUnit[] getLinkedSquareUnitsInPositionThree();

    protected Piece(final ISquareUnit[] squareUnits, final byte position){
        this.squareUnits = squareUnits;
        this.position = this.calculatePosition(position);
    }

    private byte calculatePosition(final byte position){
        return (byte) (position % POSITIONS);
    }

    @Override
    public final ISquareUnit[] getSquareUnits() {
        return this.squareUnits;
    }

    @Override
    public ISquareUnit[] getLinkedSquareUnits() {
        ISquareUnit[] squareUnits = null;

        switch(this.position){
            case 0:
                squareUnits = this.getLinkedSquareUnitsInPositionZero();
                break;
            case 1:
                squareUnits = this.getLinkedSquareUnitsInPositionOne();
                break;
            case 2:
                squareUnits = this.getLinkedSquareUnitsInPositionTwo();
                break;
            case 3:
                squareUnits = this.getLinkedSquareUnitsInPositionThree();
                break;
        }

        return squareUnits;
    }

    @Override
    public final T rotate() {
        ISquareUnit[] squareUnits = null;
        switch(this.position){
            case 0:
                squareUnits = this.getRotatedSquareUnitsToPositionOne();
                break;
            case 1:
                squareUnits = this.getRotatedSquareUnitsToPositionTwo();
                break;
            case 2:
                squareUnits = this.getRotatedSquareUnitsToPositionThree();
                break;
            case 3:
                squareUnits = this.getRotatedSquareUnitsToPositionZero();
                break;
        }
        return this.self(squareUnits, (byte)(this.position + 1));
    }

    @Override
    public final T moveLeft() {
        int units = this.squareUnits.length;
        ISquareUnit[] squareUnits = new T.SquareUnit[this.squareUnits.length];
        for (int i = 0; i < units; i++) {
            squareUnits[i] = new SquareUnit(this.squareUnits[i].getX() - 1, this.squareUnits[i].getY(), this.squareUnits[i].getColor());
        }
        return this.self(squareUnits, this.position);
    }

    @Override
    public final T moveRight() {
        int units = this.squareUnits.length;
        ISquareUnit[] squareUnits = new T.SquareUnit[this.squareUnits.length];
        for (int i = 0; i < units; i++) {
            squareUnits[i] = new SquareUnit(this.squareUnits[i].getX() + 1, this.squareUnits[i].getY(), this.squareUnits[i].getColor());
        }
        return this.self(squareUnits, this.position);
    }

    @Override
    public final T moveDown() {
        int units = this.squareUnits.length;
        ISquareUnit[] squareUnits = new T.SquareUnit[this.squareUnits.length];
        for (int i = 0; i < units; i++) {
            squareUnits[i] = new SquareUnit(this.squareUnits[i].getX(), this.squareUnits[i].getY() + 1, this.squareUnits[i].getColor());
        }
        return this.self(squareUnits, this.position);
    }

    public static class SquareUnit implements IPiece.ISquareUnit{
        private final int x, y;
        private final Color color;

        public SquareUnit(final int x, final int y, final Color color){
            this.x = x;
            this.y = y;
            this.color = color;
        }

        @Override
        public int getX() {
            return this.x;
        }

        @Override
        public int getY() {
            return this.y;
        }

        @Override
        public Color getColor() {
            return this.color;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ISquareUnit that = (ISquareUnit) o;
            return this.x == that.getX() &&
                    this.y == that.getY() &&
                    this.getColor() == that.getColor();
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + x;
            result = prime * result + y;
            result = prime * result + color.hashCode();
            return result;
        }
    }

    public static final class LinkedSquareUnit extends SquareUnit{

        private LinkedSquareUnit leftSquareUnit;
        private LinkedSquareUnit topSquareUnit;
        private LinkedSquareUnit rightSquareUnit;
        private LinkedSquareUnit bottomSquareUnit;

        public LinkedSquareUnit(int x, int y, Color color) {
            super(x, y, color);
        }

        public LinkedSquareUnit getLeftSquareUnit() {
            return this.leftSquareUnit;
        }

        public void setLeftSquareUnit(LinkedSquareUnit leftSquareUnit) {
            this.leftSquareUnit = leftSquareUnit;
        }

        public LinkedSquareUnit getTopSquareUnit() {
            return this.topSquareUnit;
        }

        public void setTopSquareUnit(LinkedSquareUnit topSquareUnit) {
            this.topSquareUnit = topSquareUnit;
        }

        public LinkedSquareUnit getRightSquareUnit() {
            return this.rightSquareUnit;
        }

        public void setRightSquareUnit(LinkedSquareUnit rightSquareUnit) {
            this.rightSquareUnit = rightSquareUnit;
        }

        public LinkedSquareUnit getBottomSquareUnit() {
            return this.bottomSquareUnit;
        }

        public void setBottomSquareUnit(LinkedSquareUnit bottomSquareUnit) {
            this.bottomSquareUnit = bottomSquareUnit;
        }

        public void unlinkLeftSquareUnit(){
            this.setLeftSquareUnit(null);
        }

        public void unlinkTopSquareUnit(){
            this.setTopSquareUnit(null);
        }

        public void unlinkRightSquareUnit(){
            this.setRightSquareUnit(null);
        }

        public void unlinkBottomSquareUnit(){
            this.setBottomSquareUnit(null);
        }

        public void unlinkAllSquareUnits(){
            this.unlinkLeftSquareUnit();
            this.unlinkTopSquareUnit();
            this.unlinkRightSquareUnit();
            this.unlinkBottomSquareUnit();
        }
    }

    public abstract static class Builder<T extends Piece, B extends Builder<T, B>>{

        protected static final int SQUARE_UNITS = 4;

        protected int x;
        protected int y;
        protected Color[] colors;
        protected int position;

        protected abstract void setDefaults();
        protected abstract B self();
        public abstract T build();

        protected Builder(){
            this.setDefaults();
        }

        public B withCoordinateX(final int x){
            this.x = x;
            return this.self();
        }

        public B withCoordinateY(final int y){
            this.y = y;
            return this.self();
        }

        public B withCoordinatesXY(final int x, final int y){
            this.x = x;
            this.y = y;
            return this.self();
        }

        public B withRotations(final int rotations){
            this.position = rotations;
            return this.self();
        }

        public B inColor(final Color color){
            if(this.colors == null)
                throw new IllegalArgumentException("Piece square colors cannot be null.");

            int length = this.colors.length;
            for(int i = 0; i < length; i++) {
                this.colors[i] = color;
            }
            return this.self();
        }

        public B inColors(final Color[] color){
            if(this.colors == null)
                throw new IllegalArgumentException("Piece square colors cannot be null.");

            this.colors = color;
            return this.self();
        }

        protected ISquareUnit[] recalculateSquareUnitsCoordinates(final T piece){
            ISquareUnit[] squareUnits = piece.getSquareUnits();
            int difX = squareUnits[0].getX() - this.x;
            int difY = squareUnits[0].getY() - this.y;

            int units = squareUnits.length;

            ISquareUnit[] recalculatedSquareUnits = new ISquareUnit[units];
            for(int i = 0; i < units; i++){
                recalculatedSquareUnits[i] = new SquareUnit(squareUnits[i].getX() - difX, squareUnits[i].getY() - difY, squareUnits[i].getColor());
            }
            return recalculatedSquareUnits;
        }
    }
}
