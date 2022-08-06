package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Freezer {

    public static void main(String[] args) {

        List<String> frigo = new ArrayList<>();

        frigo.add("vaj");
        frigo.add("tej");
        frigo.add("csirkefarhát");
        frigo.add("zsír");
        frigo.add("sör");

        System.out.println(frigo);
        System.out.println(frigo.size());

        frigo.remove("vaj");
        frigo.remove("sör");
        frigo.remove(1);

        System.out.println(frigo);
        System.out.println(frigo.size());



    }

}
