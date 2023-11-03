
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class signupthree extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno;
    signupthree(String formno){
        this.formno=formno;
        setLayout(null);
      JLabel  L1=new JLabel ("Page 3: Account Details");
      L1.setFont(new Font("Raleway",Font.BOLD,22));
      L1.setBounds(280,40,400,40);
      add(L1);
      
      JLabel type =new JLabel ("Account type");
       type.setFont(new Font("Raleway",Font.BOLD,22));
      type.setBounds(100,140,200,30);
      add(type);
      
      r1=new JRadioButton("Saving Account");
      r1.setFont(new Font ("Raleway",Font.BOLD,16));
      r1.setBounds(100, 180, 150,20);
      r1.setBackground(Color.white);
      add(r1);
      
      r2=new JRadioButton("Current");
      r2.setFont(new Font("Raleway",Font.BOLD,16));
      r2.setBounds(100,220,150,20);
      r2.setBackground(Color.white);
      add(r2);
      
      r3=new JRadioButton("Fixed deposit");
      r3.setFont(new Font("Raleway",Font.BOLD,16));
      r3.setBackground(Color.white);
      r3.setBounds(300, 180, 250, 20);
      add(r3);
      
      r4=new JRadioButton("Recurring Account");
      r4.setFont(new Font("Raleway",Font.BOLD,16));
      r4.setBackground(Color.white);
      r4.setBounds(300, 220, 250, 20);
      add(r4);
      
      ButtonGroup account=new ButtonGroup();
      account.add(r1);
      account.add(r2);
      account.add(r3);
      account.add(r4);
      
       JLabel card =new JLabel ("Card Number");
       card.setFont(new Font("Raleway",Font.BOLD,22));
      card.setBounds(100,260,200,30);
      add(card);
      
       JLabel number =new JLabel ("xxxx-xxxx-xxxx-2344");
       number.setFont(new Font("Raleway",Font.BOLD,22));
      number.setBounds(300,260,280,30);
      add(number);
      
      JLabel cardDetails =new JLabel ("Your 16 Digit Card Number");
       cardDetails.setFont(new Font("Raleway",Font.BOLD,10));
      cardDetails.setBounds(100,280,280,20);
      add(cardDetails);
      
        JLabel pin =new JLabel ("Pin:");
       pin.setFont(new Font("Raleway",Font.BOLD,22));
      pin.setBounds(100,320,200,30);
      add(pin);
      
       JLabel pnumber =new JLabel ("xxxx");
       pnumber.setFont(new Font("Raleway",Font.BOLD,22));
      pnumber.setBounds(300,320,200,30);
      add(pnumber);
      
      JLabel pinDetails =new JLabel ("Your 4 digit pin");
       pinDetails.setFont(new Font("Raleway",Font.BOLD,10));
      pinDetails.setBounds(100,340,280,20);
      add(pinDetails);
      
       JLabel service =new JLabel ("Services Required :");
       service.setFont(new Font("Raleway",Font.BOLD,20));
      service.setBounds(100,380,230,30);
      add(service);
      
      c1=new JCheckBox("Atm Card");
      c1.setBackground(Color.white);
      c1.setBounds(100, 420, 150, 30);
      c1.setFont(new Font("Raleway",Font.BOLD,15));
      add(c1);
      
      c2=new JCheckBox("Internet Banking");
      c2.setFont(new Font("Raleway",Font.BOLD,15));
      c2.setBounds(100,460,150,30);
      c2.setBackground(Color.white);
      add(c2);
      
      c3=new JCheckBox("Mobile Banking");
      c3.setBackground(Color.white);
      c3.setBounds(300, 420,200, 30);
      c3.setFont(new Font("Raleway",Font.BOLD,15));
      add(c3);
      
      c4=new JCheckBox("Email & Sms Alert");
      c4.setBounds(300,460, 200, 30);
      c4.setBackground(Color.white);
      c4.setFont(new Font("Raleway",Font.BOLD,15));
      add(c4);
      
      c5=new JCheckBox("CheckBox");
      c5.setBackground(Color.white);
      c5.setBounds(100, 500, 150, 30);
      c5.setFont(new Font("Raleway",Font.BOLD,15));
      add(c5);
      
      c6=new JCheckBox("E statement");
      c6.setBackground(Color.white);
      c6.setBounds(300, 500, 200, 30);
      c6.setFont(new Font("Raleway",Font.BOLD,15));
      add(c6);
      
      c7=new JCheckBox("I hereby declare that all the information provided by me is correct");
      c7.setBounds(100, 620, 800, 30);
      c7.setBackground(Color.white);
      c7.setFont(new Font("Raleway",Font.BOLD,10));
      add(c7);
      
      submit=new JButton("Submit");
      submit.setBackground(Color.black);
      submit.setFont(new Font("Raleway",Font.BOLD,18));
      submit.setBounds(220,680,120,20);
      submit.setForeground(Color.white);
      submit.addActionListener(this);
      add(submit);
      
      cancel=new JButton("Clear");
      cancel.setBackground(Color.BLACK);
      cancel.setForeground(Color.white);
      cancel.setFont(new Font("Raleway",Font.BOLD,18));
      cancel.setBounds(380,680,120, 20);
      cancel.addActionListener(this);
      add(cancel);
      
//      frame color change
getContentPane().setBackground(Color.white);


      setSize(850,820);
      setLocation(350,0);
      setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
            String accountType=null;
            if(r1.isSelected()){
                accountType="Saving Account";
            }else if(r2.isSelected()){
                accountType="Current";
            }else if(r3.isSelected()){
                accountType="Fixed deposit";
            }else if(r4.isSelected()){
                accountType="Recurring Account";
            }
            
            Random random=new Random();
            String cardnumber=""+ Math.abs((random.nextLong()%90000000L)+5040936000000000L);
            String pinnumber=""+Math.abs((random.nextLong()%9000L)+1000L);
            
            String facility="";
            
            if(c1.isSelected()){
                facility=facility+"Atm card";
            }else if(c2.isSelected()){
                facility=facility+"Internet Banking";
            }else if(c3.isSelected()){
                facility=facility+"Mobile Banking";
            }else if(c4.isSelected()){
                facility=facility+"Email & Sms Alerts";
            }else if(c5.isSelected()){
                facility=facility+"Cheque Book ";
            }else if(c6.isSelected()){
                facility=facility+"E-statement";
            }
            
            try{
                if(accountType.equals("")){
                    JOptionPane.showMessageDialog(null,"Account type is required");
            }else{
                 sql conn=new sql();
                 String query1="insert into signupthree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                 String query2="insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
               conn.s.executeUpdate(query1);
               conn.s.executeUpdate(query2);
                JOptionPane.showMessageDialog(null,"Card number :"+cardnumber + "\nPin :"+pinnumber);
              
                setVisible(false);
                new deposit(pinnumber).setVisible(false);
                }
            }catch(Exception e){
               System.out.println(e);
            }
            
            
            
        }else if(ae.getSource()==cancel){
         setVisible(false);
         new Login().setVisible(true);
        }
    }
    public static void main(String args[]){
        new signupthree("");
        
    }
}
