/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resturantmanagement.model;

import java.util.Date;

/**
 *
 * @author Microsoft
 */
public class Customer {
      private String id;
    private String firstname;
    private String lastname;
    private String address;
    private String phone;
    private String email;
    private String city;
    private String country;
    private Date order;
    private double tax;
    private double subtotal;
    private double total;

    public Customer(String id, String firstname, String lastname,String address,String phone, String email, String city,String country,Date order,double tax,double subtotal,double total) {
        this.id = id;
        this.firstname = firstname;
        this.lastname=lastname;
        this.address=address;
        this.phone=phone;
        this.email=email;
        this.city=city;
        this.country=country;
        this.order=order;
        this.tax=tax;
        this.subtotal=subtotal;
        this.total = total;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
     public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
     public String getAdress() {
        return address;
    }

    public void setAdress(String address) {
        this.address = address;
    }

      public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
     public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    
     public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }
    
      public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    public double getTotal() {
        return total;
    }
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    public double getSubtotal() {
        return subtotal;
    }
    public void setTax(double tax) {
        this.tax = tax;
    }
    public double getTax() {
        return tax;
    }
    
    public void setOrder(Date order) {
        this.order = order;
    }
    public Date getOrder() {
        return order;
    }
}
