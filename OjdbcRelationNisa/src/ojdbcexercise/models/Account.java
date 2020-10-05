/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ojdbcexercise.models;

/**
 *
 * @author Laila
 */
public class Account {
    String  a_username, a_password, a_email, a_job_id, a_address, a_token;
int a_id,a_status;
    public Account(int a_id, String a_username, String a_password, String a_email, String a_job_id, String a_address) {
        this.a_id = a_id;
        this.a_username = a_username;
        this.a_password = a_password;
        this.a_email = a_email;
        this.a_job_id = a_job_id;
        this.a_address = a_address;
    }

    public int getA_status() {
        return a_status;
    }

    public Account(String a_username, String a_password, String a_email, String a_job_id, String a_address, String a_token) {
        this.a_username = a_username;
        this.a_password = a_password;
        this.a_email = a_email;
        this.a_job_id = a_job_id;
        this.a_address = a_address;
        this.a_token = a_token;
    }

    public Account(String a_username, String a_password, String a_email, String a_job_id, String a_address) {
        this.a_username = a_username;
        this.a_password = a_password;
        this.a_email = a_email;
        this.a_job_id = a_job_id;
        this.a_address = a_address;
    }

    public void setA_status(int a_status) {
        this.a_status = a_status;
    }

    public String getA_token() {
        return a_token;
    }

    public void setA_token(String a_token) {
        this.a_token = a_token;
    }

    public String getA_address() {
        return a_address;
    }

    public void setA_address(String a_address) {
        this.a_address = a_address;
    }

    public Account() {
    }

    public Account(String a_username, String a_password) {
        this.a_username = a_username;
        this.a_password = a_password;
    }

    public int getA_id() {
        return a_id;
    }

    public void setA_id(int a_id) {
        this.a_id = a_id;
    }

    public String getA_username() {
        return a_username;
    }

    public void setA_username(String a_username) {
        this.a_username = a_username;
    }

    public String getA_password() {
        return a_password;
    }

    public void setA_password(String a_password) {
        this.a_password = a_password;
    }

    public String getA_email() {
        return a_email;
    }

    public void setA_email(String a_email) {
        this.a_email = a_email;
    }

    public String getA_job_id() {
        return a_job_id;
    }

    public void setA_job_id(String a_job_id) {
        this.a_job_id = a_job_id;
    }

    
}
