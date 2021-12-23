/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Cristian
 */
public class DataBase {
       public String driver = "com.mysql.cj.jdbc.Driver";
    public Connection getConection() throws SQLException, ClassNotFoundException{
        Class.forName(driver);

        Connection conexion=null;
        try{
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/comision1109","root","");
        }catch(SQLException e){
            System.out.println(e.toString());
        }
        return conexion;
    }
     public static void main(String [] argms) throws ClassNotFoundException, SQLException{
        DataBase com = new DataBase();
        com.getConection();
        System.out.println("hola");
    }
}
