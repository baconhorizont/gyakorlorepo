package week03.compositionlist.computer;

public class Software {
    private String name;
    private double numberOfVersion;

    @Override
    public String toString() {
        return  name + ": " + numberOfVersion;
    }

    public Software(String name, double numberOfVersion) {
        this.name = name;
        this.numberOfVersion = numberOfVersion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNumberOfVersion() {
        return numberOfVersion;
    }

    public void setNumberOfVersion(double numberOfVersion) {
        this.numberOfVersion = numberOfVersion;
    }
}
