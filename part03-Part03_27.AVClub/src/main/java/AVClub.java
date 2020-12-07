
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            String[] array = input.split(" ");
            for (int i = 0; i < array.length; i++) {
                if (input.isEmpty()) {
                    return;
                } else {
                    if (array[i].contains("av")) {
                        System.out.println(array[i]);
                    } else {
                        break;
                    }
                }
            }
        }
    }
}
