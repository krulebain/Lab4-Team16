package chess.interfaces;
import chess.InvalidMoveException;

public interface IntBishop {
    boolean moveToBishop(int x, int y) throws InvalidMoveException;
    
}
