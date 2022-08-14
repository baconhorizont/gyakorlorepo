package week03.compositionlist.computer;

public class Cpu {
    private String model;
    private double clockSignal;

    @Override
    public String toString() {
        return model  + ": " + clockSignal;
    }

    public Cpu(String model, double clockSignal) {
        this.model = model;
        this.clockSignal = clockSignal;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getClockSignal() {
        return clockSignal;
    }

    public void setClockSignal(double clockSignal) {
        this.clockSignal = clockSignal;
    }
}
