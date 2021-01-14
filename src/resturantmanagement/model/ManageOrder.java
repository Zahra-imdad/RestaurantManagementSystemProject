/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resturantmanagement.model;

import java.util.ArrayList;

/**
 *
 * @author Microsoft
 */
public class ManageOrder {
     private Cart cart;
    
    public ManageOrder() {
        this.cart = new Cart(new ArrayList<>(), 0);
    }
    
    public void addToCart(CartProducts cartItem) {
        this.cart.addItemToCart(cartItem);
    }
    
    public void clearCart() {
        this.cart = new Cart(new ArrayList<>(), 0);
    }
    
    public Cart getCart() {
        return this.cart;
    }
}
