package w02d04;

import com.sun.jdi.event.BreakpointEvent;

import java.sql.SQLOutput;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        List<Integer> numbers = new ArrayList(Arrays.asList(1, 2, 7, 9, 15));

        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(1,2,30,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9));


        System.out.println(main.isArrayListEven(numbers2));


    }


    public boolean isArrayListEven(List<Integer> array){

        int akku = 0;

        for(int i =1;i < array.size();i++) {
            if (array.get(i-1) < array.get(i)) {
                System.out.println(akku);
            }else {
                akku++;
                System.out.println(akku + "false");
            }

        }
        return akku == 0;
    }
}


