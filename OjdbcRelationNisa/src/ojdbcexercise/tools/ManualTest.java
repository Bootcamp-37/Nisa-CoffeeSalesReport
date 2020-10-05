/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ojdbcexercise.tools;

import java.util.List;
import ojdbcexercise.controllers.TransactionController1;
import ojdbcexercise.models.Transactionbeverage;
//import ojdbcexercise.models.STransaction;
//import ojdbcexercise.models.STransactionitem;



/**
 *
 * @author Laila
 */
public class ManualTest {

    public static void main(String[] args) {

//        try {
            //        try {
            //        try {
            //        try {
//                    System.out.println(new Koneksi().getConnection());
//System.out.println(new RelationController1().changePass("clayn1", "NBPLWMUJ"));
//            System.out.println(new RelationController1().getByUsernameAccountController("clayn"));
//        System.out.println(new RelationController1().Login1("admin1","admin123"));
//System.out.println(BCrypt.checkpw("admin123", "$2a$10$2.U3ahQsOuQzeSfPhCwvAO1f2LUn3660/9.hAiz7QZMKT5GkN2VRS"));
//        System.out.println(new RelationController1().registerAccount1("clayn", "clayn123","kayclayn@gmail.com" ,2));
//        System.out.println(new RelationController1().insertCountrySP("AT","Antartika","1"));
//        System.out.println(new RelationController1().updateCountrySP("AT", "Antartik","1"));
//        System.out.println(new RelationController1().deleteCountryController("ID"));
//System.out.println(new RelationController1().deleteCountryControllerSP("AT"));
//Country country= new RelationController1().getByIdCountryController("IL");
//        System.out.println(country.getId()+" "+country.getName());
//Country country= new RelationController1().getByIdCountryControllerSP("IL");
//        System.out.println(country.getId()+" "+country.getName());
//List<Country> countries = new RelationController1().getDataCountry();
//List<Country> countries = new RelationController1().getDataCountrySP();
//List<Country> countries = new RelationController1().findCountry("Y");
//List<Country> countries = new RelationController1().findCountrySP("1");
//        for (Country country : countries) {
//            System.out.println(country.getId() + " " + country.getName()+" "+country.getRegion());
//        }
//String password="rahasia";
//String hash= BCrypt.hashpw(password, BCrypt.gensalt());
//        
//        if (BCrypt.checkpw(password, hash)){
//            System.out.println("Password benar");
//        }
//        else{
//            System.out.println("Password salah");
//        }
//try{
//MailTool.sendMail("kayclayn@gmail.com");
//        } catch (Exception ex) {
//          ex.printStackTrace();
//        }
//System.out.println(GenerateToken.generateCode());
//               System.out.println(new RelationController1().getDataAll());
//List<STransactionitem> transactionitems = new RelationController1().getDataAll();
//List<STransactionitem> transactionitems= new RelationController1().getDataAll();
//        for (STransactionitem st:transactionitems) {
//            System.out.println("Nama: "+st.getItemId().getName()+", Price: "+st.getItemId().getPrice()
//                    +", Stock: "+st.getItemId().getStock()+", Item sold: "+st.getQuantity()
//                    +", Date Order "+st.getTransactionId().getOrderdate());
//
//    }
//System.out.println(new TransactionController1().getDataTransaction());
//System.out.println(new TransactionController1().insertUpdateTrans1("T075", "2020-09-02"));
//        } catch (ParseException ex) {
//            Logger.getLogger(ManualTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        } catch (ParseException ex) {
//            Logger.getLogger(ManualTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
//System.out.println( new TransactionController1().updateTransbevController("T077", "MT", "3", "Ice less"));
//System.out.println(new TransactionController1().deleteTransController("T0000025"));
//List<Transaction1> transactions = new TransactionController1().getDataTransaction1();
//     for (Transaction1 transaction : transactions) {
//            System.out.println(transaction.getId()+" ,"+transaction.getOrderdate());
//        }
//System.out.println(new TransactionController1().insertTrans("62"));
//System.out.println(new TransactionController1().insertTrans("62"));
//System.out.println(new TransactionController1().insertTransBev("MT", "2"));
//        } catch (ParseException ex) {
//            Logger.getLogger(ManualTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
//List<Beverages> bevs= new TransactionController1().getDataBeverageses();
//        for (Beverages t:bevs) {
//            System.out.println("Nama: "+t.getName());
//
//    }
//
//System.out.println(new TransactionController1().getLastIdTransController());
//Beverages bev= new TransactionController1().getIdByNameBevController("Americano");
//        System.out.println(bev.getId());
//
//        Employee1 emp= new TransactionController1().getRoleByNameEmpController("clayn");
//        System.out.println(emp.getRole());
//System.out.println(new TransactionController1().getIdByNameBevController("Americano"));
//System.out.println(new TransactionController1().deleteTransBevController("MT", "T077"));
Transactionbeverage transbev= new TransactionController1().getByIdTransBevController("T043", "MT");
        System.out.println("Description :"+transbev.getDescription()+", Quantity: "+transbev.getQuantity());
List<Transactionbeverage> transbevs= new TransactionController1().getDataTransaction();
        for (Transactionbeverage t:transbevs) {
            System.out.println("Nama: "+t.getBeverages().getName()+", Price: "+t.getBeverages().getPrice()+" Jumlah: "+t.getQuantity()
                    +", Employee: "+t.getTransaction1().getEmployee().getName()+", "+ t.getDescription());

    }
    }
}
