/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armydb;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;

/**
 *
 * @author Prerana raykar
 */
public class army {

    
    Statement s;
    Connection cn;
    public static Connection getCon(){
       // Connection cn=null;
        try{
           Class.forName("com.mysql.jdbc.Driver");
           String s1="jdbc:mysql://localhost:3307/armydb?characterEncoding=latin1";
           Connection cn=DriverManager.getConnection(s1,"root","prerana21");
           return cn;
        }
        catch(Exception ex){
            System.out.println(ex);
            return null;
        }
    }
}
