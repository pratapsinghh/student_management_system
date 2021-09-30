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
import java.sql.*;

public class ReadData implements ActionListener {
    JFrame frame;
    JLabel id1,id2,id3,aid1,id9,id;
    JButton b1,b2;
    public ReadData(){
 
        id9=new JLabel();
        id9.setBounds(0,0,500,400);
        id9.setLayout(null);
        
        id=new JLabel("Student Detail");
        id.setBounds(50,5,1000,30);
        id.setFont(new Font("serif",Font.PLAIN,22));
        id9.add(id);
        
        id1 = new JLabel("Name:");
        id1.setBounds(50,120,100,30);
        id1.setFont(new Font("serif",Font.BOLD,20));
        id9.add(id1);

        id2= new JLabel("Mobile :");  
        id2.setBounds(50,150,100,30);
        id2.setFont(new Font("serif",Font.BOLD,20));
        id9.add(id2);

        

        id3= new JLabel("Branch :");
        id3.setBounds(50,180,100,30);
        id3.setFont(new Font("serif",Font.BOLD,20));
        id9.add(id3);

        aid1= new JLabel("Gender :");
        aid1.setBounds(50,210,300,30);
        aid1.setFont(new Font("serif",Font.BOLD,20));
        id9.add(aid1);

        
        b1=new JButton("Print");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.BLUE);
        b1.setBounds(100,300,100,30);
        id9.add(b1);

        b2=new JButton("Back");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.BLUE);
        b2.setBounds(250,300,100,30);
        b2.addActionListener(this);
        id9.add(b2);
        
         frame=new JFrame();
        frame.setBackground(Color.red);
        frame.setLayout(null);
        frame.setSize(new Dimension(700,400));
        frame.setVisible(true);
        frame.add(id9);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        


    }
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource()==b2)
            {
                frame.setVisible(false);
                Detail d=new Detail();
            }
        }
    public static void main(String[] args){
       ReadData r= new ReadData();
    }

    
}
