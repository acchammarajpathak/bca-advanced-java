/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acchamma.Lab4;

import javax.swing.*;

public class tableex {
    JFrame f;
    JTable tb;
    JScrollPane js;
    tableex(){
        f = new JFrame("table");
        String data[][]= {{"01","ram","670000"},
            {"02","sita","89000"},
            {"03","hari","90000"}};
        String column [] = {"ID","Name","Salary"};
        tb = new JTable(data,column);
        js = new JScrollPane(tb);
        f.add(js);
        f.setVisible(true);
        f.setSize(300,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public static void main(String[]args){
        new tableex();
    }
}
