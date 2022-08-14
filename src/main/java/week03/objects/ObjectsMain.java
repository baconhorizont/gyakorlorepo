package week03.objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {

    public static void main(String[] args) {

        new Book();

        System.out.println(new Book());

        Book emptyBook = new Book();
        System.out.println(emptyBook);
        emptyBook = null;
        System.out.println(emptyBook);

        System.out.println((emptyBook == null));

        Book book = new Book();
        Book anotherBook = new Book();

        System.out.println((book == anotherBook));

        book = anotherBook;

        System.out.println(book);
        System.out.println(anotherBook);
        System.out.println(book == anotherBook);


        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = book1;
        Book book5 = book1;
        Book book6 = book3;
        Book book7 = null;
        book4 = book6;
        new Book();
        book5 = new Book();
        book6 = null;
        book5 = book4;
        System.out.println("ellenorzes:");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);
        System.out.println(book5);
        System.out.println(book6);
        System.out.println(book7);


        Book[] books ={book1,book2,book3};
        List<Book> booksList = Arrays.asList(book1,book2,book3);
        List<Book> empty = new ArrayList<>();

        empty.add(book1);
        empty.add(book2);
        empty.add(book3);
        System.out.println(Arrays.toString(books));
        System.out.println(booksList);
        System.out.println(empty);



    }

}
