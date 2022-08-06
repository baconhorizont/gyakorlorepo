package aslist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Favourites {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> favouriteThings = new ArrayList<>();

        System.out.println("kedvenc állat");
        favouriteThings.add(scanner.nextLine());
        System.out.println("kedvenc étel");
        favouriteThings.add(scanner.nextLine());
        System.out.println("kedvenc film");
        favouriteThings.add(scanner.nextLine());

        System.out.println(favouriteThings);
        System.out.println(favouriteThings.size());

    }
}
