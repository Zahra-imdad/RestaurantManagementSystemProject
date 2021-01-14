/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resturantmanagement.model;

import resturantmanagement.Sales.Sales;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Microsoft
 */
public class ManageSales {
      // ===================== GENERATE SALES REPORT ====================================
    public void generateReport(JTable jTable1){
       String filePath="C:\\Users\\Microsoft\\Documents\\NetBeansProjects\\ResturantManagement\\AddProducts.txt";
        File file = new File(filePath);
        
       String path="";
        JFileChooser j = new JFileChooser ();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x = j.showSaveDialog(j);
        
        if(x==JFileChooser.APPROVE_OPTION){
            path = j.getSelectedFile().getPath();
        }
        Document doc = new Document();
        try{
            PdfWriter.getInstance(doc, new FileOutputStream(path+"salesReport.pdf"));
            doc.open();
            PdfPTable tbl;
            tbl = new PdfPTable(3);
            tbl.addCell("PRODUCT ID");
            tbl.addCell("QUANTITY");
            tbl.addCell("TOTAL");
            for(int i =0 ; i < jTable1.getRowCount(); i++){
                String id= jTable1.getValueAt(1, 0).toString();
                String qty= jTable1.getValueAt(1, 1).toString();
                String total= jTable1.getValueAt(1, 2).toString();
                tbl.addCell(id);
                tbl.addCell(qty);
                tbl.addCell(total);
               
            }
            doc.add(tbl);
             JOptionPane.showMessageDialog(null,"PDF REPORT GENERATED");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error");
        }
    }
    
    //=========================GENERATE PAYMENT REPORT=====================================
     public void generatePayment(JTable jTable1){
       String filePath="C:\\Users\\Microsoft\\Documents\\NetBeansProjects\\ResturantManagement\\Payments.txt";
        File file = new File(filePath);
        
       String path="";
        JFileChooser j = new JFileChooser ();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x = j.showSaveDialog(j);
        
        if(x==JFileChooser.APPROVE_OPTION){
            path = j.getSelectedFile().getPath();
        }
        Document doc = new Document();
        try{
            PdfWriter.getInstance(doc, new FileOutputStream(path+"paymentReport.pdf"));
            doc.open();
            PdfPTable tbl;
            tbl = new PdfPTable(3);
            tbl.addCell("ID");
            tbl.addCell("NAME");
            tbl.addCell("TIMMINGS");
            tbl.addCell("DUTY");
            tbl.addCell("SALARY");
            for(int i =0 ; i < jTable1.getRowCount(); i++){
                String id= jTable1.getValueAt(1, 0).toString();
                String name= jTable1.getValueAt(1, 1).toString();
                String timing= jTable1.getValueAt(1, 2).toString();
                String duty= jTable1.getValueAt(1, 3).toString();
                String salary= jTable1.getValueAt(1, 4).toString();
                tbl.addCell(id);
                tbl.addCell(name);
                tbl.addCell(timing);
                tbl.addCell(duty);
                tbl.addCell(salary);
               
            }
            doc.add(tbl);
             JOptionPane.showMessageDialog(null,"PDF REPORT GENERATED");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error");
        }
    }
}
