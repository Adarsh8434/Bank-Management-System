
package bank.management.system;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener
{
    JButton login,clear,signup;
    JTextField cardTextField;
    JPasswordField pinTextField;
    Login(){
            setTitle("Automated Tailor Machine");
            ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
            setLayout(null);
            Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
            ImageIcon i3=new ImageIcon(i2);
            JLabel label=new JLabel(i3);
            label.setBounds(70, 10, 100, 100);

            getContentPane().setBackground(Color.white);
            add(label);
        
         
          JLabel text=new JLabel("Welcome to atm");
         text.setBounds(200, 40, 400, 40);
         text.setFont(new Font("Osward",Font.BOLD,38));
         add(text);
        

         JLabel cardno=new JLabel("Card No:");
         cardno.setBounds(110, 180, 180, 40);
         cardno.setFont(new Font("Osward",Font.BOLD,38));
         add(cardno);
         cardTextField=new JTextField();
         cardTextField.setBounds(300, 180,230, 40);
         cardTextField.setFont(new Font("Arial",Font.BOLD,14));
         add(cardTextField);

         JLabel pin=new JLabel("PIN:");
         pin.setBounds(110, 230, 180, 40);
         pin.setFont(new Font("Osward",Font.BOLD,38));
         add(pin);
         pinTextField=new JPasswordField();
         pinTextField.setBounds(300, 230,230, 40);
         pinTextField.setFont(new Font("Arial",Font.BOLD,14));
         add(pinTextField);

         login=new JButton("SIGN IN");
         login.setBounds(300, 300, 100, 30);
         login.setForeground(Color.white);
         login.setBackground(Color.black);
         login.addActionListener(this);
         add(login);

         clear=new JButton("Clear ");
         clear.setBounds(430, 300, 100, 30);
         clear.setForeground(Color.white);
         clear.setBackground(Color.black);
         clear.addActionListener(this);
         add(clear);

         signup=new JButton("Sign Up ");
         signup.setBounds(300, 350, 230, 30);
         signup.setForeground(Color.white);
         signup.setBackground(Color.black);
         signup.addActionListener(this);
         add(signup);

        setSize(900,450);
        setVisible(true);
        setLocation(350,200);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==clear){
         cardTextField.setText("");
         pinTextField.setText("");
        }else if(ae.getSource()==login){
          sql c=new sql();
          String cardnumber=cardTextField.getText();
          String pinnumber=pinTextField.getText();
          String query="select * from login where cardnumber='"+cardnumber+"' and pin= '"+pinnumber+"'";
        try{
           ResultSet rs= c.s.executeQuery(query);
           if(rs.next()){
               setVisible(false);
               new Transactions(pinnumber).setVisible(true);
           }else{
               JOptionPane.showMessageDialog(null,"Incorrect Card Number or Pin");
           }
        }catch(Exception e){
           System.out.println(e);
        }
        
        }else if(ae.getSource()==signup){
           setVisible(false);
           new signup().setVisible(true);
        }
    }
    public static void main(String[] args) 
    {
        new Login();
    }
}
