package travel.management.system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable {

    Thread thread;

    Splash() {
//        setSize(1200,700);
//        setLocation(200,100);

        JLabel name = new JLabel("WELCOME!!");
        name.setForeground(Color.YELLOW);
        name.setFont(new Font("Tahoma", Font.BOLD, 25));
        name.setBounds(600, 0, 700, 35);
        add(name);

        JLabel welcome = new JLabel("Travel and Toursim Application");
        welcome.setForeground(Color.ORANGE);
        welcome.setFont(new Font("Tahoma", Font.BOLD, 40));
        welcome.setBounds(350, 40, 700, 50);
        add(welcome);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/splash1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1920, 1278, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);

        setVisible(true);
        thread = new Thread(this);
        thread.start();
    }

    public void run() {
        try {
            Thread.sleep(1700);
            setVisible(false);
            Login l = new Login();
            l.setVisible(true);
        } catch (Exception e) {

        }
    }

    public static void main(String[] args) {
        Splash frame = new Splash();

        int x = 1;
        for (int i = 1; i <= 600; x += 7, i += 6) {
            frame.setLocation(750 - (x + i) / 2, 400 - (i / 2));
            frame.setSize(x + i + 50, i + 150);
            try {
                Thread.sleep(5);
            } catch (Exception e) {
            }
        }
    }
}
