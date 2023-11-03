
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Transactions extends JFrame implements ActionListener {
    
    JButton deposit,Withdrawl,MiniStatement,pinchange,fastCash,balanceEnquiry,exit;
    String pinnumber;
    Transactions(String pinnumber)
    { 
        this.pinnumber=pinnumber;
        setLayout(null);
        
        ImageIcon li=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=li.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text=new JLabel("Please select Your Transaction");
        text.setBounds(220, 300,700, 35);
        text.setForeground(Color.white);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);
        
         deposit=new JButton("Deposit");
        deposit.setBounds(170, 415, 150, 30);
        deposit.addActionListener(this);
        image.add(deposit);
        
        
        Withdrawl=new JButton("Cash Withdrawal");
        Withdrawl.setBounds(355, 415, 150, 30);
        Withdrawl.addActionListener(this);
        image.add(Withdrawl);
        
        fastCash=new JButton("Fast Cash");
        fastCash.setBounds(170, 450, 150, 30);
        fastCash.addActionListener(this);
        image.add(fastCash);
        
        MiniStatement=new JButton("Mini Statement");
        MiniStatement.setBounds(355, 450, 150, 30);
        MiniStatement.addActionListener(this);
        image.add(MiniStatement);
        
         pinchange=new JButton("Pin Change");
        pinchange.setBounds(170, 485, 150, 30);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
         balanceEnquiry=new JButton("Balance Enquiry");
        balanceEnquiry.setBounds(355, 485, 150, 30);
        balanceEnquiry.addActionListener(this);
        image.add(balanceEnquiry);
        
         exit=new JButton("Exit");
        exit.setBounds(355, 520, 150, 30);
        exit.addActionListener(this);
        image.add(exit);
        
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==exit){
            System.exit(0);
        }else if(ae.getSource()==deposit){
            setVisible(false);
            new deposit(pinnumber).setVisible(true);
        }else if(ae.getSource()==Withdrawl){
            setVisible(false);
            new withdrawal(pinnumber).setVisible(true);
        }else if(ae.getSource()==fastCash){
            setVisible(false);
            new fastcash(pinnumber).setVisible(true);
        }else if(ae.getSource()==pinchange){
            setVisible(false);
            new pinchange(pinnumber).setVisible(true);
    }
    }
    public static void main(String args[]){
        new Transactions("");
    }
}
