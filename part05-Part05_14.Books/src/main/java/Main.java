
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        boolean bookExists = false;

        while (true) {
            System.out.println("Name (empty will stop):");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.println("Publication year:");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            Book book = new Book(name, publicationYear);
            for (int i = 0; i < books.size(); i++) {
                if (books.get(i).equals(book)) {
                    System.out.println("The book is already on the list. Let's not"
                            + " add the same book again.");
                    bookExists = true;
                }
            }
            if (!bookExists) {
                books.add(book);
            }
            
            bookExists = false;

        }
        
        // NB! Don't alter the line below!
        System.out.println("Thank you! Books added: " + books.size());
    }
}
