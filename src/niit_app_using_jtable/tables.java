/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package niit_app_using_jtable;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class tables {
     public static void main(String[] args)
    {
        Connection con = null;
        Statement st = null;
     try
     {
         //code to automatically create tables in mysql workbench database
      con=(Connection) ConnectionProvider.getCon();
      st = con.createStatement();
      st.executeUpdate("create table studentTable(studentId int NOT NULL auto_increment,firstName varchar(50),lastName varchar(200),courseOfStudy varchar(20),amountPaid int(20),email varchar(20),gender varchar(20), primary key(studentId))");
     
      
      JOptionPane.showMessageDialog(null, "Table Created Successfully");
     
     }
     catch(Exception e)
     {
         JOptionPane.showMessageDialog(null, e);
     }
     
         finally
     {
      try
     {
         con.close();
         st.close();
     
     }
     catch(Exception e)
     {}
     }
     
    
    }
    
    
}
