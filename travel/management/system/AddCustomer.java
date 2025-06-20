package travel.management.system;

import java.awt.*;
import java.awt.Font;
import java.awt.Image;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;

public class AddCustomer extends JFrame implements ActionListener {

    JLabel labelusername;
    JComboBox comboid;
    JTextField tfnumber, tfcountry, tfaddress, tfphone, tfemail, tfname;
    JRadioButton rmale, rfemale;
    JButton add, back;
    JPanel contentPane;

    AddCustomer(String username) {

        setBounds(330, 130, 900, 620);
        setLayout(null);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);
//        getContentPane().setBackground(Color.cyan);

        JLabel lblName = new JLabel("😉Add Personal Details");
        lblName.setFont(new Font("Yu Mincho", Font.BOLD, 30));
        lblName.setBounds(140, 0, 500, 53);
        lblName.setForeground(Color.RED);
        contentPane.add(lblName);

        JLabel lblusername = new JLabel("Username :");
        lblusername.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblusername.setBounds(60, 70, 150, 25);
        lblusername.setForeground(Color.ORANGE);
        add(lblusername);

        labelusername = new JLabel();
        labelusername.setFont(new Font("Tahoma", Font.BOLD, 17));
        labelusername.setBounds(250, 70, 150, 25);
        labelusername.setForeground(Color.black);
        add(labelusername);
        
        JLabel lblid = new JLabel("ID :");
        lblid.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblid.setForeground(Color.ORANGE);
        lblid.setBounds(60, 110, 150, 25);
        add(lblid);

        comboid = new JComboBox(new String[]{"Passport", "Aadhar Card", "Voter Id", "Driving license", "PAN Card", "Ration Card"});
        comboid.setBounds(250, 110, 180, 25);
        comboid.setFont(new Font("Tahoma", Font.BOLD, 15));
        comboid.setBackground(Color.lightGray);
        comboid.setForeground(Color.black);
        add(comboid);

        JLabel lblnumber = new JLabel("Number :");
        lblnumber.setBounds(60, 150, 150, 25);
        lblnumber.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblnumber.setForeground(Color.ORANGE);
        add(lblnumber);

        tfnumber = new JTextField();
        tfnumber.setBounds(250, 150, 180, 25);
        tfnumber.setFont(new Font("Tahoma", Font.BOLD, 15));
        tfnumber.setBackground(Color.lightGray);
        tfnumber.setForeground(Color.black);
        tfnumber.setBorder(BorderFactory.createEmptyBorder());
        add(tfnumber);

        JLabel lblname = new JLabel("Name :");
        lblname.setBounds(60, 190, 150, 25);
        lblname.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblname.setForeground(Color.ORANGE);
        add(lblname);

        tfname = new JTextField();
        tfname.setBounds(250, 190, 180, 25);
        tfname.setFont(new Font("Tahoma", Font.BOLD, 15));
        tfname.setBackground(Color.lightGray);
        tfname.setForeground(Color.black);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        add(tfname);

        JLabel lblGender = new JLabel("Gender :");
        lblGender.setBounds(60, 230, 150, 25);
        lblGender.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblGender.setForeground(Color.ORANGE);
        add(lblGender);

        rmale = new JRadioButton("Male");
        rmale.setBounds(250, 230, 70, 25);
        rmale.setFont(new Font("Tahoma", Font.BOLD, 13));
        rmale.setForeground(Color.black);
        rmale.setBackground(Color.orange);
        add(rmale);

