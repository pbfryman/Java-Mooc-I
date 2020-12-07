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

public class Package {
    private final ArrayList<Gift> gifts;
    private int weight;
    
    public Package() {
        this.gifts = new ArrayList<>();
        this.weight = 0;
    }
    
    public void addGift(Gift gift) {
        this.gifts.add(gift);
        this.weight += gift.getWeight();
    }
    
    public int totalWeight() {
        return this.weight;
    }
}
