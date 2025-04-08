import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class ResourceFactory {
    private final Map<Integer, Function<String, BorrowableResource>> registry = new HashMap<>();

    public ResourceFactory() {
        register(1, Book::new);
        register(2, Journal::new);
        register(3, AudioBook::new);
    }

    public void register(int option, Function<String, BorrowableResource> creator) {
        registry.put(option, creator);
    }

    public BorrowableResource create(int option, String title) {
        Function<String, BorrowableResource> creator = registry.get(option);
        if (creator != null) {
            return creator.apply(title);
        }
        return null;
    }

    public void printMenu() {
        System.out.println("1. Book");
        System.out.println("2. Journal");
        System.out.println("3. Audiobook");
    }
}
