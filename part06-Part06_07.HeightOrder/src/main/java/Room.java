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
public class Room {
    private ArrayList<Person> list;
    
    public Room() {
        this.list = new ArrayList<>();
    }
    
    public void add(Person person) {
        list.add(person);
    }
    
    public boolean isEmpty() {
        if (list.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    
    public ArrayList<Person> getPersons() {
        return this.list;
    }
    
    public Person shortest() {
        if (list.isEmpty()) {
            return null;
        }
        
        Person shortest = list.get(0);
        
        for (Person person : list) {
            if (person.getHeight() < shortest.getHeight()) {
                shortest = person;
            }
        }
        return shortest;
    }
    
    public Person take() {
        if (isEmpty()) {
            return null;
        }
        
        Person shortest = shortest();
        list.remove(shortest);
        return shortest;
    }
}
