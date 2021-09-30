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
import java.awt.event.*;
import javax.swing.*;
public class front_page implements ActionListener {
   JFrame frame;
    ImageIcon image;
    ImageIcon image2;
    JButton button;
    JLabel label, id;
    front_page()
    {
        button =new JButton("click Next");
        button.setBounds(300,380,200,70);
        button.setBackground(Color.black);
        button.setForeground(Color.CYAN);
        button.addActionListener(this);
        image=new ImageIcon("");
        
        JLabel background = new JLabel(" ", image, JLabel.LEFT);
        background.setBounds(80, 10, 1700, 500);

        //label create
        label = new JLabel("Student Management System");
        label.setBounds(20, 0, 1000, 90);
        label.setFont(new Font("serif", Font.PLAIN, 50));
        label.setForeground(Color.blue);

        //frame adding here
        frame = new JFrame("Student Management System");
        frame.setBackground(Color.BLACK);
        frame.setLayout(null);
        frame.setSize(new Dimension(800, 500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(button);
        frame.add(label);
        frame.add(background);
        frame.setVisible(true);

        //set lid of medical
        while (true) {
            label.setVisible(false);
            try {
                Thread.sleep(500);
                label.setForeground(Color.magenta);
            } catch (InterruptedException e) {
            }
            try {
                label.setVisible(true);
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
     public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == button) {
            frame.setVisible(false);
            Detail S = new Detail();
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        front_page s=new front_page();
}
} 
