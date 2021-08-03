package sample;

import javafx.scene.control.Label;

public abstract class AI {

    public void drawO(Label label){
        label.setText("O");
        label.setOpacity(1);
    }
}
