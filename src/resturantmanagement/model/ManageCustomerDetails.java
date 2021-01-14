/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resturantmanagement.model;

import resturantmanagement.Customers.ManageCustomer;
import resturantmanagement.Staff.manageEmployees;
import com.mysql.cj.xdevapi.Table;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Microsoft
 */
public class ManageCustomerDetails {
    
    // ===================== ADD CUSTOMER ====================================
    public void create(Customer customer) {
         
         try{
            FileWriter Writer = new FileWriter("Customers.txt",true);
           Writer.write(" "+customer.getId()+"\t"+customer.getFirstname()+"\t"+customer.getLastname()+"\t"+customer.getAdress()+"\t"+customer.getPhone()+"\t"+customer.getEmail()+"\t"+customer.getCity()+"\t"+customer.getCountry()+"\t"+customer.getOrder()+"\t"+customer.getTax()+"\t"+customer.getSubtotal()+"\t"+customer.getTotal() );
            Writer.write(System.getProperty("line.separator"));
            Writer.close();
            JOptionPane.showMessageDialog(null,"Success");
            
            new ManageCustomer().setVisible(true);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error");
    }
    }
    
    // ===================== VIEW ALL CUSTOMER DETAILS ====================================
    public void seeData(JTable jTable1){
    String filePath="C:\\Users\\Microsoft\\Documents\\NetBeansProjects\\ResturantManagement\\Customers.txt";
    File file = new File(filePath);
        
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            String FirstLine= br.readLine().trim();
            String[] columnsName = FirstLine.split(",");
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.setColumnIdentifiers(columnsName);
            
            Object[] tableLines = br.lines().toArray();
            
            for(int i =0 ; i < tableLines.length; i++){
                String line =tableLines[i].toString().trim();
                String[] dataRow = line.split("\t");
                model.addRow(dataRow);
            
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error");
        }
    }
    
   // ===================== DELETE CUSTOMER ===================================
    public void Delete(JTable jTable1){
     DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
      int i = jTable1.getSelectedRow();
        if(i>0){
            model.removeRow(i);
            JOptionPane.showMessageDialog(null,"Record Deleted");
        }
        else{
            if(i == 0){
                JOptionPane.showMessageDialog(null,"Table is empty");
            }
            else{
                JOptionPane.showMessageDialog(null,"Select a row to be deleted");
            }
        
        }
    }
    // ===================== RESET ALL FIELDS ====================================
    public void Reset(String textcust,String txtcity,String txtcountry,String txtemail,String txtphone,String txtaddress,String txtfirstname,String txtlastname,String txttax, String subtotal, String total,String txtorder){
        textcust="";
        txtcity="";
        txtcountry="";
        txtemail="";
        txtphone="";
        txtaddress="";
        txtfirstname="";
        txtlastname="";
        txttax="";
        txtorder="";
        subtotal="";
        total="";
    }
    
    // ===================== UPDATE FIELD ====================================
    public void Update(JTable jTable1){
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if(jTable1.getSelectedRow()==1){
            model.removeRow(jTable1.getSelectedRow());
            if(jTable1.getRowCount()==0){
                JOptionPane.showMessageDialog(null,"Updated","Resturant Management System",
                    JOptionPane.OK_OPTION
                );
            }
        }
    }
}

