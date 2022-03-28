/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acchamma.Lab1;
import javax.swing.*;
/**
 *
 * @author DELL
 */
public class LoginForm {
    JFrame f;
    JLabel l1,l2;
    JTextField t1;
    JPasswordField p1;
    JButton b1;
    
    LoginForm()
    {
    f= new JFrame("Login Form/Ananda");
    l1= new JLabel("Username");
    l2= new JLabel("Password");
    t1= new JTextField(25);
    p1= new JPasswordField(25);
    b1= new JButton("Login");
    
    l1.setBounds(25,50,100,20);
    t1.setBounds(150,50,100,20);
    l2.setBounds(25,100,100,20);
    p1.setBounds(150,100,100,20);
    b1.setBounds(150,150,80,20);
    f.add(l1);
    f.add(l2);
      f.add(t1);
    f.add(p1);
    f.add(b1);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    }
    public static void main(String[]args){
        new LoginForm(); 
    }
}
