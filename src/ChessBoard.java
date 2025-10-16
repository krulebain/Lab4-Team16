import interfaces.*;

public class ChessBoard implements IntChessBoard {
    @Override
    public boolean verifyCoordinate(int x, int y) {
        
        if(x < 1 || x > 8 || y < 1 || y > 8 ){
            return false;
        }
        return true; 
    }
}
