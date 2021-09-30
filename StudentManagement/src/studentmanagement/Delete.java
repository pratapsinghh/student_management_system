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
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Delete implements ActionListener{
    JFrame frame;
    JTextField t;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l,l9;
    JButton b,b1,b2,b3;

    Delete(){
        

        l5=new JLabel();
        l5.setBounds(0,0,500,500);
        l5.setLayout(null);
        

        
        l1=new JLabel("Student_Name");
        l1.setBounds(10,50,250,30);
        l1.setForeground(Color.black);
        Font f2 = new Font("serif",Font.BOLD,25); 
        l1.setFont(f2);
        l5.add(l1);

        t=new JTextField();
        t.setBounds(250,50,150,30);
        l5.add(t);


        b=new JButton("Search");
        b.setBounds(200,100,100,30);
        //b.addActionListener(this);
        l5.add(b);

        b3=new JButton("back");
        b3.setBounds(360,100,100,30);   
        //b3.addActionListener(this);
        l5.add(b3);


        l2=new JLabel("Name:"); 
        l2.setBounds(50,150,250,30);
        l2.setForeground(Color.white);
        Font f3 = new Font("serif",Font.BOLD,20); 
        l2.setFont(f3);
        l5.add(l2);

        l6=new JLabel();    
        l6.setBounds(200,150,350,30);
        l6.setForeground(Color.white);
        Font F6=new Font("serif",Font.BOLD,20); 
        l6.setFont(F6);
        l5.add(l6);

        l3=new JLabel("Mobile");
        l3.setBounds(50,200,250,30);
        l3.setForeground(Color.white);
        Font f4 = new Font("serif",Font.BOLD,20); 
        l3.setFont(f4);
        l5.add(l3);


        l7=new JLabel();
        l7.setBounds(200,200,350,30);
        l7.setForeground(Color.white);
        Font F7=new Font("serif",Font.BOLD,20); 
        l7.setFont(F7);
        l5.add(l7);

        l4=new JLabel("Branch");
        l4.setBounds(50,250,250,30);
        l4.setForeground(Color.white);
        Font F5=new Font("serif",Font.BOLD,20); 
        l4.setFont(F5);
        l5.add(l4);

        l8=new JLabel();
        l8.setBounds(200,250,350,30);
        l8.setForeground(Color.white);
        Font f8=new Font("serif",Font.BOLD,20); 
        l8.setFont(f8);
        l5.add(l8);
        
         l=new JLabel("Gender");
        l.setBounds(50,300,250,30);
        l.setForeground(Color.white);
        Font f = new Font("serif",Font.BOLD,20); 
        l.setFont(f);
        l5.add(l);


        l9=new JLabel();
        l9.setBounds(200,300,350,30);
        l9.setForeground(Color.white);
        Font F=new Font("serif",Font.BOLD,20); 
        l9.setFont(F);
        l5.add(l9);

        b1=new JButton("Remove");
        b1.setBounds(120,300,100,30);
        //b1.addActionListener(this);
        l5.add(b1);


        b2=new JButton("back");
        b2.setBounds(300,300,100,30);
        b2.addActionListener(this);
        l5.add(b2);
       

        
        frame=new JFrame();
        frame.setBackground(Color.red);
        frame.setLayout(null);
        frame.setSize(new Dimension(500,300));
        frame.setVisible(true);
        frame.add(l5);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
    @Override
            public void actionPerformed(ActionEvent ae){
                if(ae.getSource()==b2)
                {
                    frame.setVisible(false);
                    Detail d=new Detail();
                }
            }
    public static void main(String[]ar){
        Delete remove = new Delete();
    }
}
