
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            String[] array = input.split(" ");
        
            System.out.println(array[0]);
            if (input.isEmpty()) {
                return;
            }
        }

    }
}
