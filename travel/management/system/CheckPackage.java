package travel.management.system;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class CheckPackage extends JFrame {

    CheckPackage() {
        setBounds(300, 150, 1000, 600);

        String[] package1 = new String[]{"😊SILVER PACKAGE", "• 6 days and 7 Nights", "• Airport Assistance at Airport", "• Half Day City Tour", "• Daily Buffet", "• Soft Drinks Free", "• Full Day 3 Island Cruise", "• English Speaking Guide", "BOOK NOW", "*SuMMeR SpEcIAL", "Rs 7999/-", "package1.jpg"};
        String[] package2 = new String[]{"😊GOLD PACKAGE", "• 5 days and 6 Nights", "• Toll Free and Entrance Free Tickets", "• Meet and Greet at Airport", "• Welcome drinks on Arrival", "• Night Safari", "• Full Day 3 Island Cruise", "• Cruise with Dinner", "BOOK NOW", "*WiNtER SpEcIAL", "Rs 17999/-", "package2.jpg"};
        String[] package3 = new String[]{"😊DIAMOND PACKAGE", "• 6 days and 5 Nights", "• Return Airfare", "• Free Clubbing, Horse Riding & other Games", "• Hard Drinks Free", "• Daily Buffet", "• Stay in 5 Star Hotel", "• BBQ Dinner", "BOOK NOW", "*WiNtER SpEcIAL", "Rs 24999/-", "package3.jpg"};

        JTabbedPane tab = new JTabbedPane();
        JPanel p1 = createPackage(package1);
        tab.setBackground(Color.black);
        tab.setForeground(Color.magenta);
        tab.addTab("Package 1", null, p1);
        JPanel p2 = createPackage(package2);
        tab.addTab("Package 2", null, p2);
//        ImageIcon i8 = new ImageIcon(ClassLoader.getSystemResource("icons/pack2.jpg"));
//        Image i9 = i8.getImage().getScaledInstance(1000, 600, Image.SCALE_DEFAULT);
//        ImageIcon i10 = new ImageIcon(i9);
//        JLabel l16 = new JLabel(i10);
//        l16.setBounds(0, 0, 1000, 600);
//        p2.add(l16);
        JPanel p3 = createPackage(package3);
        tab.addTab("Package 3", null, p3);

        add(tab);

        setVisible(true);
    }

    public JPanel createPackage(String[] pack) {
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        
        JLabel l1 = new JLabel(pack[0]);
        l1.setBounds(60, 5, 400, 40);
        l1.setForeground(Color.GREEN);
        l1.setFont(new Font("Times New Roman", Font.BOLD, 36));
        p1.add(l1);

        JLabel l2 = new JLabel(pack[1]);
        l2.setBounds(40, 60, 500, 30);
        l2.setForeground(Color.YELLOW);
        l2.setFont(new Font("Tahoma", Font.BOLD, 23));
        p1.add(l2);

        JLabel l3 = new JLabel(pack[2]);
        l3.setBounds(40, 110, 600, 30);
        l3.setForeground(Color.YELLOW);
        l3.setFont(new Font("Tahoma", Font.BOLD, 23));
        p1.add(l3);

        JLabel l4 = new JLabel(pack[3]);
        l4.setBounds(40, 160, 550, 30);
        l4.setForeground(Color.YELLOW);
        l4.setFont(new Font("Tahoma", Font.BOLD, 23));
        p1.add(l4);

        JLabel l5 = new JLabel(pack[4]);
        l5.setBounds(40, 210, 500, 30);
        l5.setForeground(Color.YELLOW);
        l5.setFont(new Font("Tahoma", Font.BOLD, 23));
        p1.add(l5);

        JLabel l6 = new JLabel(pack[5]);
        l6.setBounds(40, 260, 500, 30);
        l6.setForeground(Color.YELLOW);
        l6.setFont(new Font("Tahoma", Font.BOLD, 23));
        p1.add(l6);

        JLabel l7 = new JLabel(pack[6]);
        l7.setBounds(40, 310, 500, 30);
        l7.setForeground(Color.YELLOW);
        l7.setFont(new Font("Tahoma", Font.BOLD, 23));
        p1.add(l7);

        JLabel l8 = new JLabel(pack[7]);
        l8.setBounds(40, 360, 500, 30);
        l8.setForeground(Color.YELLOW);
        l8.setFont(new Font("Tahoma", Font.BOLD, 23));
        p1.add(l8);

        JLabel back = new JLabel(pack[8]);
        back.setBounds(90, 410, 130, 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Tahoma", Font.BOLD, 15));
//        back.addActionListener(this);
        p1.add(back);
        
//        back.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                setVisible(false);
//                BookPackage su = new BookPackage("");
//                su.setVisible(true);
//            }
//        });

        JLabel l9 = new JLabel(pack[9]);
        l9.setBounds(70, 460, 500, 30);
        l9.setForeground(Color.green);
        l9.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 30));
        p1.add(l9);

        JLabel l10 = new JLabel(pack[10]);
        l10.setBounds(580, 400, 500, 45);
        l10.setForeground(Color.cyan);
        l10.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 37));
        p1.add(l10);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/" + pack[11]));
        Image i2 = i1.getImage().getScaledInstance(330, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l20 = new JLabel(i3);
        l20.setBounds(610, 30, 330, 300);
        p1.add(l20);

        ImageIcon i5 = new ImageIcon(ClassLoader.getSystemResource("icons/pack1.jpg"));
        Image i7 = i5.getImage().getScaledInstance(1000, 600, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i7);
        JLabel l15 = new JLabel(i6);
        l15.setBounds(0, 0, 1000, 600);
        p1.add(l15);

        return p1;
    }

    public static void main(String[] args) {
        new CheckPackage();
    }
}
