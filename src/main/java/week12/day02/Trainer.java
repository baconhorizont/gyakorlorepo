package week12.day02;

public class Trainer {

    private String name;
    private String subject;
    private String className;
    private int hourNumber;

    public Trainer(String name, String subject, String className, int hourNumber) {
        this.name = name;
        this.subject = subject;
        this.className = className;
        this.hourNumber = hourNumber;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public String getClassName() {
        return className;
    }

    public int getHourNumber() {
        return hourNumber;
    }
}
