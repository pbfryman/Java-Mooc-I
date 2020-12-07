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

public class Suitcase {
    private final ArrayList<Item> items;
    private final int maxWeight;
    
    public Suitcase(int weight) {
        this.items = new ArrayList<>();
        this.maxWeight = weight;
    }
    
    public void addItem(Item item) {        
        if (maxWeight - (totalWeight() + item.getWeight()) >= 0) {
            items.add(item);
        }
    }
    
    public void printItems() {
        for (Item value : items) {
            System.out.println(value.getName() + " (" + value.getWeight() + " kg)");
        }
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Item value : items) {
            totalWeight += value.getWeight();
        }
        return totalWeight;
    }
    
    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        Item heaviest = items.get(0);
        for (Item value : items) {
            if (value.getWeight() > heaviest.getWeight()) {
                heaviest = value;
            }
        }
        return heaviest;
    }
    
    @Override
    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (" + totalWeight() + " kg)";
        } else if (this.items.size() == 1) {
            return "" + this.items.size() + " item (" + totalWeight() + " kg)";
        }
        return "" + this.items.size() + " items (" + totalWeight() + " kg)";
    }
}
