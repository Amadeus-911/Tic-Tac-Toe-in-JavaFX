package sample;

import javafx.scene.control.Label;

import java.util.List;

public class Defensive_Ai extends AI{

    char board[][];
    public Defensive_Ai(char board[][]){
        this.board = board;
    }

        class Move
        {
            int row, col;
        }

        int arr[];
        private final int INFINITY = 999999;
        private final char ai = 'o', player = 'x';


        Boolean isMovesLeft(char board[][])
        {
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++)
                    if (board[i][j] == '_')
                        return true;
            return false;
        }

        int getScore(char board[][])
        {
            // Checking for Rows for X or O victory.
            for (int row = 0; row < 3; row++)
            {
                if (board[row][0] == board[row][1] && board[row][1] == board[row][2])
                {
                    if (board[row][0] == ai)
                        return +1;
                    else if (board[row][0] == player)
                        return -1;
                }
            }

            // Checking for Columns for X or O victory.
            for (int col = 0; col < 3; col++)
            {
                if (board[0][col] == board[1][col] && board[1][col] == board[2][col])
                {
                    if (board[0][col] == ai)
                        return +1;

                    else if (board[0][col] == player)
                        return -1;
                }
            }

            // Checking for Diagonals for X or O victory.
            if (board[0][0] == board[1][1] && board[1][1] == board[2][2])
            {
                if (board[0][0] == ai)
                    return +1;
                else if (board[0][0] == player)
                    return -1;
            }

            if (board[0][2] == board[1][1] && board[1][1] == board[2][0])
            {
                if (board[0][2] == ai)
                    return +1;
                else if (board[0][2] == player)
                    return -1;
            }

            // Else if none of them have won then return 0
            return 0;
        }

        // This is the minimax function. It considers all
// the possible ways the game can go and returns
// the value of the board
        int minimax(char board[][], int depth, Boolean isMaximizing)
        {
            int score = getScore(board);

            // If Maximizer has won the game
            // return his/her getScored score
            if (score == 10)
                return score;

            // If Minimizer has won the game
            // return his/her getScored score
            if (score == -10)
                return score;

            // If there are no more moves and
            // no winner then it is a tie
            if (isMovesLeft(board) == false)
                return 0;

            // If this maximizer's move
            if (isMaximizing)
            {
                int best = -INFINITY;

                // Traverse all cells
                for (int i = 0; i < 3; i++)
                {
                    for (int j = 0; j < 3; j++)
                    {
                        // Check if cell is empty
                        if (board[i][j]=='_')
                        {
                            // Make the move
                            board[i][j] = ai;

                            // Call minimax recursively and choose
                            // the maximum value
                            best = Math.max(best, minimax(board,
                                    depth + 1, !isMaximizing));

                            // Undo the move
                            board[i][j] = '_';
                        }
                    }
                }
                return best;
            }

            // If this minimizer's move
            else
            {
                int best = 1000;

                // Traverse all cells
                for (int i = 0; i < 3; i++)
                {
                    for (int j = 0; j < 3; j++)
                    {
                        // Check if cell is empty
                        if (board[i][j] == '_')
                        {
                            // Make the move
                            board[i][j] = player;

                            // Call minimax recursively and choose
                            // the minimum value
                            best = Math.min(best, minimax(board, depth + 1, !isMaximizing));
                            // Undo the move
                            board[i][j] = '_';
                        }
                    }
                }
                return best;
            }
        }

        // This will return the best possible
// move for the ai
         int[] findBestMove(char board[][])
        {
            int bestVal = -1000;
//            Move bestMove = new Move();
//            bestMove.row = -1;
//            bestMove.col = -1;
            arr[0] = -1;
            arr[1] = -1;

            // Traverse all cells, getScore minimax function
            // for all empty cells. And return the cell
            // with optimal value.
            for (int i = 0; i < 3; i++)
            {
                for (int j = 0; j < 3; j++)
                {
                    // Check if cell is empty
                    if (board[i][j] == '_')
                    {
                        // Make the move
                        board[i][j] = ai;

                        // compute evaluation function for this
                        // move.
                        int moveVal = minimax(board, 0, false);

                        // Undo the move
                        board[i][j] = '_';

                        // If the value of the current move is
                        // more than the best value, then update
                        // best/
                        if (moveVal > bestVal)
                        {
//                            bestMove.row = i;
//                            bestMove.col = j;
                            arr[0] = i;
                            arr[1] = j;
                            bestVal = moveVal;
                        }
                    }
                }
            }

            return arr;
        }



        public void setBestMove(){
            arr = findBestMove(board);
        }




    public void move(Label label1, Label label2, Label label3, Label label4, Label label5,
                     Label label6, Label label7, Label label8, Label label9, List<Integer> tiles){

        Label tile = label1;
        drawO(tile);
    }
}
