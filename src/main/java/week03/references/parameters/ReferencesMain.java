package week03.references.parameters;

public class ReferencesMain {

    public static void main(String[] args) {

        Person firstPerson;
        Person secondPerson;

        firstPerson = new Person("Dezső",1992);

        secondPerson = firstPerson;

        secondPerson.setName("Klára");

        System.out.println(firstPerson.getName());
        System.out.println(secondPerson.getName());

        int first;
        int second;

        first = 24;

        second = first;
        second++;

        System.out.println(first);
        System.out.println(second);

        secondPerson = new Person("Kati",1977);
        System.out.println(secondPerson.getName());
    }

}
