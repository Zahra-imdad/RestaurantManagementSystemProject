/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resturantmanagement.model;

import java.util.List;

public class Cart {
    
   private List<CartProducts> cartItems;
   private double totalPrice;

    public Cart(List<CartProducts> cartItems, double totalPrice) {
        this.cartItems = cartItems;
        this.totalPrice = totalPrice;
    }

    public List<CartProducts> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartProducts> cartItems) {
        this.cartItems = cartItems;
    }
    
    public void addItemToCart(CartProducts cartItem) {
        this.cartItems.add(cartItem);
    }

    public double getTotalPrice() {
        totalPrice = 0;
        cartItems.forEach((cartItem) -> {
            totalPrice += cartItem.getPrice();
        });
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    } 
}
