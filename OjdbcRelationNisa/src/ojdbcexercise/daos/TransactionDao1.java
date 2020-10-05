/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ojdbcexercise.daos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ojdbcexercise.models.Beverages;
import ojdbcexercise.models.Employee1;
import ojdbcexercise.models.Transaction1;
import ojdbcexercise.models.Transactionbeverage;

import oracle.jdbc.OracleTypes;

/**
 *
 * @author Laila
 */
public class TransactionDao1 {
    private Connection connection;
/**
 * instanciating connection by Koneksi class from RelationDao1 class
 */
    public TransactionDao1() {
    }

    public TransactionDao1(Connection connection) {
        this.connection = connection;
    }
    
/**
 * This method is called when you want to show all the transaction beverage data
 * @return the list of transaction beverage data
 */
public List<Transactionbeverage> getTransBev() {
        List<Transactionbeverage> transbevs = new ArrayList<>();
        List<Transaction1> transs = new ArrayList<>();
        List<Employee1> employee1s = new ArrayList<>();
        List<Beverages> bevs = new ArrayList<>();
        String query = "select e.name, t.orderdate, t.id, b.name bevname, tb.quantity, b.price, tb.description "
                + "from employee1 e "
                + "join transaction1 t "
                + "on e.id=t.employee "
                + "join transactionbeverage tb "
                + "on tb.transaction= t.id "
                + "join beverages b on b.id= tb.beverage order by t.id asc";
        try {
            PreparedStatement preparedStatement = this.connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            ResultSetMetaData metaData= resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            while (resultSet.next()) {
                Transactionbeverage transbev= new Transactionbeverage();
                Transaction1 trans = new Transaction1();
                Beverages bev= new Beverages();
                Employee1 emp = new Employee1();
                emp.setName(resultSet.getString("name"));
                trans.setOrderdate(resultSet.getDate("orderdate"));
                trans.setId(resultSet.getString("id"));
                bev.setName(resultSet.getString("bevname"));
                transbev.setQuantity(resultSet.getInt("quantity"));
                bev.setPrice(resultSet.getInt("price"));
                transbev.setDescription(resultSet.getString("description"));
                transbev.setBeverages(bev);
                transbev.setTransaction1(trans);
                trans.setEmployee(emp);
                transbevs.add(transbev);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return transbevs;
    }

/**
 * This method is called when you want to show all the transaction data
 * @return the list of transaction 
 */
  public List<Transaction1> getTransaction1() {
        List<Transaction1> transactions = new ArrayList<>();
        List<Employee1> employees = new ArrayList<>();
        String query = "select * from Transaction1";
        try {
            PreparedStatement preparedStatement = this.connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Employee1 employee1= new Employee1();
                Transaction1 transaction1 = new Transaction1();
                transaction1.setId(resultSet.getString(1));
                transaction1.setOrderdate(resultSet.getDate(2));
                transaction1.setEmployee(employee1);
                employee1.setId(resultSet.getInt(3));
                transactions.add(transaction1);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return transactions;
    }
  /**
   * This method is called when you want to show all the beverages data
  */
 public List<Beverages> getBeverages() {
        List<Beverages> beverages = new ArrayList<>();
        String query = "select name from BEVERAGES";
        try {
            PreparedStatement preparedStatement = this.connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Beverages beverages1 = new Beverages();
                beverages1.setId(resultSet.getString(1));
                beverages1.setName(resultSet.getString(2));
                beverages1.setPrice(resultSet.getInt(3));
                beverages1.setStock(resultSet.getInt(4));
                beverages.add(beverages1);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return beverages;
    }

    
    /**
     * This method is called when you want to insert or update transaction table, you only need to input two parameters,
     * @param transaction
     * @param id
     * @return true , if successfully edit data, or otherwise return false statement
     */
    public boolean updateTransaction(Transaction1 transaction, String id) {
        boolean result = false;
                try {
                        String query1 = "UPDATE transaction1 SET orderdate=?, employee=? WHERE (id = ?)";
                        

                    PreparedStatement preparedStatement1 = connection.prepareStatement(query1);
                        preparedStatement1.setString(3, transaction.getId());
                        preparedStatement1.setInt(2, transaction.getEmployee().getId());
                        preparedStatement1.setDate(1, transaction.getOrderdate());
                        preparedStatement1.executeUpdate();
                        return true;
                    } catch (Exception e) {
                        e.printStackTrace();
                        
                    }
        return result;
                
                
 }  
    /**
     * This method is called when you want to update transaction beverage table, you only need to input one parameter,
     * @param transbev
     * @return true statement, if successfully edit data, or otherwise return false statement
     */
    public boolean updateTransactionBev(Transactionbeverage transbev) {
        boolean result = false;
                try {
                    String query1 = "update transactionbeverage set quantity=?, description=? where transaction = ? and beverage=?";
                        

                    PreparedStatement preparedStatement1 = connection.prepareStatement(query1);
                        preparedStatement1.setInt(1, transbev.getQuantity());
                        preparedStatement1.setString(2, transbev.getDescription());
                        preparedStatement1.setString(4, transbev.getBeverages().getId());
                        preparedStatement1.setString(3, transbev.getTransaction1().getId());
                        preparedStatement1.executeUpdate();
                        return true;
                    } catch (Exception e) {
                        e.printStackTrace();
                        
                    }
//                }
        return result;
                
                
 }  
    /**
     * This method is called when you want to delete transaction beverage table, you only need to input one parameter,
     * @param transbev
     * @return true, if successfully delete data, or otherwise return false statement
     */
    public boolean deleteTransBev(Transactionbeverage transbev) {
        boolean result = false;

        String query = "DELETE FROM Transactionbeverage WHERE (transaction = ?)and beverage =?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, transbev.getTransaction1().getId());
            preparedStatement.setString(2, transbev.getBeverages().getId());
            preparedStatement.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return result;

    }


    /**
     * This method is called when you want to insert transaction table, you only need to input one parameter,
     * @param trans
     * @return true, if successfully insert data, or otherwise return false statement
     */
    public boolean insertTrans(Transaction1 trans) {
        boolean result = false;

        String query = "INSERT INTO Transaction1 (orderdate, employee) VALUES ((TO_DATE(sysdate, 'dd/mm/yyyy hh24:mi:ss')),?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, trans.getEmployee().getId());
            
            preparedStatement.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return result;

    }
     public boolean insertTransBev(Transactionbeverage transbev) {
        boolean result = false;

        String query = "INSERT INTO TransactionBeverage (transaction, beverage, quantity, description) VALUES (?,?,?,?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, transbev.getTransaction1().getId());
            preparedStatement.setString(2, transbev.getBeverages().getId());
            preparedStatement.setInt(3, transbev.getQuantity());
            preparedStatement.setString(4, transbev.getDescription());
            
            preparedStatement.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return result;

    }
     /**
      * This method called if you want to search id by name in beverage table, you only need one parameter
      * @param name
      * @return a whole beverage object
      */
        public Beverages findIdByNameBev(String name) {
        Beverages bev = null;
        String query = "select id from beverages where name =?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                bev = new Beverages();
                bev.setId(resultSet.getString(1));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bev;
    }
     /**
      * This method called if you want to search role by name in employee table, you only need one parameter
      * @param name
      * @return a whole employee object
      */
         public Employee1 findRoleByNameEmployee(String name) {
        Employee1 emp = null;
        String query = "select role from employee1 where name =?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                emp = new Employee1();
                emp.setRole(resultSet.getInt(1));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return emp;
    }
         
         /**
          * This method will be called if you want to search last inserted id in transaction table
          * @return a whole transaction object
          */
        public Transaction1 findLastInsertId() {
        Transaction1 transaction1 = null;
        String query = "select id from transaction1 where id = (select max(id) from transaction1)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                transaction1 = new Transaction1(resultSet.getString(1));
                

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return transaction1;
    }

         public Transaction1 findLastInsertEmployee() {
        Transaction1 transaction1 = null;
        String query = "select id from transaction1 where id = (select max(id) from transaction1)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
//            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                transaction1 = new Transaction1(resultSet.getString(1));
                

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return transaction1;
    }
         /**
          * This method will be called if you want to search id data in transaction beverage table, by the id
          * @param trans
          * @param bev
          * @return a whole transaction beverage object
          */
    public Transactionbeverage findByIdTransBev(String trans, String bev) {
        Transactionbeverage transbev = null;
        String query = "select quantity, description from transactionbeverage where transaction = ? and beverage=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, trans);
            preparedStatement.setString(2, bev);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                transbev = new Transactionbeverage();
                transbev.setDescription(resultSet.getString(2));
                transbev.setQuantity(resultSet.getInt(1));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return transbev;
    }
   
}