        rfemale = new JRadioButton("Female");
        rfemale.setBounds(330, 230, 80, 25);
        rfemale.setFont(new Font("Tahoma", Font.BOLD, 13));
        rfemale.setForeground(Color.black);
        rfemale.setBackground(Color.orange);
        add(rfemale);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rmale);
        bg.add(rfemale);

        JLabel lblcountry = new JLabel("Country :");
        lblcountry.setBounds(60, 270, 200, 25);
        lblcountry.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblcountry.setForeground(Color.ORANGE);
        add(lblcountry);

        tfcountry = new JTextField();
        tfcountry.setBounds(250, 270, 180, 25);
        tfcountry.setFont(new Font("Tahoma", Font.BOLD, 15));
        tfcountry.setBackground(Color.lightGray);
        tfcountry.setForeground(Color.black);
        tfcountry.setBorder(BorderFactory.createEmptyBorder());
        add(tfcountry);

        JLabel lbladdress = new JLabel("Address :");
        lbladdress.setBounds(60, 310, 150, 25);
        lbladdress.setFont(new Font("Tahoma", Font.BOLD, 20));
        lbladdress.setForeground(Color.ORANGE);
        add(lbladdress);

        tfaddress = new JTextField();
        tfaddress.setBounds(250, 310, 180, 25);
        tfaddress.setFont(new Font("Tahoma", Font.BOLD, 15));
        tfaddress.setBackground(Color.lightGray);
        tfaddress.setForeground(Color.black);
        tfaddress.setBorder(BorderFactory.createEmptyBorder());
        add(tfaddress);

        JLabel lblphone = new JLabel("Phone :");
        lblphone.setBounds(60, 350, 150, 25);
        lblphone.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblphone.setForeground(Color.ORANGE);
        add(lblphone);

        tfphone = new JTextField();
        tfphone.setBounds(250, 350, 180, 25);
        tfphone.setFont(new Font("Tahoma", Font.BOLD, 15));
        tfphone.setBackground(Color.lightGray);
        tfphone.setForeground(Color.black);
        tfphone.setBorder(BorderFactory.createEmptyBorder());
        add(tfphone);

        JLabel lblemail = new JLabel("Email :");
        lblemail.setBounds(60, 390, 150, 25);
        lblemail.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblemail.setForeground(Color.ORANGE);
        add(lblemail);

        tfemail = new JTextField();
        tfemail.setBounds(250, 390, 180, 25);
        tfemail.setFont(new Font("Tahoma", Font.BOLD, 15));
        tfemail.setBackground(Color.lightGray);
        tfemail.setForeground(Color.black);
        tfemail.setBorder(BorderFactory.createEmptyBorder());
        add(tfemail);

        add = new JButton("Add");
        add.setBackground(Color.BLACK);
        add.setFont(new Font("Tahoma", Font.BOLD, 15));
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        add.setBounds(90, 455, 120, 30);
        add(add);

        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Tahoma", Font.BOLD, 15));
        back.addActionListener(this);
        back.setBounds(230, 455, 120, 30);
        add(back);

//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/laptop.jpg"));
//        Image i2 = i1.getImage().getScaledInstance(580, 600, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel image = new JLabel(i3);
//        image.setBounds(550, -80, 580, 600);
//        add(image);
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/add.jpg"));
        Image i5 = i4.getImage().getScaledInstance(900, 620, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image1 = new JLabel(i6);
        image1.setBounds(0, 0, 900, 620);
        add(image1);
//        

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from account where username = '" + username + "'");
            while (rs.next()) {
                labelusername.setText(rs.getString("username"));
                tfname.setText(rs.getString("name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            String username = labelusername.getText();
            String id = (String) comboid.getSelectedItem();
            String number = tfnumber.getText();
            String name = tfname.getText();
            String gender = null;
            if (rmale.isSelected()) {
                    gender = "Male";
                } else if(rfemale.isSelected()) {
                    gender = "Female";
                }         
            String country = tfcountry.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();

            try {
                
                String query = "insert into customer values('" + username + "','" + id + "','" + number + "','" + name + "','" + gender + "','" + country + "','" + address + "','" + phone + "','" + email + "')";
                
                if (tfnumber.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "You have not filled id number");
                } else if (tfname.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "You have not filled name");
                }          //} else{
//                                    JOptionPane.showMessageDialog(null, "select gender");
//                                }
                else if (tfcountry.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "You have not filled country");
                } else if (tfaddress.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "You have not filled address");
                } else if (tfphone.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "You have not filled phone");
                } else {
                    Conn c = new Conn();
                    c.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Details Added Successfully");
                    setVisible(false);
                }
//                new Loading(username);
            } catch (Exception e) {

                e.printStackTrace();
            }
        } else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new AddCustomer("");
    }
}
