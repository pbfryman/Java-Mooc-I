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
    Scanner scanner = new Scanner(System.in);
    BirdDatabase birds = new BirdDatabase();
    
    public UserInterface(Scanner scanner, BirdDatabase birds) {
        this.scanner = scanner;
        this.birds = birds;
    }
    
    public void start() {
        loop : while (true) {
            String command = getCommand();
            switch (command) {
                case "add":
                    add();
                    break;
                case "observation":
                    birds.observe();
                    break;
                case "all":
                    birds.printAll();
                    break;
                case "one":
                    birds.printOne();
                    break;
                case "quit":
                    break loop;
            }
        }
    }
    
    private String getCommand() {
        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine().toLowerCase();
            if (command.equals("add") || command.equals("observation") || command.equals("all") ||
                    command.equals("one") || command.equals("quit")) {
                return command;
            } else {
                System.out.println("Invalid command.");
            }
        }
    }
    
    private void add() {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Name in Latin: ");
        String latin = scanner.nextLine();
        
        birds.addBird(new Bird(name, latin));
    }
}
