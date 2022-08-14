package week03.consultations.d05;

import java.util.List;

public class AirportMain {
    public static void main(String[] args) {
        Palne palne1 = new Palne(20);

        Passenger passenger1 = new Passenger("Bence","ASDFG",10);
        Passenger passenger2 = new Passenger("Dezső","asdadfdsf",5);
        Passenger passenger3 = new Passenger("Dezső","asdadfdsf",5);
        Passenger passenger4 = new Passenger("Dezső","asdadfdsf",5);

        System.out.println(palne1.addPassenger(passenger1));
        System.out.println(palne1.addPassenger(passenger2));
        System.out.println(palne1.addPassenger(passenger3));
        System.out.println(palne1.addPassenger(passenger4));
        System.out.println(palne1.getPassengers());

    }
}
