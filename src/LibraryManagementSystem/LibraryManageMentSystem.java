package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class LibraryManageMentSystem {

    private final List<Book> bookInventory;
    private final List<User> registerUsers;

    public LibraryManageMentSystem() {
        this.registerUsers = new ArrayList<>();
        this.bookInventory = new ArrayList<>();

    }

    public  void addBook(Book book) {
        this.bookInventory.add(book);
    }

    public void registerUser(User user) {
        this.registerUsers.add(user);
    }
    public void printUserDetails() {
        System.out.println("User Details");
        for(User user : registerUsers) {
            System.out.println("User Name: "+ user.getName());
        }
    }

    public void printBookDetails() {
        System.out.println("Book Details: ");
        for(Book book: bookInventory) {
            System.out.println("Book Title: "+ book.getTitle());
            System.out.println("Book Author: "+ book.getAuthor());
        }
    }

//    public static List<Book> searchBook(String criteria) {
//        List<Book> search =
//    }
}
