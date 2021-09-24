package sample;

import javafx.scene.control.Label;

import java.util.List;

public class Defensive_Ai extends AI{

    char board[][];


    public Defensive_Ai(char board[][]){
        this.board = board;
    }

    private final int INFINITY = 999999;
    private final char ai = 'o', player = 'x';


    Boolean isMovesLeft(char board[][]) {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] == '_')
                    return true;
        return false;
    }

    int getScore(char board[][]) {
        for (int row = 0; row < 3; row++) {
            if (board[row][0] == board[row][1] && board[row][1] == board[row][2]) {
                if (board[row][0] == ai)
                    return +1;
                else if (board[row][0] == player)
                    return -1;
            }
        }


        for (int col = 0; col < 3; col++) {
            if (board[0][col] == board[1][col] && board[1][col] == board[2][col]) {
                if (board[0][col] == ai)
                    return +1;
                else if (board[0][col] == player)
                    return -1;
            }
        }


        if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            if (board[0][0] == ai)
                return +1;
            else if (board[0][0] == player)
                return -1;
        }

        if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            if (board[0][2] == ai)
                return +1;
            else if (board[0][2] == player)
                return -1;
        }


        return 0;
    }

    int minimax(char board[][], int depth, Boolean isMaximizing) {
        int score = getScore(board);


        if (score == 1)
            return score;

        if (score == -1)
            return score;

        if (isMovesLeft(board) == false)
            return 0;


        if (isMaximizing) {
            int best = -INFINITY;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j]=='_') {
                        board[i][j] = ai;

                        best = Math.max(best, minimax(board, depth + 1, !isMaximizing));
                        board[i][j] = '_';
                    }
                }
            }
            return best;
        }


        else {
            int best = 1000;


            for (int i = 0; i < 3; i++){
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == '_') {
                        board[i][j] = player;
                        best = Math.min(best, minimax(board, depth + 1, !isMaximizing));
                        board[i][j] = '_';
                    }
                }
            }
            return best;
        }
    }

    int[] findBestMove(char board[][]) {
        int arr[] = {-1,-1};
        int bestVal = -1000;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (board[i][j] == '_') {
                    board[i][j] = ai;
                    int moveVal = minimax(board, 0, false);
                    board[i][j] = '_';

                    if (moveVal > bestVal) {
                        arr[0] = i;
                        arr[1] = j;
                        bestVal = moveVal;
                    }
                }
            }
        }

        return arr;
    }


    public void move(Label label1, Label label2, Label label3, Label label4, Label label5,
                     Label label6, Label label7, Label label8, Label label9, List<Integer> tiles,char[][] board){


        int move[] = findBestMove(board);
        System.out.println(move[0]+" "+move[1]);
        System.out.println(board[0][0]+" "+board[0][1]+" "+board[0][2]+"\n"+
                board[1][0]+" "+board[1][1]+" "+board[1][2]+"\n"+
                board[2][0]+" "+board[2][1]+" "+board[2][2]);
        System.out.println("Def move");

        if(move[0] == 0 && move[1] == 0){
            Label tile = label1;
            int row = 0;
            int col = 0;
            drawO(tile,row, col, board);
        }
        else if(move[0] == 0 && move[1] == 1){
            Label tile = label2;
            int row = 0;
            int col = 1;
            drawO(tile,row, col, board);
        }
        else if(move[0] == 0 && move[1] == 2){
            Label tile = label3;
            int row = 0;
            int col = 2;
            drawO(tile,row, col, board);
        }
        else if(move[0] == 1 && move[1] == 0){
            Label tile = label4;
            int row = 1;
            int col = 0;
            drawO(tile,row, col, board);
        }
        else if(move[0] == 1 && move[1] == 1){
            Label tile = label5;
            int row = 1;
            int col = 1;
            drawO(tile,row, col, board);
        }
        else if(move[0] == 1 && move[1] == 2){
            Label tile = label6;
            int row = 1;
            int col = 2;
            drawO(tile,row, col, board);
        }
        else if(move[0] == 2 && move[1] == 0){
            Label tile = label7;
            int row = 2;
            int col = 0;
            drawO(tile,row, col, board);
        }
        else if(move[0] == 2 && move[1] == 1){
            Label tile = label8;
            int row = 2;
            int col = 1;
            drawO(tile,row, col, board);
        }
        else {
            Label tile = label9;
            int row = 2;
            int col = 2;
            drawO(tile,row, col, board);
        }
    }
}