/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acchamma.Lab4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
public class list {
    JFrame f;
    JList list1;
    public list(){
        f = new JFrame("list");
        f.setLayout(new FlowLayout());
        String[]Listcol = {"Red","Green","Blue","Black"};
        Color[]color = {Color.red,Color.green,Color.blue,Color.black};
        list1 = new JList(Listcol);
        list1.setVisibleRowCount(3);
       list1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        f.add(new JScrollPane(list1));
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         list1.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
               f.getContentPane().setBackground(color[list1.getSelectedIndex()]);
            }
         })
                 ;
         }
public static void main(String[]args){
new list();
}
}
