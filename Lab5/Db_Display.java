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
public class Db_Display {
    public static void main(String [] args) throws Exception{
//        1.Register Driver
Class.forName("com.mysql.jdbc.Driver");
//2.Creating Connection
Connection con = DriverManager.getConnection("jdbc:mysql://localhost/college","root","");
//3.Create Statement
String sql ="INSERT INTO student(Roll, Name, Address, College) VALUES (29, 'Arjun Queen','Dhangadi','PK')";
String sql1 ="select *  from student where College ='RR'";

Statement stmt =con.createStatement();
//Execute query
int row = stmt.executeUpdate(sql);
ResultSet rs1 = stmt.executeQuery(sql1);
//5.Getting Result

if (row == 1) {
    System.out.println("success");
}


System.out.println("Roll\t Name\t Address\t College");
while(rs1.next()){
System.out.println(rs1.getInt(1)+"\t"+rs1.getString(2)+"\t"+rs1.getString(3)+"\t"+rs1.getString(4)+"\t");
}
//6.Closing Connection
con.close();
    
}
}