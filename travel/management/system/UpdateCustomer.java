package travel.management.system;

import java.awt.BorderLayout;
import java.awt.*;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.Image;
import java.sql.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UpdateCustomer extends JFrame {

    private JPanel contentPane;
    private JTextField  t3, t4, t5, t6, t7, t8, t9;
    JLabel t1;
    JComboBox t2;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UpdateCustomer frame = new UpdateCustomer("");
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public UpdateCustomer(String username) throws SQLException {
        System.out.println(username);
        setBounds(360, 160, 900, 600);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblName = new JLabel("😎Update Your Details");
        lblName.setFont(new Font("Yu Mincho", Font.BOLD, 30));
        lblName.setForeground(Color.BLACK);
        lblName.setBounds(430, 11, 500, 53);
        contentPane.add(lblName);

        JLabel l3 = new JLabel("Username :");
        l3.setBounds(430, 70, 250, 30);
        l3.setFont(new Font("Yu Mincho", Font.BOLD, 20));
        l3.setForeground(Color.BLACK);
        contentPane.add(l3);

        t1 = new JLabel();
        t1.setBounds(670, 72, 180, 25);
        t1.setForeground(Color.BLACK);
        t1.setBackground(Color.LIGHT_GRAY);
        t1.setFont(new Font("Tahoma", Font.BOLD, 17));
        t1.setBorder(BorderFactory.createEmptyBorder());
        contentPane.add(t1);

        JLabel lblId = new JLabel("ID :");
        lblId.setBounds(430, 110, 250, 30);
        lblId.setFont(new Font("Yu Mincho", Font.BOLD, 20));
        lblId.setForeground(Color.BLACK);
        contentPane.add(lblId);

        t2 = new JComboBox(new String[]{"Passport", "Aadhar Card", "Voter Id", "Driving license", "PAN Card", "Ration Card"});
        t2.setBounds(670, 112, 180, 25);
        t2.setFont(new Font("Tahoma", Font.BOLD, 15));
        t2.setBackground(Color.lightGray);
        t2.setForeground(Color.black);
        add(t2);

        JLabel l2 = new JLabel("Number :");
        l2.setBounds(430, 150, 250, 30);
        l2.setFont(new Font("Yu Mincho", Font.BOLD, 20));
        l2.setForeground(Color.BLACK);
        contentPane.add(l2);

        t3 = new JTextField();
        t3.setBounds(670, 152, 180, 25);
        t3.setForeground(Color.BLACK);
        t3.setBackground(Color.LIGHT_GRAY);
        t3.setFont(new Font("Tahoma", Font.BOLD, 15));
        t3.setBorder(BorderFactory.createEmptyBorder());
        contentPane.add(t3);

        JLabel lblName_1 = new JLabel("Name :");
        lblName_1.setBounds(430, 190, 250, 30);
        lblName_1.setFont(new Font("Yu Mincho", Font.BOLD, 20));
        lblName_1.setForeground(Color.BLACK);
        contentPane.add(lblName_1);

        t4 = new JTextField();
        t4.setBounds(670, 192, 180, 25);
        t4.setForeground(Color.BLACK);
        t4.setBackground(Color.LIGHT_GRAY);
        t4.setFont(new Font("Tahoma", Font.BOLD, 15));
        t4.setBorder(BorderFactory.createEmptyBorder());
        contentPane.add(t4);

        JLabel lblGender = new JLabel("Gender :");
        lblGender.setBounds(430, 230, 250, 30);
        lblGender.setFont(new Font("Yu Mincho", Font.BOLD, 20));
        lblGender.setForeground(Color.BLACK);
        contentPane.add(lblGender);

        t5 = new JTextField();
        t5.setBounds(670, 232, 180, 25);
        t5.setForeground(Color.BLACK);
        t5.setBackground(Color.LIGHT_GRAY);
        t5.setFont(new Font("Tahoma", Font.BOLD, 15));
        t5.setBorder(BorderFactory.createEmptyBorder());
        contentPane.add(t5);

        JLabel lblCountry = new JLabel("Country :");
        lblCountry.setBounds(430, 270, 250, 30);
        lblCountry.setFont(new Font("Yu Mincho", Font.BOLD, 20));
        lblCountry.setForeground(Color.BLACK);
        contentPane.add(lblCountry);

        t6 = new JTextField();
        t6.setBounds(670, 272, 180, 25);
        t6.setForeground(Color.BLACK);
        t6.setBackground(Color.LIGHT_GRAY);
        t6.setFont(new Font("Tahoma", Font.BOLD, 15));
        t6.setBorder(BorderFactory.createEmptyBorder());
        contentPane.add(t6);

        JLabel lblReserveRoomNumber = new JLabel("Address :");
        lblReserveRoomNumber.setBounds(430, 310, 300, 30);
        lblReserveRoomNumber.setFont(new Font("Yu Mincho", Font.BOLD, 20));
        lblReserveRoomNumber.setForeground(Color.BLACK);
        contentPane.add(lblReserveRoomNumber);

        t7 = new JTextField();
        t7.setBounds(670, 312, 180, 25);
        t7.setForeground(Color.BLACK);
        t7.setBackground(Color.LIGHT_GRAY);
        t7.setFont(new Font("Tahoma", Font.BOLD, 15));
        t7.setBorder(BorderFactory.createEmptyBorder());
        contentPane.add(t7);

        JLabel lblCheckInStatus = new JLabel("Phone :");
        lblCheckInStatus.setBounds(430, 350, 250, 30);
        lblCheckInStatus.setFont(new Font("Yu Mincho", Font.BOLD, 20));
        lblCheckInStatus.setForeground(Color.BLACK);
        contentPane.add(lblCheckInStatus);

        t8 = new JTextField();
        t8.setBounds(670, 352, 180, 25);
        t8.setForeground(Color.BLACK);
        t8.setBackground(Color.LIGHT_GRAY);
        t8.setFont(new Font("Tahoma", Font.BOLD, 15));
        t8.setBorder(BorderFactory.createEmptyBorder());
        contentPane.add(t8);

        JLabel lblDeposite = new JLabel("Email :");
        lblDeposite.setBounds(430, 390, 250, 30);
        lblDeposite.setFont(new Font("Yu Mincho", Font.BOLD, 20));
        lblDeposite.setForeground(Color.BLACK);
        contentPane.add(lblDeposite);

        t9 = new JTextField();
        t9.setBounds(670, 392, 180, 25);
        t9.setForeground(Color.BLACK);
        t9.setBackground(Color.LIGHT_GRAY);
        t9.setFont(new Font("Tahoma", Font.BOLD, 15));
        t9.setBorder(BorderFactory.createEmptyBorder());
        contentPane.add(t9);

        

        try {
            Conn c = new Conn();
            String query = ("select * from customer where username = '" + username + "'");
            ResultSet rs = c.s.executeQuery(query);     
            while (rs.next()) {
                t1.setText(rs.getString("username"));               
                t3.setText(rs.getString("number"));
                t4.setText(rs.getString("name"));
                t5.setText(rs.getString("gender"));
                t6.setText(rs.getString("country"));
                t7.setText(rs.getString("address"));
                t8.setText(rs.getString("phone"));
                t9.setText(rs.getString("email"));
            }
        } catch (Exception e) {
        }
        

        JButton update = new JButton("Update");
        update.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Conn c = new Conn();

                try {
                    String s1 = t1.getText();
                    String s2 = (String) t2.getSelectedItem();
                    String s3 = t3.getText();
                    String s4 = t4.getText();
                    String s5 = t5.getText();
                    String s6 = t6.getText();
                    String s7 = t7.getText();
                    String s8 = t8.getText();
                    String s9 = t9.getText();

                    String q1 = "update customer set id = '" + s2 + "', number = '" + s3 + "', name = '" + s4 + "', gender = '" + s5 + "', country = '" + s6 + "', address = '" + s7 + "', phone = '" + s8 + "', email = '" + s9 + "' where username = '" + s1 + "'";
                    c.s.executeUpdate(q1);

                    JOptionPane.showMessageDialog(null, "Customer Detail Updated Successfully");
                    setVisible(false);
                } catch (SQLException e1) {
                    System.out.println(e1.getMessage());
                } catch (NumberFormatException s) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid Number");
                }
            }
        });
        update.setBounds(450, 450, 120, 30);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        update.setFont(new Font("Tahoma", Font.BOLD, 15));
        contentPane.add(update);

        JButton back = new JButton("Back");
        back.setBounds(590, 450, 120, 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Tahoma", Font.BOLD, 15));
        contentPane.add(back);
        
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/airplane.jpg"));
        Image i3 = i1.getImage().getScaledInstance(900, 600, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel l1 = new JLabel(i2);
        l1.setBounds(0, 0, 900, 600);
        contentPane.add(l1);
    }
}
