package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Line;

import java.util.List;

import static sample.Utility.*;
import static sample.Window.endGameMsg;

public class Controller {

    private char board[][] = {{'_','_','_'},{'_','_','_'},{'_','_','_'}};
    private final String X = "X";
    private final String win = "You have won";
    private final String lose = "You lost";
    private  final String tie = "The game is Tied";
    private boolean turnX = true;
    private boolean isTie = false;
    private boolean isPlayable = true;
    private int tile[];
    public static int aiNum = 0;

    Player player = new Player();
    Random_Ai randomAi = new Random_Ai();
    Defensive_Ai defensiveAi = new Defensive_Ai(board);

    public List<Integer> tiles = createList();

    @FXML protected AnchorPane background;
    @FXML protected RadioButton forest;
    @FXML protected RadioButton classic;

    @FXML protected Line boardLine1;
    @FXML protected Line boardLine2;
    @FXML protected Line boardLine3;
    @FXML protected Line boardLine4;

    public void changeTheme(){
        Theme theme = new Theme();
        if(forest.isSelected()){
            theme.forest(background,boardLine1,boardLine2,boardLine3,boardLine4);
        }
        else if(classic.isSelected()){
            theme.classic(background,boardLine1,boardLine2,boardLine3,boardLine4);
        }
    }

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
        clean(label1, label2, label3, label4, label5, label6, label7, label8, label9, line1,line2,line3,line4,line5,line6,line7,line8,tiles);
        tiles = createList();
        board = new char[][]{{'_', '_', '_'}, {'_', '_', '_'}, {'_', '_', '_'}};
        System.out.println(board[0][0]+" "+board[0][1]+" "+board[0][2]+"\n"+
                board[1][0]+" "+board[1][1]+" "+board[1][2]+"\n"+
                board[2][0]+" "+board[2][1]+" "+board[2][2]);
    }

    @FXML
    public void initializeRandomAi(){
        aiNum = 0;
        reset();
        System.out.println("Random AI " + aiNum);
    }
    @FXML
    public void initializeDefensiveAi(){
        aiNum = 1;
        reset();
        System.out.println("Defensive AI " + aiNum);
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
                endGameMsg(tie);
            default:
                System.out.println("no game");
        }
    }

<<<<<<< HEAD
=======

