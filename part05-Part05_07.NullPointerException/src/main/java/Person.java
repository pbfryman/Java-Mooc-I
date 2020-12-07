/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Blake
 */
public class Person {
    private String name;
    private int age;
    
    public Person(String name) {
        this.name = name;
        this.age = 0;
    }
    
    public void growOlder() {
        this.age += 1;
    }
    
    public String toString() {
        return this.name + ", age " + this.age + " years";
    }
}
