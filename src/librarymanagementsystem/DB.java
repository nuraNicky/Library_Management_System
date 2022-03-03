/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class DB {
//   private static Connection c;
//   public static void CreateMyConnection() throws Exception {
//       Class.forName("com.mysql.jdbc.Driver");
//       c=DriverManager.getConnection("jdbc:mysql://localhost:3306/Library","root","");
//   }
//   
//   /**public static void idu(String sql) throws Exception{
//   if(c==null){
//   CreateMyConnection();
//   }
//   c.createStatement().executeUpdate(sql);
//   }*/
//  
//   public static void pst(String sql){
//    
//       if(c==null){
//           try {
//               CreateMyConnection();
//           } catch (Exception ex) {
//               Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
//           }
//       }
//
//       try {
//           c.createStatement().executeQuery(sql);
//       } catch (SQLException ex) {
//           Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
//       }
//   }
//   
//   public static ResultSet search(String sql) throws Exception{
//    
//       if(c==null){
//           CreateMyConnection();
//       }
//
//       return  c.createStatement().executeQuery(sql);
//   }
//   
  
    private static Connection c;

    public static void CreateMyConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Library", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void idu(String sql) throws Exception {
        if (c == null) {
            CreateMyConnection();
        }
        c.createStatement().executeUpdate(sql);
    }

    public static ResultSet search(String sql) throws Exception {

        if (c == null) {
            CreateMyConnection();
        }
        return c.createStatement().executeQuery(sql);
    }

 
}
