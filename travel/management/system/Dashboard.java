package travel.management.system;

import java.awt.Color;
import java.awt.Image;
import java.awt.Insets;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
//import.javax.awt.event.*;

public class Dashboard extends JFrame {

    JPanel contentPane;

    public static void main(String[] args) {
        new Dashboard("");
    }
    String username;
    JButton addPersonalDetails;

    Dashboard(String username) {
        this.username = username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
        contentPane.setLayout(null);

        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0, 0, 102));
        p1.setBounds(0, 0, 1600, 65);
        add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5, 0, 70, 70);
        p1.add(icon);

        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(80, 10, 300, 40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Times New Roman", Font.BOLD, 35));
        p1.add(heading);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0, 0, 102));
        p2.setBounds(0, 65, 300, 900);
        add(p2);

        JButton logout = new JButton("Logout");
        logout.setBounds(1300, 10, 150, 30);
        logout.setBackground(Color.BLACK);
        logout.setForeground(Color.WHITE);
//        logout.addActionListener(this);
        logout.setFont(new Font("Times New Roman", Font.BOLD, 20));
//        logout.setMargin(new Insets(0, 10, 0, 60));
        p1.add(logout);

        logout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    if (ae.getSource() == logout) {

                        int a = JOptionPane.showConfirmDialog(null, "Do you really want to Close Application", "Select", JOptionPane.YES_NO_OPTION);
                        if (a == 0) {
                            System.exit(0);
                        }

                    }

                    
                } catch (Exception e) {
                }
            }
        });

        addPersonalDetails = new JButton("Add Personal Details");
        addPersonalDetails.setBounds(0, 0, 300, 50);
        addPersonalDetails.setBackground(new Color(0, 0, 102));
        addPersonalDetails.setForeground(Color.WHITE);
        addPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        addPersonalDetails.setMargin(new Insets(0, 10, 0, 60));
