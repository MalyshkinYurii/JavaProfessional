package homework1.task3;

import java.util.ArrayList;
import java.util.Collections;

public class SortingTheOddWay {

    public static Double[] sortItOut(Double[] array) {
        ArrayList<Double> oddNumber = new ArrayList<Double>(0);
        ArrayList<Double> evenNumber = new ArrayList<Double>(0);
        for (int i = 0; i < array.length; i++) {
            Double val = array[i];
            if (val % 2 != 0) {
                oddNumber.add(val);
            } else {
                evenNumber.add(val);
            }
        }
        Collections.sort(oddNumber);
        Collections.sort(evenNumber, Collections.reverseOrder());

        oddNumber.addAll(evenNumber);
        Double[] finalArray = oddNumber.toArray(new Double[oddNumber.size()]);


        return finalArray;
    }


}

