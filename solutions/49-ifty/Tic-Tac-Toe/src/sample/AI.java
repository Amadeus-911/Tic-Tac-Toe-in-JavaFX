package sample;

import javafx.scene.control.Label;

public class AI {

    public void drawO(Label label, int row, int col, char[][] board){
        label.setText("O");
        label.setOpacity(1);
        board[row][col] = 'o';
    }
    public void move(){

    }
}
