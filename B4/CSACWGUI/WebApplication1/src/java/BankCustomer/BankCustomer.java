/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankCustomer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author admin
 */
@WebService(serviceName = "BankCustomer")
public class BankCustomer {
Connection connection;
 Statement stmt;
 
    /**
     * Web service operation
     */
    @WebMethod(operationName = "addCustomer")
    @Oneway
    
    //Operation for inserting customer
    public void addCustomer(@WebParam(name = "sql") String sql) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/customer";
        String userName = "root";
        String passWord = "";
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            System.err.println("Driver not found please install the driver");
        }
        try {
            connection = DriverManager.getConnection(url,userName,passWord);
        } catch (SQLException ex) {
            System.err.println("Not Connected to Database Please Start the Connection");
        }
        try
        {
            stmt = connection.createStatement();
            stmt.executeUpdate(sql);
        }  
        catch (SQLException e){
            e.printStackTrace();
        } 
        finally{
            if (connection != null){
                try {
                    connection.close();
                } catch (SQLException ex) {
                    System.err.println("Cannot Close Connection");
                }
            }
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "deleteCustomer")
    @Oneway
    
    //Operation for deleting customer
    public void deleteCustomer(@WebParam(name = "sql") String sql) {
    String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/customer";
        String userName = "root";
        String passWord = "";
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            System.err.println("Driver not found please install the driver");
        }
        try {
            connection = DriverManager.getConnection(url,userName,passWord);
        } catch (SQLException ex) {
            System.err.println("Not Connected to Database Please Start the Connection");
        }
        try
        {
            stmt = connection.createStatement();
            stmt.executeUpdate(sql);
        }  
        catch (SQLException e){
            e.printStackTrace();
        } 
        finally{
            if (connection != null){
                try {
                    connection.close();
                } catch (SQLException ex) {
                    System.err.println("Cannot Close Connection");
                }
            }
        }
    }

//Web Service operation for displaying customer list
    @WebMethod(operationName = "customerList")
    public ResultSet customerList(@WebParam(name = "sql") String sql) throws SQLException {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/customer";
        String userName = "root";
        String passWord = "";
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            System.err.println("Driver not found please install the driver");
        }
        try {
            connection = DriverManager.getConnection(url,userName,passWord);
        } catch (SQLException ex) {
            System.err.println("Not Connected to Database Please Start the Connection");
        }
        try
        {
            stmt = connection.createStatement();
        }  
        catch (SQLException e){
            e.printStackTrace();
        } 
        finally{
            if (connection != null){
                try {
                    connection.close();
                } catch (SQLException ex) {
                    System.err.println("Cannot Close Connection");
                }
            }
        }
    return stmt.executeQuery(sql);
    }
}