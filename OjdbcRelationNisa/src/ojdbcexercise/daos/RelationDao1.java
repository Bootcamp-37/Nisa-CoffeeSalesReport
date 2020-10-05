/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ojdbcexercise.daos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ojdbcexercise.models.Account;
import ojdbcexercise.models.Employee1;

import ojdbcexercise.tools.GenerateToken;
import oracle.jdbc.OracleTypes;
import tools.BCrypt;

/**
 *
 * @author Laila
 */
public class RelationDao1 {

    private Connection connection;
/**
 * instanciation of relationdao1 class
 * @param connection 
 */
    public RelationDao1(Connection connection) {
        this.connection = connection;
    }

    public RelationDao1() {
    }
    /**
     * This method is called when you want to login
     * @param employee
     * @return true if you successfully logged, or no if you cant logged
     */
    public boolean login1(Employee1 employee) {
        String query = "select * from employee1 where (name=?) and (password=?)";
        try {
            PreparedStatement preparedStatement = this.connection.prepareStatement(query);

            preparedStatement.setString(1, employee.getName());
            preparedStatement.setString(2, employee.getPassword());
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String hash = BCrypt.hashpw(employee.getPassword(), BCrypt.gensalt());
                if (BCrypt.checkpw(employee.getPassword(), hash)) {
                    return true;
                }

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return false;
    }
/**
 * This method is called when you want to register
 * @param employee
 * @return boolean true, if successfully register, or otherwise
 */

    public boolean registerAccount1(Employee1 employee) {
        boolean result = false;

        String query = "INSERT INTO employee1 (NAME,PASSWORD, ROLE,EMAIL,CODE) VALUES (?,?,?,?,?)";
String code= GenerateToken.generateCode();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            preparedStatement.setString(1, employee.getName());
            preparedStatement.setString(2, employee.getPassword());
            preparedStatement.setInt(3, employee.getRole());
            preparedStatement.setString(4, employee.getEmail());
            preparedStatement.setString(5, code);
            preparedStatement.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return result;

    }
    /**
     * This method is use to take account object from parameter token
     * @param token
     * @return the whole object account
     */
    public Account findByTokenAccount(String token) {
        Account account = null;
        String query = "select * from account where token = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, token);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                account = new Account(resultSet.getInt(1), resultSet.getString(2), 
                        resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return account;
    }
    /**
     * This method is use to take account object from parameter username
     * @param username
     * @return the whole object account
     */
    public String findByUsernameAccount(String username) {
        String email= "";
        Account account = null;
        String query = "select email from account where username = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
               email= resultSet.getString("email");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return email;
    }
    
    /**
     * This method is use to take token data in account's object from parameter username
     * @param username
     * @return token
     */
    public String findTokenByUsernameAccount(String username) {
        String token= "";
        Account account = null;
        String query = "select token from account where username = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
               token= resultSet.getString("token");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return token;
    }
    
    
   /**
    * This method called when you forgot the password,
    * @param account
    * @return true if successfully change password, or otherwise
    */
     public boolean changePassword(Account account) {
        boolean result = false;

        String query = "UPDATE Account SET password=? WHERE (token = ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, account.getA_password());
            preparedStatement.setString(2, account.getA_token());
            
            preparedStatement.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return result;

    }
}
