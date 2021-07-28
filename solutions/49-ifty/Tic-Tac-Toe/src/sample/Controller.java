package sample;

import javafx.fxml.FXML;

import javafx.scene.control.Label;

import static sample.Utility.*;

public class Controller {

    private final String X = "X";
    private boolean turnX = true;
    Player player = new Player();
    AI ai = new AI();

    @FXML protected Label label1;
    @FXML protected Label label2;
    @FXML protected Label label3;
    @FXML protected Label label4;
    @FXML protected Label label5;
    @FXML protected Label label6;
    @FXML protected Label label7;
    @FXML protected Label label8;
    @FXML protected Label label9;




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
                int tile = randomTile(label1, label2, label3, label4, label5, label6, label7, label8, label9);
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
                }
                turnX = true;
            }
        }else{
            System.out.println("Not empty");
        }
   }


    public void  tile2(){
        System.out.println("Hello I'm Tile 2");
//        Draw draw = new Draw(label2);
//        if(turnX){
//            draw.drawX();
//            turnX = false;
//        }
        if(isEmpty(label2)){
            if (turnX){
                player.drawX(label2);
                turnX = false;
                int tile = randomTile(label1, label2, label3, label4, label5, label6, label7, label8, label9);
                System.out.println(tile);
                switch (tile){
                    case 1:
                        ai.drawO(label1);
                        break;
                    case 2:
                        System.out.println("do noting");
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
                turnX = true;
            }
        }else{
            System.out.println("Not empty");
        }
    }
    public void  tile3(){
//        System.out.println("Hello I'm Tile 3");
//        Draw draw = new Draw(label3);
//        if(turnX){
//            draw.drawX();
//            turnX = false;
//        }
        if(isEmpty(label3)){
            if (turnX){
                player.drawX(label3);
                turnX = false;
                int tile = randomTile(label1, label2, label3, label4, label5, label6, label7, label8, label9);
                System.out.println(tile);
                switch (tile){
                    case 1:
                        ai.drawO(label1);
                        break;
                    case 2:
                        ai.drawO(label2);
                        break;
                    case 3:
                        System.out.println("do noting");
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
                turnX = true;
            }
        }else{
            System.out.println("Not empty");
        }
    }
    public void  tile4(){
        if(isEmpty(label4)){
            if (turnX){
                player.drawX(label4);
                turnX = false;
                int tile = randomTile(label1, label2, label3, label4, label5, label6, label7, label8, label9);
                System.out.println(tile);
                switch (tile){
                    case 1:
                        ai.drawO(label1);
                        break;
                    case 2:
                        ai.drawO(label2);
                        break;
                    case 3:
                        ai.drawO(label3);
                        break;
                    case 4:
                        System.out.println("do noting");
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
                turnX = true;
            }
        }else{
            System.out.println("Not empty");
        }
    }
    public void  tile5(){
        System.out.println("Hello I'm Tile 5");
//        Draw draw = new Draw(label5);
//        if(turnX){
//            draw.drawX();
//            turnX = false;
//        }
        if(isEmpty(label5)){
            if (turnX){
                player.drawX(label5);
                turnX = false;
                int tile = randomTile(label1, label2, label3, label4, label5, label6, label7, label8, label9);
                System.out.println(tile);
                switch (tile){
                    case 1:
                        ai.drawO(label1);
                        break;

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
                        System.out.println("do noting");
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
                turnX = true;
            }
        }else{
            System.out.println("Not empty");
        }
    }
    public void  tile6(){
        System.out.println("Hello I'm Tile 6");
//        Draw draw = new Draw(label6);
//        if(turnX){
//            draw.drawX();
//            turnX = false;
//        }
        if(isEmpty(label6)){
            if (turnX){
                player.drawX(label6);
                turnX = false;
                int tile = randomTile(label1, label2, label3, label4, label5, label6, label7, label8, label9);
                System.out.println(tile);
                switch (tile){
                    case 1:
                        ai.drawO(label1);
                        break;

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
                        System.out.println("do noting");
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
                turnX = true;
            }
        }else{
            System.out.println("Not empty");
        }
    }
    public void  tile7(){
        System.out.println("Hello I'm Tile 7");
//        Draw draw = new Draw(label7);
//        if(turnX){
//            draw.drawX();
//            turnX = false;
//        }
        if(isEmpty(label7)){
            if (turnX){
                player.drawX(label7);
                turnX = false;
                int tile = randomTile(label1, label2, label3, label4, label5, label6, label7, label8, label9);
                System.out.println(tile);
                switch (tile){
                    case 1:
                        ai.drawO(label1);
                        break;

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
                        System.out.println("do noting");
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
                turnX = true;
            }
        }else{
            System.out.println("Not empty");
        }
    }
    public void  tile8(){
        System.out.println("Hello I'm Tile 8");
//        Draw draw = new Draw(label8);
//        if(turnX){
//            draw.drawX();
//            turnX = false;
//        }
        if(isEmpty(label8)){
            if (turnX){
                player.drawX(label8);
                turnX = false;
                int tile = randomTile(label1, label2, label3, label4, label5, label6, label7, label8, label9);
                System.out.println(tile);
                switch (tile){
                    case 1:
                        ai.drawO(label1);
                        break;
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
                        System.out.println("do noting");
                    case 9:
                        ai.drawO(label9);
                        break;
                    default:
                        System.out.println("default");
                        break;
                }
                turnX = true;
            }
        }else{
            System.out.println("Not empty");
        }
    }
    public void  tile9(){
        System.out.println("Hello I'm Tile 9");
//        Draw draw = new Draw(label9);
//        if(turnX){
//            draw.drawX();
//            turnX = false;
//        }
        if(isEmpty(label9)){
            if (turnX){
                player.drawX(label9);
                turnX = false;
                int tile = randomTile(label1, label2, label3, label4, label5, label6, label7, label8, label9);
                System.out.println(tile);
                switch (tile){
                    case 1:
                        ai.drawO(label9);
                        break;
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
                        System.out.println("do noting");
                    default:
                        System.out.println("default");
                        break;
                }
                turnX = true;
            }
        }else{
            System.out.println("Not empty");
        }

    }

}
