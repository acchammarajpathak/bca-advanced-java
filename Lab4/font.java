/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acchamma.Lab4;

import javax.swing.*;
import java.awt.*;
public class font extends Canvas {
    public static void main(String[]args){
        JFrame f= new JFrame("color and font");
        Canvas can = new font();
        can.setSize(300,300);
        f.add(can);
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    public void paint(Graphics g){
        
       Font font = new Font("monospace",Font.BOLD|Font.ITALIC,20 );
       g.setFont(font);
       g.setColor(Color.red);
       g.drawString("this java class", 50, 100);
        
    }
    
}
