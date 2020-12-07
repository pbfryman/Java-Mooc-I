
import java.util.Scanner;

public class Login {

    private static String[] usernames = {"alex", "emma"};
    private static String[] passwords = {"sunshine", "haskell"};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        if (checkPassword(username, password) == true) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }

    }
    
    public static boolean checkPassword(String username, String password) {
        boolean isValid = false;
        
        for (int i = 0; i < usernames.length; i++) {
            if (usernames[i].equals(username) && passwords[i].equals(password)) {
                isValid = true;
                break;
            }
        }
        return isValid;
    }
}
