import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = null;
        int length = 0;
        int sum = 0;
        int count = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            
            String[] array = input.split(",");
            if (array[0].length() > length) {
                name = array[0];
                length = array[0].length();
            }
            sum += Integer.valueOf(array[1]);
            count++;
        }
        double avg = (double)(sum) / (double)(count);
        
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + avg);
    }
}
