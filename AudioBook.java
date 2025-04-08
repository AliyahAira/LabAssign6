public class AudioBook implements BorrowableResource {
    private String title;

    public AudioBook(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void borrow(String borrower) {
        System.out.println(borrower + " borrowed audiobook: " + title);
    }
}
