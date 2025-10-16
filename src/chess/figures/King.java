package chess.figures;
import chess.InvalidMoveException;

public class King extends Queen {
    public King() {}
    public King(String name, String color, int column, int row) {
        super(name, color, column, row);
    }
    @Override
    public boolean moveTo(int x, int y) throws InvalidMoveException{
        if((Math.abs(x - this.getColumn()) <= 1) && (Math.abs(y - this.getRow()) <= 1)){
            return true;
        } else {
            return throw new InvalidMoveException("Invalid move for King");
        }
    }
    
}
