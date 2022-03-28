/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acchamma.Lab3;

import javax.swing.*;
import java.awt.*;
public class borderlayout{
    JFrame f;
    JButton b1,b2,b3,b4,b5;
    
     borderlayout(){
        f = new JFrame("flowlayout");
        b1 = new JButton("b1");
          b2 = new JButton("b2");  
            b3 = new JButton("b3");
            b4 = new JButton("b4");
             b5 = new JButton("b5");
            f.add(b1,BorderLayout.EAST);
            f.add(b2,BorderLayout.WEST);
            f.add(b3,BorderLayout.NORTH);
            f.add(b4,BorderLayout.SOUTH);
            f.add(b5,BorderLayout.CENTER);
            f.setSize(300,300);
            f.setVisible(true);
            f.setLayout(new BorderLayout());
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new borderlayout();
    }
}
