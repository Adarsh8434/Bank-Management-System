package bank.management.system;

import java.awt.Color;
import javax.swing.*;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;

public class pinchange extends JFrame implements ActionListener {

    JTextField pin, repin;
    JButton back, change;
    String pinnumber;
    pinchange(String pinnumber) {
        setLayout(null);
        this.pinnumber=pinnumber;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        JLabel text = new JLabel("Change Your Pin");
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(250, 280, 500, 35);
        text.setForeground(Color.white);
        image.add(text);

        JLabel pintext = new JLabel("Enter your new pin");
        pintext.setFont(new Font("System", Font.BOLD, 16));
        pintext.setForeground(Color.white);
        pintext.setBounds(160, 320, 180, 25);
        image.add(pintext);

        pin = new JTextField();
        pin.setBounds(340, 320, 180, 25);
        pin.setFont(new Font("Raleway", Font.BOLD, 16));
        image.add(pin);

        JLabel repintext = new JLabel("Re-Enter your new pin");
        repintext.setFont(new Font("System", Font.BOLD, 16));
        repintext.setForeground(Color.white);
        repintext.setBounds(160, 355, 180, 25);
        image.add(repintext);

        repin = new JTextField();
        repin.setBounds(340, 360, 180, 25);
        repin.setFont(new Font("Raleway", Font.BOLD, 16));
        image.add(repin);

        change = new JButton("Change");
        change.setBounds(355, 485, 150, 30);
        change.addActionListener(this);
        image.add(change);

        back = new JButton("Back");
        back.setBounds(355, 520, 150, 30);
        back.addActionListener(this);
        image.add(back);

        setSize(900, 900);
        setLocation(300, 0);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == change){
       try {
            String npin = pin.getText();
            String rpin = repin.getText();
            if (!npin.equals(rpin)) {
                JOptionPane.showMessageDialog(null, "Entered pin does not match ");
                return;
            }
            if(npin.equals("")){
                JOptionPane.showMessageDialog(null,"Please Enter new pin");
                return;
            }
            sql c=new sql();
            String query1="update bank set pin='"+rpin+"' where pin='"+pinnumber+"'";
            String query2="update login set pin='"+rpin+"' where pin='"+pinnumber+"'";
            String query3="update signupthree set pin='"+rpin+"' where pin='"+pinnumber+"'";
            
            c.s.executeUpdate(query1);
            c.s.executeUpdate(query2);
            c.s.executeUpdate(query3);
            
            JOptionPane.showMessageDialog(null,"Pin Changed Successfully");
            setVisible(false);
            new Transactions(rpin).setVisible(true);

        } catch (Exception e) {

            System.out.println(e);
        }
    }

     else{
        setVisible(false);
        new Transactions(pinnumber).setVisible(true);
       
         }
}

public static void main(String args[]){
new pinchange("").setVisible(true);
}
}
