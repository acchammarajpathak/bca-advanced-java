/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acchamma.Lab2;

import javax.swing.*;
import java.awt.event.*;
import java.math.*;

/**
 *
 * @author DELL
 */
public class Interest implements ActionListener {
    JFrame f;
    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3,t4;
    JButton b1,b2;
    
    Interest()
    {
    f= new JFrame("Interest/Ananda");
    l1= new JLabel("Principle");
    l2= new JLabel("Rate");
    l3= new JLabel("Time");
    l4= new JLabel("Result");
    
    t1= new JTextField(25);
    t2= new JTextField(25);
    t3= new JTextField(25);
    t4= new JTextField(25);
    
    b1= new JButton("SI");
    b2= new JButton("CI");
    
    l1.setBounds(25,50,100,20);
    t1.setBounds(150,50,100,20);
    l2.setBounds(25,100,100,20);
    t2.setBounds(150,100,100,20);
    l3.setBounds(25,150,100,20);
    t3.setBounds(150,150,100,20);
    l4.setBounds(25,250,100,20);
    t4.setBounds(150,250,150,20);
    b1.setBounds(150,200,80,20);
    b2.setBounds(250,200,100,20);
    f.add(l1);
    f.add(l2);
    f.add(l3);
    f.add(l4);
    f.add(t1);
    f.add(t2);
    f.add(t3);
    f.add(t4);
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
    double n1 = Double.parseDouble(t1.getText());
    double n2 = Double.parseDouble(t2.getText());
    double n3 = Double.parseDouble(t3.getText());
    if(e.getActionCommand()=="SI"){
        double SI = n1*n2*n3/100;
         t4.setText(" "+SI);
    }
    if(e.getActionCommand()=="CI"){
        double CI =n1 *(Math.pow((1 + n2 / 100), n3));
         t4.setText(" "+CI);
    }
   
    
    }
    public static void main(String[]args){
        new Interest(); 
    }
    
}
