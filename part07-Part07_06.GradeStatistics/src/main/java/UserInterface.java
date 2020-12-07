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
    private GradeRegister register;
    private Scanner scanner;
    
    public UserInterface(GradeRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }
    
    public void start() {
        readPoints();
        register.pointAverage();
        register.passingPointAverage();
        register.passingPercentage();
        register.gradeDistribution();
    }
    
    public void readPoints() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int points = Integer.valueOf(scanner.nextLine());
            if (points == -1) {
                break;
            }
            if (points < 0 || points > 100) {
                continue;
            }
        this.register.add(points);
        }
    }
}
