/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

/**
 *
 * @author jack
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author jack
 */
public class Detail implements ActionListener{

    JFrame frame;
    JLabel l1,l2;
    JButton b1,b2,b3,b4;

    public Detail(){

        l1 = new JLabel();
        l1.setBounds(0,0,700,500);
        l1.setLayout(null);
        

        l2 = new JLabel("Specific Operation");
        l2.setBounds(30,20,300,40);
        l2.setFont(new Font("serif",Font.BOLD,25));
        l2.setForeground(Color.black);
        l1.add(l2);

        b1=new JButton("Read");
        b1.setBounds(110,80,100,40);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.addActionListener(this);
        l1.add(b1);


        b2=new JButton("Write");
        b2.setBounds(230,80,100,40);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.addActionListener(this);
        l1.add(b2);

        b3=new JButton("Delete");
        b3.setBounds(110,140,100,40);
        b3.setFont(new Font("serif",Font.BOLD,15));
        b3.addActionListener(this);
        l1.add(b3);

        b4=new JButton("Update");
        b4.setBounds(230,140,100,40);
        b4.setFont(new Font("serif",Font.BOLD,15));
        b4.addActionListener(this);
        l1.add(b4);
        

        frame=new JFrame();
        frame.setBackground(Color.red);
        frame.setLayout(null);
        frame.setSize(new Dimension(400,300));
        frame.setVisible(true);
        frame.add(l1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

    }
public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1)
        {
            frame.setVisible(false);
            ReadData rd=new ReadData();
        }
        if(ae.getSource()==b2){
            frame.setVisible(false);
            StudentManagement s=new StudentManagement();
        }
        if(ae.getSource()==b3){
            frame.setVisible(false);
            Delete d=new Delete();
        }
        if(ae.getSource()==b4){
            frame.setVisible(false);
            update_detail ud=new update_detail();
        }
    }
    

    public static void main(String[ ] arg){
        Detail d = new Detail();
    }
}
