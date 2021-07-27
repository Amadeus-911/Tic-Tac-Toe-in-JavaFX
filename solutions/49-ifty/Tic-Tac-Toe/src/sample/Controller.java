package sample;

import javafx.fxml.FXML;

import javafx.scene.control.Label;

import java.util.Random;

public class Controller {

    private String X = "X";
    private boolean turnX = true;
    Player player = new Player();
    AI ai = new AI();

    @FXML private Label label1;
    @FXML private Label label2;
    @FXML private Label label3;
    @FXML private Label label4;
    @FXML private Label label5;
    @FXML private Label label6;
    @FXML private Label label7;
    @FXML private Label label8;
    @FXML private Label label9;

    public int rand(){
        Random r = new Random();
        int low = 1;
        int high = 10;
        return r.nextInt(high-low) + low;
    }

    public boolean isEmpty(Label label){
        String val = label.getText();
        String nan = String.valueOf('.');
        if(val.equals(nan)){
            return true;
        }else{
            return false;
        }
    }


    public int randomTile(){
        int tile = 0;
        tile = rand();
        switch (tile){
            case 1:
                if(isEmpty(label1)){
                    return 1;
                }
            case 2:
                if(isEmpty(label2)){
                    return 2;
                }
            case 3:
                if(isEmpty(label3)){
                    return 3;
                }
            case 4:
                if(isEmpty(label4)){
                    return 4;
                }
            case 5:
                if(isEmpty(label5)){
                    return 5;
                }
            case 6:
                if(isEmpty(label6)){
                    return 6;
                }
            case 7:
                if(isEmpty(label7)){
                    return 7;
                }
            case 8:
                if(isEmpty(label8)){
                    return 8;
                }
            case 9:
                if(isEmpty(label9)) {
                    return 9;
                }
            default:
                return 0;
        }
    }


    public void tile1(){
        System.out.println("Hello I'm Tile 1");
//        if(turnX){
//            draw.drawX();
//            if(val.equals(X)){
//                turnX = false;
//            }
//        }else{
//            if(!val.equals(X)){
//                draw.drawO();
//            }
//        }
        if(isEmpty(label1)){
            if (turnX){
                player.drawX(label1);
                turnX = false;
                int tile = randomTile();
                System.out.println(tile);
                switch (tile){
                    case 1:
                        System.out.println("do noting");
                    case 2:
                        ai.drawO(label2);
                        break;
                    case 3:
                        ai.drawO(label3);
                        break;
                    case 4:
                        ai.drawO(label4);
                        break;
                    case 5:
                        ai.drawO(label5);
                        break;
                    case 6:
                        ai.drawO(label6);
                        break;
                    case 7:
                        ai.drawO(label7);
                        break;
                    case 8:
                        ai.drawO(label8);
                        break;
                    case 9:
                        ai.drawO(label9);
                        break;
                    default:
                        System.out.println("default");
                        break;
                }
            }else{
                int tile = randomTile();
                System.out.println(tile);
                switch (tile){
                    case 1:
                        System.out.println("do noting");
                    case 2:
                        ai.drawO(label2);
                        System.out.println("draw");
                    case 3:
                        ai.drawO(label3);
                        System.out.println("draw");
                    case 4:
                        ai.drawO(label4);
                        System.out.println("draw");
                    case 5:
                        ai.drawO(label5);
                        System.out.println("draw");
                    case 6:
                        ai.drawO(label6);
                        System.out.println("draw");
                    case 7:
                        ai.drawO(label7);
                        System.out.println("draw");
                    case 8:
                        ai.drawO(label8);
                        System.out.println("draw");
                    case 9:
                        ai.drawO(label9);
                        System.out.println("draw");
                    default:
                        System.out.println("default");
                }
            }
        }else{
            System.out.println("Not empty");
        }
   }


    public void  tile2(){
        System.out.println("Hello I'm Tile 2");
        Draw draw = new Draw(label2);
        if(turnX){
            draw.drawX();
            turnX = false;
        }
    }
    public void  tile3(){
        System.out.println("Hello I'm Tile 3");
        Draw draw = new Draw(label3);
        if(turnX){
            draw.drawX();
            turnX = false;
        }
    }
    public void  tile4(){
        System.out.println("Hello I'm Tile 4");
        Draw draw = new Draw(label4);
        if(turnX){
            draw.drawX();
            turnX = false;
        }
    }
    public void  tile5(){
        System.out.println("Hello I'm Tile 5");
        Draw draw = new Draw(label5);
        if(turnX){
            draw.drawX();
            turnX = false;
        }
    }
    public void  tile6(){
        System.out.println("Hello I'm Tile 6");
        Draw draw = new Draw(label6);
        if(turnX){
            draw.drawX();
            turnX = false;
        }
    }
    public void  tile7(){
        System.out.println("Hello I'm Tile 7");
        Draw draw = new Draw(label7);
        if(turnX){
            draw.drawX();
            turnX = false;
        }
    }
    public void  tile8(){
        System.out.println("Hello I'm Tile 8");
        Draw draw = new Draw(label8);
        if(turnX){
            draw.drawX();
            turnX = false;
        }
    }
    public void  tile9(){
        System.out.println("Hello I'm Tile 9");
        Draw draw = new Draw(label9);
        if(turnX){
            draw.drawX();
            turnX = false;
        }
    }

}
