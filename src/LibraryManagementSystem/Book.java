package LibraryManagementSystem;

public abstract class Book implements Lendable {
    public   String isbn;
    public String title;;
    public String author;
    private boolean isAvailable;

    public Book(String isbn, String  title, String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = false;
    }

    @Override
    public boolean lend(User user) {
        if (isAvailable && user.canBorrowBooks()) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public void returnBook(User user) {
        isAvailable = true;
    }

    @Override
    public boolean isAvailable() {
       return  isAvailable;
    }

    public abstract void displayBookDetails();
}
