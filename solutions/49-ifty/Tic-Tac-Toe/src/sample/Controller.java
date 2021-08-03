package sample;
import javafx.fxml.FXML;

import javafx.scene.control.Label;
import javafx.scene.shape.Line;

import static sample.Utility.*;
import static sample.Window.*;

public class Controller {

    private final String X = "X";
    private final String win = "You have won";
    private final String lose = "You lost";
    private  final String tie = "The game is Tied";
    private boolean turnX = true;
    private boolean isTie = false;
    private boolean isPlayable = true;
    Player player = new Player();
    AI ai = new AI();
    Random_Ai randomAi = new Random_Ai();

    @FXML protected Label label1;
    @FXML protected Label label2;
    @FXML protected Label label3;
    @FXML protected Label label4;
    @FXML protected Label label5;
    @FXML protected Label label6;
    @FXML protected Label label7;
    @FXML protected Label label8;
    @FXML protected Label label9;


    @FXML private Line line1;
    @FXML private Line line2;
    @FXML private Line line3;
    @FXML private Line line4;
    @FXML private Line line5;
    @FXML private Line line6;
    @FXML private Line line7;
    @FXML private Line line8;

    public void reset(){
        turnX = true;
        isTie = false;
        clean(label1, label2, label3, label4, label5, label6, label7, label8, label9, line1,line2,line3,line4,line5,line6,line7,line8);
    }

    public void drawGameOverLine(){
        int combo = getCombo(label1, label2, label3, label4, label5, label6, label7, label8, label9);
        switch (combo){
            case 1:
                line1.setOpacity(1);
                break;
            case 2:
                line2.setOpacity(1);
                break;
            case 3:
                line3.setOpacity(1);
                break;
            case 4:
                line4.setOpacity(1);
                break;
            case 5:
                line5.setOpacity(1);
                break;
            case 6:
                line6.setOpacity(1);
                break;
            case 7:
                line7.setOpacity(1);
                break;
            case 8:
                line8.setOpacity(1);
                break;
            case 0:
                isTie = true;
                gameWinnerDisplay(tie);
            default:
                System.out.println("no game");
        }
    }



