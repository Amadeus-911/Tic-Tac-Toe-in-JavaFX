package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;



public class Window {
    public static void endGameMsg(String msg){

        Stage window = createWinddow();

        VBox layout = createVboxLayout(window,msg);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();

    }

    private static Stage createWinddow() {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);

        window.setTitle("Tic-Tac-Toe");
        window.setMinWidth(250);
        window.setMinHeight(100);

        return window;
    }

    private static VBox createVboxLayout(Stage window,String msg){
        Label label = new Label();
        label.setText(msg);
        Button okButton = new Button("OK");
        okButton.setOnAction(e -> window.close());

        VBox layout = new VBox();
        layout.getChildren().addAll(label, okButton);
        layout.setAlignment(Pos.CENTER);

        return layout;
    }
    
}

