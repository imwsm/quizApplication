package quizapplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.font.TextAttribute.FONT;
public class Login extends JFrame implements ActionListener{
    JButton rules,Back;
    JTextField tfname ;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image=new JLabel(i1);
        image.setBounds(0, 0, 580, 500);
        add(image);
        JLabel heading =new JLabel("SIMPLE MINDS");
        heading.setBounds(700,60,300,45);
        heading.setFont(new Font("Halvetica",Font.BOLD,40));
        heading.setForeground(Color.blue);
        add(heading);
         JLabel name =new JLabel("Enter Your Name");
        name.setBounds(770,120,300,25);
        name.setFont(new Font("Halvetica",Font.BOLD,20));
        name.setForeground(Color.blue);
        add(name);
        
        tfname=new JTextField();
        tfname.setBounds(720, 180, 300, 29);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tfname);
        
            rules=new JButton("Rules");
        rules.setBounds(740, 240,100, 25);
        rules.setBackground(new Color(30,144,254));
        rules.addActionListener(this);
        add(rules);
        
        Back=new JButton("Back");
        Back.setBounds(880, 240,100, 25);
        Back.setBackground(new Color(30,144,254));
        Back.addActionListener(this);
        add(Back);
        
        setSize(1150,500);
        setLocation(100,150);
        
        setVisible(true);
    }
    
    public void actionPerformed (ActionEvent ae){
        if(ae.getSource()==rules){
            String name=tfname.getText();
                setVisible(false);
                new Rules(name);
        }
        else if(ae.getSource()==Back){
            setVisible(false);
        }
        
    }
public static void main(String args[]){
new Login();   
}
}
