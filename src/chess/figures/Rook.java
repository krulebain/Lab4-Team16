package chess.figures;

public class Rook extends Figure {
    public Rook(){}
    public Rook(String name, String color, int column, int row){
        super(name, color, column, row);
    }

    @Override
    public String toString() {
        return piece_name + " " + color + " " + column + "" + row;
    }

    @Override
    public boolean moveTo(int newCol, int newRow) {
        int diffX = Math.abs(newRow-getRow());
        int diffY = Math.abs(newCol-getColumn());
        return (diffX==2&&diffY==1)||(diffX==1&&diffY==2);
    }

}
