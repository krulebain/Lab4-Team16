package chess.figures;
import chess.interfaces.IntBishop;

public class Queen extends Rook implements IntBishop {
    public Queen() {}
    public Queen(String name, String color, int column, int row) {
        super(name, color, column, row);
    }
    @Override
    public boolean moveToBishop(int x, int y) {
        return Math.abs(x - this.getColumn()) == Math.abs(y - this.getRow());
    }
    @Override
    public boolean moveTo(int x, int y) {
        return super.moveTo(x, y) || moveToBishop(x, y);
    }
    
}
