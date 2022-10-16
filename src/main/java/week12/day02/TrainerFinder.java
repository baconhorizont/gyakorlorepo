package week12.day02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrainerFinder {

    private List<Trainer> trainers = new ArrayList<>();

    public List<Trainer> getTrainers() {
        return trainers;
    }

    public void readFromFile(Path path){
        try {
            List<String> lines = Files.readAllLines(path);
            createTrainers(lines);
        }catch (IOException e){
            throw new IllegalArgumentException("Can not read file");
        }
    }

    private void createTrainers(List<String> lines){
        for (int i = 0; i < lines.size(); i+=4) {
            trainers.add(new Trainer(lines.get(i),lines.get(i+1),lines.get(i+2),Integer.parseInt(lines.get(i+3))));
        }
    }

    public int givenHoursByName(String trainerName){
        int result = 0;
        boolean trainerFound = false;
        for (Trainer actual : trainers) {
            if(actual.getName().equals(trainerName)){
                result += actual.getHourNumber();
                trainerFound = true;
            }
        }
        if (!trainerFound){
            throw new TrainerNotExistException("Trainer don't exist.");
        }
        return result;
    }
}
