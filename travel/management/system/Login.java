package travel.management.system;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    private final JPanel contentPane;
    JButton login, signup, password;
    JTextField tfusername;
    JTextField tfpassword;

    Login() {
        setBounds(290, 100, 1000, 700);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
        contentPane.setLayout(null);

//        getContentPane().setBackground(Color.orange);
        JPanel p1 = new JPanel();
        p1.setBounds(0, 0, 1000, 700);
        p1.setLayout(null);
        add(p1);

//        JPanel p1 = new JPanel();
//        p1.setBackground(Color.CYAN);
//        p1.setBounds(0, 0, 400, 400);
//        p1.setLayout(null);
//        add(p1);
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
//        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel image = new JLabel(i3);
//        image.setBounds(100, 90, 200, 200);
//        contentPane.add(image);
//        JPanel p2 = new JPanel();
//        p2.setLayout(null);
//        p2.setBounds(400, 30, 450, 300);
//        add(p2);
        JLabel title = new JLabel("Login Travel Application");
        title.setBounds(260, 0, 700, 200);
        title.setFont(new Font("Times New Roman", Font.BOLD, 50));
        title.setForeground(Color.ORANGE);
        p1.add(title);
//        
//        JLabel title1 = new JLabel("who do not travel");
//        title1.setBounds(20, 20, 300, 20);
//        title1.setFont(new Font("Tahoma", Font.PLAIN, 15));
//        title1.setForeground(Color.black);
//        p1.add(title1);
//        
//        JLabel title2 = new JLabel("read only one page");
//        title2.setBounds(20, 40, 300, 20);
//        title2.setFont(new Font("Tahoma", Font.PLAIN, 15));
//        title2.setForeground(Color.black);
//        p1.add(title2);

        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(330, 155, 150, 25);
        lblusername.setForeground(Color.black);
        lblusername.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 25));
        contentPane.add(lblusername);
        p1.add(lblusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(330, 195, 300, 30);
        tfusername.setFont(new Font("Tahoma", Font.BOLD, 18));
        tfusername.setForeground(Color.black);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        tfusername.setBackground(Color.lightGray);
        contentPane.add(tfusername);
        p1.add(tfusername);

        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(330, 235, 100, 25);
        lblpassword.setForeground(Color.black);
        lblpassword.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 23));
        contentPane.add(lblpassword);
        p1.add(lblpassword);

        tfpassword = new JPasswordField();
        tfpassword.setBounds(330, 265, 300, 30);
        tfpassword.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblusername.setForeground(Color.black);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        tfpassword.setBackground(Color.lightGray);
        contentPane.add(tfpassword);
        p1.add(tfpassword);

        login = new JButton("Login");
        login.addActionListener(this);
        login.setFont(new Font("Tahoma", Font.BOLD, 14));
        login.setBounds(365, 315, 110, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        contentPane.add(login);
        p1.add(login);

        signup = new JButton("Signup");
        signup.addActionListener(this);
        signup.setFont(new Font("Tahoma", Font.BOLD, 14));
        signup.setBounds(490, 315, 110, 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        contentPane.add(signup);
        p1.add(signup);

        password = new JButton("Forgot Password");
        password.addActionListener(this);
        password.setFont(new Font("Tahoma", Font.BOLD, 12));
        password.setBounds(410, 355, 140, 25);
        password.setBackground(Color.RED);
        password.setForeground(Color.black);
        contentPane.add(password);
        p1.add(password);
//        p2.add(password);

        JLabel text = new JLabel("Trouble in login...");
        text.setBounds(360, 275, 150, 20);
        text.setForeground(Color.RED);
        contentPane.add(text);
        p1.add(text);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/beach.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1000, 700);
        contentPane.add(image);
        p1.add(image);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == login) {
            try {
                String username = tfusername.getText();
                String pass = tfpassword.getText();

                String query = "select * from account where username = '" + username + "' AND password = '" + pass + "'";
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                if (rs.next()) {
                    setVisible(false);
//                    Thread.sleep(800);

//                    new AddCustomer(username);
                    new Loading(username);
                } else if (tfusername.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "You have not filled username");
                            } else if (tfpassword.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "You have not filled password");
                            } else {
                    JOptionPane.showMessageDialog(null, "Invalid Login or Password!");

                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (ae.getSource() == signup) {
            setVisible(false);
            Signup su = new Signup();
            su.setVisible(true);
        }
        if (ae.getSource() == password) {
            setVisible(false);
            ForgotPassword forgot = new ForgotPassword();
            forgot.setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Login().setVisible(true);
    }

}
