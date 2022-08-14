package week03.primitivetypes.exam;

import java.util.ArrayList;
import java.util.List;

public class Exam {

    private List<Person> appliedForExam = new ArrayList<>();

    public void addPerson(Person person){
        appliedForExam.add(person);
    }

    public List<Person> getAppliedForExam() {
        return appliedForExam;
    }
}
