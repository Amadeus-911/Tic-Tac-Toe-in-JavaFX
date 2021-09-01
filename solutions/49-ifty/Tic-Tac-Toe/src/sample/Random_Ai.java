package sample;

import javafx.scene.control.Label;

import java.util.HashMap;
import java.util.List;

import static sample.Utility.rand;

public class Random_Ai extends AI{



    public Label randomTile(Label label1, Label label2, Label label3, Label label4, Label label5,
                                   Label label6, Label label7, Label label8, Label label9, List<Integer> tiles) {



        int tile = 0;
        tile = rand(tiles);

        HashMap<Integer, Label> myMap = new HashMap<>();
        myMap.put(1, label1);
        myMap.put(2, label2);
        myMap.put(3, label3);
        myMap.put(4, label4);
        myMap.put(5, label5);
        myMap.put(6, label6);
        myMap.put(7, label7);
        myMap.put(8, label8);
        myMap.put(9, label9);


        Label newTile = myMap.get(tile);
        tiles.remove(Integer.valueOf(tile));
        return newTile;
    }



    public void move(Label label1, Label label2, Label label3, Label label4, Label label5,
                                Label label6, Label label7, Label label8, Label label9, List<Integer> tiles,
                                char[][] board){

        int row, col;
        Label tile = randomTile(label1, label2, label3, label4, label5, label6, label7, label8, label9, tiles);

        if (label1.equals(tile)) {
            row = 0;
            col = 0;
        } else if (label2.equals(tile)) {
            row = 0;
            col = 1;
        } else if (label3.equals(tile)) {
            row = 0;
            col = 2;
        } else if (label4.equals(tile)) {
            row = 1;
            col = 0;
        } else if (label5.equals(tile)) {
            row = 1;
            col = 1;
        } else if (label6.equals(tile)) {
            row = 1;
            col = 2;
        } else if (label7.equals(tile)) {
            row = 2;
            col = 0;
        } else if (label8.equals(tile)) {
            row = 2;
            col = 1;
        } else if (label9.equals(tile)) {
            row = 2;
            col = 2;
        } else {
            row = 0;
            col = 0;
        }

        drawO(tile, row, col, board);
    }

}
