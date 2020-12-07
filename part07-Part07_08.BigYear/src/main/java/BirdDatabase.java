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
import java.util.ArrayList;

public class BirdDatabase {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Bird> birds;
    
    public BirdDatabase() {
        this.birds = new ArrayList<>();
    }
    
    public void addBird(Bird bird) {
        this.birds.add(bird);
    }
    
    public void printOne() {
        System.out.print("Bird? ");
        String name = scanner.nextLine();
        if (findBird(name) == false) {
            System.out.println("Not a bird!");
        } else {
            for (Bird bird : birds) {
                if (bird.getName().equals(name)) {
                    System.out.println(bird);
                }
            }
        }
    }
    
    public boolean findBird(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
    
    public void observe() {
        System.out.print("Bird? ");
        String name = scanner.nextLine();
        if (findBird(name) == false) {
            System.out.println("Not a bird!");
        } else {
            for (Bird bird : birds) {
                if (bird.getName().equals(name)) {
                    bird.addObservation();
                }
            }
        }
    }
    
    public void printAll() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }
}
