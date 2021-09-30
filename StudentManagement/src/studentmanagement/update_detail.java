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
public class update_detail implements ActionListener{
      JFrame frame;
      JLabel id,id1,id2,id3,id4,id15;
      JTextField t,t1,t2,t3,t4;
      JButton b,b1,b2,b3;
    public update_detail()
    {
        //super(0);
        id15=new JLabel();
        id15.setBounds(0,0,900,700);
        id15.setLayout(null);
        

        id = new JLabel("Update Detail");
        id.setBounds(320,30,500,50);
        id.setFont(new Font("serif",Font.ITALIC,25));
        id.setForeground(Color.black);
        id15.add(id);
        

 
        id1 = new JLabel("Name");
        id1.setBounds(50,150,100,30);
        id1.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id1);

        t1=new JTextField();
        t1.setBounds(150,150,150,30);
        id15.add(t1);

        id2 = new JLabel("Branch");
        id2.setBounds(50,200,200,30);
        id2.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id2);

        t2=new JTextField();
        t2.setBounds(150,200,150,30);
        id15.add(t2);

        id3= new JLabel("Phone");
        id3.setBounds(50,250,100,30);
        id3.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id3);

        t3=new JTextField();
        t3.setBounds(150,250,150,30);
        id15.add(t3);
        
        id4= new JLabel("Gender");
        id4.setBounds(50,300,100,30);
        id4.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id4);

        t4=new JTextField();
        t4.setBounds(150,300,150,30);
        id15.add(t4);
        
        b = new JButton("update");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.blue);
        b.setBounds(250,450,150,40);
        
        id15.add(b);

        b1=new JButton("Back");   
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.blue);
        b1.setBounds(450,450,150,40);
        b1.addActionListener(this);
        id15.add(b1);
        
        frame=new JFrame();
        frame.setBackground(Color.red);
        frame.setLayout(null);
        frame.setSize(new Dimension(700,600));
        frame.setVisible(true);
        frame.add(id15);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
      @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1)
        {
            frame.setVisible(false);
            Detail d=new Detail();
        }
    }
    public static void main(String[] args)
    {
        update_detail u=new update_detail();
    }
    
}
