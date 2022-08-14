package week03.introconstructors;

import java.time.LocalDate;

public class CyclingTour {

    private String description;
    private LocalDate startTime;
    private int numberOfPeople;
    private double kms;

    public void registerPreson(int person){
        this.numberOfPeople = numberOfPeople + person;
    }

    public void ride(double km){
        this.kms = kms + km;
    }


    public CyclingTour(String description, LocalDate startTime) {
        this.description = description;
        this.startTime = startTime;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public double getKms() {
        return kms;
    }


    public static void main(String[] args) {
        CyclingTour cyclingTour = new CyclingTour("Balatonkerülés",LocalDate.of(2022,6,11));


        System.out.println(cyclingTour.getDescription());
        System.out.println(cyclingTour.getStartTime());
        System.out.println(cyclingTour.getNumberOfPeople());
        System.out.println(cyclingTour.getKms());

        cyclingTour.registerPreson(8);
        cyclingTour.ride(206);

        System.out.println(cyclingTour.getDescription());
        System.out.println(cyclingTour.getStartTime());
        System.out.println(cyclingTour.getNumberOfPeople());
        System.out.println(cyclingTour.getKms());





    }
}
