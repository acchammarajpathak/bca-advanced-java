/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acchamma.Lab3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Adapter  extends KeyAdapter{
    JFrame f;
    JLabel l;
    JTextArea ta;
    Adapter(){
        f= new JFrame("Adapter");
        l = new JLabel();
        ta = new JTextArea();
        l.setBounds(20,100,200,200);
        ta.setBounds(10,100,100,100);
        f.getContentPane().add(l);
        f.getContentPane().add(ta);
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        ta.addKeyListener(this);
        
    }
    public void KeyRealesed(KeyEvent e)
    {
        String text = ta.getText();
        l.setText("total number of character = "+text.length());
    }
   public static void main(String[] args){
       new Adapter();
    }
}
