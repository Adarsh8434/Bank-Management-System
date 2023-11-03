
package bank.management.system;

import java.sql.*;

public class sql {
    Connection c;
    Statement s;
    public sql(){
        try{
          
            c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","student");
            s=c.createStatement();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
//create statement
//create connection