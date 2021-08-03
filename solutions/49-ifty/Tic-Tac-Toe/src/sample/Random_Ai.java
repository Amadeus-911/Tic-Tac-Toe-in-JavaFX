package sample;

import javafx.scene.control.Label;

import java.util.HashMap;

import static sample.Utility.randomTile;

public class Random_Ai extends AI{

    public void drawO(Label label){
        label.setText("O");
        label.setOpacity(1);
    }

    //Label label1, Label label2, Label label3, Label label4, Label label5,
    //                             Label label6, Label label7, Label label8, Label label9, Line line1, Line line2,Line line3,
    //                             Line line4,Line line5,Line line6,Line line7,Line line8
    public void move(Label label1, Label label2, Label label3, Label label4, Label label5,
                                Label label6, Label label7, Label label8, Label label9){
        Integer tile = randomTile(label1, label2, label3, label4, label5, label6, label7, label8, label9);

        HashMap<Integer,Label> myMap = new HashMap<>();
        myMap.put(1,label1);
        myMap.put(2,label2);
        myMap.put(3,label3);
        myMap.put(4,label4);
        myMap.put(5,label5);
        myMap.put(6,label6);
        myMap.put(7,label7);
        myMap.put(8,label8);
        myMap.put(9,label9);

        Label selectedTile = myMap.get(tile);
        drawO(selectedTile);
    }

}
