package chess.interfaces;
import chess.InvalidCoordinateException;

public interface IntChessBoard {
    boolean verifyCoordinate(int x, int y) throws InvalidCoordinateException;
}
