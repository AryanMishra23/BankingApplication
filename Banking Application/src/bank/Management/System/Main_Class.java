package bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_Class extends JFrame implements ActionListener {

    JButton button1,button2, button3,button4,button5,button6,button7;

    String pin;

    Main_Class(String pin){

        this.pin = pin;

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("Icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1 = new JLabel("Please select your Transaction");
        label1.setBounds(430,180,700,35);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System",Font.BOLD,28));
        l3.add(label1);

        button1 = new JButton("DEPOSIT");
        button1.setForeground(Color.WHITE);
        button1.setBackground(new Color(35,125,128));
        button1.setBounds(410,274,150,35);
        button1.addActionListener(this);
        l3.add(button1);

        button2 = new JButton("CASH WITHDRAWL");
        button2.setForeground(Color.WHITE);
        button2.setBackground(new Color(35,125,128));
        button2.setBounds(700,274,150,35);
        button2.addActionListener(this);
        l3.add(button2);

        button3 = new JButton("FAST CASH");
        button3.setForeground(Color.WHITE);
        button3.setBackground(new Color(35,125,128));
        button3.setBounds(410,318,150,35);
        button3.addActionListener(this);
        l3.add(button3);

        button4 = new JButton("MINI STATEMENT");
        button4.setForeground(Color.WHITE);
        button4.setBackground(new Color(35,125,128));
        button4.setBounds(700,318,150,35);
        button4.addActionListener(this);
        l3.add(button4);

        button5 = new JButton("PIN CHANGE");
        button5.setForeground(Color.WHITE);
        button5.setBackground(new Color(35,125,128));
        button5.setBounds(410,362,150,35);
        button5.addActionListener(this);
        l3.add(button5);

        button6 = new JButton("BALANCE ENQUIRY");
        button6.setForeground(Color.WHITE);
        button6.setBackground(new Color(35,125,128));
        button6.setBounds(700,362,150,35);
        button6.addActionListener(this);
        l3.add(button6);

        button7 = new JButton("EXIT");
        button7.setForeground(Color.WHITE);
        button7.setBackground(new Color(35,125,128));
        button7.setBounds(700,406,150,35);
        button7.addActionListener(this);
        l3.add(button7);

        setLayout(null);
        setSize(1550,1000);
        setLocation(0,0);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button1){
            new Deposit(pin);
            setVisible(false);
        } else if (e.getSource()==button7) {
            System.exit(0);
        } else if (e.getSource()==button2) {
            new Withdrawl(pin);
            setVisible(false);
        } else if (e.getSource()==button6) {
            new BalanceEnquiry(pin);
            setVisible(false);
        } else if (e.getSource()==button3) {
            new FastCash(pin);
            setVisible(false);
        } else if (e.getSource()==button5) {
            new Pin(pin);
            setVisible(false);
        } else if (e.getSource()==button4) {
            new Mini(pin);
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Main_Class("");
    }
}
