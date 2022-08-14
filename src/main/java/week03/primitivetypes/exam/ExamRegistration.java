package week03.primitivetypes.exam;

import java.time.LocalDate;
import java.util.Scanner;

public class ExamRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExamRegistration examRegistration = new ExamRegistration();

        System.out.println("Jelentkező neve:");
        String name = scanner.nextLine();
        System.out.println("Jelentkező születési éve:");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Jelentkező irányítószáma:");
        String postal = scanner.nextLine();
        System.out.println("Jelentkező tanulmányi átlaga:");
        String avarage = scanner.nextLine();

       // System.out.println(name);
        //System.out.println(dateOfBirth);
        //System.out.println(postal);
        //System.out.println(avarage);


        examRegistration.stringToLocalDate(dateOfBirth);
        examRegistration.stringToInt(postal);
        examRegistration.stringToDouble(avarage);


        Exam exam = new Exam();

        exam.addPerson(new Person(name,
                examRegistration.stringToLocalDate(dateOfBirth),
                examRegistration.stringToInt(postal),
                examRegistration.stringToDouble(avarage)));

        System.out.println(exam.getAppliedForExam());
    }

    private int stringToInt(String number){
        return Integer.parseInt(number);
    }
    private double stringToDouble(String number){
        return Double.parseDouble(number);
    }
    private LocalDate stringToLocalDate(String date){
        return LocalDate.parse(date);
    }

}
