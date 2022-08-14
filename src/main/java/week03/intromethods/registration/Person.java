package week03.intromethods.registration;

import java.time.LocalDate;

public class Person {

    private String name;
    private LocalDate dateOfBirth;
    private String email;



    @Override
    public String toString() {
        return
                "név: " + name + 
                ", született: " + dateOfBirth +
                ", email: " + email;
    }

    public Person(String name, LocalDate dateOfBirth, String email) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }
}
