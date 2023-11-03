package bank.management.system;
import javax.swing.*; 
import java.awt.Color;
import java.awt.Font;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;



public class signup extends JFrame implements ActionListener{
    long random;
    JButton next;
    JRadioButton male, female, Married, Unmarried, Other;
    JTextField nameTextField, fnameTextField, EmailTextField, AddressTextField, CountryTextField, CityTextField, StateTextField, PinTextField;
    JDateChooser dateChooser;

    signup() {

        setLayout(null);

        Random ran = new Random();
        random = Math.abs(ran.nextLong() % 1000L);
        JLabel formno = new JLabel("Application form No. " + random);
        formno.setFont(new Font("Arial", Font.BOLD, 39));
        formno.setBounds(140, 20, 600, 40);
        add(formno);

        JLabel PersonalDetails = new JLabel("Page 1: " + "Personal Details ");
        PersonalDetails.setFont(new Font("Arial", Font.BOLD, 22));
        PersonalDetails.setBounds(240, 80, 400, 30);
        add(PersonalDetails);

        JLabel name = new JLabel("Name: ");
        name.setFont(new Font("Arial", Font.BOLD, 22));
        name.setBounds(100, 140, 100, 30);
        add(name);

        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Arial", Font.BOLD, 14));
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);

        JLabel fname = new JLabel("Father Name: ");
        fname.setFont(new Font("Arial", Font.BOLD, 22));
        fname.setBounds(100, 190, 200, 30);
        add(fname);

        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Arial", Font.BOLD, 14));
        fnameTextField.setBounds(300, 190, 400, 30);
        add(fnameTextField);

        JLabel dob = new JLabel("Date of Birth: ");
        dob.setFont(new Font("Arial", Font.BOLD, 22));
        dob.setBounds(100, 240, 300, 30);
        add(dob);

         dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 240, 200, 30);
        dateChooser.setBounds(300, 240, 400, 30);
        add(dateChooser);

