package challenges.utilities;

public class BattleShip {
//    pass in a board, row and column with blank spaces for empty spots or #
//    for part of a ship. Return a string indicating whether shot was out of bounds, hits or misses
    public static String fire (String [][] board, int row, int column){
        if (board.length-1 < row) return "Out of bounds";
        for (int i = 0; i < board.length; i++) {
            if (board[i].length-1 < column) return "Out of bounds";
        }
        if (board[row][column].contains("#"))return "Hit!";
        else return "Miss!";
    }

}
