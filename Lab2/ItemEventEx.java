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
public class ItemEventEx {
    JFrame f;
    JLabel l;
    JCheckBox c1,c2;
    
    ItemEventEx()
    {
    f= new JFrame("ItemeventEx/Ananda");
    l= new JLabel();
    c1= new JCheckBox("BCA");
    c2= new JCheckBox("B.Sc CSIT");
    l.setBounds(20,110,200,20);
    c1.setBounds(20,70,300,20);
    c2.setBounds(20,90,300,20);
    f.add(l);
    f.add(c1);
    f.add(c2);
    f.setSize(300,300);
    f.setLayout(null);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    c1.addItemListener(new ItemListener(){
    public void itemStateChanged(ItemEvent e){
   if(e.getStateChange()==1){
   l.setText("BCA is Checked");
   }
   else
   {
       l.setText("BCA is unchecked");
   }
    }
    });
    c2.addItemListener(new ItemListener(){
    public void itemStateChanged(ItemEvent e){
        if(e.getStateChange()==1){
   l.setText("B.Ss CSIT is Checked");
   }
   else
   {
       l.setText("B.Ss CSITis unchecked");
   }
    
    }
    });
    }
    public static void main(String[]args){
    new ItemEventEx();
    
    }
    
    
    
    
    
    
    
    }
    

