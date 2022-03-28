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
public class Calculator {
   
    JFrame f;
    JLabel l1,l2;
    JTextField t1,t2;
    JButton b1;
    
    Calculator()
    {
    f= new JFrame("Calculator/Ananda");
    l1= new JLabel("Input Num1");
    l2= new JLabel("Input Num2");
    t1= new JTextField(25);
    t2= new JTextField(25);
    b1= new JButton("Add");
    
    l1.setBounds(25,50,100,20);
    t1.setBounds(150,50,100,20);
    l2.setBounds(25,100,100,20);
    t2.setBounds(150,100,100,20);
    b1.setBounds(150,150,80,20);
    f.add(l1);
    f.add(l2);
      f.add(t1);
    f.add(t2);
    f.add(b1);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    }
    public static void main(String[]args){
        new Calculator(); 
    }
}
    
    