//        addPersonalDetails.addActionListener((ActionListener) this);
        p2.add(addPersonalDetails);

        addPersonalDetails.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    new AddCustomer(username).setVisible(true);
                } catch (Exception e) {
                }
            }
        });

        JButton updatePersonalDetails = new JButton("Update Personal Details");
        updatePersonalDetails.setBounds(0, 55, 300, 50);
        updatePersonalDetails.setBackground(new Color(0, 0, 102));
        updatePersonalDetails.setForeground(Color.WHITE);
        updatePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        updatePersonalDetails.setMargin(new Insets(0, 0, 0, 30));
        p2.add(updatePersonalDetails);

        updatePersonalDetails.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    new UpdateCustomer(username).setVisible(true);
                } catch (Exception e) {
                }
            }
        });

        JButton viewPersonalDetails = new JButton("View Details");
        viewPersonalDetails.setBounds(0, 110, 300, 50);
        viewPersonalDetails.setBackground(new Color(0, 0, 102));
        viewPersonalDetails.setForeground(Color.WHITE);
        viewPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewPersonalDetails.setMargin(new Insets(0, 0, 0, 127));
        p2.add(viewPersonalDetails);

        viewPersonalDetails.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    new ViewCustomer(username).setVisible(true);
                } catch (Exception e) {
                }
            }
        });

        JButton deletePersonalDetails = new JButton("Delete Personal Details");
        deletePersonalDetails.setBounds(0, 165, 300, 50);
        deletePersonalDetails.setBackground(new Color(0, 0, 102));
        deletePersonalDetails.setForeground(Color.WHITE);
        deletePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        deletePersonalDetails.setMargin(new Insets(0, 0, 0, 35));
        p2.add(deletePersonalDetails);

        deletePersonalDetails.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    new Delete(username).setVisible(true);
                } catch (Exception e) {
                }
            }
        });
        
        JButton checkpackages = new JButton("Check Packages");
        checkpackages.setBounds(0, 220, 300, 50);
        checkpackages.setBackground(new Color(0, 0, 102));
        checkpackages.setForeground(Color.WHITE);
        checkpackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        checkpackages.setMargin(new Insets(0, 0, 0, 96));
        p2.add(checkpackages);

        checkpackages.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    new CheckPackage().setVisible(true);
                } catch (Exception e) {
                }
            }
        });

        JButton bookpackages = new JButton("Book Packages");
        bookpackages.setBounds(0, 275, 300, 50);
        bookpackages.setBackground(new Color(0, 0, 102));
        bookpackages.setForeground(Color.WHITE);
        bookpackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookpackages.setMargin(new Insets(0, 0, 0, 100));
        p2.add(bookpackages);

        bookpackages.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    new BookPackage(username).setVisible(true);
                } catch (Exception e) {
                }
            }
        });

        JButton viewpackages = new JButton("View Booked Packages");
        viewpackages.setBounds(0, 330, 375, 50);
        viewpackages.setBackground(new Color(0, 0, 102));
        viewpackages.setForeground(Color.WHITE);
        viewpackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewpackages.setMargin(new Insets(0, 0, 0, 102));
        p2.add(viewpackages);

        viewpackages.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    new ViewPackage(username).setVisible(true);
                } catch (Exception e) {
                }
            }
        });

        JButton viewhotels = new JButton("View Hotels");
        viewhotels.setBounds(0, 385, 300, 50);
        viewhotels.setBackground(new Color(0, 0, 102));
        viewhotels.setForeground(Color.WHITE);
        viewhotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewhotels.setMargin(new Insets(0, 0, 0, 128));
        p2.add(viewhotels);

        viewhotels.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    new ViewHotel().setVisible(true);
                } catch (Exception e) {
                }
            }
        });

        JButton bookhotel = new JButton("Book Hotel");
        bookhotel.setBounds(0, 440, 300, 50);
        bookhotel.setBackground(new Color(0, 0, 102));
        bookhotel.setForeground(Color.WHITE);
        bookhotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookhotel.setMargin(new Insets(0, 0, 0, 136));
        p2.add(bookhotel);
        
        bookhotel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    new BookHotel(username).setVisible(true);
                } catch (Exception e) {
                }
            }
        });

        JButton viewbookhotel = new JButton("View Booked Hotel");
        viewbookhotel.setBounds(0, 495, 300, 50);
        viewbookhotel.setBackground(new Color(0, 0, 102));
        viewbookhotel.setForeground(Color.WHITE);
        viewbookhotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewbookhotel.setMargin(new Insets(0, 0, 0, 63));
        p2.add(viewbookhotel);
        
        viewbookhotel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    new ViewBookedHotel(username).setVisible(true);
                } catch (Exception e) {
                }
            }
        });

        JButton destinations = new JButton("Destinations");
        destinations.setBounds(0, 550, 300, 50);
        destinations.setBackground(new Color(0, 0, 102));
        destinations.setForeground(Color.WHITE);
        destinations.setFont(new Font("Tahoma", Font.PLAIN, 20));
        destinations.setMargin(new Insets(0, 0, 0, 121));
        p2.add(destinations);

        destinations.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    new Destination().setVisible(true);
                } catch (Exception e) {
                }
            }
        });

        JButton payments = new JButton("Payments");
        payments.setBounds(0, 605, 300, 50);
        payments.setBackground(new Color(0, 0, 102));
        payments.setForeground(Color.WHITE);
        payments.setFont(new Font("Tahoma", Font.PLAIN, 20));
        payments.setMargin(new Insets(0, 0, 0, 143));
        p2.add(payments);

        payments.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    new Payment().setVisible(true);
                } catch (Exception e) {
                }
            }
        });

        JButton calculator = new JButton("Calculator");
        calculator.setBounds(0, 660, 300, 50);
        calculator.setBackground(new Color(0, 0, 102));
        calculator.setForeground(Color.WHITE);
        calculator.setFont(new Font("Tahoma", Font.PLAIN, 20));
        calculator.setMargin(new Insets(0, 0, 0, 138));
        p2.add(calculator);

        calculator.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    Runtime.getRuntime().exec("calc.exe");
                } catch (Exception e) {
                }
            }
        });

        JButton notepad = new JButton("Notepad");
        notepad.setBounds(0, 715, 300, 50);
        notepad.setBackground(new Color(0, 0, 102));
        notepad.setForeground(Color.WHITE);
        notepad.setFont(new Font("Tahoma", Font.PLAIN, 20));
        notepad.setMargin(new Insets(0, 0, 0, 150));
        p2.add(notepad);

        notepad.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    Runtime.getRuntime().exec("notepad.exe");
                } catch (Exception e) {
                }
            }
        });

        JButton about = new JButton("About");
        about.setBounds(0, 770, 300, 50);
        about.setBackground(new Color(0, 0, 102));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Tahoma", Font.PLAIN, 20));
        about.setMargin(new Insets(0, 0, 0, 170));
        p2.add(about);

        about.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                new About().setVisible(true);
            }
        });

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0, 0, 1650, 1000);
        add(image);

        JLabel text = new JLabel("Travel And Tourism Management System");
        text.setBounds(400, 70, 1200, 70);
        text.setForeground(Color.black);
        text.setFont(new Font("Times New Roman", Font.BOLD, 55));
        image.add(text);

        setVisible(true);
    }

//    public void actionPerformed(ActionEvent ae) {
//        if (ae.getSource() == addPersonalDetails) {
//            new AddCustomer(username);
//        }
//    }
}
