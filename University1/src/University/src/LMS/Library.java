package University.src.LMS;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;

public class Library {
    private ArrayList<Book> books = new ArrayList();
    private ArrayList<LibraryMember> members = new ArrayList();

    public Library() {
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void addMember(LibraryMember member) {
        this.members.add(member);
    }

    public void borrowBook(String isbn, String memberId) {
        Iterator var3 = this.books.iterator();

        Book book;
        do {
            if (!var3.hasNext()) {
                System.out.println("Book not found in library.");
                return;
            }

            book = (Book)var3.next();
        } while(!book.getIsbn().equals(isbn));

        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println("Book borrowed successfully by member ID: " + memberId);
        } else {
            System.out.println("Book is currently not available.");
        }

    }

    public void returnBook(String isbn) {
        Iterator var2 = this.books.iterator();

        Book book;
        do {
            if (!var2.hasNext()) {
                System.out.println("Book not found in library.");
                return;
            }

            book = (Book)var2.next();
        } while(!book.getIsbn().equals(isbn));

        if (!book.isAvailable()) {
            book.setAvailable(true);
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("This book was not borrowed.");
        }

    }

    public void listAvailableBooks() {
        System.out.println("Available books in the library:");
        Iterator var1 = this.books.iterator();

        while(var1.hasNext()) {
            Book book = (Book)var1.next();
            if (book.isAvailable()) {
                PrintStream var10000 = System.out;
                String var10001 = book.getTitle();
                var10000.println(var10001 + " by " + book.getAuthor() + " (ISBN: " + book.getIsbn() + ")");
            }
        }

    }
}
