package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class ViewPackage extends JFrame implements ActionListener {

    JPanel contentPane;
    JLabel labelusername, lblusername, labeldesti, lbldesti, labelname, lblname, labelpersons, lblpersons, labelid, lblid,
            labelnumber, lblnumber, labelgender, lblgender, labelphone, lblphone, labeltotal, lbltotal;
    String username;
    JButton back;

    ViewPackage(String username) {
        this.username = username;
        setBounds(310, 160, 1030, 600);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel text = new JLabel("😊 VIEW PACKAGE DETAILS");
        text.setBounds(510, 20, 700, 40);
        text.setForeground(Color.ORANGE);
        text.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 35));
        add(text);

        labelusername = new JLabel("Username :");
        labelusername.setBounds(590, 70, 150, 25);
        labelusername.setFont(new Font("Tahoma", Font.BOLD, 17));
        labelusername.setForeground(Color.GREEN);
        add(labelusername);

        lblusername = new JLabel();
        lblusername.setBounds(810, 70, 300, 30);
        lblusername.setFont(new Font("Times New Roman", Font.BOLD, 22));
        lblusername.setForeground(Color.cyan);
        add(lblusername);

        labeldesti = new JLabel("Destination Details :");
        labeldesti.setBounds(590, 110, 200, 25);
        labeldesti.setFont(new Font("Tahoma", Font.BOLD, 17));
        labeldesti.setForeground(Color.GREEN);
        add(labeldesti);

        lbldesti = new JLabel();
        lbldesti.setBounds(810, 110, 300, 30);
        lbldesti.setFont(new Font("Times New Roman", Font.BOLD, 22));
        lbldesti.setForeground(Color.cyan);
        add(lbldesti);

        labelname = new JLabel("Package Name :");
        labelname.setBounds(590, 150, 200, 25);
        labelname.setFont(new Font("Tahoma", Font.BOLD, 17));
        labelname.setForeground(Color.green);
        add(labelname);

        lblname = new JLabel();
        lblname.setBounds(810, 150, 300, 30);
        lblname.setFont(new Font("Times New Roman", Font.BOLD, 22));
        lblname.setForeground(Color.cyan);
        add(lblname);

        labelpersons = new JLabel("Total Persons :");
        labelpersons.setBounds(590, 190, 180, 25);
        labelpersons.setFont(new Font("Tahoma", Font.BOLD, 17));
        labelpersons.setForeground(Color.green);
        add(labelpersons);

        lblpersons = new JLabel();
        lblpersons.setBounds(810, 190, 300, 30);
        lblpersons.setFont(new Font("Times New Roman", Font.BOLD, 22));
        lblpersons.setForeground(Color.cyan);
        add(lblpersons);

        labelid = new JLabel("ID :");
        labelid.setBounds(590, 230, 150, 25);
        labelid.setFont(new Font("Tahoma", Font.BOLD, 17));
        labelid.setForeground(Color.green);
        add(labelid);

        lblid = new JLabel();
        lblid.setBounds(810, 230, 200, 25);
        lblid.setFont(new Font("Times New Roman", Font.BOLD, 22));
        lblid.setForeground(Color.cyan);
        add(lblid);

        labelnumber = new JLabel("Numbar :");
        labelnumber.setBounds(590, 270, 200, 25);
        labelnumber.setFont(new Font("Tahoma", Font.BOLD, 17));
        labelnumber.setForeground(Color.green);
        add(labelnumber);

        lblnumber = new JLabel();
        lblnumber.setBounds(810, 270, 500, 25);
        lblnumber.setFont(new Font("Times New Roman", Font.BOLD, 22));
        lblnumber.setForeground(Color.cyan);
        add(lblnumber);

        labelgender = new JLabel("Gender :");
        labelgender.setBounds(590, 310, 150, 25);
        labelgender.setFont(new Font("Tahoma", Font.BOLD, 17));
        labelgender.setForeground(Color.green);
        add(labelgender);

        lblgender = new JLabel();
        lblgender.setBounds(810, 310, 200, 25);
        lblgender.setFont(new Font("Times New Roman", Font.BOLD, 22));
        lblgender.setForeground(Color.cyan);
        add(lblgender);

        labelphone = new JLabel("Phone :");
        labelphone.setBounds(590, 350, 200, 25);
        labelphone.setFont(new Font("Tahoma", Font.BOLD, 17));
        labelphone.setForeground(Color.green);
        add(labelphone);

        lblphone = new JLabel();
        lblphone.setBounds(810, 350, 500, 25);
        lblphone.setFont(new Font("Times New Roman", Font.BOLD, 22));
        lblphone.setForeground(Color.cyan);
        add(lblphone);

        labeltotal = new JLabel("Total Price :");
        labeltotal.setBounds(590, 390, 200, 25);
        labeltotal.setFont(new Font("Tahoma", Font.BOLD, 17));
        labeltotal.setForeground(Color.green);
        add(labeltotal);

        lbltotal = new JLabel();
        lbltotal.setBounds(810, 390, 200, 25);
        lbltotal.setFont(new Font("Times New Roman", Font.BOLD, 22));
        lbltotal.setForeground(Color.red);
        add(lbltotal);

        try {
            Conn c = new Conn();
            String query = ("select * from bookpackage where username = '" + username + "'");
            ResultSet rs = c.s.executeQuery(query);
            while (rs.next()) {
                lblusername.setText(rs.getString("username"));
                lbldesti.setText(rs.getString("destination"));
                lblname.setText(rs.getString("package"));
                lblpersons.setText(rs.getString("persons"));
                lblid.setText(rs.getString("id"));
                lblnumber.setText(rs.getString("number"));
                lblgender.setText(rs.getString("gender"));
                lblphone.setText(rs.getString("phone"));
                lbltotal.setText(rs.getString("price"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(700, 520, 120, 25);
        back.addActionListener(this);
        contentPane.add(back);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/bookedDetails.jpg"));
        Image i5 = i4.getImage().getScaledInstance(550, 500, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l2 = new JLabel(i6);
        l2.setBounds(0, 30, 550, 500);
        contentPane.add(l2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/book2.jpg"));
        Image i3 = i1.getImage().getScaledInstance(1030, 600, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel l1 = new JLabel(i2);
        l1.setBounds(0, 0, 1030, 600);
        contentPane.add(l1);

        setVisible(true);
    }

    public static void main(String[] args) {
        new ViewPackage("");
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back) {
            setVisible(false);
        }
    }
}
