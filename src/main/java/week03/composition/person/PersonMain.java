package week03.composition.person;

public class PersonMain {

    public static void main(String[] args) {
        Person person = new Person("Dezső","123456SA");

        System.out.println(person.toString());

        person.moveTo(new Address("USA","San Francisco","Baker avenue, 12","123"));

        System.out.println(person.toString());

        person.getAddress().setStreetAndNumber("John Doe avenue, 35");
        person.getAddress().setZipCode("455");

        System.out.println(person.toString());

        person.correctData("Fero","65433JK");

        System.out.println(person.toString());

    }
}
