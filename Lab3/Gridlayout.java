/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acchamma.Lab3;

import javax.swing.*;
import java.awt.*;
public class Gridlayout {
   JFrame f;
    JButton b1,b2,b3,b4,b5,b6;
    
     Gridlayout(){
        f = new JFrame("flowlayout");
        b1 = new JButton("b1");
          b2 = new JButton("b2");  
            b3 = new JButton("b3");
            b4 = new JButton("b4");
             b5 = new JButton("b5");
             b6 = new JButton("b6");
            f.add(b1);
            f.add(b2);
            f.add(b3);
            f.add(b4);
            f.add(b5);
            f.add(b6);
            f.setSize(300,300);
            f.setVisible(true);
           
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             f.setLayout(new GridLayout(20,15));
    }
    public static void main(String[] args){
        new Gridlayout();
    } 
}
