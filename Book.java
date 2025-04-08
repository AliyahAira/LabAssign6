public class Book implements BorrowableResource {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void borrow(String borrower) {
        System.out.println(borrower + " borrowed book: " + title);
    }
}
