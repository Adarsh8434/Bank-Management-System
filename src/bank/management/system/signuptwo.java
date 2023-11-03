package bank.management.system;

import javax.swing.*; 
import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.event.*;



public class signuptwo extends JFrame implements ActionListener{
    
    JButton next;
    JRadioButton syes, Sno,Eno,Eyes;
    JTextField pan, Addhar,Purpose;
    JComboBox religion,Occupation,Education,Income,Category;
    String formno;
    signuptwo(String formno) {
         this.formno=formno;
        setLayout(null);
        setTitle("New Account Application form-Page 2 ");

       

        JLabel additionalDetails = new JLabel("Page 2: " + "Additional Details ");
        additionalDetails.setFont(new Font("Arial", Font.BOLD, 22));
        additionalDetails.setBounds(240, 80, 400, 30);
        add(additionalDetails);

        JLabel name = new JLabel("Religion: ");
        name.setFont(new Font("Arial", Font.BOLD, 22));
        name.setBounds(100, 140, 100, 30);
        add(name);
        
        String valReligion[]={"Hindu","Christain","Sikh","Jain","Muslim","Other"};
        religion =new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.white);
        add(religion);
        
        
       

        JLabel fname = new JLabel("Category: ");
        fname.setFont(new Font("Arial", Font.BOLD, 22));
        fname.setBounds(100, 190, 200, 30);
        add(fname);

        String valCategory[]={"General","OBC","SC","ST","Other"};
         Category=new JComboBox(valCategory);
        Category.setBackground(Color.white);
        Category.setBounds(300, 190, 400, 30);
        add(Category);
        
        
      

        JLabel dob = new JLabel("Income: ");
        dob.setFont(new Font("Arial", Font.BOLD, 22));
        dob.setBounds(100, 240, 300, 30);
        add(dob);
        
        String valIncome[]={"0-200000","2000000-400000","400000-800000","100000 or more"};
         Income=new JComboBox(valIncome);
         Income.setBounds(300, 240, 400, 30);
         Income.setBackground(Color.white);
        add(Income);
        
         


        JLabel Gender = new JLabel("Education ");
        Gender.setFont(new Font("Arial", Font.BOLD, 22));
        Gender.setBounds(100, 290, 200, 30);
        add(Gender);

         JLabel Email = new JLabel("Qualification: ");
        Email.setFont(new Font("Arial", Font.BOLD, 22));
        Email.setBounds(100, 315, 200, 30);
        add(Email);
        
        String ValEducation[]={"Matric","InterMediate","Graduation","Post Graduation","PHD"};
         Education=new JComboBox(ValEducation);
        Education.setBackground(Color.white);
        Education.setBounds(300, 315, 200, 30);
        add(Education);

       

        JLabel martialStatus = new JLabel("Occupation: ");
        martialStatus.setFont(new Font("Arial", Font.BOLD, 22));
        martialStatus.setBounds(100, 390, 300, 30);
        add(martialStatus);

        String valOccupation[]={"Student","Salaried Employee","Self-Employed","Bussinessman","Retired"};
        Occupation=new JComboBox(valOccupation);
        Occupation.setBackground(Color.white);
        Occupation.setBounds(300, 390, 70, 30);
        add(Occupation);
       

        JLabel pancard = new JLabel("PAN No: ");
        pancard.setFont(new Font("Arial", Font.BOLD, 22));
        pancard.setBounds(100, 440, 300, 30);
        add(pancard);

        pan = new JTextField();
        pan.setFont(new Font("Arial", Font.BOLD, 14));
        pan.setBounds(300, 440, 400, 30);
        add(pan);

        JLabel City = new JLabel("Addhar no: ");
        City.setFont(new Font("Arial", Font.BOLD, 22));
        City.setBounds(100, 490, 300, 30);
        add(City);

        Addhar = new JTextField();
        Addhar.setFont(new Font("Arial", Font.BOLD, 14));
        Addhar.setBounds(300, 490, 400, 30);
        add(Addhar);

        JLabel State = new JLabel("Senior Citizen: ");
        State.setFont(new Font("Arial", Font.BOLD, 22));
        State.setBounds(100, 540, 300, 30);
        add(State);

        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        Sno=new JRadioButton("No");
        Sno.setBounds(450,540,100,30);
        Sno.setBackground(Color.white);
        add(Sno);
        
         ButtonGroup Senior = new ButtonGroup();
        Senior.add(syes);
        Senior.add((Sno));


        JLabel Country = new JLabel("Existing Account ");
        Country.setFont(new Font("Arial", Font.BOLD, 22));
        Country.setBounds(100, 590, 300, 30);
        add(Country);

        Eyes = new JRadioButton("Yes");
        Eyes.setBounds(300, 590, 100, 30);
        Eyes.setBackground(Color.WHITE);
        add(Eyes);
        
        Eno=new JRadioButton("No");
        Eno.setBounds(450,590,100,30);
        Eno.setBackground(Color.white);
        add(Eno);
        
         ButtonGroup existing = new ButtonGroup();
        existing.add(Eyes);
        existing.add(Eno);

        JLabel PinCode = new JLabel("Purpose: ");
        PinCode.setFont(new Font("Arial", Font.BOLD, 22));
        PinCode.setBounds(100, 640, 300, 30);
        add(PinCode);

        Purpose = new JTextField();
        Purpose.setFont(new Font("Arial", Font.BOLD, 14));
        Purpose.setBounds(300, 640, 400, 30);
        add(Purpose);

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
        
        String sreligion=(String)religion.getSelectedItem();
        String scategory=(String)Category.getSelectedItem();
        String sIncome=(String)Income.getSelectedItem();
        String seducation=(String)Education.getSelectedItem();
        String sOccupation=(String)Occupation.getSelectedItem();
        String SeniorCitizen=null;
        if (syes.isSelected()){
      SeniorCitizen="Yes";
  }
        else if(Sno.isSelected()){
            SeniorCitizen="No";
        }
          
          String existingAcc=null;
          if(Eyes.isSelected()){
              existingAcc="yes";
          }
          else if(Eno.isSelected()){
              existingAcc="No";
          }
        
        
          String span=pan.getText();
          String saddhar=Addhar.getText();
          String spurpose=Purpose.getText();
         
   
    
     try{
       
        
            sql c=new sql();
            String query="insert into signuptwo values ('"+formno+"','"+sreligion+"','"+scategory+"','"+sIncome+"','"+seducation+"','"+sOccupation+"','"+SeniorCitizen+"','"+existingAcc+"','"+span+"','"+saddhar+"','"+spurpose+"')";
            c.s.executeUpdate(query);
//         signup3 Object
        setVisible(false);
        new signupthree(formno).setVisible(true) ;


  } catch (Exception e)
          {
            System.out.println(e);  
          }


}
    public static void main(String[] args) {
        new signuptwo("");
    }
}
