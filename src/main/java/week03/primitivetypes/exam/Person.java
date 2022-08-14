package week03.primitivetypes.exam;

import java.time.LocalDate;

public class Person {

    private String name;
    private LocalDate dateOfBirth;
    private int postalCode;
    private double avarageOfMarks;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", postalCode=" + postalCode +
                ", avarageOfMarks=" + avarageOfMarks +
                '}';
    }

    public Person(String name, LocalDate dateOfBirth, int postalCode, double avarageOfMarks) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.postalCode = postalCode;
        this.avarageOfMarks = avarageOfMarks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public double getAvarageOfMarks() {
        return avarageOfMarks;
    }

    public void setAvarageOfMarks(double avarageOfMarks) {
        this.avarageOfMarks = avarageOfMarks;
    }
}
