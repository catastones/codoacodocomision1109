/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;


import java.sql.*;
import java.util.logging.*;

/**
 *
 * @author Cristian
 */
public class BaseDatos {
    
        public String driver = "com.mysql.cj.jdbc.Driver";
    public Connection getConection()throws SQLException{
        Connection conexion=null;
        try{
            Class.forName(driver);
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/comision1109",
                    "root","123456");
        }catch(SQLException e){
            System.out.println(e.toString());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;
    } 
    
     public static void main(String [] argms) throws SQLException{
        BaseDatos con = new BaseDatos();
        
        //Connection  conexion =null;
        Connection conexion = con.getConection();
        
        PreparedStatement ps;
        ResultSet rs;
        
        ps = conexion.prepareStatement("SELECT * FROM participantes");
        rs = ps.executeQuery();
        
        while(rs.next()){
            int id = rs.getInt("id");
            String nombres = rs.getString("nombre");
             String apellidos = rs.getString("apellido");
             String email = rs.getString("email");
             String telefono = rs.getString("telefono");
            System.out.println("id: "+ id +" Nombre: "+ nombres +" Apellido: "
                    +apellidos+ "Email: "+ email + "Telefono: "+telefono);
        }
        
    }
    
}
