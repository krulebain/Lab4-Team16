package chess;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import chess.figures.*;
import chess.interfaces.*;
import chess.InvalidCoordinateException;
import chess.InvalidMoveException;
import chess.InvalidPieceNameException;

public class ChessGame {
    public static void main(String[] args) throws Exception {
        Figure[] chessPieces = new Figure[6];
        Scanner input = new Scanner(System.in);
        HashSet<String> validPieces = new HashSet<>(
            Arrays.asList("pawn", "rook", "knight", "bishop", "king", "queen")
        );

        for (int i = 0; i < chessPieces.length; i++) {
            System.out.println("Choose a piece... ");
            String piece = input.nextLine().toLowerCase().trim();
            boolean validPiece = false;
            while (!validPiece) {
                if (validPieces.contains(piece)) {
                validPiece = true;
                break;
                }
                System.out.println("That is not a real piece... try again...");
                piece = input.nextLine().toLowerCase().trim();
            }

            System.out.println("Choose it's color (black or white)");
            String color = input.nextLine().toLowerCase().trim();
            while (!color.equalsIgnoreCase("black") && !color.equalsIgnoreCase("white")) {
                System.out.println("That is not a valid color, try again (black or white): ");
                color = input.nextLine().toLowerCase().trim();
            }

            int column = 0;
            int row = 0;
            System.out.println("Select its initial column and row (ex. A5)....");
            // Take user input for initial position and separate it into x and y vals
            String coordinates = input.nextLine().toUpperCase().trim();
            while (coordinates.length() != 2) {
                System.out.println("That's not right!");
                coordinates = input.nextLine().toUpperCase().trim();
            }

            column = coord.charAt(0) - 'A' + 1;
            row = Character.getNumericValue(coord.charAt(1));

            // check if it is on the board and a valid first position
            boolean validMove = ChessBoard.verifyCoordinate(column, row);
            while (!validMove) {
                System.out.println("That doesn't work, try again: ");
                coordinates = input.nextLine().toLowerCase().trim();
                while (coordinates.length() != 2) {
                System.out.println("That's not right! ");
                coordinates = input.nextLine().toLowerCase().trim();
                }
                coordinput = coordinates.split("");
                column = coordinput[0].charAt(0);
                row = Integer.parseInt(coordinput[1]);
                validMove = ChessBoard.verifyCoordinate(column, row);
            }
            switch (piece) {
                case "pawn":
                    Figure pawn = new Pawn(piece, color, column, row);
                    chessPieces[i] = pawn;
                    break;
                case "bishop":
                    Figure bishop = new Bishop(piece, color, column, row);
                    chessPieces[i] = bishop;
                    break;
                case "rook":
                    Figure rook = new Rook(piece, color, column, row);
                    chessPieces[i] = rook;
                    break;
                case "knight":
                    Figure knight = new Knight(piece, color, column, row);
                    chessPieces[i] = knight;
                    break;
                case "king":
                    Figure king = new King(piece, color, column, row);
                    chessPieces[i] = king;
                    break;
                case "queen":
                    Figure queen = new Queen(piece, color, column, row);
                    chessPieces[i] = queen;
                    break;
                default:
                    break;
            }
        }
        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Where would you like these pieces to go?");
        String coordinates1 = input.nextLine().toLowerCase().trim();
        while (coordinates1.length() != 2) {
            System.out.println("That's not right!");
            coordinates1 = input.nextLine().toLowerCase().trim();
        }
        String[] coordinput1 = coordinates1.split("");
        char column1 = coordinput1[0].charAt(0);
        int row1 = Integer.parseInt(coordinput1[1]);
        // check if it is on the board
        boolean validMove1 = ChessBoard.verifyCoordinate(column1, row1);
        while (!validMove1) {
            System.out.println("That doesn't work, try again: ");
            coordinates1 = input.nextLine().toLowerCase().trim();
        while (coordinates1.length() != 2) {
            System.out.println("That's not right! ");
            coordinates1 = input.nextLine().toLowerCase().trim();
        }
            coordinput1 = coordinates1.split("");
            column1 = coordinput1[0].charAt(0);
            row1 = Integer.parseInt(coordinput1[1]);
            validMove1 = ChessBoard.withinChessboard(column1, row1);
        }
        boolean attemptedMove = false;
        for (int index = 0; index < chessPieces.length; index++) {
            attemptedMove = chessPieces[index].moveTo(column1, row1);
            if(!attemptedMove){
                System.out.println("This move for the piece at index "+index+" is not valid!");
            }else{
                System.out.println("That move for the piece at index "+index+" is a valid move!");
            }
        }
    }
}
