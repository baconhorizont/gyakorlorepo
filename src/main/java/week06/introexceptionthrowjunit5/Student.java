package week06.introexceptionthrowjunit5;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private List<Integer> notes = new ArrayList<>();


    public void addNote(int note){

        if (note < 1 || note > 5){
            throw new IllegalArgumentException("A jegy 1 és 5 között lehet.");
        }

        notes.add(note);
    }

    public List<Integer> getNotes() {
        return notes;
    }
}
