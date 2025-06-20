package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.border.EmptyBorder;

public class Signup extends JFrame implements ActionListener {

    private final JPanel contentPane;

    JButton create, back, check;
    JTextField tfname, tfusername, tfpassword, tfanswer;
    JComboBox security;

    Signup() {
        setBounds(350, 200, 950, 500);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
//        contentPane.setBackground(Color.ORANGE);
        contentPane.setLayout(null);

//        JPanel p1 = new JPanel();
//        p1.setBackground(Color.CYAN);
//        p1.setBounds(0, 0, 500, 450);
//        p1.setLayout(null);
//        add(p1);
        JLabel head = new JLabel("🙄Signup");
        head.setBounds(50, 30, 150, 40);
        head.setFont(new Font("Times New Roman", Font.BOLD, 30));
        head.setForeground(Color.cyan);
        contentPane.add(head);

        JLabel lblusername = new JLabel("Username :");
        lblusername.setBounds(50, 90, 125, 25);
        lblusername.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 20));
        lblusername.setForeground(Color.BLACK);
        contentPane.add(lblusername);

        tfusername = new JTextField();
        tfusername.setBounds(220, 90, 180, 25);
        tfusername.setFont(new Font("Tahoma", Font.TRUETYPE_FONT, 15));
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        tfusername.setBackground(Color.lightGray);
        contentPane.add(tfusername);

        JLabel lblname = new JLabel("Name :");
        lblname.setBounds(50, 130, 125, 25);
        lblname.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 20));
        lblname.setForeground(Color.BLACK);
        contentPane.add(lblname);

        tfname = new JTextField();
        tfname.setBounds(220, 130, 180, 25);
        tfname.setFont(new Font("Tahoma", Font.TRUETYPE_FONT, 15));
        tfname.setBorder(BorderFactory.createEmptyBorder());
        tfname.setBackground(Color.lightGray);
        contentPane.add(tfname);

        JLabel lblpassword = new JLabel("Password :");
        lblpassword.setBounds(50, 170, 125, 25);
        lblpassword.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 20));
        lblpassword.setForeground(Color.BLACK);
        contentPane.add(lblpassword);

        tfpassword = new JTextField();
        tfpassword.setBounds(220, 170, 180, 25);
        tfpassword.setFont(new Font("Tahoma", Font.TRUETYPE_FONT, 15));
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        tfpassword.setBackground(Color.lightGray);
        contentPane.add(tfpassword);

        JLabel lblsecurity = new JLabel("Security Question :");
        lblsecurity.setBounds(50, 210, 180, 25);
        lblsecurity.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 20));
        lblsecurity.setForeground(Color.BLACK);
        contentPane.add(lblsecurity);

//        security = new Choice();
//        security.add("In what city were you born?");
//        security.add("What is the name of your favorite pet?");
//        security.add("What is your mother's maiden name?");
//        security.add("What high school did you attend?");
//        security.add("What was the name of your elementary school?");
//        security.add("What was the make of your first car?");
//        security.add("What was your favorite food as a child?");
//        security.setBounds(190, 140, 260, 25);
//        p1.add(security);
        security = new JComboBox(new String[]{"In what city were you born?", "What is the name of your favorite pet?",
            "What is your mother's maiden name?", "What high school did you attend?", "What was the name of your elementary school?",
            "What was the make of your first car?", "What was your favorite food as a child?"});
        security.setBounds(220, 210, 270, 25);
        security.setBackground(Color.lightGray);
        security.setBorder(BorderFactory.createEmptyBorder());
        contentPane.add(security);

        JLabel lblanswer = new JLabel("Answer :");
        lblanswer.setBounds(50, 250, 125, 25);
        lblanswer.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 20));
        lblanswer.setForeground(Color.BLACK);
        contentPane.add(lblanswer);

        tfanswer = new JTextField();
        tfanswer.setBounds(220, 250, 180, 25);
        tfanswer.setFont(new Font("Tahoma", Font.TRUETYPE_FONT, 15));
        tfanswer.setBorder(BorderFactory.createEmptyBorder());
        tfanswer.setBackground(Color.lightGray);
        contentPane.add(tfanswer);

        create = new JButton("Create");
        create.addActionListener(this);
        create.setFont(new Font("BENGUIAT", Font.ROMAN_BASELINE, 15));
        create.setBounds(140, 330, 110, 30);
        create.setBackground(Color.BLACK);
        create.setForeground(Color.WHITE);
        contentPane.add(create);
//        p1.add(create);

        back = new JButton("Back");
        back.addActionListener(this);
        back.setFont(new Font("BENGUIAT", Font.ROMAN_BASELINE, 15));
        back.setBounds(270, 330, 110, 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        contentPane.add(back);
//        p1.add(back);

        check = new JButton("check username exists or not");
        check.addActionListener(this);
        check.setFont(new Font("Tahoma", Font.BOLD, 14));
        check.setBounds(410, 90, 210, 23);
        check.setBackground(Color.RED);
        check.setForeground(Color.black);
//        check.setBorder(BorderFactory.createEmptyBorder());
        contentPane.add(check);
//        p1.add(check);

//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/signup.jpg"));
//        Image i2 = i1.getImage().getScaledInstance(460, 450, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel image = new JLabel(i3);
//        image.setBounds(500, 0, 460, 450);
//        contentPane.add(image);
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/signup1.jpg"));
        Image i5 = i4.getImage().getScaledInstance(950, 500, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image1 = new JLabel(i6);
        image1.setBounds(0, 0, 950, 500);
        contentPane.add(image1);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == create) {
            String username = tfusername.getText();
            String name = tfname.getText();
            String password = tfpassword.getText();
            String question = (String) security.getSelectedItem();
            String answer = tfanswer.getText();
            String query = "insert into account values('" + username + "', '" + name + "', '" + password + "', '" + question + "', '" + answer + "')";
            try {
                if (tfusername.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "You have not filled username");
                } else if (tfname.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "You have not filled name");
                } else if (tfpassword.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "You have not filled password");
                } else if (tfanswer.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "You have not filled answer");
                } else {
                    Conn c = new Conn();
                    c.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Account Created Successfully");
                    setVisible(false);
                    new Login();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == check) {
            try {
                String username = tfusername.getText();

                String query = "select * from account where username = '" + username + "'";
                Conn c = new Conn();

                ResultSet rs = c.s.executeQuery(query);
                if (tfusername.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "You have not filled username");
                } else if (rs.next()) {
//                    setVisible(true);
                    JOptionPane.showMessageDialog(null, "(˘･_･˘)this username is already exists");
                } else {
                    JOptionPane.showMessageDialog(null, "👍😊this username is valid");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == back) {
            setVisible(false);
            new Login();
        }

    }

    public static void main(String[] args) {
        new Signup();
    }
}
