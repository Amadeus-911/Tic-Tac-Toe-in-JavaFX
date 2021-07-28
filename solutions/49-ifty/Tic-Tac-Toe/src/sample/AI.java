package sample;

import javafx.scene.control.Label;

public class AI {
    private Label label;

    public void getLabel(Label label){
        this.label = label;
    }

    public void drawO(Label label){
        label.setText("O");
        label.setOpacity(1);
    }
}
