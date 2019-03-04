package com.pencelab.tetrismaster.pieces;

import com.pencelab.tetrismaster.common.Globals;

import java.awt.Color;

/**---------        ---------           ---------       ---------
 *   POS 0            POS 1               POS 2           POS 3
 * ---------        ---------           ---------       ---------
 * 0: x, y          0: x, y             0: x, y         0: x, y
 * 1: x+1, y        1: x, y+1           1: x-1, y       1: x, y-1
 * 2: x+1, y-1        2: x+1, y+1         2: x-1, y+1     2: x-1, y-1
 * 3: x+1, y-2      3: x+2, y+1         3: x-1, y+2     3: x-2, y-1
 *
 *     |---|                            |---|---|
 *     | 3 |                            | 1 | 0 |
 *     |---|        |---|               |---|---|       |---|---|---|
 *     | 2 |        | 0 |               | 2 |           | 3 | 2 | 1 |
 * |---|---|        |---|---|---|       |---|           |---|---|---|
 * | 0 | 1 |        | 1 | 2 | 3 |       | 3 |                   | 0 |
 * |---|---|        |---|---|---|       |---|                   |---|
 */

public final class LR extends Piece<LR> {

    private LR(final ISquareUnit[] squareUnits, final int initX, final int initY, final Color[] colors) {
        super(squareUnits, (byte) 0);
        this.squareUnits[0] = new SquareUnit(initX, initY, colors[0]);
        this.squareUnits[1] = new SquareUnit(initX + 1, initY, colors[1]);
        this.squareUnits[2] = new SquareUnit(initX + 1, initY - 1, colors[2]);
        this.squareUnits[3] = new SquareUnit(initX + 1, initY - 2, colors[3]);
    }

    private LR(final ISquareUnit[] squareUnits, final byte position) {
        super(squareUnits, position);
    }

    @Override
    protected LR self(final ISquareUnit[] squareUnits, final byte position) {
        return new LR(squareUnits, position);
    }

    @Override
    protected ISquareUnit[] getRotatedSquareUnitsToPositionZero() {
        ISquareUnit[] squareUnits = {
                new SquareUnit(this.squareUnits[0].getX() - 2, this.squareUnits[0].getY(), this.squareUnits[0].getColor()),
                new SquareUnit(this.squareUnits[1].getX() - 1, this.squareUnits[1].getY() + 1, this.squareUnits[1].getColor()),
                new SquareUnit(this.squareUnits[2].getX(), this.squareUnits[2].getY(), this.squareUnits[2].getColor()),
                new SquareUnit(this.squareUnits[3].getX() + 1, this.squareUnits[3].getY() - 1, this.squareUnits[3].getColor())
        };
        return squareUnits;
    }

    @Override
    protected ISquareUnit[] getRotatedSquareUnitsToPositionOne() {
        ISquareUnit[] squareUnits = {
                new SquareUnit(this.squareUnits[0].getX(), this.squareUnits[0].getY() - 1, this.squareUnits[0].getColor()),
                new SquareUnit(this.squareUnits[1].getX() - 1, this.squareUnits[1].getY(), this.squareUnits[1].getColor()),
                new SquareUnit(this.squareUnits[2].getX(), this.squareUnits[2].getY() + 1, this.squareUnits[2].getColor()),
                new SquareUnit(this.squareUnits[3].getX() + 1, this.squareUnits[3].getY() + 2, this.squareUnits[3].getColor())
        };
        return squareUnits;
    }

    @Override
    protected ISquareUnit[] getRotatedSquareUnitsToPositionTwo() {
        ISquareUnit[] squareUnits = {
                new SquareUnit(this.squareUnits[0].getX() + 1, this.squareUnits[0].getY() - 1, this.squareUnits[0].getColor()),
                new SquareUnit(this.squareUnits[1].getX(), this.squareUnits[1].getY() - 2, this.squareUnits[1].getColor()),
                new SquareUnit(this.squareUnits[2].getX() - 1, this.squareUnits[2].getY() - 1, this.squareUnits[2].getColor()),
                new SquareUnit(this.squareUnits[3].getX() - 2, this.squareUnits[3].getY(), this.squareUnits[3].getColor())
        };
        return squareUnits;
    }

    @Override
    protected ISquareUnit[] getRotatedSquareUnitsToPositionThree() {
        ISquareUnit[] squareUnits = {
                new SquareUnit(this.squareUnits[0].getX() + 1, this.squareUnits[0].getY() + 2, this.squareUnits[0].getColor()),
                new SquareUnit(this.squareUnits[1].getX() + 2, this.squareUnits[1].getY() + 1, this.squareUnits[1].getColor()),
                new SquareUnit(this.squareUnits[2].getX() + 1, this.squareUnits[2].getY(), this.squareUnits[2].getColor()),
                new SquareUnit(this.squareUnits[3].getX(), this.squareUnits[3].getY() - 1, this.squareUnits[3].getColor())
        };
        return squareUnits;
    }

