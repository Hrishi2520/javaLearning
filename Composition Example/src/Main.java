import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book java = new Book("EffectiveJ Java", "Joshua Bloch");
        Book go = new Book("Go Programming Language", "Alan A. A. Donovan");
        Book alchemist = new Book("The Alchemist", "Paulo Coelho");
        Book babylon = new Book("The Richest Man in Babylon", "George Samuel Clason\n");

        List<Book> books = new ArrayList<>();
        books.add(java);
        books.add(go);
        books.add(alchemist);
        books.add(babylon);

        Library library = new Library(books);
        List<Book> books1 = library.getBooks();

//        for (Book book: books1) {
//            System.out.println("Title : " + book.title
//                    + " and "
//                    + " Author : " + book.author);
//        }
        System.out.println(library.getBooks());
    }
}