package chess;

import chess.InvalidCoordinateException;
import chess.interfaces.IntChessBoard;

public class ChessBoard implements IntChessBoard {
    @Override
    public boolean verifyCoordinate(int x, int y) throws InvalidCoordinateException {
        if(x < 1 || x > 8 || y < 1 || y > 8 ){
            throw new InvalidCoordinateException("Invalid coordinate: (" + x + "," + y + ")");
        }
        return true; 
    }
}
