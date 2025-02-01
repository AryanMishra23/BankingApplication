package bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.Time;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {

    JButton button1,button2, button3,button4,button5,button6,button7;

    String pin;

    FastCash(String pin){

        this.pin = pin;

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("Icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1 = new JLabel("SELECT WITHDRAWAL AMOUNT");
        label1.setBounds(445,180,700,35);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System",Font.BOLD,22));
        l3.add(label1);

        button1 = new JButton("Rs. 100");
        button1.setForeground(Color.WHITE);
        button1.setBackground(new Color(35,125,128));
        button1.setBounds(410,274,150,35);
        button1.addActionListener(this);
        l3.add(button1);

        button2 = new JButton("Rs. 500");
        button2.setForeground(Color.WHITE);
        button2.setBackground(new Color(35,125,128));
        button2.setBounds(700,274,150,35);
        button2.addActionListener(this);
        l3.add(button2);

        button3 = new JButton("RS. 1000");
        button3.setForeground(Color.WHITE);
        button3.setBackground(new Color(35,125,128));
        button3.setBounds(410,318,150,35);
        button3.addActionListener(this);
        l3.add(button3);

        button4 = new JButton("Rs. 2000");
        button4.setForeground(Color.WHITE);
        button4.setBackground(new Color(35,125,128));
        button4.setBounds(700,318,150,35);
        button4.addActionListener(this);
        l3.add(button4);

        button5 = new JButton("Rs. 5000");
        button5.setForeground(Color.WHITE);
        button5.setBackground(new Color(35,125,128));
        button5.setBounds(410,362,150,35);
        button5.addActionListener(this);
        l3.add(button5);

        button6 = new JButton("RS. 10000");
        button6.setForeground(Color.WHITE);
        button6.setBackground(new Color(35,125,128));
        button6.setBounds(700,362,150,35);
        button6.addActionListener(this);
        l3.add(button6);

        button7 = new JButton("BACK");
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
        if (e.getSource()==button7){
            setVisible(false);
            new Main_Class(pin);
        } else {
            String amount = ((JButton)e.getSource()).getText().substring(4);
            Con c =new Con();
            Date date = new Date();
            try {
                ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
                int balance = 0;

                while (resultSet.next()){
                    if (resultSet.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(resultSet.getString("amount"));
                    } else {
                        balance -= Integer.parseInt(resultSet.getString("amount"));
                    }
                } String num = "17";
                if (e.getSource()!= button7 && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"Insufficient Balance");
                    return;
                }

                c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Withdrawal','"+amount+"')");
                JOptionPane.showMessageDialog(null,"Debited Successfully");


            }catch (Exception E){
                E.printStackTrace();
            }

            setVisible(false);
            new Main_Class(pin);
        }

    }

    public static void main(String[] args) {
        new FastCash("");
    }
}
