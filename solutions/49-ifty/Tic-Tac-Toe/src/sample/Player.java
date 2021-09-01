package sample;

import javafx.scene.control.Label;

public class Player {
    private Label label;

    public void getLabel(Label label){
        this.label = label;
    }
    public void drawX(Label label, int row, int col, char[][] board){
        label.setText("X");
        label.setOpacity(1);
        board[row][col] = 'x';
    }



}
