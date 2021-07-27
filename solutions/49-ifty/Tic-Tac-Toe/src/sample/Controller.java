package sample;

import javafx.fxml.FXML;

import javafx.scene.control.Label;

public class Controller {
    @FXML


    private Label label1;
    @FXML private Label label2;
    @FXML private Label label3;
    @FXML private Label label4;
    @FXML private Label label5;
    @FXML private Label label6;
    @FXML private Label label7;
    @FXML private Label label8;
    @FXML private Label label9;


    public void  tile1(){
        System.out.println("Hello I'm Tile 1");
        Draw draw = new Draw(label1);
        draw.drawX();
    }
    public void  tile2(){
        System.out.println("Hello I'm Tile 2");
        Draw draw = new Draw(label2);
        draw.drawX();
    }
    public void  tile3(){
        System.out.println("Hello I'm Tile 3");
        Draw draw = new Draw(label3);
        draw.drawX();
    }
    public void  tile4(){
        System.out.println("Hello I'm Tile 4");
        Draw draw = new Draw(label4);
        draw.drawX();
    }
    public void  tile5(){
        System.out.println("Hello I'm Tile 5");
        Draw draw = new Draw(label5);
        draw.drawX();
    }
    public void  tile6(){
        System.out.println("Hello I'm Tile 6");
        Draw draw = new Draw(label6);
        draw.drawX();
    }
    public void  tile7(){
        System.out.println("Hello I'm Tile 7");
        Draw draw = new Draw(label7);
        draw.drawX();
    }
    public void  tile8(){
        System.out.println("Hello I'm Tile 8");
        Draw draw = new Draw(label8);
        draw.drawX();
    }
    public void  tile9(){
        System.out.println("Hello I'm Tile 9");
        Draw draw = new Draw(label9);
        draw.drawX();
    }

}
