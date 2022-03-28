/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acchamma.Lab5;

import java.sql.*;

public class DB_Delete {
    public static void main(String[] args) throws Exception{
    
    Class.forName("com.mysql.jdbc.Driver");
    
    Connection con =DriverManager.getConnection("jdbc:mysql://localhost/College","root","");
    
    String sql= "Delete from student where Address='Patan'";
    Statement stmt = con.createStatement();
    
    int row = stmt.executeUpdate(sql);
    if(row>0){
        System.out.println("Success ");
    
    }
    else{
        System.out.println("Error in delete");
    }
    con.close();
    
    }
    
}
