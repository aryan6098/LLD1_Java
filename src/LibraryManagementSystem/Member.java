package LibraryManagementSystem;

public class Member extends User{

    private static final int MAX_BORROW_LIMIT = 5;
    private int borrowBooksCount;

    public Member(String name, String contactInfo, int borrowBooksCount){
        super(name, contactInfo);
        this.borrowBooksCount = borrowBooksCount;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Member Dashboard");
        System.out.println("Books Bowwowed: "+ borrowBooksCount);
    }

    @Override
    public boolean canBorrowBooks() {
        return borrowBooksCount <= MAX_BORROW_LIMIT;
    }
}
