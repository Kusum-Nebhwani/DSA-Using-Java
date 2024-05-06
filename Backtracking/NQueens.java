package Backtracking;

public class NQueens {
    public static  void printChessBoard(char[][] chessboard) {
        System.out.println("--------chessBoard--------");
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard[i].length; j++) {
                System.out.print(chessboard[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(char[][] chessboard , int r ,int c){
        //vertically up
        for(int i = r-1;i>=0;i--){
            if(chessboard[i][c] == 'Q'){
                return false;
            }

        }
        //diagonally up left
        for(int i = r-1  , j = c-1; i>=0 && j>=0; i--,j--){
            if(chessboard[i][j] == 'Q'){
                return false;
            }
        }



         //diagonally up right
        for(int i = r-1  , j = c+1; i>=0 && j< chessboard.length; i--,j++){
            if(chessboard[i][j] == 'Q'){
                return false;
            }
        }

        return true;

    }
    public static void nQueens(char [][] chessboard,int row){
        //BASE CASE
        if(row == chessboard.length){
            printChessBoard(chessboard);
            return;
        }

        for(int i = 0;i<chessboard.length;i++) {
            if (isSafe(chessboard, row, i)){
                chessboard[row][i] = 'Q';
                //RECURSION
                nQueens(chessboard, row + 1);  //FUNCTION CALL
                chessboard[row][i] = 'X';  //BACKTRACKING STEP

            }
        }
    }
    public static void main(String[] args) {
        int n = 4;
        char [][] chessboard = new char[n][n];
        // Initialisation
        for(int i = 0;i<chessboard.length;i++){
            for(int j = 0;j<chessboard[i].length;j++){
                chessboard[i][j] = 'X';  //'X' -->indicates no queen is sitting on the respective position
            }
        }

        nQueens(chessboard,0);
    }
}
