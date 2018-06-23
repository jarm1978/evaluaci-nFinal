/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.evaluacion.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jorge Ramirez
 */
public class Conexion {
    private static String servidor ="jdbc:mysql://localhost:3306/hospital";
    private static String user ="root";
    private static String pass ="";
    private static String driver ="com.mysql.jdbc.Driver";
    private static Connection conexion;
    
    public Conexion(){
        
        try{
            Class.forName(driver);
            conexion= DriverManager.getConnection(servidor, user,pass);
        } catch (ClassNotFoundException | SQLException e){
            
        }  
    }
    public Connection getConnection (){
        return conexion;
    }
}
