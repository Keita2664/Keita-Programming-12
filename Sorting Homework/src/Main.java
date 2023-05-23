import java.lang.reflect.Array;
import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayA = {27, 24, 23, 15, 10, 8};
        int[] arrayB = {84, 81, 35, 25, 14, 11, 8, 5, 2};
        ArrayList<Integer> merged = new ArrayList<>();
        int numberOfTrials = arrayA.length + arrayB.length;
        int numberForA = 0;
        int numberForB = 0;

        for (int i = 0; i < numberOfTrials; i++){
            if (numberForA >= arrayA.length){
                for (int j = numberForB; j < arrayB.length; j++){
                    merged.add(arrayB[numberForB]);
                    numberForB++;
                }
                break;
            }
            if (numberForB >= arrayB.length){
                for (int j = numberForA; j < arrayA.length; j++){
                    merged.add(arrayA[numberForA]);
                    numberForA++;
                }
                break;
            }
            if (arrayA[numberForA] > arrayB[numberForB]){
                merged.add(arrayA[numberForA]);
                numberForA++;
            }
            else if (arrayB[numberForB] > arrayA[numberForA]){
                merged.add(arrayB[numberForB]);
                numberForB++;
            }
            else if (arrayA[numberForA] == arrayB[numberForB]){
                merged.add(arrayA[numberForA]);
                merged.add(arrayB[numberForB]);
                numberForA++;
                numberForB++;
            }
        }
        System.out.println(merged);
    }
}