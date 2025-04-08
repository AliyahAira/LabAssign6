public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void borrowResource(BorrowableResource resource) {
        resource.borrow(this.name);
    }
}
