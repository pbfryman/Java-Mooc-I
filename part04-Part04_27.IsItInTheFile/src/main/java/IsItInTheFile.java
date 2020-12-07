
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        boolean found = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        try (Scanner fileScan = new Scanner(Paths.get(file))) {
            while (fileScan.hasNextLine()) {
                String row = fileScan.nextLine();
                if (row.contains(searchedFor)) {
                    System.out.println("Found!");
                    found = true;
                }
            }
            if (found == false) {
                System.out.println("Not found.");
            }
        } catch (Exception e) {
            System.out.println("Reading the file" + file + " failed.");
        }
    }
}
