package bank.Management.System;
 
import com.toedter.calendar.JDateChooser;

import javax.lang.model.element.Name;
import javax.print.event.PrintJobAttributeListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {

    JRadioButton radioButton1, radioButton2,radioButtonMarital1, radioButtonMarital2, radioButtonOther;

    JButton nextbutton;

    JDateChooser dateChooser;

    JTextField textName, textFathername, textEmail, textAddress, textCity, textPin,textState;

    Random random = new Random();

    long first4 = (random.nextLong() % 9000L) + 1000L;

    String first = " " + Math.abs(first4);

    Signup(){
        super("APPLICATION FORM");

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("Icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO." + first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        label2.setBounds(330,70,600,30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(290,90,600,30);
        add(label3);

        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        labelName.setBounds(100,190,100,30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,20));
        textName.setBounds(300,190,400,30);
        add(textName);

        JLabel labelfathername = new JLabel("Father's Name :");
        labelfathername.setFont(new Font("Raleway",Font.BOLD,20));
        labelfathername.setBounds(100,240,200,30 );
        add(labelfathername);

        textFathername = new JTextField();
        textFathername.setFont(new Font("Raleway",Font.BOLD,20));
        textFathername.setBounds(300,240,400,30);
        add(textFathername);

        JLabel DOB =new JLabel("Date of Birth :");
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setBounds(100,340,200,30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);


        JLabel labelGender = new JLabel("Gender");
        labelGender.setFont(new Font("Raleway",Font.BOLD,20));
        labelGender.setBounds(100,290,200,30);
        add(labelGender);

        radioButton1= new JRadioButton("Male");
        radioButton1.setFont(new Font("raleway",Font.BOLD,14));
        radioButton1.setBackground(Color.LIGHT_GRAY);
        radioButton1.setBounds(300,290,60,30);
        add(radioButton1);

        radioButton2 = new JRadioButton("Female");
        radioButton2.setFont(new Font("Raleway",Font.BOLD,14));
        radioButton2.setBackground(Color.LIGHT_GRAY);
        radioButton2.setBounds(450,290,90,30);
        add(radioButton2);

        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);

        JLabel labelemail = new JLabel("Email Address : ");
        labelemail.setFont(new Font("Raleway",Font.BOLD,20));
        labelemail.setBounds(100,390,200,30);
        add(labelemail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        textEmail.setBounds(300,390,400,30);
        add(textEmail);

        JLabel labelMarriedStatus = new JLabel("Marital Status : ");
        labelMarriedStatus.setFont(new Font("Raleway",Font.BOLD,20));
        labelMarriedStatus.setBounds(100,440,200,30);
        add(labelMarriedStatus);

        radioButtonMarital1 = new JRadioButton("Married");
        radioButtonMarital1.setBounds(300,440,100,30);
        radioButtonMarital1.setBackground(Color.lightGray);
        radioButtonMarital1.setFont(new Font("Raleway",Font.BOLD,14));
        add(radioButtonMarital1);

        radioButtonMarital2 = new JRadioButton("Unmarried");
        radioButtonMarital2.setBounds(450,440,100,30);
        radioButtonMarital2.setBackground(Color.lightGray);
        radioButtonMarital2.setFont(new Font("Raleway",Font.BOLD,14));
        add(radioButtonMarital2);

        radioButtonOther = new JRadioButton("Other");
        radioButtonOther.setBounds(635,440,100,30);
        radioButtonOther.setBackground(Color.lightGray);
        radioButtonOther.setFont(new Font("Raleway",Font.BOLD,14));
        add(radioButtonOther);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(radioButtonMarital1);
        buttonGroup1.add(radioButtonMarital2);
        buttonGroup1.add(radioButtonOther);


        JLabel labelAddress = new JLabel("Address : ");
        labelAddress.setFont(new Font("Raleway",Font.BOLD,20));
        labelAddress.setBounds(100,490,200,30);
        add(labelAddress);

        textAddress = new JTextField();
        textAddress.setFont(new Font("Raleway",Font.BOLD,14));
        textAddress.setBounds(300,490,400,30);
        add(textAddress);

        JLabel labelCity = new JLabel("City : ");
        labelCity.setFont(new Font("raleway",Font.BOLD,20));
        labelCity.setBounds(100,540,200,30);
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway",Font.BOLD,14));
        textCity.setBounds(300,540,400,30);
        add(textCity);

        JLabel labelPin = new JLabel("Pin Code : ");
        labelPin.setFont(new Font("Raleway",Font.BOLD,20));
        labelPin.setBounds(100,590,200,30);
        add(labelPin);

        textPin = new JTextField();
        textPin.setFont(new Font("Raleway",Font.BOLD,14));
        textPin.setBounds(300,590,400,30);
        add(textPin);

        JLabel labelState =new JLabel("State :");
        labelState.setFont(new Font("Raleway",Font.BOLD,20));
        labelState.setBounds(100,640,200,30);
        add(labelState);

        textState = new JTextField();
        textState.setFont(new Font("Raleway",Font.BOLD,14));
        textState.setBounds(300,640,400,30);
        add(textState);

        nextbutton = new JButton("Next");
        nextbutton.setFont(new Font("Raleway",Font.BOLD,14));
        nextbutton.setBackground(Color.BLACK);
        nextbutton.setForeground(Color.WHITE);
        nextbutton.setBounds(620,710,80,30);
        nextbutton.addActionListener(this);
        add(nextbutton);

        getContentPane().setBackground(Color.LIGHT_GRAY);
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formno = first;
        String name = textName.getText();
        String fathername = textFathername.getText();
        String dob =((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (radioButton1.isSelected()){
            gender = "Male";
        } else if (radioButton2.isSelected()) {
            gender= "Female";
        }
        String email = textEmail.getText();
        String marital = null;
        if (radioButtonMarital1.isSelected()){
            marital = "Married";
        } else if (radioButtonMarital2.isSelected()) {
            marital = "Unmarried";
        } else if (radioButtonOther.isSelected()) {
            marital = "Other";
        }

        String address = textAddress.getText();
        String city = textCity.getText();
        String pin = textPin.getText();
        String state = textState.getText();

        try {
            if (textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the field");
            } else{
                Con con1 = new Con();
                String q = "insert into signup values('"+formno+"', '"+name+"', '"+fathername+"', '"+dob+"' ,'"+gender+"','"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+pin+"', '"+state+"')";
                con1.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup();
    }
}
