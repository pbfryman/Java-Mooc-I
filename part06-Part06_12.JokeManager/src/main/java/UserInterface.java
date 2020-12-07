/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Blake
 */
import java.util.Scanner;

public class UserInterface {
    private JokeManager manager;
    private Scanner scanner;
    
    public UserInterface(JokeManager manager, Scanner scanner) {
        this.manager = manager;
        this.scanner = scanner;
    }
    
    public void start() {
        OUTER:
        while (true) {
            System.out.println("Commands:\n" + "1 - add a joke\n" +
                    "2 - draw a joke\n" + "3 - list jokes\n" + 
                    "X - stop");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    System.out.println("Enter a joke:");
                    String joke = scanner.nextLine();
                    manager.addJoke(joke);
                    break;
                case "2":
                    System.out.println(manager.drawJoke());;
                    break;
                case "3":
                    manager.printJokes();
                    break;
                case "X":
                    break OUTER;
                default:
                    System.out.println("Command not found.");
                    break;
            }
        }
    }
}
