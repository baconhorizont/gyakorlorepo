package week15.labs.streams;

import java.util.ArrayList;
import java.util.List;

public class CookBook {

    private List<Cake> cakes = new ArrayList<>();

    public CookBook(List<Cake> cakes) {
        this.cakes = cakes;
    }
    public List<String> listCakeNamesWithGivenIngredient(String ingredient){
        return cakes.stream()
                .filter(cake -> cake.getIngredients().contains(ingredient))
                .map(Cake::getName)
                .toList();
    }
    List<String> listCakeNamesWithMaxIngredients(int max){
        return cakes.stream()
                .filter(cake -> cake.getIngredients().size() <= max)
                .map(Cake::getName)
                .toList();
    }
    public List<Cake> getCakes() {
        return cakes;
    }
}
