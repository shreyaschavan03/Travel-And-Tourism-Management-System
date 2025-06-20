package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class BookHotel extends JFrame implements ActionListener {

    JPanel contentPane;
    JLabel lblusername, labelusername, lblhotel, lblpersons, lbldays, lblac, lblfood, lblid, lblgender, lblphone, lblnumber, lbltotal,
            lblNewLabel_11, lblgender1, lblnumber1, lbltotal1, lblId1;
    Choice chotel, cac, cfood;
    JTextField tfpersons, tfdesti, tfdays;
    String username;
    JButton checkprice, bookpackage, back;
    JLabel lbldesti;

    BookHotel(String username) {
        this.username = username;
        setBounds(310, 160, 950, 660);
        contentPane = new JPanel();
//        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

//        JPanel black = new JPanel();
//        black.setLayout(null);
//        black.setBackground(Color.BLACK);
//        black.setBounds(490, 15, 430, 430);
//        add(black);
        JLabel text = new JLabel("😊 BOOK HOTEL");
        text.setBounds(500, 20, 400, 40);
        text.setForeground(Color.ORANGE);
        text.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 35));
        add(text);

        lblusername = new JLabel("Username -");
        lblusername.setBounds(510, 70, 150, 25);
        lblusername.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblusername.setForeground(Color.GREEN);
        add(lblusername);

        labelusername = new JLabel();
        labelusername.setBounds(720, 70, 300, 30);
        labelusername.setFont(new Font("Times New Roman", Font.BOLD, 22));
        labelusername.setForeground(Color.cyan);
        add(labelusername);

//        lbldesti = new JLabel("Destination Details -");
//        lbldesti.setBounds(510, 110, 200, 25);
//        lbldesti.setFont(new Font("Tahoma", Font.BOLD, 17));
//        lbldesti.setForeground(Color.GREEN);
//        add(lbldesti);
//        
//        
//        
//        tfdesti = new JTextField();
//        tfdesti.setBounds(720, 110, 200, 25);
//        tfdesti.setFont(new Font("Times New Roman", Font.BOLD, 20));
//        tfdesti.setForeground(Color.black);
//        tfdesti.setBackground(Color.LIGHT_GRAY);
//        tfdesti.setBorder(BorderFactory.createEmptyBorder());
//        add(tfdesti);
        lblhotel = new JLabel("Select Hotel -");
        lblhotel.setBounds(510, 110, 200, 25);
        lblhotel.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblhotel.setForeground(Color.green);
        add(lblhotel);

        chotel = new Choice();
