package week14.day03;

public class Client{
    private final String regNumber;
    private String name;


    public Client(String regNumber) {
        this.regNumber = regNumber;
    }

    public Client(String name, String regNumber) {
        this(regNumber);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getRegNumber() {
        return regNumber;
    }

}
