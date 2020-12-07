
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        int sum = 0;
        int count = 0;
        double avg = 0;
        int even = 0;
        int odd = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give numbers:");
        int number = Integer.valueOf(scanner.nextLine());
        
        while (number != -1) {
            count++;
            sum += number;
            avg = (double)(sum) / (double)(count);
            
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            
            number = Integer.valueOf(scanner.nextLine());
        }
        
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + avg);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

    }
}
