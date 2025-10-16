package chess.figures;

import chess.interfaces.IntBishop;
import chess.InvalidMoveException;

public class Bishop implements IntBishop {
    protected int row;
    protected int column;
    protected String color;
    protected String piece_name;

    public Bishop() {}
    public Bishop(String name, String color, int column, int row) {
        this.piece_name = name;
        this.color = color;
        this.column = column;
        this.row = row;
    }
    @Override
    public boolean moveToBishop(int x, int y) throws InvalidMoveException {
        if(Math.abs(x - this.column) == Math.abs(y - this.row)){
            return true;
        } else {
            return throw new InvalidMoveException("Invalid move for Bishop");
        }
    }
}
