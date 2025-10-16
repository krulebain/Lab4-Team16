package chess.figures;
import chess.InvalidMoveException;

public class Pawn extends Figure {
    public Pawn(){}
    public Pawn(String name, String color, int column, int row){
        super(name, color, column, row);
    }

    @Override
    public String toString() {
        return piece_name + " " + color + " " + column + "" + row;
    }

    @Override
    public boolean moveTo(int newCol, int newRow) throws InvalidMoveException {
        if (getColor().equalsIgnoreCase("white")) {
            if (newCol == this.getColumn() && newRow - this.getRow() == 1) {
                return true;
            }
            } else {
            if (newCol == this.getColumn() && newRow - this.getRow() == -1) {
                return true;
            }
        }
        return throw new InvalidMoveException("Invalid move for Pawn");
    }

}