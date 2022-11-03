package week15.labs.streams;

public class Book {

    private String author;
    private String title;
    private int numberOfPages;

    public Book(String author, String title, int numberOfPages) {
        this.author = author;
        this.title = title;
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getAuthor() {
        return author;
    }
}
