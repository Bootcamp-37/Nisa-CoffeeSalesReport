/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ojdbcexercise.tools;

import java.sql.Connection;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author Laila
 */
public class Koneksi {

    private Connection connection=null;

    public Connection getConnection() {
        try {
            OracleDataSource dataSource= new OracleDataSource();
            dataSource.setDriverType("thin");
            dataSource.setServerName("localhost");
            dataSource.setPortNumber(1521);
            dataSource.setUser("SYSTEM");
            dataSource.setPassword("b0o7c@mp");
            dataSource.setServiceName("XE");
            connection=dataSource.getConnection();
            connection.createStatement().execute("alter session SET current_schema =HR");
            
        } catch (Exception e) {
        e.printStackTrace();
        }
        return connection;
        
    }
}
