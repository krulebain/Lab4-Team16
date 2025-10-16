public class Knight extends Figure{
    public Knight(){}
    public Knight(String name, String color, int column, int row){
        super(name, color, column, row);
    }

    @Override
    public String toString() {
        return name + " " + color + " " + column + "" + row;
    }
}
