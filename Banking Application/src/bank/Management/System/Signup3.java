package bank.Management.System;

import javax.swing.*;
import javax.swing.plaf.LabelUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {

    JRadioButton radioButton1,radioButton2,radioButton3,radioButton4;

    JCheckBox checkBox1,checkBox2,checkBox3,checkBox4,checkBox5,checkBox6;

    JButton buttonSubmit,buttonCancel;

    String formno;

    Signup3(String formno){
        this.formno = formno;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        JLabel label1 = new JLabel("Page 3: ");
        label1.setFont(new Font("Raleway",Font.BOLD,22));
        label1.setBounds(280,40,400,40);
        add(label1);

        JLabel label2 = new JLabel("Accounts Details: ");
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        label2.setBounds(280,70,400,40);
        add(label2);

        JLabel label3 = new JLabel("Account Type : ");
        label3.setFont(new Font("Raleway",Font.BOLD,18));
        label3.setBounds(100,140,200,30);
        add(label3);

        radioButton1 = new JRadioButton("Saving Account");
        radioButton1.setFont(new Font("Raleway",Font.BOLD,16));
        radioButton1.setBackground(new Color(215,252,252));
        radioButton1.setBounds(100,180,150,30 );
        add(radioButton1);

        radioButton2 = new JRadioButton("Fixed Deposit");
        radioButton2.setFont(new Font("Raleway",Font.BOLD,16));
        radioButton2.setBackground(new Color(215,252,252));
        radioButton2.setBounds(350,180,300,30);
        add(radioButton2);

        radioButton3 = new JRadioButton("Current Account");
        radioButton3.setFont(new Font("Raleway",Font.BOLD,16));
        radioButton3.setBackground(new Color(215,252,252));
        radioButton3.setBounds(100,220,250,30);
        add(radioButton3);

        radioButton4 = new JRadioButton("Recurring Deposit Account");
        radioButton4.setFont(new Font("Raleway",Font.BOLD,16));
        radioButton4.setBackground(new Color(215,252,252));
        radioButton4.setBounds(350,220,2500,30);
        add(radioButton4);

        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        group.add(radioButton3);
        group.add(radioButton4);

        JLabel label4 = new JLabel("Card Number : ");
        label4.setFont(new Font("Raleway",Font.BOLD,18));
        label4.setBounds(100,300,200,30);
        add(label4);

        JLabel label5= new JLabel("(Your 16-Digit Card Number)");
        label5.setFont(new Font("Raleway",Font.BOLD,12));
        label5.setBounds(100,330,200,20);
        add(label5);

        JLabel label6 = new JLabel("XXXX-XXXX-XXXX-4841");
        label6.setFont(new Font("Raleway",Font.BOLD,18));
        label6.setBounds(330,300,250,30);
        add(label6);

        JLabel label7 = new JLabel("(It Would Appear on Atm Card/Cheque Book and Statement)");
        label7.setFont(new Font("Raleway",Font.BOLD,12));
        label7.setBounds(330,330,500,20);
        add(label7);

        JLabel label8 = new JLabel("PIN NO :");
        label8.setFont(new Font("Raleway",Font.BOLD,18));
        label8.setBounds(100,370,200,30);
        add(label8);

        JLabel label9 = new JLabel("XXXX");
        label9.setFont(new Font("Raleway",Font.BOLD,18));
        label9.setBounds(330,370,200,30);
        add(label9);

        JLabel label10 = new JLabel("(4-Digit Password)");
        label10.setFont(new Font("Raleway",Font.BOLD,12));
        label10.setBounds(100,400,200,30);
        add(label10);

        JLabel label11 = new JLabel("Service Required : ");
        label11.setFont(new Font("Raleway",Font.BOLD,18));
        label11.setBounds(100,450,200,30);
        add(label11);


        checkBox1 = new JCheckBox("ATM Card");
        checkBox1.setBackground(new Color(215,252,252));
        checkBox1.setFont(new Font("Raleway",Font.BOLD,16));
        checkBox1.setBounds(100,500,200,30);
        add(checkBox1);

        checkBox2 = new JCheckBox("Internet Bnaking");
        checkBox2.setBackground(new Color(215,252,252));
        checkBox2.setFont(new Font("Raleway",Font.BOLD,16));
        checkBox2.setBounds(350,500,200,30);
        add(checkBox2);

        checkBox3 = new JCheckBox("Mobile Banking : ");
        checkBox3.setBackground(new Color(215,252,252));
        checkBox3.setFont(new Font("Raleway",Font.BOLD,16));
        checkBox3.setBounds(100,550,200,30);
        add(checkBox3);

        checkBox4 = new JCheckBox("Email Alerts : ");
        checkBox4.setBackground(new Color(215,252,252));
        checkBox4.setFont(new Font("Raleway",Font.BOLD,16));
        checkBox4.setBounds(350,550,200,30);
        add(checkBox4);

        checkBox5 = new JCheckBox("Cheque Book : ");
        checkBox5.setBackground(new Color(215,252,252));
        checkBox5.setFont(new Font("Raleway",Font.BOLD,16));
        checkBox5.setBounds(100,600,200,30);
        add(checkBox5);

        checkBox6 = new JCheckBox("E-Statement : ");
        checkBox6.setBackground(new Color(215,252,252));
        checkBox6.setFont(new Font("Raleway",Font.BOLD,16));
        checkBox6.setBounds(350,600,200,30);
        add(checkBox6);

        JCheckBox checkBox7 = new JCheckBox("I here by declare that the above entered details are correct to the best of my Knowledge. ", true);
        checkBox7.setBackground(new Color(215,252,252));
        checkBox7.setFont(new Font("Raleway",Font.BOLD,12));
        checkBox7.setBounds(100,680,600,20);
        add(checkBox7);

        JLabel label12 = new JLabel("Form No:- ");
        label12.setFont(new Font("Raleway",Font.BOLD,12));
        label12.setBounds(700,10,100,30);
        add(label12);

        JLabel label13 = new JLabel(formno);
        label13.setFont(new Font("Raleway",Font.BOLD,12));
        label13.setBounds(760,10,60,30);
        add(label13);


        buttonSubmit = new JButton("Submit");
        buttonSubmit.setFont(new Font("Raleway",Font.BOLD,14));
        buttonSubmit.setBackground(Color.BLACK);
        buttonSubmit.setForeground(Color.WHITE);
        buttonSubmit.setBounds(250,720,100,30);
        buttonSubmit.addActionListener(this);
        add(buttonSubmit);

        buttonCancel = new JButton("Cancel");
        buttonCancel.setFont(new Font("Raleway",Font.BOLD,14));
        buttonCancel.setBackground(Color.BLACK);
        buttonCancel.setForeground(Color.WHITE);
        buttonCancel.setBounds(420,720,100,30);
        buttonCancel.addActionListener(this);
        add(buttonCancel);


        getContentPane().setBackground(new Color(215,252,252));
        setSize(850,800);
        setLayout(null);
        setLocation(400,20);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String atype = null;

        if (radioButton1.isSelected()){
            atype = "Saving Account";
        } else if (radioButton2.isSelected()) {
            atype = "Fixed Deposit";
        } else if (radioButton3.isSelected()) {
            atype = "Current Account";
        } else if (radioButton4.isSelected()) {
            atype = "Recurring Deposit Account";
        }

        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L)  + 1409963000000000L;
        String cardno =  "" + Math.abs(first7);

        long first3 = (ran.nextLong() % 9000L)+1000L;
        String pin = "" + Math.abs(first3);

        String fac = "";
        if (checkBox1.isSelected()){
            fac = fac+"ATM CARD";
        } else if (checkBox2.isSelected()) {
            fac = fac+"Internet Bnaking";
        } else if (checkBox3.isSelected()) {
            fac =fac+"Mobile Banking";
        } else if (checkBox4.isSelected()) {
            fac=fac+"Email Alert";
        } else if (checkBox5.isSelected()) {
            fac=fac+"Cheque Book";
        } else if (checkBox6.isSelected()) {
            fac= fac+"E-Statement";
        }

        try {
            if (e.getSource()==buttonSubmit){
                if (atype.equals("")){
                    JOptionPane.showMessageDialog(null,"Fill all the Fields");
                }else {
                    Con c1  =new Con();
                    String q1 = "insert into signup3 values('"+formno+"','"+atype+"','"+cardno+"','"+pin+"','"+fac+"')";
                    String q2 = "insert into login values('"+formno+"','"+cardno+"','"+pin+"')";

                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card Number : "+cardno+"\n Pin : "+pin);
                    new Deposit(pin);
                    setVisible(false);
                }
            } else if (e.getSource()==buttonCancel) {
                System.exit(0);
            }
        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup3(" ");
    }
}