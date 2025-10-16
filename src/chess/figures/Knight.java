package chess.figures;
import chess.InvalidMoveException;

public class Knight extends Figure{
    public Knight(){}
    public Knight(String name, String color, int column, int row){
        super(name, color, column, row);
    }

    @Override
    public String toString() {
        return piece_name + " " + color + " " + column + "" + row;
    }
    @Override
    public boolean moveTo(int newCol, int newRow) throws InvalidMoveException {
        int diffX = Math.abs(newRow-this.getRow());
        int diffY = Math.abs(newCol-this.getColumn());
        if((diffX==2&&diffY==1)||(diffX==1&&diffY==2)){
            return true;
        } else {
            return throw new InvalidMoveException("Invalid move for Knight");
        }
    }
}
