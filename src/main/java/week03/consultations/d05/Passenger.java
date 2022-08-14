package week03.consultations.d05;

public class Passenger {

    private String name;
    private String id;
    private int numberOfPackages;

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", numberOfPackages=" + numberOfPackages +
                '}';
    }

    public Passenger(String name, String id, int numberOfPackages) {
        this.name = name;
        this.id = id;
        this.numberOfPackages = numberOfPackages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumberOfPackages() {
        return numberOfPackages;
    }

    public void setNumberOfPackages(int numberOfPackages) {
        this.numberOfPackages = numberOfPackages;
    }
}
