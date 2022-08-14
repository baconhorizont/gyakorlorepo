package week03.references.dogs;

import java.util.ArrayList;
import java.util.List;

public class Kennel {

    public static void main(String[] args) {
        List<Dog> listOfDogs = new ArrayList<>();

        Dog first = new Dog("Rozi",3,"black");
        Dog second = new Dog("Törpe",1,"brown");
        Dog third = new Dog("Hógolyó",10,"white");
        listOfDogs.add(first);
        listOfDogs.add(second);
        listOfDogs.add(third);

        System.out.println(listOfDogs);
        Dog fourThDog = listOfDogs.get(1);
        fourThDog.setColor("kék");
        System.out.println(listOfDogs);

        System.out.println(listOfDogs.get(1));
        System.out.println(fourThDog);

        Dog fifthDog = new Dog("Karcsi",5,"sand");
        System.out.println(fifthDog);
        fifthDog = listOfDogs.get(1);
        System.out.println(fifthDog);
        listOfDogs.add(fifthDog);
        System.out.println(listOfDogs);

        Dog sixthDog = fourThDog;
        sixthDog.setColor("narancs");

        System.out.println(listOfDogs);

        List<Dog> secondListOfDogs = new ArrayList<>(listOfDogs);

        Dog sevenThDog = fourThDog;
        sevenThDog.setColor("piros");




        System.out.println(secondListOfDogs);


        second.setColor("türkiz");

        System.out.println(secondListOfDogs);
        second = null;
        System.out.println(secondListOfDogs);
        Dog eightThDog = listOfDogs.get(1);
        eightThDog = null;

        System.out.println(secondListOfDogs);

        Dog nineThDog = listOfDogs.get(1);
        nineThDog.setColor("sárga");
        System.out.println(secondListOfDogs);
    }
}
