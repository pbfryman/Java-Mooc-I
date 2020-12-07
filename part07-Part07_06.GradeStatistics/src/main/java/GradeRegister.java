/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Blake
 */
import java.util.ArrayList;
public class GradeRegister {
    private ArrayList<Integer> grades;
    
    public GradeRegister() {
        this.grades = new ArrayList<>();
    }
    
    public void add(int grade) {
        this.grades.add(grade);
    }
    
    public void pointAverage() {
        if (grades.isEmpty()) {
            System.out.println("-");
        }
        int sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        System.out.println("Point average (all): " + (double)(sum) / (double)(grades.size())); 
    } 
    
    public void passingPointAverage() {
        int sum = 0;
        int count = 0;
        for (Integer grade : grades) {
            if (grade >= 50) {
                sum += grade;
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + (double)(sum) / (double)(count));
        }
    }
    
    public void passingPercentage() {
        int count = 0;
        for (Integer grade : grades) {
            if (grade >= 50) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Pass percentage: 0.0");
        } else {
            System.out.println("Pass percentage: " + ((double)(count) / (double)(grades.size()) * 100));
        }
    }
    
    public void gradeDistribution() {
        System.out.println("Grade Distribution:");
        int grade = 5;
        while (grade >= 0) {
            System.out.print(grade + ": ");
            for (Integer points : grades) {
                if (pointsToGrade(points) == grade) {
                    printStars();
                }
            }
            System.out.println("");
            grade -= 1;
        }
    }
    
    private void printStars() {
        System.out.print("*");
    }
    
    private int pointsToGrade(int points) {
        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }
        return grade;
    }
}
