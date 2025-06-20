package travel.management.system;

import java.awt.*;
import javax.swing.*;
import java.sql.*;

public class Loading extends JFrame implements Runnable {

    JPanel contentPane;
    JProgressBar bar;
    String username;
    Connection conn;
    Thread th;

    public static void main(String[] args) {
        new Loading("");
    }

    public void setUploading() {
        setVisible(true);
        th.start();
    }

    public void run() {
        try {
            for (int i = 1; i <= 101; i++) {
                int max = bar.getMaximum();
                int value = bar.getValue();
                if (value < max) {
                    bar.setValue(bar.getValue() + 1);}
                 else {
                    setVisible(false);
                    new Dashboard(username);
                }
                Thread.sleep(10);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    Loading(String username) {
        this.username = username;
        th = new Thread((Runnable)this);

        setBounds(280, 150, 1000, 650);
        contentPane = new JPanel();
        contentPane.setBackground(Color.BLUE);
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        

        JLabel lbllibraryManagement = new JLabel("Travel and Toursim Application");
        lbllibraryManagement.setForeground(Color.magenta);
        lbllibraryManagement.setFont(new Font("Times New Roman", Font.BOLD, 40));
        lbllibraryManagement.setBounds(250, 46, 700, 45);
        contentPane.add(lbllibraryManagement);

        bar = new JProgressBar();
        bar.setFont(new Font("Times New Roman", Font.BOLD, 18));
        bar.setStringPainted(true);
        bar.setBounds(320, 115, 350, 30);
        bar.setBackground(Color.PINK);
        bar.setForeground(Color.BLACK);
        contentPane.add(bar);

        JLabel lblNewLabel_2 = new JLabel("Please Wait....");
        lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 23));
        lblNewLabel_2.setForeground(Color.RED);
        lblNewLabel_2.setBounds(400, 165, 150, 30);
        contentPane.add(lblNewLabel_2);
        
//        JPanel panel = new JPanel();
//        panel.setBackground(Color.GREEN);
//        panel.setBounds(20, 20, 960, 610);
//        add(panel);
        
        JLabel lblusername = new JLabel("Welcome " + username);
        lblusername.setFont(new Font("Times New Roaman", Font.BOLD, 35));
        lblusername.setForeground(Color.magenta);
        lblusername.setBounds(70, 550, 400, 50);
        contentPane.add(lblusername);

        
        
        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("icons/trees.jpg"));
        Image i1 = c1.getImage().getScaledInstance(960, 610, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        JLabel l6 = new JLabel(i2);
        l6.setBounds(20, 20, 960, 610);
        add(l6);

        setUndecorated(true);
        setUploading();
    }
}
