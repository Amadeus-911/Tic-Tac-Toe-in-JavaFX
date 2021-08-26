package sample;

import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Line;

public class Theme {
    public void forest(AnchorPane background, Line boardLine1,Line boardLine2,Line boardLine3,Line boardLine4){
        background.setStyle("-fx-background-color: lightgreen");
        boardLine1.setStroke(Paint.valueOf("Green"));
        boardLine2.setStroke(Paint.valueOf("Green"));
        boardLine3.setStroke(Paint.valueOf("Green"));
        boardLine4.setStroke(Paint.valueOf("Green"));
    }
    public void classic(AnchorPane background, Line boardLine1,Line boardLine2,Line boardLine3,Line boardLine4){
        background.setStyle("-fx-background-color: white");
        boardLine1.setStroke(Paint.valueOf("Black"));
        boardLine2.setStroke(Paint.valueOf("Black"));
        boardLine3.setStroke(Paint.valueOf("Black"));
        boardLine4.setStroke(Paint.valueOf("Black"));
    }
}
