package acchamma.Lab2;
import javax.swing.*;
import java.awt.event.*;
        
        

public class KeyExample implements KeyListener{
 JFrame f;
 JLabel l;
 JTextArea t1;


KeyExample()
{
f = new JFrame("Key Example/Ananda");
l = new JLabel();
t1 = new JTextArea (10,20);
l.setBounds (20,50,100,20);
t1.setBounds (20,100,100,100);
f.add(l); f.add(t1);
f.setSize(300,300);
f.setLayout(null);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
t1.addKeyListener (this);
} 
public void keyPressed (KeyEvent e)
{
l.setText ("Key Pressed");
}
public void keyReleased (KeyEvent e)
{
l.setText ("Key Released");
}
public void keyTyped (KeyEvent e)
{
l.setText ("Key Typed");
}
public static void main(String[] args)
{
new KeyExample();
}
}
