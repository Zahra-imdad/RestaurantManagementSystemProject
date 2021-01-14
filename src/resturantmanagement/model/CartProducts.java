/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resturantmanagement.model;

/**
 *
 * @author Microsoft
 */
public class CartProducts {
     private Item item;
    private int qty;
    private double price;

    public CartProducts(Item item, int qty, double price) {
        this.item = item;
        this.qty = qty;
        this.price = price;
    }
    public Item getItem() {
        return item;
    }
    public void setItem(Item item) {
        this.item = item;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
