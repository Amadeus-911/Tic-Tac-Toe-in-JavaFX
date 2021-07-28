package sample;

import javafx.scene.control.Label;

import java.util.Random;

public final class Utility {
    public static int rand(){
        Random r = new Random();
        int low = 1;
        int high = 10;
        return r.nextInt(high-low) + low;
    }

    public static boolean isEmpty(Label label){
        String val = label.getText();
        String nan = String.valueOf('.');
        if(val.equals(nan)){
            return true;
        }else{
            return false;
        }
    }

    public static int randomTile(Label label1, Label label2, Label label3, Label label4, Label label5,
                                 Label label6, Label label7, Label label8, Label label9){
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
                return randomTile(label1, label2, label3, label4, label5, label6, label7, label8, label9);

        }
   }
    public static boolean isGameOver(Label label1, Label label2, Label label3, Label label4, Label label5,
                                     Label label6, Label label7, Label label8, Label label9){

//            winning combos = [1,2,3],[4,5,6],[7,8,9],[1,5,9],[3,5,7],[1,4,7],[2,5,8],[3,6,9]

        boolean condition1 = (label1.getText().equals(label2.getText()) && label2.getText().equals(label3.getText()));
        boolean condition2 = (label4.getText().equals(label5.getText()) && label5.getText().equals(label6.getText()));
        boolean condition3 = (label7.getText().equals(label8.getText()) && label8.getText().equals(label9.getText()));
        boolean condition4 = (label1.getText().equals(label5.getText()) && label5.getText().equals(label9.getText()));
        boolean condition5 = (label3.getText().equals(label5.getText()) && label5.getText().equals(label7.getText()));
        boolean condition6 = (label1.getText().equals(label4.getText()) && label4.getText().equals(label7.getText()));
        boolean condition7 = (label2.getText().equals(label5.getText()) && label5.getText().equals(label8.getText()));
        boolean condition8 = (label3.getText().equals(label6.getText()) && label6.getText().equals(label9.getText()));


    }

}
