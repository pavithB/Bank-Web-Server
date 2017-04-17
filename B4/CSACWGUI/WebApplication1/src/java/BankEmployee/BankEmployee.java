/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankEmployee;

import static java.lang.String.valueOf;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
@WebService(serviceName = "BankEmployee")
public class BankEmployee {
 Connection connection;
 Statement stmt;
 PreparedStatement statement ;
 ResultSet rs ;
    /**
     * Web service operation
     * @param sql
     */
    @WebMethod(operationName = "addEmployee")
    @Oneway
    
    //Code for inserting bank employee
    public void addEmployee(@WebParam(name = "sql") String sql) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/employee";
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
    @WebMethod(operationName = "deleteEmployee")
    @Oneway
    //code for deleting bank employee
    public void deleteEmployee(@WebParam(name = "sql") String sql) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/employee";
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
    @WebMethod(operationName = "login")
    public void login(@WebParam(name = "uName") String uName, @WebParam(name = "pWord") String pWord) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/employee";
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
        String sql = "select * from employee where emp_UserName=? and emp_PassWord=?";
        try {
            statement = connection.prepareStatement(sql);
            statement.setString(1, uName);
            statement.setString(2, pWord);
            rs = statement.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Login Successfull!");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Login! Please try again");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "employeeList")
    public ResultSet employeeList(@WebParam(name = "sql") String sql) throws SQLException {
      String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/employee";
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