//        JTextField dobTextField=new JTextField("ex-12/03/2002");
//        dobTextField.setFont(new Font("Arial",Font.BOLD,14));
//        dobTextField.setBounds(300, 240, 400, 30);
//        add(dobTextField);
        JLabel Gender = new JLabel("Gender: ");
        Gender.setFont(new Font("Arial", Font.BOLD, 22));
        Gender.setBounds(100, 290, 100, 30);
        add(Gender);

        male = new JRadioButton("Male");
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.WHITE);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(380, 290, 100, 30);
        female.setBackground(Color.WHITE);
        add(female);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add((female));

        JLabel Email = new JLabel("Email Id: ");
        Email.setFont(new Font("Arial", Font.BOLD, 22));
        Email.setBounds(100, 340, 300, 30);
        add(Email);

        EmailTextField = new JTextField();
        EmailTextField.setFont(new Font("Arial", Font.BOLD, 14));
        EmailTextField.setBounds(300, 340, 400, 30);
        add(EmailTextField);

        JLabel martialStatus = new JLabel("Martial Status: ");
        martialStatus.setFont(new Font("Arial", Font.BOLD, 22));
        martialStatus.setBounds(100, 390, 300, 30);
        add(martialStatus);

        Married = new JRadioButton("Married");
        Married.setBounds(300, 390, 70, 30);
        Married.setBackground(Color.WHITE);
        add(Married);

        Unmarried = new JRadioButton("UnMarried");
        Unmarried.setBounds(390, 390, 100, 30);
        Unmarried.setBackground(Color.WHITE);
        add(Unmarried);

        Other = new JRadioButton("Other");
        Other.setBounds(490, 390, 100, 30);
        Other.setBackground(Color.WHITE);
        add(Other);

        ButtonGroup OtherGroup = new ButtonGroup();
        OtherGroup.add(Married);
        OtherGroup.add(Unmarried);
        OtherGroup.add(Other);

        JLabel Address = new JLabel("Address: ");
        Address.setFont(new Font("Arial", Font.BOLD, 22));
        Address.setBounds(100, 440, 300, 30);
        add(Address);

        AddressTextField = new JTextField();
        AddressTextField.setFont(new Font("Arial", Font.BOLD, 14));
        AddressTextField.setBounds(300, 440, 400, 30);
        add(AddressTextField);

        JLabel City = new JLabel("City: ");
        City.setFont(new Font("Arial", Font.BOLD, 22));
        City.setBounds(100, 490, 300, 30);
        add(City);

        CityTextField = new JTextField();
        CityTextField.setFont(new Font("Arial", Font.BOLD, 14));
        CityTextField.setBounds(300, 490, 400, 30);
        add(CityTextField);

        JLabel State = new JLabel("State: ");
        State.setFont(new Font("Arial", Font.BOLD, 22));
        State.setBounds(100, 540, 300, 30);
        add(State);

        StateTextField = new JTextField();
        StateTextField.setFont(new Font("Arial", Font.BOLD, 14));
        StateTextField.setBounds(300, 540, 400, 30);
        add(StateTextField);

        JLabel Country = new JLabel("Country: ");
        Country.setFont(new Font("Arial", Font.BOLD, 22));
        Country.setBounds(100, 590, 300, 30);
        add(Country);

        CountryTextField = new JTextField();
        CountryTextField.setFont(new Font("Arial", Font.BOLD, 14));
        CountryTextField.setBounds(300, 590, 400, 30);
        add(CountryTextField);

        JLabel PinCode = new JLabel("Pin Code: ");
        PinCode.setFont(new Font("Arial", Font.BOLD, 22));
        PinCode.setBounds(100, 640, 300, 30);
        add(PinCode);

        PinTextField = new JTextField();
        PinTextField.setFont(new Font("Arial", Font.BOLD, 14));
        PinTextField.setBounds(300, 640, 400, 30);
        add(PinTextField);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setFont(new Font("Arial", Font.BOLD, 22));
        next.setBounds(620, 700, 100, 30);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);

        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }
  public void actionPerformed(ActionEvent ae){
        String formno=""+random;
        String name=nameTextField.getText();
        String fname=fnameTextField.getText();
        String  dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String Gender=null;
        if (male.isSelected()){
      Gender="Male";
  }
        else if(female.isSelected()){
            Gender="Female";
        }
          String Email=EmailTextField.getText();
          String martialStatus=null;
          if(Married.isSelected()){
              martialStatus="Married";
          }
          else if(Unmarried.isSelected()){
              martialStatus="Unmarried";
          }
          else if(Other.isSelected()){
               martialStatus="Other";
          }
        
          String Address=AddressTextField.getText();
          String City=CityTextField.getText();
          String Country=CountryTextField.getText();
          String State=StateTextField.getText();
          String PinCode=PinTextField.getText();
        
    try{
        if(name.equals("")){
           JOptionPane.showMessageDialog(null,"Name is Required"); 
        }
    
  } catch (Exception e)
          {
            System.out.println(e);  
          }
    
     try{
        if(fname.equals("")){
           JOptionPane.showMessageDialog(null,"FName is Required"); 
        }
        else{
            sql c=new sql();
            String query="insert into signup values ('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+Gender+"','"+Email+"','"+martialStatus+"','"+Address+"','"+City+"','"+Country+"','"+State+"','"+PinCode+"')";
            c.s.executeUpdate(query);
         
            setVisible(false);
            new signuptwo(formno).setVisible(true);
        }
    
  } catch (Exception e)
          {
            System.out.println(e);  
          }
 try{
        if(dob.equals("")){
           JOptionPane.showMessageDialog(null,"DOB is Required"); 
        }
    
  } catch (Exception e)
          {
            System.out.println(e);  
          }


}
    public static void main(String[] args) {
        new signup();
    }
}
