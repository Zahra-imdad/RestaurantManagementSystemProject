/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resturantmanagement.model;

import resturantmanagement.Staff.manageEmployees;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Microsoft
 */
public class ManageOrderDetails {
     // ===================== ADD Product to the Cart ====================================
    public void AddtoCart(Order order) {
        
         try {
            FileWriter Writer = new FileWriter("Sales.txt",true);
            Writer.write("\t"+order.getOrderID()+"\t"+order.getQty()+"\t"+order.getTotal());
            Writer.write(System.getProperty("line.separator"));
            Writer.close();
            JOptionPane.showMessageDialog(null,"Success");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error");
        }
    }   
    // ===================== VIEW ALL ORDER DETAILS ====================================
    public void seeData(JTable jTable1){
       String filePath="C:\\Users\\Microsoft\\Documents\\NetBeansProjects\\ResturantManagement\\AddProducts.txt";
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
}
