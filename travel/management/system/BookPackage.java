package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class BookPackage extends JFrame implements ActionListener {

    JPanel contentPane;
    JLabel lblAvailability, lblCleanStatus, lblNewLabel, lblid, lblgender, lblphone, lblnumber, lbltotal, lblAvailability1, lblNewLabel_11, lblgender1, lblnumber1, lbltotal1, lblId1;
    Choice cpackage;
    JTextField tfpersons, tfdesti;
    String username;
    JButton checkprice, bookpackage, back;
    JLabel lbldesti;

    BookPackage(String username) {
        this.username = username;
        setBounds(310, 160, 950, 600);
        contentPane = new JPanel();
//        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
//        JPanel black = new JPanel();
//        black.setLayout(null);
//        black.setBackground(Color.BLACK);
//        black.setBounds(490, 15, 430, 430);
//        add(black);

        JLabel text = new JLabel("😊 BOOK PACKAGE");
        text.setBounds(500, 20, 400, 40);
        text.setForeground(Color.ORANGE);
        text.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 35));
        add(text);

        lblAvailability = new JLabel("Username -");
        lblAvailability.setBounds(510, 70, 150, 25);
        lblAvailability.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblAvailability.setForeground(Color.GREEN);
        add(lblAvailability);

        lblAvailability1 = new JLabel();
        lblAvailability1.setBounds(720, 70, 300, 30);
        lblAvailability1.setFont(new Font("Times New Roman", Font.BOLD, 22));
        lblAvailability1.setForeground(Color.cyan);
        add(lblAvailability1);
        
        lbldesti = new JLabel("Destination Details -");
        lbldesti.setBounds(510, 110, 200, 25);
        lbldesti.setFont(new Font("Tahoma", Font.BOLD, 17));
        lbldesti.setForeground(Color.GREEN);
        add(lbldesti);
        
        
        
        tfdesti = new JTextField();
        tfdesti.setBounds(720, 110, 200, 25);
        tfdesti.setFont(new Font("Times New Roman", Font.BOLD, 20));
        tfdesti.setForeground(Color.black);
        tfdesti.setBackground(Color.LIGHT_GRAY);
        tfdesti.setBorder(BorderFactory.createEmptyBorder());
        add(tfdesti);

        lblCleanStatus = new JLabel("Select Package -");
        lblCleanStatus.setBounds(510, 150, 200, 25);
        lblCleanStatus.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblCleanStatus.setForeground(Color.green);
        add(lblCleanStatus);

        cpackage = new Choice();
        cpackage.add("Silver Package");
        cpackage.add("Gold Package");
        cpackage.add("Diamond Package");
        cpackage.setBounds(720, 150, 200, 30);
        cpackage.setFont(new Font("Tahoma", Font.BOLD, 15));
        cpackage.setBackground(Color.LIGHT_GRAY);
        cpackage.setForeground(Color.black);
        add(cpackage);

        lblNewLabel = new JLabel("Total Persons -");
        lblNewLabel.setBounds(510, 190, 180, 25);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblNewLabel.setForeground(Color.green);
        add(lblNewLabel);

        tfpersons = new JTextField();
        tfpersons.setBounds(720, 190, 200, 25);
        tfpersons.setFont(new Font("Times New Roman", Font.BOLD, 20));
        tfpersons.setForeground(Color.black);
        tfpersons.setBackground(Color.LIGHT_GRAY);
        tfpersons.setBorder(BorderFactory.createEmptyBorder());
        add(tfpersons);

        JLabel note = new JLabel("Note: In the Total Person Field fill only integer value");
        note.setBounds(20, 480, 500, 25);
        note.setFont(new Font("Tahoma", Font.ITALIC, 15));
        note.setForeground(Color.YELLOW);
        add(note);

        lblid = new JLabel("ID -");
        lblid.setBounds(510, 230, 150, 25);
        lblid.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblid.setForeground(Color.green);
        add(lblid);

        lblNewLabel_11 = new JLabel();
        lblNewLabel_11.setBounds(720, 230, 200, 25);
        lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD, 22));
        lblNewLabel_11.setForeground(Color.cyan);
        add(lblNewLabel_11);
        
        lblphone = new JLabel("Numbar -");
        lblphone.setBounds(510, 270, 200, 25);
        lblphone.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblphone.setForeground(Color.green);
        add(lblphone);

        lblgender1 = new JLabel();
        lblgender1.setBounds(720, 270, 500, 25);
        lblgender1.setFont(new Font("Times New Roman", Font.BOLD, 22));
        lblgender1.setForeground(Color.cyan);
        add(lblgender1);

        lblgender = new JLabel("Gender -");
        lblgender.setBounds(510, 310, 150, 25);
        lblgender.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblgender.setForeground(Color.green);
        add(lblgender);

        lblId1 = new JLabel();
        lblId1.setBounds(720, 310, 200, 25);
        lblId1.setFont(new Font("Times New Roman", Font.BOLD, 22));
        lblId1.setForeground(Color.cyan);
        add(lblId1);

        lblnumber = new JLabel("Phone -");
        lblnumber.setBounds(510, 350, 200, 25);
        lblnumber.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblnumber.setForeground(Color.green);
        add(lblnumber);

        lblnumber1 = new JLabel();
        lblnumber1.setBounds(720, 350, 500, 25);
        lblnumber1.setFont(new Font("Times New Roman", Font.BOLD, 22));
        lblnumber1.setForeground(Color.cyan);
        add(lblnumber1);

        lbltotal = new JLabel("Total Price -");
        lbltotal.setBounds(510, 390, 200, 25);
        lbltotal.setFont(new Font("Tahoma", Font.BOLD, 17));
        lbltotal.setForeground(Color.green);
        add(lbltotal);

        lbltotal1 = new JLabel();
        lbltotal1.setBounds(720, 390, 200, 25);
        lbltotal1.setFont(new Font("Times New Roman", Font.BOLD, 22));
        lbltotal1.setForeground(Color.red);
        add(lbltotal1);

        try {
            Conn c = new Conn();
            String query = ("select * from customer where username = '" + username + "'");
            ResultSet rs = c.s.executeQuery(query);
            while (rs.next()) {
                lblAvailability1.setText(rs.getString("username"));
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
        checkprice.setBounds(560, 470, 120, 25);
        checkprice.addActionListener(this);
        contentPane.add(checkprice);

        bookpackage = new JButton("Book Package");
        bookpackage.setBackground(Color.BLACK);
        bookpackage.setForeground(Color.WHITE);
        bookpackage.setBounds(700, 470, 120, 25);
        bookpackage.addActionListener(this);
        contentPane.add(bookpackage);

        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(620, 520, 120, 25);
        back.addActionListener(this);
        contentPane.add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/book2.jpg"));
        Image i3 = i1.getImage().getScaledInstance(950, 600, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel l1 = new JLabel(i2);
        l1.setBounds(0, 0, 950, 600);
        contentPane.add(l1);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == checkprice) {
            String pack = cpackage.getSelectedItem();
            int cost = 0;
            if (tfpersons.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill Total Persons");
            } else if (tfdesti.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please fill Destination Details");
            } else if (pack.equals("Silver Package")) {
                cost += 7999;
            } else if (pack.equals("Gold Package")) {
                cost += 17999;
            } else {
                cost += 24999;
            }
            int persons = Integer.parseInt(tfpersons.getText());
            cost *= persons;
            lbltotal1.setText("Rs " + cost);
        } else if (ae.getSource() == bookpackage) {

            try {

                String query = ("insert into bookpackage values('" + lblAvailability1.getText() + "', '" + tfdesti.getText() + "', '" + cpackage.getSelectedItem() + "', '" + tfpersons.getText() + "', '" + lblNewLabel_11.getText() + "', '" + lblgender1.getText() + "', '" + lblId1.getText() + "', '" + lblnumber1.getText() + "', '" + lbltotal1.getText() + "')");

                if (tfpersons.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please fill Total Persons");
                } else if (lbltotal1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please check Total Price");
                } else if (tfdesti.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please fill Destination Details");
                } else {
                    Conn c = new Conn();
                    c.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Package Booked Successfully");
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
        new BookPackage("");
    }
}
