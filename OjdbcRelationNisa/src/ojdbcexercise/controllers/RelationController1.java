/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ojdbcexercise.controllers;

import java.util.List;
import ojdbcexercise.daos.RelationDao1;
import ojdbcexercise.models.Account;
import ojdbcexercise.models.Employee1;
import ojdbcexercise.tools.Koneksi;

/**
 *
 * @author Laila
 */
public class RelationController1 {
      RelationDao1 relationDao1;
/**
 * instanciating connection by Koneksi class from RelationDao1 class
 */
    public RelationController1() {
        this.relationDao1 = new RelationDao1(new Koneksi().getConnection());
    }

/**
 * This method is called when you want to login
 * Use two parameter
 * @param username
 * @param password
 * @return true if you successfully logged, or no if you cant logged
 */
    public boolean Login1(String username, String password){
        Employee1 employee = new Employee1();
        employee.setName(username);
        employee.setPassword(password);
        
        return this.relationDao1.login1(employee)?true:false;
    }
/**
 * This method is called when you want to register
 * have 3 parameters to input
 * @param username
 * @param password
 * @param email
 * @param role
 * @return statement true, if successfully register, or otherwise
 */    
    public String registerAccount1(String username,String password,String email,int role) {

       Employee1 employee=new Employee1(username, password,email, role);
        return relationDao1.registerAccount1(employee) ?  "Your data is registered, please check your email" : "Failed to register";
    }
    
    /**
     * This method is use to take account object from parameter token
     * @param token
     * @return the whole object account
     */
public Account getByTokenAccountController(String token){
         return this.relationDao1.findByTokenAccount(token);
     }
/**
 * This method is use to take account object from parameter username
 * @param username
 * @return the whole object account
 */
public String getByUsernameAccountController(String username){
   
    return this.relationDao1.findByUsernameAccount(username);
     }
/**
 * This method is use to take token data in account's object from parameter username
 * @param username
 * @return token
 */
public String getTokenByUsernameAccountController(String username){
   
    return this.relationDao1.findTokenByUsernameAccount(username);
     }
/**
 * This method called when you forgot the password, in this method you must enter two parameter,
 * @param password
 * @param token
 * @return statement true if successfully change password, or otherwise
 */
public String changePass(String password, String token) {
        
        Account account = new Account();
        account.setA_password(password);
        account.setA_token(token);
        return relationDao1.changePassword(account) ? "Password succesfully changed" : "Failed to change password";
    }

}
