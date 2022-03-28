/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acchamma.Lab4;

import javax.swing.*;
import java.awt.*;
public class shapes extends Canvas {
    public static void main(String[] args){
      JFrame frame = new JFrame("Drawing of shapes");
      Canvas can = new shapes();
      can.setSize(400,600);
      frame.add(can);
      frame.pack();
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void paint(Graphics g){
        g.drawLine(100, 100, 200, 200);
        g.drawRect(30,30,100,50);
        g.drawArc(60, 180, 50, 140, 0, 90);
        g.drawOval(100, 100, 50, 90);
        int [] x = {10,200,10};
        int [] y = {450,450,550};
        g.drawPolygon(x, y, 3);
        
    }
    
}
