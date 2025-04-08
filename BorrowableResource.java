public interface BorrowableResource {
    String getTitle();
    void borrow(String borrower);
}
