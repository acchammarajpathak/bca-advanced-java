/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acchamma.Lab2;

import javax.swing.*;
import java.awt.event.*;


/**
 *
 * @author DELL
 */
public class Calculator implements ActionListener{
    JFrame f;
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton b1,b2;
    
    Calculator()
    {
    f= new JFrame("Calculator/Ananda");
    l1= new JLabel("Input Num1");
    l2= new JLabel("Input Num2");
    l3= new JLabel("Result");
    t1= new JTextField(25);
    t2= new JTextField(25);
    t3= new JTextField(25);
    b1= new JButton("sum");
    b2= new JButton("difference");
    
    l1.setBounds(25,50,100,20);
    t1.setBounds(150,50,100,20);
    l2.setBounds(25,100,100,20);
    t2.setBounds(150,100,100,20);
    l3.setBounds(25,200,100,20);
    t3.setBounds(150,200,100,20);
    b1.setBounds(150,150,80,20);
    b2.setBounds(250,150,100,20);
    f.add(l1);
    f.add(l2);
    f.add(l3);
    f.add(t1);
    f.add(t2);
    f.add(t3);
    f.add(b1);
    f.add(b2);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    b1.addActionListener(this);
    b2.addActionListener(this);
    
    }
    public void actionPerformed(ActionEvent e)
    {
    int n1 = Integer.parseInt(t1.getText());
    int n2 = Integer.parseInt(t2.getText());
    if(e.getActionCommand()=="sum"){
        int sum = n1+n2;
         t3.setText(" "+sum);
    }
    if(e.getActionCommand()=="difference"){
        int diff = n1-n2;
         t3.setText(" "+diff);
    }
   
    
    }
    public static void main(String[]args){
        new Calculator(); 
    }
}
    

