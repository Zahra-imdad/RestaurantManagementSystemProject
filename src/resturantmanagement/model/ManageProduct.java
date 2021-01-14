/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resturantmanagement.model;

import resturantmanagement.Products.AddProduct;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import resturantmanagement.model.Item;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Microsoft
 */
public class ManageProduct {
  
     public ManageProduct() {
        
    }

     // ===================== VIEW ALL PRODUCTS DETAILS ====================================
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
// ===================== ADD NEW ITEM ====================================
    public void create(Item item) {
        try{
            FileWriter Writer = new FileWriter("AddProducts.txt",true);
            Writer.write("\t"+item.getId()+"\t"+item.getName()+"\t"+item.getCategory()+"\t"+item.getPrice());
            Writer.write(System.getProperty("line.separator"));
            Writer.close();
            JOptionPane.showMessageDialog(null,"Success");
            new AddProduct().setVisible(true);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error");
        }
    }

    // ===================== DELETE AN ITEM ====================================

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
    
}