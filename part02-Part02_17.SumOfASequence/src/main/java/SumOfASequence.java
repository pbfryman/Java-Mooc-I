
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Last number?");
        int number = Integer.valueOf(scanner.nextLine());
        
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        
        System.out.println("The sum is " + sum);

    }
}
