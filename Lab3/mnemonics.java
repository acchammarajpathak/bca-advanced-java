/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acchamma.Lab3;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class mnemonics {
    JFrame f;
    JMenuBar mb;
    JMenu m1;
    JMenuItem i1,i2;   

mnemonics(){
f = new JFrame("mnemonics");
mb = new JMenuBar();
m1 = new JMenu("file");
f.setJMenuBar(mb);
mb.add(m1);
i1 = new JMenuItem("new",KeyEvent.VK_N);
i2 = new JMenuItem("Open");
i2.setMnemonic(KeyEvent.VK_0);
m1.add(i1);
m1.add(i2);
f.setSize(300,300);
f.setVisible(true);
f.setLayout(null);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


i1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,KeyEvent.CTRL_DOWN_MASK));
i2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_0,KeyEvent.ALT_DOWN_MASK));
i1.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(f, "new menu item");
    }
});
i2.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(f, "open menu item");
    }
});
        }
public static void main(String[]args){
  new mnemonics();  
}
}