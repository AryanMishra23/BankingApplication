package bank.Management.System;

import javax.print.DocFlavor;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pin extends JFrame implements ActionListener {

    JButton button1,button2;

    JPasswordField passwordField1,passwordField2;

    String pin;

    Pin(String pin){

        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/atm2.png"));
        Image i2= i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1 = new JLabel("CHANGE YOUR PIN");
        label1.setForeground(Color.white);
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setBounds(430,180,400,35);
        l3.add(label1);

        JLabel label2 = new JLabel("New PIN");
        label2.setForeground(Color.white);
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setBounds(430,220,150,35);
        l3.add(label2);

        passwordField1 = new JPasswordField();
        passwordField1.setBackground(new Color(65,125,128));
        passwordField1.setForeground(Color.white);
        passwordField1.setBounds(600,220,180,25);
        passwordField1.setFont(new Font("System",Font.BOLD,22));
        l3.add(passwordField1);

        JLabel label3 = new JLabel("Re-Enter New PIN");
        label3.setForeground(Color.white);
        label3.setFont(new Font("System",Font.BOLD,16));
        label3.setBounds(430,250,400,35);
        l3.add(label3);

        passwordField2 = new JPasswordField();
        passwordField2.setBackground(new Color(65,125,128));
        passwordField2.setForeground(Color.white);
        passwordField2.setBounds(600,255,180,25);
        passwordField2.setFont(new Font("Raleway",Font.BOLD,22));
        l3.add(passwordField2);


        button1 = new JButton("CHANGE");
        button1.setBounds(700,362,150,35);
        button1.setBackground(new Color(65,125,128));
        button1.setForeground(Color.white);
        button1.addActionListener(this);
        l3.add(button1);

        button2 = new JButton("BACK");
        button2.setBounds(700,406,150,35);
        button2.setBackground(new Color(65,125,128));
        button2.setForeground(Color.white);
        button2.addActionListener(this);
        l3.add(button2);

        setSize(1550,1080);
        setLayout(null);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {

            String pin1 = passwordField1.getText();
            String pin2 = passwordField2.getText();

            if (!pin1.equals(pin2)){
                JOptionPane.showMessageDialog(null,"Enter PIN does not match");
                 return;
            }
            if (e.getSource()==button1){
                if (passwordField1.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Enter new PIN ");
                    return;
                }
                if (passwordField2.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Re-Enter New PIN");
                    return;
                }

                Con c = new Con();
                String q1  = "update bank set pin = '"+pin1+"' where pin = '"+pin+"'";
                String q2 = "update login set pin = '"+pin1+"' where pin = '"+pin+"'";
                String q3 = "update signup3 set pin = '"+pin1+"' where pin ='"+pin+"'";

                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);

                JOptionPane.showMessageDialog(null,"PIN Changed Successfully");
                setVisible(false);
                new Main_Class(pin);

            } else if (e.getSource()==button2) {
                new Main_Class(pin);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Pin("");
    }
}
