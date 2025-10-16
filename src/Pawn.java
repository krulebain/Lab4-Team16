public class Pawn extends Figure {
    public Pawn(){}
    public Pawn(String name, String color, int column, int row){
        super(name, color, column, row);
    }

    @Override
    public String toString() {
        return name + " " + color + " " + column + "" + row;
    }

    @Override
    public boolean moveTo(int newCol, int newRow) {
        if (getColor().equalsIgnoreCase("white")) {
            if (newCol == getColumn() && newRow - getRow() == 1) {
            return true;
            }
            } else {
            if (newCol == getColumn() && newRow - getRow() == -1) {
            return true;
            }
        }
        return false;
    }

}