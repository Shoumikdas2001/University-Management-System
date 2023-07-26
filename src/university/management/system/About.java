package university.management.system;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {
    
    About(){
        setSize(700,510);
        setLocation(400,150);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/unilogo.png"));
        Image i2 = i1.getImage().getScaledInstance(661, 280, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(20,-20,661,280);
        add(image);
        /*
        JLabel heading = new JLabel ("<html>University<br/>Management System</html>");
        heading.setBounds(70,20,300,130);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        add(heading);
        */
        
        JLabel topic = new JLabel ("UNIVERSITY MANAGEMENT SYSTEM");
        topic.setBounds(70,270,5000,30);
        topic.setFont(new Font("Tahoma",Font.BOLD,30));
        add(topic);
        
        JLabel name = new JLabel ("Developed by: Shoumik Das");
        name.setBounds(70,320,500,30);
        name.setFont(new Font("Tahoma",Font.BOLD,30));
        add(name);
        
        JLabel rollno = new JLabel ("Roll no: 20CSE127 (14800320024)");
        rollno.setBounds(70,370,500,30);
        rollno.setFont(new Font("Tahoma",Font.PLAIN,30));
        add(rollno);
        
        JLabel contact = new JLabel ("Contact: shoumikdas2001@gmail.com");
        contact.setBounds(70,420,500,30);
        contact.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(contact);
        
        setLayout(null);
        
        setVisible(true);
    }
    
    public static void main(String args[]){
        new About();
    }
}
