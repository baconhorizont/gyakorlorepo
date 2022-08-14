package week03.intromethods.registration;

import java.time.LocalDate;
import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Registration registration = new Registration();

        System.out.println("Vezetéknév:");
        String lastName = scanner.nextLine();
        System.out.println("Keresztnév:");
        String firstName = scanner.nextLine();
        System.out.println("Email:");
        String email = scanner.nextLine();
        System.out.println("Születési év:");
        int yearOfBirth = scanner.nextInt();
        System.out.println("Születési hónap:");
        int monthOfBirth = scanner.nextInt();
        System.out.println("Születési hónap napja:");
        int dayOfBirth = scanner.nextInt();

        String fullName = registration.concateName(lastName,firstName);
        LocalDate dateOfBirth = registration.concateDateOfBirth(yearOfBirth,monthOfBirth,dayOfBirth);

        Person person = new Person(fullName,dateOfBirth,email);

        System.out.println(person.toString());


        //Person person = new Person();

    }

    public String concateName(String lastName, String firstName){
        return lastName + " " + firstName;
    }

    public LocalDate concateDateOfBirth(int year, int month, int day){
        return LocalDate.of(year,month,day);

    }


}
