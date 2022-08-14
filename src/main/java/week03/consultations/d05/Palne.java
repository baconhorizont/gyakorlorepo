package week03.consultations.d05;

import java.util.ArrayList;
import java.util.List;

public class Palne {

    private List<Passenger> passengersList = new ArrayList<>();
    private int maxCapatity;

    public boolean addPassenger(Passenger passenger){
        if (passengersList.size() < maxCapatity) {
            passengersList.add(passenger);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Palne{" +
                "passengersList=" + passengersList +
                ", maxCapatity=" + maxCapatity +
                '}';
    }

    public int numberOfPackages(){
        int packagesSum = 0;
        for (int i = 0;i < passengersList.size();i++){
            packagesSum += passengersList.get(i).getNumberOfPackages();
        }
        return packagesSum;
    }

    public Palne(int maxCapatity) {
        this.maxCapatity = maxCapatity;
    }

    public List<Passenger> getPassengers() {
        return passengersList;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengersList = passengers;
    }

    public int getMaxCapatity() {
        return maxCapatity;
    }

    public void setMaxCapatity(int maxCapatity) {
        this.maxCapatity = maxCapatity;
    }
}
