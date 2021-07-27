package sample;

import javafx.scene.control.Label;

public class AI {
    private Label label;

    public void getLabel(Label label){
        this.label = label;
    }
    public void drawX(Label label){
        label.setText("X");
        label.setOpacity(1);
    }
    public void drawO(Label label){
        label.setText("O");
        label.setOpacity(1);
    }
}
