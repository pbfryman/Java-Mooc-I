/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Blake
 */
public class Container {
    private int liquid;
    private int maxLiquid;
    
    public Container() {
        this.liquid = 0;
        this.maxLiquid = 100;
    }
    
    public int contains() {
        return this.liquid;
    }
    
    public void add(int amount) {
        if (amount > 0) {
            if (this.liquid + amount > this.maxLiquid) {
                this.liquid = this.maxLiquid;
            } else {
                this.liquid += amount;
            }
        }
    }
    
    public void move(Container second, int amount) {
        if (amount > 0) {
            if (this.liquid - amount < 0) {
                second.add(this.liquid);
                this.liquid = 0;
            } else {
                this.liquid -= amount;
                second.add(amount);
            }
        }
    }
    
    public void remove(int amount) {
        if (amount > 0) {
            if (this.liquid - amount < 0) {
                this.liquid = 0;
            } else {
                this.liquid -= amount;
            }
        }
    }
    
    public String toString() {
        return this.liquid + "/" + this.maxLiquid;
    }
}
