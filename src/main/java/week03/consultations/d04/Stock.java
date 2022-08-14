package week03.consultations.d04;

import java.util.ArrayList;
import java.util.List;

public class Stock {

    private List<Double> numbers ;

    public Stock(List<Double> numbers) {

        this.numbers = numbers;
    }

    public double maxProfit(){
        double stockProfit = 0;
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++ )
            if (numbers.get(j) - numbers.get(i) > stockProfit){
                stockProfit = numbers.get(j) - numbers.get(i);
            }
        }
        return stockProfit;
    }

}
