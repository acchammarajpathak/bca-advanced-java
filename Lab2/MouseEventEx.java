/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class MouseEventEx implements MouseListener{
    JFrame f;
    JLabel l;
    
    MouseEventEx(){
    f = new JFrame("MouseEvent/Ananda");
    l = new JLabel();
    
    l.setBounds(25,50,200,20);
    f.add(l);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.addMouseListener(this);
    }
    public void mousePressed(MouseEvent e){
    
    l.setText("mouse is pressed.");
    
    }
    public void mouseReleased(MouseEvent e){
    
    l.setText("mouse is released.");
    
    }
    public void mouseEntered(MouseEvent e){
    
    l.setText("mouse is entered.");
    
    }
     public void mouseClicked(MouseEvent e){
    
    l.setText("mouse is clicked.");
    
    }
      public void mouseExited(MouseEvent e){
    
    l.setText("mouse is exited.");
    
    }
    

 public static void main(String[]args){
        new MouseEventEx(); 
    }
}

    
    

