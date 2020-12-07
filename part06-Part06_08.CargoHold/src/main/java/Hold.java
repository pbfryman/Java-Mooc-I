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

public class Hold {
    private final ArrayList<Suitcase> luggage;
    private final int maxWeight;
    
    public Hold(int weight) {
        this.luggage = new ArrayList<>();
        this.maxWeight = weight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        int weight = 0;
        for (Suitcase value : luggage) {
            weight += value.totalWeight();
        }
        
        if ((suitcase.totalWeight() + weight) <= maxWeight) {
            luggage.add(suitcase);
        }
    }
    
    public void printItems() {
        for (Suitcase value : luggage) {
            value.printItems();
        }
    }
    
    @Override
    public String toString() {
        int weight = 0;
        for (Suitcase value : luggage) {
            weight += value.totalWeight();
        }
        return "" + this.luggage.size() + " suitcases (" + weight + " kg)";
    }
}