>>>>>>> dd1325a088b9454c11cbd107501e8e188bcc38cb
    public void tile1(){
        System.out.println("Hello I'm Tile 1");
        int row = 0;
        int col = 0;
        if(!isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
            if (isEmpty(label1)) {
                if (turnX) {
                    player.drawX(label1, row, col, board);
                    tiles.remove(Integer.valueOf(1));
                    turnX = false;

                    if (isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
                        drawGameOverLine();
                        if (!isTie) {
                            endGameMsg(win);
                        }
                        return;
                    }

                    if(aiNum == 0){
                        randomAi.move(label1, label2, label3, label4, label5, label6, label7, label8, label9, tiles, board);
                    }else {
                        defensiveAi.move(label1, label2, label3, label4, label5, label6, label7, label8, label9, tiles, board);
                    }

                    if (isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
                        drawGameOverLine();
                        if (!isTie) {
                            endGameMsg(lose);
                        }
                        return;
                    }
                    turnX = true;
                }
            } else {
                System.out.println("Not empty");
            }
        }
    }


    public void  tile2(){
        System.out.println("Hello I'm Tile 2");

        int row = 0;
        int col = 1;
        if(!isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
            if (isEmpty(label2)) {
                if (turnX) {
                    player.drawX(label2, row, col, board);
                    tiles.remove(Integer.valueOf(2));
                    turnX = false;
                    if (isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
                        drawGameOverLine();
                        if(!isTie){endGameMsg(win);}
                        return;
                    }

                    if(aiNum == 0){
                        randomAi.move(label1, label2, label3, label4, label5, label6, label7, label8, label9, tiles, board);
                    }else {
                        defensiveAi.move(label1, label2, label3, label4, label5, label6, label7, label8, label9, tiles, board);
                    }

                    if (isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
                        drawGameOverLine();
                        if(!isTie){endGameMsg(lose);}
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

        int row = 0;
        int col = 2;
        if(!isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
            if (isEmpty(label3)) {
                if (turnX) {
                    player.drawX(label3, row, col, board);
                    tiles.remove(Integer.valueOf(3));
                    turnX = false;
                    if (isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
                        drawGameOverLine();
                        if(!isTie){endGameMsg(win);}
                        return;
                    }

                    if(aiNum == 0){
                        randomAi.move(label1, label2, label3, label4, label5, label6, label7, label8, label9, tiles, board);
                    }else {
                        defensiveAi.move(label1, label2, label3, label4, label5, label6, label7, label8, label9, tiles, board);
                    }

                    if (isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
                        drawGameOverLine();
                        if(!isTie){endGameMsg(lose);}
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

        int row = 1;
        int col = 0;
        if(!isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
            if (isEmpty(label4)) {
                if (turnX) {
                    player.drawX(label4, row, col, board);
                    tiles.remove(Integer.valueOf(4));
                    turnX = false;
                    if (isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
                        drawGameOverLine();
                        if(!isTie){endGameMsg(win);}
                        return;
                    }

                    if(aiNum == 0){
                        randomAi.move(label1, label2, label3, label4, label5, label6, label7, label8, label9, tiles, board);
                    }else {
                        defensiveAi.move(label1, label2, label3, label4, label5, label6, label7, label8, label9, tiles, board);
                    }

                    if (isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
                        drawGameOverLine();
                        if(!isTie){endGameMsg(lose);}
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

        int row = 1;
        int col = 1;
        if(!isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
            if (isEmpty(label5)) {
                if (turnX) {
                    player.drawX(label5, row, col, board);
                    tiles.remove(Integer.valueOf(5));
                    turnX = false;
                    if (isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
                        drawGameOverLine();
                        if(!isTie){endGameMsg(win);}
                        return;
                    }

                    if(aiNum == 0){
                        randomAi.move(label1, label2, label3, label4, label5, label6, label7, label8, label9, tiles, board);
                    }else {
                        defensiveAi.move(label1, label2, label3, label4, label5, label6, label7, label8, label9, tiles, board);
                    }

                    if (isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
                        drawGameOverLine();
                        if(!isTie){endGameMsg(lose);}
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

        int row = 1;
        int col = 2;
        if(!isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
            if (isEmpty(label6)) {
                if (turnX) {
                    player.drawX(label6, row, col, board);
                    tiles.remove(Integer.valueOf(6));
                    turnX = false;
                    if (isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
                        drawGameOverLine();
                        if(!isTie){endGameMsg(win);}
                        return;
                    }

                    if(aiNum == 0){
                        randomAi.move(label1, label2, label3, label4, label5, label6, label7, label8, label9, tiles, board);
                    }else {
                        defensiveAi.move(label1, label2, label3, label4, label5, label6, label7, label8, label9, tiles, board);
                    }

                    if (isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
                        drawGameOverLine();
                        if(!isTie){endGameMsg(lose);}
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

        int row = 2;
        int col = 0;
        if(!isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
            if (isEmpty(label7)) {
                if (turnX) {
                    player.drawX(label7, row, col, board);
                    tiles.remove(Integer.valueOf(7));
                    turnX = false;
                    if (isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
                        drawGameOverLine();
                        if(!isTie){endGameMsg(win);}
                        return;
                    }

                    if(aiNum == 0){
                        randomAi.move(label1, label2, label3, label4, label5, label6, label7, label8, label9, tiles, board);
                    }else {
                        defensiveAi.move(label1, label2, label3, label4, label5, label6, label7, label8, label9, tiles, board);
                    }

                    if (isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
                        drawGameOverLine();
                        if(!isTie){endGameMsg(lose);}
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

        int row = 2;
        int col = 1;
        if(!isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
            if (isEmpty(label8)) {
                if (turnX) {
                    player.drawX(label8, row, col, board);
                    tiles.remove(Integer.valueOf(8));
                    turnX = false;
                    if (isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
                        drawGameOverLine();
                        if(!isTie){endGameMsg(win);}
                        return;
                    }

                    if(aiNum == 0){
                        randomAi.move(label1, label2, label3, label4, label5, label6, label7, label8, label9, tiles, board);
                    }else {
                        defensiveAi.move(label1, label2, label3, label4, label5, label6, label7, label8, label9, tiles, board);
                    }

                    if (isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
                        drawGameOverLine();
                        if(!isTie){endGameMsg(lose);}
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

        int row = 2;
        int col = 2;
        if(!isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
            if (isEmpty(label9)) {
                if (turnX) {
                    player.drawX(label9, row, col, board);
                    tiles.remove(Integer.valueOf(9));
                    turnX = false;
                    if (isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
                        drawGameOverLine();
                        if(!isTie){endGameMsg(win);}
                        return;
                    }

                    if(aiNum == 0){
                        randomAi.move(label1, label2, label3, label4, label5, label6, label7, label8, label9, tiles, board);
                    }else {
                        defensiveAi.move(label1, label2, label3, label4, label5, label6, label7, label8, label9, tiles, board);
                    }

                    if (isGameOver(label1, label2, label3, label4, label5, label6, label7, label8, label9)) {
                        drawGameOverLine();
                        if(!isTie){endGameMsg(lose);}
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