    @Override
    protected ISquareUnit[] getLinkedSquareUnitsInPositionZero() {
        int units = this.squareUnits.length;
        LinkedSquareUnit[] linkedSquareUnits = new LinkedSquareUnit[units];
        for(int i = 0; i < units; i++){
            linkedSquareUnits[i] = new LinkedSquareUnit(this.squareUnits[i].getX(), this.squareUnits[i].getY(), this.squareUnits[i].getColor());
        }
        linkedSquareUnits[0].setRightSquareUnit(linkedSquareUnits[1]);
        linkedSquareUnits[1].setLeftSquareUnit(linkedSquareUnits[0]);
        linkedSquareUnits[1].setTopSquareUnit(linkedSquareUnits[2]);
        linkedSquareUnits[2].setTopSquareUnit(linkedSquareUnits[3]);
        linkedSquareUnits[2].setBottomSquareUnit(linkedSquareUnits[1]);
        linkedSquareUnits[3].setBottomSquareUnit(linkedSquareUnits[2]);
        return linkedSquareUnits;
    }

    @Override
    protected ISquareUnit[] getLinkedSquareUnitsInPositionOne() {
        int units = this.squareUnits.length;
        LinkedSquareUnit[] linkedSquareUnits = new LinkedSquareUnit[units];
        for(int i = 0; i < units; i++){
            linkedSquareUnits[i] = new LinkedSquareUnit(this.squareUnits[i].getX(), this.squareUnits[i].getY(), this.squareUnits[i].getColor());
        }
        linkedSquareUnits[0].setBottomSquareUnit(linkedSquareUnits[1]);
        linkedSquareUnits[1].setTopSquareUnit(linkedSquareUnits[0]);
        linkedSquareUnits[1].setRightSquareUnit(linkedSquareUnits[2]);
        linkedSquareUnits[2].setLeftSquareUnit(linkedSquareUnits[1]);
        linkedSquareUnits[2].setRightSquareUnit(linkedSquareUnits[3]);
        linkedSquareUnits[3].setLeftSquareUnit(linkedSquareUnits[2]);
        return linkedSquareUnits;
    }

    @Override
    protected ISquareUnit[] getLinkedSquareUnitsInPositionTwo() {
        int units = this.squareUnits.length;
        LinkedSquareUnit[] linkedSquareUnits = new LinkedSquareUnit[units];
        for(int i = 0; i < units; i++){
            linkedSquareUnits[i] = new LinkedSquareUnit(this.squareUnits[i].getX(), this.squareUnits[i].getY(), this.squareUnits[i].getColor());
        }
        linkedSquareUnits[0].setLeftSquareUnit(linkedSquareUnits[1]);
        linkedSquareUnits[1].setRightSquareUnit(linkedSquareUnits[0]);
        linkedSquareUnits[1].setBottomSquareUnit(linkedSquareUnits[2]);
        linkedSquareUnits[2].setTopSquareUnit(linkedSquareUnits[1]);
        linkedSquareUnits[2].setBottomSquareUnit(linkedSquareUnits[3]);
        linkedSquareUnits[3].setTopSquareUnit(linkedSquareUnits[2]);
        return linkedSquareUnits;
    }

    @Override
    protected ISquareUnit[] getLinkedSquareUnitsInPositionThree() {
        int units = this.squareUnits.length;
        LinkedSquareUnit[] linkedSquareUnits = new LinkedSquareUnit[units];
        for(int i = 0; i < units; i++){
            linkedSquareUnits[i] = new LinkedSquareUnit(this.squareUnits[i].getX(), this.squareUnits[i].getY(), this.squareUnits[i].getColor());
        }
        linkedSquareUnits[0].setTopSquareUnit(linkedSquareUnits[1]);
        linkedSquareUnits[1].setLeftSquareUnit(linkedSquareUnits[2]);
        linkedSquareUnits[1].setBottomSquareUnit(linkedSquareUnits[0]);
        linkedSquareUnits[2].setLeftSquareUnit(linkedSquareUnits[3]);
        linkedSquareUnits[2].setRightSquareUnit(linkedSquareUnits[1]);
        linkedSquareUnits[3].setRightSquareUnit(linkedSquareUnits[2]);
        return linkedSquareUnits;
    }

    public static class Builder extends Piece.Builder<LR, Builder> {

        @Override
        protected void setDefaults() {
            this.x = 4;
            this.y = 3;

            if(this.colors == null)
                this.colors = new Color[SQUARE_UNITS];

            for(int i = 0; i < this.colors.length; i++)
                this.colors[i] = Globals.PieceColor.TEAL.getColor();

            this.position = 0;
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public LR build(){
            if(this.colors.length != SQUARE_UNITS)
                throw new IllegalArgumentException("Colors array length doesn't match number of square units. Colors array length is " + this.colors.length + " when it should be " + SQUARE_UNITS + ".");

            LR piece = new LR(new SquareUnit[SQUARE_UNITS], this.x, this.y, this.colors);
            for(int i = 0; i < this.position; i++){
                piece = piece.rotate();
            }
            return new LR(this.recalculateSquareUnitsCoordinates(piece), (byte) this.position);
        }
    }
}
