package week03.compositionlist.computer;

import java.util.ArrayList;

public class PersonalComputerMain {

    public static void main(String[] args) {

PersonalComputer computerOne = new PersonalComputer(new Cpu("AMD Ryzen",4.4));

        computerOne.addHardware(new Hardware("GPU","R3080"));
        computerOne.addHardware(new Hardware("RAM","32Gb"));
        computerOne.addSoftware(new Software("Creo",8.0));
        computerOne.addSoftware(new Software("DOOM",2.1));

        System.out.println(computerOne);
    }
}
