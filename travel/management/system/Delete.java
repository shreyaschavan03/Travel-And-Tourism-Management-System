/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.management.system;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.sql.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Delete extends JFrame {

    Connection conn = null;
    private JPanel contentPane;
    JLabel lblAvailability;
    JLabel lblCleanStatus;
    JLabel lblNewLabel;
    JLabel lblNewLabel_1;
    JLabel lblId;

    /**
     * Launch the application.
     */
    public Delete(String username) {

//		conn = Javaconnect.getDBConnection();
        setBounds(320, 150, 900, 650);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

//                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
//                Image i3 = i1.getImage().getScaledInstance(626, 201,Image.SCALE_DEFAULT);
//                ImageIcon i2 = new ImageIcon(i3);
//                JLabel l1 = new JLabel(i2);
//                l1.setBounds(0,450,626,201);
//                add(l1);
//                
//                ImageIcon i4  = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
//                Image i5 = i4.getImage().getScaledInstance(626, 201,Image.SCALE_DEFAULT);
//                ImageIcon i6 = new ImageIcon(i5);
//                JLabel l2 = new JLabel(i6);
//                l2.setBounds(615,450,626,201);
//                add(l2);
//		table = new JTable();
//		table.setBounds(0, 40, 900, 350);
//		contentPane.add(table);
        try {
            Conn c = new Conn();
            String displayCustomersql = "select * from customer";
            ResultSet rs = c.s.executeQuery(displayCustomersql);
//                        table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e1) {
            e1.printStackTrace();
        }

        JButton back = new JButton("Delete");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    if (e.getSource() == back) {
                        int a = JOptionPane.showConfirmDialog(null, "Do you really want to Delete Data", "Select", JOptionPane.YES_NO_OPTION);
                        if (a == 0) {

                            Conn c = new Conn();
                            c.s.executeUpdate("delete from account where username = '" + username + "'");
                            c.s.executeUpdate("delete from customer where username = '" + username + "'");
                            c.s.executeUpdate("delete from bookpackage where username = '" + username + "'");
                            c.s.executeUpdate("delete from bookhotel where username = '" + username + "'");

                            JOptionPane.showMessageDialog(null, "Data Deleted Successfully");
                            System.exit(0);
                        }

                    }
                } catch (Exception ae) {
                    ae.printStackTrace();
                }
            }
        });
        back.setBounds(350, 530, 120, 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        contentPane.add(back);

        JLabel head = new JLabel("🙄Your Details");
        head.setBounds(100, 10, 300, 50);
        head.setFont(new Font("Times New Roman", Font.BOLD, 33));
        head.setForeground(Color.GREEN);
        add(head);

        lblAvailability = new JLabel("Username -");
        lblAvailability.setBounds(70, 80, 150, 25);
        lblAvailability.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblAvailability.setForeground(Color.cyan);
        contentPane.add(lblAvailability);

        JLabel lblAvailability1 = new JLabel();
        lblAvailability1.setBounds(200, 76, 300, 30);
        lblAvailability1.setFont(new Font("Times New Roman", Font.BOLD, 22));
        lblAvailability1.setForeground(Color.PINK);
        add(lblAvailability1);

        lblCleanStatus = new JLabel("Id Type -");
        lblCleanStatus.setBounds(70, 170, 150, 25);
        lblCleanStatus.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblCleanStatus.setForeground(Color.cyan);
        contentPane.add(lblCleanStatus);

        JLabel lblCleanStatus1 = new JLabel();
        lblCleanStatus1.setBounds(200, 166, 250, 30);
        lblCleanStatus1.setFont(new Font("Times New Roman", Font.BOLD, 22));
        lblCleanStatus1.setForeground(Color.PINK);
        add(lblCleanStatus1);

        lblNewLabel = new JLabel("Number -");
        lblNewLabel.setBounds(70, 260, 150, 25);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblNewLabel.setForeground(Color.cyan);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel1 = new JLabel();
        lblNewLabel1.setBounds(200, 256, 400, 30);
        lblNewLabel1.setFont(new Font("Times New Roman", Font.BOLD, 22));
        lblNewLabel1.setForeground(Color.pink);
        add(lblNewLabel1);

        lblNewLabel_1 = new JLabel("Name -");
        lblNewLabel_1.setBounds(70, 350, 150, 25);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblNewLabel_1.setForeground(Color.cyan);
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel_11 = new JLabel();
        lblNewLabel_11.setBounds(200, 346, 300, 30);
        lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD, 22));
        lblNewLabel_11.setForeground(Color.pink);
        add(lblNewLabel_11);

        lblId = new JLabel("Gender -");
        lblId.setBounds(70, 440, 150, 25);
        lblId.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblId.setForeground(Color.cyan);
        contentPane.add(lblId);

        JLabel lblId1 = new JLabel();
        lblId1.setBounds(200, 436, 250, 30);
        lblId1.setFont(new Font("Times New Roman", Font.BOLD, 22));
        lblId1.setForeground(Color.pink);
        add(lblId1);

        JLabel l3 = new JLabel("Country -");
        l3.setBounds(520, 80, 150, 25);
        l3.setFont(new Font("Tahoma", Font.BOLD, 17));
        l3.setForeground(Color.cyan);
        contentPane.add(l3);

        JLabel l31 = new JLabel();
        l31.setBounds(620, 76, 250, 30);
        l31.setFont(new Font("Times New Roman", Font.BOLD, 22));
        l31.setForeground(Color.pink);
        add(l31);

        JLabel l4 = new JLabel("Address -");
        l4.setBounds(520, 170, 150, 25);
        l4.setFont(new Font("Tahoma", Font.BOLD, 17));
        l4.setForeground(Color.cyan);
        contentPane.add(l4);

        JLabel l41 = new JLabel();
        l41.setBounds(620, 166, 500, 30);
        l41.setFont(new Font("Times New Roman", Font.BOLD, 22));
        l41.setForeground(Color.pink);
        add(l41);

        JLabel l5 = new JLabel("Phone -");
        l5.setBounds(520, 260, 150, 25);
        l5.setFont(new Font("Tahoma", Font.BOLD, 17));
        l5.setForeground(Color.cyan);
        contentPane.add(l5);

        JLabel l51 = new JLabel();
        l51.setBounds(620, 256, 400, 30);
        l51.setFont(new Font("Times New Roman", Font.BOLD, 22));
        l51.setForeground(Color.pink);
        add(l51);

        JLabel l6 = new JLabel("Email -");
        l6.setBounds(520, 350, 150, 25);
        l6.setFont(new Font("Tahoma", Font.BOLD, 17));
        l6.setForeground(Color.cyan);
        contentPane.add(l6);

        JLabel l61 = new JLabel();
        l61.setBounds(620, 346, 250, 30);
        l61.setFont(new Font("Times New Roman", Font.BOLD, 22));
        l61.setForeground(Color.pink);
        add(l61);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/view.jpg"));
        Image i3 = i1.getImage().getScaledInstance(900, 650, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel l1 = new JLabel(i2);
        l1.setBounds(0, 0, 900, 650);
        add(l1);

        try {
            Conn c = new Conn();
            String query = ("select * from customer where username = '" + username + "'");
            ResultSet rs = c.s.executeQuery(query);
            while (rs.next()) {
                lblAvailability1.setText(rs.getString("username"));
                lblCleanStatus1.setText(rs.getString("id"));
                lblNewLabel1.setText(rs.getString("number"));
                lblNewLabel_11.setText(rs.getString("name"));
                lblId1.setText(rs.getString("gender"));
                l31.setText(rs.getString("country"));
                l41.setText(rs.getString("address"));
                l51.setText(rs.getString("phone"));
                l61.setText(rs.getString("email"));

            }
        } catch (Exception e) {

        }

        setVisible(true);
    }

//                getContentPane().setBackground(Color.WHITE);
    public static void main(String[] args) {
        new Delete("");
    }

}