//        cpackage.add("Silver Package");
//        cpackage.add("Gold Package");
//        cpackage.add("Diamond Package");
        chotel.setBounds(720, 110, 200, 30);
        chotel.setFont(new Font("Tahoma", Font.BOLD, 15));
        chotel.setBackground(Color.LIGHT_GRAY);
        chotel.setForeground(Color.black);
        add(chotel);

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from hotel");
            while (rs.next()) {
                chotel.add(rs.getString("name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        lblpersons = new JLabel("Total Persons -");
        lblpersons.setBounds(510, 150, 180, 25);
        lblpersons.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblpersons.setForeground(Color.green);
        add(lblpersons);

        tfpersons = new JTextField();
        tfpersons.setBounds(720, 150, 200, 25);
        tfpersons.setFont(new Font("Times New Roman", Font.BOLD, 20));
        tfpersons.setForeground(Color.black);
        tfpersons.setBackground(Color.LIGHT_GRAY);
        tfpersons.setBorder(BorderFactory.createEmptyBorder());
        add(tfpersons);

        lbldays = new JLabel("No. Of Days -");
        lbldays.setBounds(510, 190, 180, 25);
        lbldays.setFont(new Font("Tahoma", Font.BOLD, 17));
        lbldays.setForeground(Color.green);
        add(lbldays);

        tfdays = new JTextField();
        tfdays.setBounds(720, 190, 200, 25);
        tfdays.setFont(new Font("Times New Roman", Font.BOLD, 20));
        tfdays.setForeground(Color.black);
        tfdays.setBackground(Color.LIGHT_GRAY);
        tfdays.setBorder(BorderFactory.createEmptyBorder());
        add(tfdays);

        lblac = new JLabel("AC/ Non-AC -");
        lblac.setBounds(510, 230, 180, 25);
        lblac.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblac.setForeground(Color.green);
        add(lblac);

        cac = new Choice();
        cac.add("AC");
        cac.add("Non-AC");
//        cpackage.add("Diamond Package");
        cac.setBounds(720, 230, 200, 30);
        cac.setFont(new Font("Tahoma", Font.BOLD, 15));
        cac.setBackground(Color.LIGHT_GRAY);
        cac.setForeground(Color.black);
        add(cac);

        lblfood = new JLabel("Food Included -");
        lblfood.setBounds(510, 270, 180, 25);
        lblfood.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblfood.setForeground(Color.green);
        add(lblfood);

        cfood = new Choice();
        cfood.add("Yes");
        cfood.add("No");
//        cpackage.add("Diamond Package");
        cfood.setBounds(720, 270, 200, 30);
        cfood.setFont(new Font("Tahoma", Font.BOLD, 15));
        cfood.setBackground(Color.LIGHT_GRAY);
        cfood.setForeground(Color.black);
        add(cfood);

        JLabel note = new JLabel("Note: In the Total Person and No. Of Days Field fill only integer value");
        note.setBounds(20, 580, 500, 25);
        note.setFont(new Font("Tahoma", Font.ITALIC, 15));
        note.setForeground(Color.YELLOW);
        add(note);

        lblid = new JLabel("ID -");
        lblid.setBounds(510, 310, 150, 25);
        lblid.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblid.setForeground(Color.green);
        add(lblid);

        lblNewLabel_11 = new JLabel();
        lblNewLabel_11.setBounds(720, 310, 200, 25);
        lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD, 22));
        lblNewLabel_11.setForeground(Color.cyan);
        add(lblNewLabel_11);

        lblphone = new JLabel("Numbar -");
        lblphone.setBounds(510, 350, 200, 25);
        lblphone.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblphone.setForeground(Color.green);
        add(lblphone);

        lblgender1 = new JLabel();
        lblgender1.setBounds(720, 350, 500, 25);
        lblgender1.setFont(new Font("Times New Roman", Font.BOLD, 22));
        lblgender1.setForeground(Color.cyan);
        add(lblgender1);

        lblgender = new JLabel("Gender -");
        lblgender.setBounds(510, 390, 150, 25);
        lblgender.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblgender.setForeground(Color.green);
        add(lblgender);

        lblId1 = new JLabel();
        lblId1.setBounds(720, 390, 200, 25);
        lblId1.setFont(new Font("Times New Roman", Font.BOLD, 22));
        lblId1.setForeground(Color.cyan);
        add(lblId1);

        lblnumber = new JLabel("Phone -");
        lblnumber.setBounds(510, 430, 200, 25);
        lblnumber.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblnumber.setForeground(Color.green);
        add(lblnumber);

        lblnumber1 = new JLabel();
        lblnumber1.setBounds(720, 430, 500, 25);
        lblnumber1.setFont(new Font("Times New Roman", Font.BOLD, 22));
        lblnumber1.setForeground(Color.cyan);
        add(lblnumber1);

        lbltotal = new JLabel("Total Price -");
        lbltotal.setBounds(510, 470, 200, 25);
        lbltotal.setFont(new Font("Tahoma", Font.BOLD, 17));
        lbltotal.setForeground(Color.green);
        add(lbltotal);

        lbltotal1 = new JLabel();
        lbltotal1.setBounds(720, 470, 200, 25);
        lbltotal1.setFont(new Font("Times New Roman", Font.BOLD, 22));
        lbltotal1.setForeground(Color.red);
        add(lbltotal1);

        try {
            Conn c = new Conn();
            String query = ("select * from customer where username = '" + username + "'");
            ResultSet rs = c.s.executeQuery(query);
            while (rs.next()) {
                labelusername.setText(rs.getString("username"));
                lblNewLabel_11.setText(rs.getString("id"));
                lblgender1.setText(rs.getString("number"));
                lblId1.setText(rs.getString("gender"));
                lblnumber1.setText(rs.getString("phone"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        checkprice = new JButton("Check Price");
        checkprice.setBackground(Color.BLACK);
        checkprice.setForeground(Color.WHITE);
        checkprice.setBounds(560, 510, 120, 25);
        checkprice.addActionListener(this);
        contentPane.add(checkprice);

        bookpackage = new JButton("Book Hotel");
        bookpackage.setBackground(Color.BLACK);
        bookpackage.setForeground(Color.WHITE);
        bookpackage.setBounds(700, 510, 120, 25);
        bookpackage.addActionListener(this);
        contentPane.add(bookpackage);

        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(620, 560, 120, 25);
        back.addActionListener(this);
        contentPane.add(back);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/123.jpg"));
        Image i5 = i4.getImage().getScaledInstance(420, 540, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l2 = new JLabel(i6);
        l2.setBounds(20, 20, 420, 540);
        contentPane.add(l2);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bookhotel.jpg"));
        Image i3 = i1.getImage().getScaledInstance(950, 660, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel l1 = new JLabel(i2);
        l1.setBounds(0, 0, 950, 660);
        contentPane.add(l1);

        
        
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == checkprice) {
            try {
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery("select * from hotel where name = '" + chotel.getSelectedItem() + "'");
                if (tfpersons.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please fill Total Persons");
                } else if (tfdays.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please fill No. of days Details");
                }
                while (rs.next()) {
                    int cost = Integer.parseInt(rs.getString("costperson"));
                    int food = Integer.parseInt(rs.getString("foodincluded"));
                    int ac = Integer.parseInt(rs.getString("acroom"));

                    int persons = Integer.parseInt(tfpersons.getText());
                    int days = Integer.parseInt(tfdays.getText());

                    String acselected = cac.getSelectedItem();
                    String foodselected = cfood.getSelectedItem();
                    
                    

                    if (persons * days > 0) {
                        int total = 0;
                        total += acselected.equals("AC") ? ac : 0;
                        total += foodselected.equals("Yes") ? food : 0;
                        total += cost;
                        total = total * persons * days;
                        lbltotal1.setText("Rs"+ total);
                        
                        
                    } else {
                        JOptionPane.showMessageDialog(null, "Please enter valid numbr");
                    }

                }
               
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ae.getSource() == bookpackage) {

            try {
                
                String query = ("insert into bookhotel values('" + labelusername.getText() + "', '" + chotel.getSelectedItem() + "', '" + tfpersons.getText() + "', '" + tfdays.getText() + "', '" + cac.getSelectedItem() + "', '" + cfood.getSelectedItem() + "', '" + lblNewLabel_11.getText() + "', '" + lblgender1.getText() + "', '"+lblId1.getText()+"', '"+lblnumber1.getText()+"', '"+lbltotal1.getText()+"')");

                if (tfpersons.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please fill Total Persons");
                } else if (tfdays.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please fill No. of days Details");
                } else if (lbltotal1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please check Total Price");
                }  else {
                    Conn c = new Conn();
                    c.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Hotel Booked Successfully");
                    setVisible(false);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new BookHotel("");
    }
}
