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
    private int amount;
    private int max;
    
    public Container() {
        this.amount = 0;
        this.max = 100;
    }
    
    public void addAmount(int amount) {
        if (this.amount + amount <= max && amount > 0) {
            this.amount += amount;
        } else if (this.amount + amount > max && amount > 0) {
            this.amount = max;
        }
    }
    
    public void moveAmount(Container container, int amount) {
        if (this.amount != 0) {
            if (amount <= this.amount) {
                this.removeAmount(amount);
                container.addAmount(amount);
            } else {
                container.addAmount(this.amount);
                this.amount = 0;
            }
        }
    }
    
    public void removeAmount(int amount) {
        if (this.amount - amount >= 0) {
            this.amount -= amount;
        } else {
            this.amount = 0;
        }
    }
    
    @Override
    public String toString() {
        return this.amount + "/" + this.max;
    }
}
