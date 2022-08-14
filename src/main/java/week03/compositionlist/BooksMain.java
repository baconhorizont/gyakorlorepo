package week03.compositionlist;

import java.util.Scanner;

public class BooksMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);
        Books books = new Books();

        System.out.println("Könyvcímek száma: ");
        int counter = scanner.nextInt();


        for (int i = 0;i < counter;i++){
            System.out.println(i +1 + "." + "könyv címe: ");
            String book = stringScanner.nextLine();
            books.addBook(book);
        }

        System.out.println(books.getBooks());

        books.findBookAndSetAuthor("asd","Bence");

        System.out.println(books.getBooks());
    }



}
