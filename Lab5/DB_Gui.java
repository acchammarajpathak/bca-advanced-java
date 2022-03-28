/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acchamma.Lab5;

import javax.swing.*;
import java.awt.event.*;
import java.math.*;
import java.sql.*;

/**
 *
 * @author DELL
 */
public class DB_Gui implements ActionListener {
    JFrame f;
    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3,t4;
    JButton b1;
    
    DB_Gui()
    {
    f= new JFrame("InsertApp");
    l1= new JLabel("Roll");
    l2= new JLabel("Name");
    l3= new JLabel("Address");
    l4= new JLabel("College");
    
    t1= new JTextField(25);
    t2= new JTextField(25);
    t3= new JTextField(25);
    t4= new JTextField(25);
    
    b1= new JButton("Insert");

    
    l1.setBounds(25,50,100,20);
    t1.setBounds(150,50,100,20);
    l2.setBounds(25,100,100,20);
    t2.setBounds(150,100,100,20);
    l3.setBounds(25,150,100,20);
    t3.setBounds(150,150,100,20);
    l4.setBounds(25,200,100,20);
    t4.setBounds(150,200,100,20);
    b1.setBounds(150,250,100,20);
    
    f.add(l1);
    f.add(l2);
    f.add(l3);
    f.add(l4);
    f.add(t1);
    f.add(t2);
    f.add(t3);
    f.add(t4);
    f.add(b1);
    
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    b1.addActionListener(this);
    
    
    }
    public void actionPerformed(ActionEvent e)
    {
        int n1 =Integer.parseInt(t1.getText());
        String s1 =t2.getText();
         String s2 =t3.getText();
          String s3 =t4.getText();
        if(e.getActionCommand()=="Insert"){
      
            try{
            //        1.Register Driver
Class.forName("com.mysql.jdbc.Driver");
//2.Creating Connection
Connection con = DriverManager.getConnection("jdbc:mysql://localhost/college","root","");
//3.Create Statement
String sql ="INSERT INTO student(Roll, Name, Address, College) VALUES ('"+n1+"','"+s1+"','"+s2+"','"+s3+"')";


Statement stmt =con.createStatement();
//Execute query
int row = stmt.executeUpdate(sql);
JOptionPane.showMessageDialog(f, "Insertion Successful");
con.close();
//5.Getting Result


            }
            catch(Exception ex){
            }




    
    }
    }

    public static void main(String[]args) throws Exception{
        new DB_Gui(); 
    }
    
}