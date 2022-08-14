package week03.compositionlist.computer;

import java.util.ArrayList;
import java.util.List;

public class PersonalComputer {

    private List<Hardware> hardwares = new ArrayList<>();
    private List<Software> softwares = new ArrayList<>();
    private Cpu cpu;


    public void addHardware(Hardware hardware){
        hardwares.add(hardware);
    }

    public void addSoftware(Software software){
        softwares.add(software);
    }


    @Override
    public String toString() {
        return "Hardwares: " + hardwares + "\n"
                + "Softwares: " + softwares +"\n"
                + "CPU: " + cpu;
    }

    public PersonalComputer(Cpu cpu) {
        this.cpu = cpu;
    }

    public List<Hardware> getHardwares() {
        return hardwares;
    }

    public List<Software> getSoftwares() {
        return softwares;
    }

    public Cpu getCpu() {
        return cpu;
    }

}
