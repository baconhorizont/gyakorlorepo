package week03.compositionlist;

import java.util.ArrayList;
import java.util.List;

public class Books {
    private List<String> books = new ArrayList<>();


    public void addBook(String title)
    {
        books.add(title);
    }

    public List<String> getBooks() {
        return books;
    }

    public void findBookAndSetAuthor(String title, String author){
       int bookNumber = books.indexOf(title);
       if (bookNumber > 0){
           books.set(bookNumber,title + ":" + author);
       }



}
}

