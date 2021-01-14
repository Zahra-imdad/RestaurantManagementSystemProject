
package resturantmanagement.model;

import resturantmanagement.Staff.manageEmployees;
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
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Microsoft
 */
public class ManageStaffDetails {
       
     // ===================== ADD NEW STAFF ====================================
    public void create(Staff staff) {
         try {
            FileWriter Writer = new FileWriter("Staff.txt",true);
            Writer.write(" "+staff.getId()+"\t"+staff.getFirstname()+"\t"+staff.getLastname()+"\t"+staff.getAdress()+"\t"+staff.getPhone()+"\t"+staff.getEmail()+"\t"+staff.getCity()+"\t"+staff.getCountry()+"\t"
                +staff.getSalary() );
            Writer.write(System.getProperty("line.separator"));
            Writer.close();
            JOptionPane.showMessageDialog(null,"Success");
            new manageEmployees().setVisible(true);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error");
        }
    }   
    
     // ===================== VIEW ALL STAFF DETAILS ====================================
    public void seeData(JTable jTable1){
       String filePath="C:\\Users\\Microsoft\\Documents\\NetBeansProjects\\ResturantManagement\\Staff.txt";
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
     // ===================== UPDATE DETAILS ====================================
    public void Update(JTable jTable1){
     DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if(jTable1.getSelectedRow()==1){
            model.removeRow(jTable1.getSelectedRow());
            if(jTable1.getRowCount()==0){
                JOptionPane.showMessageDialog(null,"Update Confirmed","Resturant Management System",
                    JOptionPane.OK_OPTION
                );
            }
        }
    }
    
      // ===================== DELETE FIELD ====================================
    public void Delete(JTable jTable1){
     DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if(jTable1.getSelectedRow()==1){
            //if single row is selected then delete
            model.removeRow(jTable1.getSelectedRow());
        }
        else{
            //if table is empty than display this message
            if (jTable1.getRowCount()==0){
                JOptionPane.showMessageDialog(null,"Table is empty");
            }else{
                //if row is not selected
                JOptionPane.showMessageDialog(null,"Select a row to be deleted");
            }
        }
    }
}
