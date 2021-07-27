package sample;

import javafx.scene.control.Label;

public class Draw {
    private Label label;
    public Draw(Label label){
         this.label = label;
    }

    public void drawX(){
        label.setText("X");
    }
    public void drawO(){
        label.setText("O");
    }

}
