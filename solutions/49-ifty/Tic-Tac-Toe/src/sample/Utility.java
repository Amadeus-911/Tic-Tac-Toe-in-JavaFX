package sample;

import javafx.scene.control.Label;

import java.lang.reflect.Array;
import java.util.*;

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
//                String dot = String.valueOf('.');
//                if((isEmpty(label1) && isEmpty(label2) && isEmpty(label3) && isEmpty(label4) && isEmpty(label5) && isEmpty(label6)
//                        &&isEmpty(label7) &&isEmpty(label8) && isEmpty(label9) && !label1.getText().equals(dot)))
                return randomTile(label1, label2, label3, label4, label5, label6, label7, label8, label9);

        }
   }
    public static boolean isGameOver(Label label1, Label label2, Label label3, Label label4, Label label5,
                                     Label label6, Label label7, Label label8, Label label9){

//            winning combos = [1,2,3],[4,5,6],[7,8,9],[1,5,9],[3,5,7],[1,4,7],[2,5,8],[3,6,9]
        String dot = String.valueOf('.');
        boolean condition1 = (label1.getText().equals(label2.getText()) && label2.getText().equals(label3.getText()) && !label1.getText().equals(dot));
        boolean condition2 = (label4.getText().equals(label5.getText()) && label5.getText().equals(label6.getText()) && !label4.getText().equals(dot));
        boolean condition3 = (label7.getText().equals(label8.getText()) && label8.getText().equals(label9.getText()) && !label7.getText().equals(dot));
        boolean condition4 = (label1.getText().equals(label5.getText()) && label5.getText().equals(label9.getText()) && !label1.getText().equals(dot));
        boolean condition5 = (label3.getText().equals(label5.getText()) && label5.getText().equals(label7.getText()) && !label3.getText().equals(dot));
        boolean condition6 = (label1.getText().equals(label4.getText()) && label4.getText().equals(label7.getText()) && !label1.getText().equals(dot));
        boolean condition7 = (label2.getText().equals(label5.getText()) && label5.getText().equals(label8.getText()) && !label2.getText().equals(dot));
        boolean condition8 = (label3.getText().equals(label6.getText()) && label6.getText().equals(label9.getText()) && !label3.getText().equals(dot));

        boolean condition9 = (!isEmpty(label1) && !isEmpty(label2) && !isEmpty(label3) && !isEmpty(label4) && !isEmpty(label5) && !isEmpty(label6)
                               && !isEmpty(label7) && !isEmpty(label8) && !isEmpty(label9) && !label1.getText().equals(dot)) ;

        return condition1 || condition2 || condition3 || condition4 || condition5 || condition6 || condition7 || condition8 ||condition9;
    }

    public static int getCombo(Label label1, Label label2, Label label3, Label label4, Label label5,
                               Label label6, Label label7, Label label8, Label label9){
        String dot = String.valueOf('.');
        boolean condition1 = (label1.getText().equals(label2.getText()) && label2.getText().equals(label3.getText()) && !label1.getText().equals(dot));
        boolean condition2 = (label4.getText().equals(label5.getText()) && label5.getText().equals(label6.getText()) && !label4.getText().equals(dot));
        boolean condition3 = (label7.getText().equals(label8.getText()) && label8.getText().equals(label9.getText()) && !label7.getText().equals(dot));
        boolean condition4 = (label1.getText().equals(label5.getText()) && label5.getText().equals(label9.getText()) && !label1.getText().equals(dot));
        boolean condition5 = (label3.getText().equals(label5.getText()) && label5.getText().equals(label7.getText()) && !label3.getText().equals(dot));
        boolean condition6 = (label1.getText().equals(label4.getText()) && label4.getText().equals(label7.getText()) && !label1.getText().equals(dot));
        boolean condition7 = (label2.getText().equals(label5.getText()) && label5.getText().equals(label8.getText()) && !label2.getText().equals(dot));
        boolean condition8 = (label3.getText().equals(label6.getText()) && label6.getText().equals(label9.getText()) && !label3.getText().equals(dot));

        if(condition1){
            return 1;
        }
        if(condition2){
            return 2;
        }
        if(condition3){
            return 3;
        }
        if(condition4){
            return 4;
        }
        if(condition5){
            return 5;
        }
        if(condition6){
            return 6;
        }
        if(condition7){
            return 7;
        }
        if(condition8){
            return 8;
        }
        return 0;
    }
}