    public void tile1(){
        System.out.println("Hello I'm Tile 1");
        if(!isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {

            if (isEmpty(label1)) {
                if (turnX) {
                    player.drawX(label1);
                    turnX = false;
                    if (isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
                        drawGameOverLine();
                        if (!isTie) {
                            gameWinnerDisplay(win);
                        }
                        return;
                    }
                    randomAi.move(label1, label2, label3, label4, label5, label6, label7, label8, label9);
//                    int tile = randomTile(label1, label2, label3, label4, label5, label6, label7, label8, label9);
//                    System.out.println(tile);
//                    switch (tile){
//                        case 1:
//                            System.out.println("do noting");
//                        case 2:
//                            ai.drawO(label2);
//                            break;
//                        case 3:
//                            ai.drawO(label3);
//                            break;
//                        case 4:
//                            ai.drawO(label4);
//                            break;
//                        case 5:
//                            ai.drawO(label5);
//                            break;
//                        case 6:
//                            ai.drawO(label6);
//                            break;
//                        case 7:
//                            ai.drawO(label7);
//                            break;
//                        case 8:
//                            ai.drawO(label8);
//                            break;
//                        case 9:
//                            ai.drawO(label9);
//                            break;
//                        default:
//                            System.out.println("default");

                    //}
                    if (isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
                        drawGameOverLine();
                        if (!isTie) {
                            gameWinnerDisplay(lose);
                        }
                        return;
                    }
                    turnX = true;
                }
            } else {
                System.out.println("Not empty");
            }
        }}


    public void  tile2(){
        System.out.println("Hello I'm Tile 2");
//        Draw draw = new Draw(label2);
//        if(turnX){
//            draw.drawX();
//            turnX = false;
//        }
        if(!isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
            if (isEmpty(label2)) {
                if (turnX) {
                    player.drawX(label2);
                    turnX = false;
                    if (isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
                        drawGameOverLine();
                        if(!isTie){gameWinnerDisplay(win);}
                        return;
                    }
                    randomAi.move(label1, label2, label3, label4, label5, label6, label7, label8, label9);
//                    int tile = randomTile(label1, label2, label3, label4, label5, label6, label7, label8, label9);
//                    System.out.println(tile);
//                    switch (tile) {
//                        case 1:
//                            ai.drawO(label1);
//                            break;
//                        case 2:
//                            System.out.println("do noting");
//                        case 3:
//                            ai.drawO(label3);
//                            break;
//                        case 4:
//                            ai.drawO(label4);
//                            break;
//                        case 5:
//                            ai.drawO(label5);
//                            break;
//                        case 6:
//                            ai.drawO(label6);
//                            break;
//                        case 7:
//                            ai.drawO(label7);
//                            break;
//                        case 8:
//                            ai.drawO(label8);
//                            break;
//                        case 9:
//                            ai.drawO(label9);
//                            break;
//                        default:
//                            System.out.println("default");
//                            break;
//                    }
                    if (isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
                        drawGameOverLine();
                        if(!isTie){gameWinnerDisplay(lose);}
                        return;
                    }
                    turnX = true;
                }
            } else {
                System.out.println("Not empty");
            }
        }
    }
    public void  tile3(){
//        System.out.println("Hello I'm Tile 3");
//        Draw draw = new Draw(label3);
//        if(turnX){
//            draw.drawX();
//            turnX = false;
//        }
        if(!isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
            if (isEmpty(label3)) {
                if (turnX) {
                    player.drawX(label3);
                    turnX = false;
                    if (isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
                        drawGameOverLine();
                        if(!isTie){gameWinnerDisplay(win);}
                        return;
                    }
                    randomAi.move(label1, label2, label3, label4, label5, label6, label7, label8, label9);
//                    int tile = randomTile(label1, label2, label3, label4, label5, label6, label7, label8, label9);
//                    System.out.println(tile);
//                    switch (tile) {
//                        case 1:
//                            ai.drawO(label1);
//                            break;
//                        case 2:
//                            ai.drawO(label2);
//                            break;
//                        case 3:
//                            System.out.println("do noting");
//                        case 4:
//                            ai.drawO(label4);
//                            break;
//                        case 5:
//                            ai.drawO(label5);
//                            break;
//                        case 6:
//                            ai.drawO(label6);
//                            break;
//                        case 7:
//                            ai.drawO(label7);
//                            break;
//                        case 8:
//                            ai.drawO(label8);
//                            break;
//                        case 9:
//                            ai.drawO(label9);
//                            break;
//                        default:
//                            System.out.println("default");
//                            break;
//                    }
                    if (isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
                        drawGameOverLine();
                        if(!isTie){gameWinnerDisplay(lose);}
                        return;
                    }
                    turnX = true;
                }
            } else {
                System.out.println("Not empty");
            }
        }
    }
    public void  tile4(){
        if(!isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
            if (isEmpty(label4)) {
                if (turnX) {
                    player.drawX(label4);
                    turnX = false;
                    if (isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
                        drawGameOverLine();
                        if(!isTie){gameWinnerDisplay(win);}
                        return;
                    }
                    randomAi.move(label1, label2, label3, label4, label5, label6, label7, label8, label9);
//                    int tile = randomTile(label1, label2, label3, label4, label5, label6, label7, label8, label9);
//                    System.out.println(tile);
//                    switch (tile) {
//                        case 1:
//                            ai.drawO(label1);
//                            break;
//                        case 2:
//                            ai.drawO(label2);
//                            break;
//                        case 3:
//                            ai.drawO(label3);
//                            break;
//                        case 4:
//                            System.out.println("do noting");
//                        case 5:
//                            ai.drawO(label5);
//                            break;
//                        case 6:
//                            ai.drawO(label6);
//                            break;
//                        case 7:
//                            ai.drawO(label7);
//                            break;
//                        case 8:
//                            ai.drawO(label8);
//                            break;
//                        case 9:
//                            ai.drawO(label9);
//                            break;
//                        default:
//                            System.out.println("default");
//                            break;
//                    }
                    if (isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
                        drawGameOverLine();
                        if(!isTie){gameWinnerDisplay(lose);}
                        return;
                    }
                    turnX = true;
                }
            } else {
                System.out.println("Not empty");
            }
        }
    }
    public void  tile5(){
        System.out.println("Hello I'm Tile 5");
//        Draw draw = new Draw(label5);
//        if(turnX){
//            draw.drawX();
//            turnX = false;
//        }
        if(!isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
            if (isEmpty(label5)) {
                if (turnX) {
                    player.drawX(label5);
                    turnX = false;
                    if (isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
                        drawGameOverLine();
                        if(!isTie){gameWinnerDisplay(win);}
                        return;
                    }
                    randomAi.move(label1, label2, label3, label4, label5, label6, label7, label8, label9);
//                    int tile = randomTile(label1, label2, label3, label4, label5, label6, label7, label8, label9);
//                    System.out.println(tile);
//                    switch (tile) {
//                        case 1:
//                            ai.drawO(label1);
//                            break;
//
//                        case 2:
//                            ai.drawO(label2);
//                            break;
//                        case 3:
//                            ai.drawO(label3);
//                            break;
//                        case 4:
//                            ai.drawO(label4);
//                            break;
//                        case 5:
//                            System.out.println("do noting");
//                        case 6:
//                            ai.drawO(label6);
//                            break;
//                        case 7:
//                            ai.drawO(label7);
//                            break;
//                        case 8:
//                            ai.drawO(label8);
//                            break;
//                        case 9:
//                            ai.drawO(label9);
//                            break;
//                        default:
//                            System.out.println("default");
//                            break;
//                    }
                    if (isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
                        drawGameOverLine();
                        if(!isTie){gameWinnerDisplay(lose);}
                        return;
                    }
                    turnX = true;
                }
            } else {
                System.out.println("Not empty");
            }
        }
    }
    public void  tile6(){
        System.out.println("Hello I'm Tile 6");
//        Draw draw = new Draw(label6);
//        if(turnX){
//            draw.drawX();
//            turnX = false;
//        }
        if(!isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
            if (isEmpty(label6)) {
                if (turnX) {
                    player.drawX(label6);
                    turnX = false;
                    if (isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
                        drawGameOverLine();
                        if(!isTie){gameWinnerDisplay(win);}
                        return;
                    }
                    randomAi.move(label1, label2, label3, label4, label5, label6, label7, label8, label9);
//                    int tile = randomTile(label1, label2, label3, label4, label5, label6, label7, label8, label9);
//                    System.out.println(tile);
//                    switch (tile) {
//                        case 1:
//                            ai.drawO(label1);
//                            break;
//
//                        case 2:
//                            ai.drawO(label2);
//                            break;
//                        case 3:
//                            ai.drawO(label3);
//                            break;
//                        case 4:
//                            ai.drawO(label4);
//                            break;
//                        case 5:
//                            ai.drawO(label5);
//                            break;
//                        case 6:
//                            System.out.println("do noting");
//                        case 7:
//                            ai.drawO(label7);
//                            break;
//                        case 8:
//                            ai.drawO(label8);
//                            break;
//                        case 9:
//                            ai.drawO(label9);
//                            break;
//                        default:
//                            System.out.println("default");
//                            break;
//                    }
                    if (isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
                        drawGameOverLine();
                        if(!isTie){gameWinnerDisplay(lose);}
                        return;
                    }
                    turnX = true;
                }
            } else {
                System.out.println("Not empty");
            }
        }
    }
    public void  tile7(){
        System.out.println("Hello I'm Tile 7");
//        Draw draw = new Draw(label7);
//        if(turnX){
//            draw.drawX();
//            turnX = false;
//        }
        if(!isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
            if (isEmpty(label7)) {
                if (turnX) {
                    player.drawX(label7);
                    turnX = false;
                    if (isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
                        drawGameOverLine();
                        if(!isTie){gameWinnerDisplay(win);}
                        return;
                    }
                    randomAi.move(label1, label2, label3, label4, label5, label6, label7, label8, label9);
//                    int tile = randomTile(label1, label2, label3, label4, label5, label6, label7, label8, label9);
//                    System.out.println(tile);
//                    switch (tile) {
//                        case 1:
//                            ai.drawO(label1);
//                            break;
//
//                        case 2:
//                            ai.drawO(label2);
//                            break;
//                        case 3:
//                            ai.drawO(label3);
//                            break;
//                        case 4:
//                            ai.drawO(label4);
//                            break;
//                        case 5:
//                            ai.drawO(label5);
//                            break;
//                        case 6:
//                            ai.drawO(label6);
//                            break;
//                        case 7:
//                            System.out.println("do noting");
//                        case 8:
//                            ai.drawO(label8);
//                            break;
//                        case 9:
//                            ai.drawO(label9);
//                            break;
//                        default:
//                            System.out.println("default");
//                            break;
//                    }
                    if (isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
                        drawGameOverLine();
                        if(!isTie){gameWinnerDisplay(lose);}
                        return;
                    }
                    turnX = true;
                }
            } else {
                System.out.println("Not empty");
            }
        }
    }
    public void  tile8(){
        System.out.println("Hello I'm Tile 8");
//        Draw draw = new Draw(label8);
//        if(turnX){
//            draw.drawX();
//            turnX = false;
//        }
        if(!isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
            if (isEmpty(label8)) {
                if (turnX) {
                    player.drawX(label8);
                    turnX = false;
                    if (isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
                        drawGameOverLine();
                        if(!isTie){gameWinnerDisplay(win);}
                        return;
                    }
                    randomAi.move(label1, label2, label3, label4, label5, label6, label7, label8, label9);
//                    int tile = randomTile(label1, label2, label3, label4, label5, label6, label7, label8, label9);
//                    System.out.println(tile);
//                    switch (tile) {
//                        case 1:
//                            ai.drawO(label1);
//                            break;
//                        case 2:
//                            ai.drawO(label2);
//                            break;
//                        case 3:
//                            ai.drawO(label3);
//                            break;
//                        case 4:
//                            ai.drawO(label4);
//                            break;
//                        case 5:
//                            ai.drawO(label5);
//                            break;
//                        case 6:
//                            ai.drawO(label6);
//                            break;
//                        case 7:
//                            ai.drawO(label7);
//                            break;
//                        case 8:
//                            System.out.println("do noting");
//                        case 9:
//                            ai.drawO(label9);
//                            break;
//                        default:
//                            System.out.println("default");
//                            break;
//                    }
                    if (isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
                        drawGameOverLine();
                        if(!isTie){gameWinnerDisplay(lose);}
                        return;
                    }
                    turnX = true;
                }
            } else {
                System.out.println("Not empty");
            }
        }
    }
    public void  tile9(){
        System.out.println("Hello I'm Tile 9");
//        Draw draw = new Draw(label9);
//        if(turnX){
//            draw.drawX();
//            turnX = false;
//        }
        if(!isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
            if (isEmpty(label9)) {
                if (turnX) {
                    player.drawX(label9);
                    turnX = false;
                    if (isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
                        drawGameOverLine();
                        if(!isTie){gameWinnerDisplay(win);}
                        return;
                    }
                    randomAi.move(label1, label2, label3, label4, label5, label6, label7, label8, label9);
//                    int tile = randomTile(label1, label2, label3, label4, label5, label6, label7, label8, label9);
//                    System.out.println(tile);
//                    switch (tile) {
//                        case 1:
//                            ai.drawO(label9);
//                            break;
//                        case 2:
//                            ai.drawO(label2);
//                            break;
//                        case 3:
//                            ai.drawO(label3);
//                            break;
//                        case 4:
//                            ai.drawO(label4);
//                            break;
//                        case 5:
//                            ai.drawO(label5);
//                            break;
//                        case 6:
//                            ai.drawO(label6);
//                            break;
//                        case 7:
//                            ai.drawO(label7);
//                            break;
//                        case 8:
//                            ai.drawO(label8);
//                            break;
//                        case 9:
//                            System.out.println("do noting");
//                        default:
//                            System.out.println("default");
//                            break;
//                    }
                    if (isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
                        drawGameOverLine();
                        if(!isTie){gameWinnerDisplay(lose);}
                        return;
                    }
                    turnX = true;
                }
            } else {
                System.out.println("Not empty");
            }
        }

    }
}
