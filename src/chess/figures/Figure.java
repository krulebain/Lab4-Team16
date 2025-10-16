package chess.figures;

import chess.interfaces.IntFigure;

public abstract class Figure implements IntFigure {
    protected int row;
    protected int column;
    protected String color;
    protected String piece_name;

    public Figure(){}

    public Figure(String piece_name,String color, int column, int row){
        this.piece_name = piece_name;
        this.color = color;
        this.column = column;
        this.row = row;
    }
    
    public String getColor() {
        return color;
    }
    public int getColumn() { 
        return column; 
    }
    public int getRow() {
        return row; 
    }

}
