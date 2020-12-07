
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            String[] array = input.split(" ");
            
            int index = (array.length - 1);
            System.out.println(array[index]);
            
            if (input.isEmpty()) {
                return;
            }
        }
    }
}
