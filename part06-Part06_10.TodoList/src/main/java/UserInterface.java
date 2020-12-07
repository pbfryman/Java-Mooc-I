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
    private final TodoList todoList;
    private final Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scan) {
        this.todoList = list;
        this.scanner = scan;
    }
    
    public void start() {
        OUTER:
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            switch (command) {
                case "stop":
                    break OUTER;
                case "add":
                    System.out.print("To add: ");
                    String add = scanner.nextLine();
                    todoList.add(add);
                    break;
                case "list":
                    todoList.print();
                    break;
                case "remove":
                    System.out.print("Which one is removed? ");
                    int index = Integer.valueOf(scanner.nextLine());
                    todoList.remove(index);
                    break;
                default:
                    System.out.println("Command not found.");
                    break;
            }
        }
    }
}
