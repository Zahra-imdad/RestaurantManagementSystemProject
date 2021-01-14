/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resturantmanagement;

import resturantmanagement.Customers.ManageCustomer;
import resturantmanagement.Login.Login;
import resturantmanagement.Payments.ShowPayments;
import resturantmanagement.Products.AddProduct;
import resturantmanagement.Sales.Sales;
import resturantmanagement.Staff.manageEmployees;
import resturantmanagement.dashboard;
import resturantmanagement.order.OrderManagement;
import resturantmanagement.showMenu;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Microsoft
 */
public class ResturantManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
               
                    new Login().setVisible(true);
                
                
            }
        });
        // TODO code application logic here
    }
    
}
