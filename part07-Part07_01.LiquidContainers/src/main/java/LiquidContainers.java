
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        
        Container first = new Container();
        Container second = new Container();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            switch (command) {
                case "add":
                    first.addAmount(amount);
                    break;
                case "move":
                    first.moveAmount(second, amount);
                    break;
                case "remove":
                    second.removeAmount(amount);
                    break;
            }
        }
    }

}
