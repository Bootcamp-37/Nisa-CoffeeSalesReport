/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ojdbcexercise.controllers;

import java.sql.Date;
import java.text.ParseException;

import java.util.List;
import ojdbcexercise.daos.TransactionDao1;
import ojdbcexercise.models.Beverages;
import ojdbcexercise.models.Employee1;
import ojdbcexercise.models.Transaction1;

import ojdbcexercise.models.Transactionbeverage;
import ojdbcexercise.tools.Koneksi;

/**
 *
 * @author Laila
 */
public class TransactionController1 {

    TransactionDao1 transactionDao1;

    /**
     * instanciating connection by Koneksi class from RelationDao1 class
     */

    public TransactionController1() {
        this.transactionDao1 = new TransactionDao1(new Koneksi().getConnection());
    }
/**
 * This method is called when you want to show all the transaction beverage data
 * @return the list of transaction beverage data
 */
    public List<Transactionbeverage> getDataTransaction() {
        return transactionDao1.getTransBev();
    }
    /**
     * This method is called when you want to show all the transaction data
     * @return the list of transaction data
     */
    public List<Transaction1> getDataTransaction1() {
        return transactionDao1.getTransaction1();
    }
/**
 * This method is called when you want to insert or update transaction table, you only need to input two parameters,
 * @param id
 * @param orderdate
 * @return true statement, if either successfully edit or insert data, or otherwise return false statement
 * @throws ParseException 
 */
public String insertUpdateTrans1(String id,String orderdate) throws ParseException {

           Date dateOrder= Date.valueOf(orderdate);
           Employee1 employee1 = new Employee1();
        Transaction1 transaction = new Transaction1(id, dateOrder, employee1);
        employee1.setId(62);
        return transactionDao1.updateTransaction(transaction,id) ?  "Data has been saved" : "Failed to save data";
    }
/**
 * This method is called when you want to update transaction beverage table, you only need to input four parameters,
 * @param transaction
 * @param beverage
 * @param quantity
 * @param description
 * @return true statement, if successfully edit data, or otherwise return false statement
 */
 public String updateTransbevController(String transaction, String beverage, String quantity, String description) {
        int quantityInt = Integer.parseInt(quantity);
Beverages beverages= new Beverages();
beverages.setId(beverage);
Transaction1 transaction1 = new Transaction1();
transaction1.setId(transaction);
        Transactionbeverage transbev = new Transactionbeverage();
        transbev.setBeverages(beverages);
        transbev.setTransaction1(transaction1);
        transbev.setQuantity(quantityInt);
        transbev.setDescription(description);
        return transactionDao1.updateTransactionBev(transbev) ?  "Data has been edited" : "Failed to edit data";
    }
/**
 * This method is called when you want to insert transaction table, you only need to input one parameter,
 * @param employee
 * @return true statement, if successfully insert data, or otherwise return false statement
 * @throws ParseException 
 */ 
    public String insertTrans(String employee) throws ParseException {
        Transaction1 transaction1 = new Transaction1();
        Employee1 employee1 = new Employee1();
        int employeeInt = Integer.parseInt(employee);
        employee1.setId(employeeInt);
        transaction1.setEmployee(employee1);
        return this.transactionDao1.insertTrans(transaction1) ? "Data has been saved" : "Failed to save data";
    }
    
/**
 * This method is called when you want to insert transaction beverage table, you only need to input three parameters,
 * @param beverage
 * @param quantity
 * @param desc
 * @return true statement, if successfully insert data, or otherwise return false statement
 * @throws ParseException 
 */    
    public String insertTransBev(String beverage, String quantity, String desc) throws ParseException {
        Transaction1 transaction1 = new Transaction1();
        Employee1 employee1 = new Employee1();
        Beverages bev = new Beverages();
        int quantityInt = Integer.parseInt(quantity);
employee1.setId(62);
transaction1.setId(transactionDao1.findLastInsertId().getId());
        transaction1.setEmployee(employee1);
        bev.setId(beverage);
        Transactionbeverage transbev = new Transactionbeverage();
        transbev.setBeverages(bev);
        transbev.setTransaction1(transaction1);
        transbev.setQuantity(quantityInt);
        transbev.setDescription(desc);

        transaction1.setId(transaction1.getId());
        return this.transactionDao1.insertTransBev(transbev) ? "Data has been saved" : "Failed to save data";
    }
/**
 * This method is called when you want to delete transaction beverage table, you only need to input two parameters,
 * @param beverage
 * @param transaction
 * @return true statement, if successfully delete data, or otherwise return false statement
 */    
    public String deleteTransBevController(String beverage, String transaction) {
          Beverages bev= new Beverages();
          bev.setId(beverage);
          Transaction1 transaction1= new Transaction1();
          transaction1.setId(transaction);
       Transactionbeverage transbev = new Transactionbeverage();
       transbev.setBeverages(bev);
       transbev.setTransaction1(transaction1);
        return transactionDao1.deleteTransBev(transbev) ? "Data has been deleted" : "Failed to delete data";
    }
    /**
     * This method called if you want to search id by name in beverage table, you only need one parameter
     * @param name
     * @return a whole beverage object
     */
 public Beverages getIdByNameBevController(String name) {
     
     return this.transactionDao1.findIdByNameBev(name);
    }
 /**
  * This method called if you want to search role by name in employee table, you only need one parameter
  * @param name
  * @return a whole employee object
  */
 public Employee1 getRoleByNameEmpController(String name) {
     
     return this.transactionDao1.findRoleByNameEmployee(name);
    }
 /**
  * This method will be called if you want to search last inserted id in transaction table
  * @return a whole transaction object
  */
    public Transaction1 getLastIdTransController() {
        return this.transactionDao1.findLastInsertEmployee();
    }
    /**
     * This method is called when you want to show all the transaction beverage data
     * @return the list of transaction beverage data
     */
 public List<Beverages> getDataBeverageses() {
        return transactionDao1.getBeverages();
    }
 /**
  * This method will be called if you want to search id data in transaction beverage table, by the id
  * @param trans
  * @param bev
  * @return a whole transaction beverage 
  */
 public Transactionbeverage getByIdTransBevController(String trans, String bev){
         return this.transactionDao1.findByIdTransBev(trans, bev);
     }
}
