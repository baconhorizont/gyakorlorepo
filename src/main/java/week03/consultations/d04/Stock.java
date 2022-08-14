package week03.consultations.d04;

import java.util.ArrayList;
import java.util.List;

public class Stock {

    private List<Double> numbers = new ArrayList<>();

    public Stock(List<Double> numbers) {
        this.numbers = numbers;
    }

    public double maxProfit(){
        double stockProfit = 0;
        for (int i =1;i < numbers.size();i++){
            if (numbers.get(i-1) < numbers.get(i)){
                stockProfit = numbers.get(i);
            }
        }

        return stockProfit;

    }

}
