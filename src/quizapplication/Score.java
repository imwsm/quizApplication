
package quizapplication;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Score extends JFrame implements ActionListener{
    JButton close,pa;
    Score(String name ,int score){
        setBounds(400,150,755,500);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2=i1.getImage().getScaledInstance(300, 250,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        
        image.setBounds(0, 100, 300, 250);
        add(image);
        
        JLabel heading=new JLabel("Thanks : "+name+" for Participating");
        heading.setBounds(45,30, 700, 30);
        heading.setFont(new Font("Tahoma",Font.PLAIN,30));
        add(heading);
        
        JLabel res=new JLabel("Your Score is: " +score);
        res.setBounds(420,150, 700, 30);
        res.setFont(new Font("Tahoma",Font.PLAIN,30));
        add(res);
        close=new JButton("close");
        close.setBackground(new Color(30,144,255));
        close.setBounds(580,210,100,40);
        close.setForeground(Color.white);
        close.setFont(new Font("Tahoma",Font.BOLD,24));
        close.addActionListener(this);
        add(close);
        pa=new JButton("Play Again");
        pa.setBackground(new Color(30,144,255));
        pa.setBounds(400,210,150,40);
        pa.setForeground(Color.white);
        pa.setFont(new Font("Tahoma",Font.BOLD,20));
        pa.addActionListener(this);
        add(pa);
        
        setVisible(true);
        
    }
    public static void main(String args[]){
      new Score("user",0);   
    }

    @Override
    public  void actionPerformed(ActionEvent ae) {
    try{
        if(ae.getSource()==close)
        setVisible(false);
        else if(ae.getSource()==pa) new Login();
        setVisible(false);
    }   
    catch(Exception e){
        e.printStackTrace();
    }
}
}
