public class Journal implements BorrowableResource {
    private String title;

    public Journal(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void borrow(String borrower) {
        System.out.println(borrower + " borrowed journal: " + title);
    }
}
