/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;

/**
 *
 * @author warun
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        try{
            Connection con = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-9THG3MUC;Database=lms;encrypt=false;","root","123456");

            return con;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
//        try
//            (
//                Class.forName("com.mysql.jdbc.Driver");
//                Connection con = DriverManager.getConnection("jdbc:mysql:");
//                return con;
//                )
//        catch(Exception e)
//              {
//                    System.out.println(e);
//                    return null;
//                    }
    }
}
