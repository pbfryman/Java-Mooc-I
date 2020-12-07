
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        double avg = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            } else if (number > 0) {
                count++;
                sum += number;
            } else {
                continue;
            }
        }
        
        if (count == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            avg = (((double)(sum)) / ((double)(count)));
            System.out.println(avg);
        }
        
    }
}
