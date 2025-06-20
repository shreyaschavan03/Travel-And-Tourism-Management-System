package travel.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;
import java.awt.event.*;

public class ForgotPassword extends JFrame implements ActionListener {

    JPanel contentPane;
    JLabel l1;
    JTextField t1, t2, t3, t4, t5;
    JButton b1, b2, b3;

    public static void main(String[] args) {
        new ForgotPassword().setVisible(true);
    }

    public ForgotPassword() {

        setBounds(400, 200, 800, 500);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
        contentPane.setLayout(null);
        
        JLabel h = new JLabel("🙄Forgot Your Password");
        h.setFont(new Font("Times New Roman", Font.BOLD, 30));
        h.setBounds(75, 30, 400, 40);
        h.setForeground(Color.RED);
        contentPane.add(h);

        l1 = new JLabel("Username :");
        l1.setFont(new Font("Tahoma", Font.BOLD, 19));
        l1.setBounds(75, 120, 150, 30);
        l1.setForeground(Color.orange);
        contentPane.add(l1);

        JLabel l2 = new JLabel("Name :");
        l2.setFont(new Font("Tahoma", Font.BOLD, 19));
        l2.setBounds(75, 160, 150, 30);
        l2.setForeground(Color.orange);
        contentPane.add(l2);

        JLabel l3 = new JLabel("Your Security Question :");
        l3.setFont(new Font("Tahoma", Font.BOLD, 19));
        l3.setBounds(75, 200, 210, 30);
        l3.setForeground(Color.orange);
        contentPane.add(l3);

        JLabel l4 = new JLabel("Answer :");
        l4.setFont(new Font("Tahoma", Font.BOLD, 19));
        l4.setBounds(75, 240, 150, 30);
        l4.setForeground(Color.orange);
        contentPane.add(l4);

        JLabel l5 = new JLabel("Password :");
        l5.setFont(new Font("Tahoma", Font.BOLD, 19));
        l5.setBounds(75, 280, 150, 30);
        l5.setForeground(Color.orange);
        contentPane.add(l5);

        t1 = new JTextField();
        t1.setFont(new Font("Tahoma", Font.BOLD, 15));
        t1.setForeground(Color.black);
        t1.setBounds(290, 123, 141, 23);
        contentPane.add(t1);
        t1.setBorder(BorderFactory.createEmptyBorder());
        t1.setColumns(10);

        t2 = new JTextField();
        t2.setEditable(false);
        t2.setFont(new Font("Tahoma", Font.BOLD, 15));
        t2.setForeground(Color.green);
        t2.setBackground(Color.GRAY);
//        t2.setColumns(10);
        t2.setBounds(290, 162, 141, 23);
        t2.setBorder(BorderFactory.createEmptyBorder());
        contentPane.add(t2);

        t3 = new JTextField();
        t3.setEditable(false);
        t3.setFont(new Font("Tahoma", Font.BOLD, 15));
        t3.setForeground(new Color(72, 61, 200));
        t3.setBackground(Color.GRAY);
//        t3.setColumns(10);
        t3.setBounds(290, 203, 250, 23);
        t3.setBorder(BorderFactory.createEmptyBorder());
        contentPane.add(t3);

        t4 = new JTextField();
        t4.setFont(new Font("Tahoma", Font.BOLD, 15));
        t4.setForeground(Color.black);
        t4.setColumns(10);
        t4.setBounds(290, 243, 141, 23);
        t4.setBorder(BorderFactory.createEmptyBorder());
        contentPane.add(t4);

        t5 = new JTextField();
        t5.setEditable(false);
        t5.setFont(new Font("Tahoma", Font.BOLD, 15));
        t5.setForeground(Color.YELLOW);
        t5.setBackground(Color.GRAY);
        t5.setColumns(10);
        t5.setBounds(290, 283, 141, 23);
        t5.setBorder(BorderFactory.createEmptyBorder());
        contentPane.add(t5);

//        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("icons/forgot.jpg"));
//        Image i1 = c1.getImage().getScaledInstance(700, 450, Image.SCALE_DEFAULT);
//        ImageIcon i2 = new ImageIcon(i1);
//        JLabel l6 = new JLabel(i2);
//        l6.setBounds(0, 0, 700, 450);
//        contentPane.add(l6);
        b1 = new JButton("Search");
        b1.addActionListener(this);
        b1.setFont(new Font("Tahoma", Font.BOLD, 13));
        b1.setBounds(440, 121, 100, 27);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        contentPane.add(b1);

        b2 = new JButton("Retrieve");
        b2.addActionListener(this);
        b2.setFont(new Font("Tahoma", Font.BOLD, 13));
        b2.setBounds(440, 241, 100, 27);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        contentPane.add(b2);

        b3 = new JButton("Back");
        b3.addActionListener(this);
        b3.setFont(new Font("Tahoma", Font.BOLD, 13));
        b3.setBounds(210, 340, 100, 28);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        contentPane.add(b3);

//        JPanel panel = new JPanel();
//        panel.setBounds(47, 45, 508, 281);
//        panel.setBackground(Color.PINK);
//        contentPane.add(panel);
        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("icons/forgot.jpg"));
        Image i1 = c1.getImage().getScaledInstance(800, 500, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        JLabel l6 = new JLabel(i2);
        l6.setBounds(0, 0, 800, 500);
        contentPane.add(l6);
    }
        
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            try {
                String query = "select * from account where username = '" + t1.getText() + "'";
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);

                if (rs.next()) {
                    t2.setText(rs.getString("name"));
                    t3.setText(rs.getString("security"));
                } else if (t1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "You have not filled username");
                            }else {
                    JOptionPane.showMessageDialog(null, "Invalid Username!");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == b2) {
            try {
                String query1 = "select * from account where answer = '" + t4.getText() + "'AND username = '" + t1.getText() + "'";
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query1);

                if (rs.next()) {
                    t5.setText(rs.getString("password"));
                } else if (t4.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "You have not filled answer");
                }else if (t1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "You field first username");
                            }else{
                    JOptionPane.showMessageDialog(null, "Invalid Answer!");
                }
                    
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ae.getSource() == b3) {
            setVisible(false);
            new Login();
        }
    }
}
