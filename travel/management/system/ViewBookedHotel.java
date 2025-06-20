package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class ViewBookedHotel extends JFrame implements ActionListener {

    JPanel contentPane;
    JLabel labelusername, lblusername, labelhotel, lblhotel, labeldays, lbldays, labelpersons, lblpersons, labelac, lblac, labelfood, lblfood, labelid, lblid,
            labelnumber, lblnumber, labelgender, lblgender, labelphone, lblphone, labeltotal, lbltotal;
    String username;
    JButton back;
    
    ViewBookedHotel(String username) {
        this.username = username;
        setBounds(310, 160, 950, 660);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel text = new JLabel("😊 VIEW BOOKED HOTEL DETAILS");
        text.setBounds(400, 10, 700, 40);
        text.setForeground(Color.ORANGE);
        text.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 30));
        add(text);

        labelusername = new JLabel("Username :");
        labelusername.setBounds(510, 70, 150, 25);
        labelusername.setFont(new Font("Tahoma", Font.BOLD, 17));
        labelusername.setForeground(Color.GREEN);
        add(labelusername);

        lblusername = new JLabel();
        lblusername.setBounds(720, 70, 300, 30);
        lblusername.setFont(new Font("Times New Roman", Font.BOLD, 22));
        lblusername.setForeground(Color.cyan);
        add(lblusername);

        labelhotel = new JLabel("Hotel Name -");
        labelhotel.setBounds(510, 110, 200, 25);
        labelhotel.setFont(new Font("Tahoma", Font.BOLD, 17));
        labelhotel.setForeground(Color.green);
        add(labelhotel);
        
        lblhotel = new JLabel();
        lblhotel.setBounds(720, 110, 300, 30);
        lblhotel.setFont(new Font("Times New Roman", Font.BOLD, 22));
        lblhotel.setForeground(Color.cyan);
        add(lblhotel);
        
        labelpersons = new JLabel("Total Persons :");
        labelpersons.setBounds(510, 150, 180, 25);
        labelpersons.setFont(new Font("Tahoma", Font.BOLD, 17));
        labelpersons.setForeground(Color.green);
        add(labelpersons);
        
        lblpersons = new JLabel();
        lblpersons.setBounds(720, 150, 300, 30);
        lblpersons.setFont(new Font("Times New Roman", Font.BOLD, 22));
        lblpersons.setForeground(Color.cyan);
        add(lblpersons);
        
        
        
        labeldays = new JLabel("Total Days :");
        labeldays.setBounds(510, 190, 180, 25);
        labeldays.setFont(new Font("Tahoma", Font.BOLD, 17));
        labeldays.setForeground(Color.green);
        add(labeldays);

        lbldays = new JLabel();
        lbldays.setBounds(720, 190, 300, 30);
        lbldays.setFont(new Font("Times New Roman", Font.BOLD, 22));
        lbldays.setForeground(Color.cyan);
        add(lbldays);
        
        labelac = new JLabel("AC/Non AC :");
        labelac.setBounds(510, 230, 180, 25);
        labelac.setFont(new Font("Tahoma", Font.BOLD, 17));
        labelac.setForeground(Color.green);
        add(labelac);

        lblac = new JLabel();
        lblac.setBounds(720, 230, 300, 30);
        lblac.setFont(new Font("Times New Roman", Font.BOLD, 22));
        lblac.setForeground(Color.cyan);
        add(lblac);
        
        labelfood = new JLabel("AC/Non AC :");
        labelfood.setBounds(510, 270, 180, 25);
        labelfood.setFont(new Font("Tahoma", Font.BOLD, 17));
        labelfood.setForeground(Color.green);
        add(labelfood);

        lblfood = new JLabel();
        lblfood.setBounds(720, 270, 300, 30);
        lblfood.setFont(new Font("Times New Roman", Font.BOLD, 22));
        lblfood.setForeground(Color.cyan);
        add(lblfood);

        labelid = new JLabel("ID :");
        labelid.setBounds(510, 310, 150, 25);
        labelid.setFont(new Font("Tahoma", Font.BOLD, 17));
        labelid.setForeground(Color.green);
        add(labelid);

        lblid = new JLabel();
        lblid.setBounds(720, 310, 200, 25);
        lblid.setFont(new Font("Times New Roman", Font.BOLD, 22));
        lblid.setForeground(Color.cyan);
        add(lblid);

        labelnumber = new JLabel("Numbar :");
        labelnumber.setBounds(510, 350, 200, 25);
        labelnumber.setFont(new Font("Tahoma", Font.BOLD, 17));
        labelnumber.setForeground(Color.green);
        add(labelnumber);

        lblnumber = new JLabel();
        lblnumber.setBounds(720, 350, 500, 25);
        lblnumber.setFont(new Font("Times New Roman", Font.BOLD, 22));
        lblnumber.setForeground(Color.cyan);
        add(lblnumber);

        labelgender = new JLabel("Gender :");
        labelgender.setBounds(510, 390, 150, 25);
        labelgender.setFont(new Font("Tahoma", Font.BOLD, 17));
        labelgender.setForeground(Color.green);
        add(labelgender);

        lblgender = new JLabel();
        lblgender.setBounds(720, 390, 200, 25);
        lblgender.setFont(new Font("Times New Roman", Font.BOLD, 22));
        lblgender.setForeground(Color.cyan);
        add(lblgender);

        labelphone = new JLabel("Phone :");
        labelphone.setBounds(510, 430, 200, 25);
        labelphone.setFont(new Font("Tahoma", Font.BOLD, 17));
        labelphone.setForeground(Color.green);
        add(labelphone);

        lblphone = new JLabel();
        lblphone.setBounds(720, 430, 500, 25);
        lblphone.setFont(new Font("Times New Roman", Font.BOLD, 22));
        lblphone.setForeground(Color.cyan);
        add(lblphone);

        labeltotal = new JLabel("Total Price :");
        labeltotal.setBounds(510, 470, 200, 25);
        labeltotal.setFont(new Font("Tahoma", Font.BOLD, 17));
        labeltotal.setForeground(Color.green);
        add(labeltotal);

        lbltotal = new JLabel();
        lbltotal.setBounds(720, 470, 200, 25);
        lbltotal.setFont(new Font("Times New Roman", Font.BOLD, 22));
        lbltotal.setForeground(Color.red);
        add(lbltotal);

        try {
            Conn c = new Conn();
            String query = ("select * from bookhotel where username = '" + username + "'");
            ResultSet rs = c.s.executeQuery(query);
            while (rs.next()) {
                lblusername.setText(rs.getString("username"));
                lblhotel.setText(rs.getString("name"));
                lblpersons.setText(rs.getString("persons"));
                lbldays.setText(rs.getString("days"));
                lblac.setText(rs.getString("ac"));
                lblfood.setText(rs.getString("food"));          
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
        back.setBounds(700, 535, 120, 25);
        back.addActionListener(this);
        contentPane.add(back);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/bookedDetails.jpg"));
        Image i5 = i4.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l2 = new JLabel(i6);
        l2.setBounds(-15, 50, 500, 500);
        contentPane.add(l2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bookhotel.jpg"));
        Image i3 = i1.getImage().getScaledInstance(1030, 600, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel l1 = new JLabel(i2);
        l1.setBounds(0, 0, 1030, 600);
        contentPane.add(l1);

        setVisible(true);
    }

    public static void main(String[] args) {
        new ViewBookedHotel("");
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back) {
            setVisible(false);
        }
    }
}
