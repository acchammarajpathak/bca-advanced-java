/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acchamma.Lab5;
import java.sql.*;

/**
 *
 * @author DELL
 */
public class Db_Update {
    public static void main(String [] args) throws Exception{
//        1.Register Driver
Class.forName("com.mysql.jdbc.Driver");
//2.Creating Connection
Connection con = DriverManager.getConnection("jdbc:mysql://localhost/college","root","");
//3.Create Statement
String sql ="UPDATE student SET Address='Jhapa' WHERE Roll=5";


Statement stmt =con.createStatement();
//Execute query
int row = stmt.executeUpdate(sql);

//5.Getting Result

if (row == 1) {
    System.out.println("success");
}
else
{
System.out.println("Error in Update.");
}


//6.Closing Connection
con.close();
    
}
}