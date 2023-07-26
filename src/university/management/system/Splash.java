package university.management.system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable {

    Thread t;

    Splash() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/unilogo.png"));
        Image i2 = i1.getImage().getScaledInstance(661, 280, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);

        t = new Thread(this);
        t.start();

        setVisible(true);
        setLocation(380, 250);
        setSize(800, 360);

        getContentPane().setBackground(Color.WHITE);

    }

    public void run() {
        try {
            Thread.sleep(3000);
            setVisible(false);

            //Next Frame
            new Login();
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        new Splash();
    }
}
