
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        int factorial = 1;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());
        
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        
        System.out.println("Factorial: " + factorial);

    }
}
