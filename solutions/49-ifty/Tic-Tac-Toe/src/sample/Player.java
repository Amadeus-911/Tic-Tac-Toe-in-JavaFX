package sample;

import javafx.scene.control.Label;

public class Player {

    public void drawX(Label label, int row, int col, char[][] board){
        label.setText("X");
        label.setOpacity(1);
        board[row][col] = 'x';
    }



}
