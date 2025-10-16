package chess.interfaces;
import chess.InvalidMoveException;

public interface IntFigure {
    boolean moveTo(int x, int y) throws InvalidMoveException;
}
