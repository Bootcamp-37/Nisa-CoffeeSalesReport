/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ojdbcexercise.tools;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import ojdbcexercise.models.Account;

/**
 *
 * @author Laila
 */
public class MailTool {
     public static void sendMail(String recepient, boolean isVerify, String code) throws Exception {
//        String rec="lailakhoirunnisa3@gmail.com";

        Properties properties = new Properties();

        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        String fromEmail = "kayclayn@gmail.com";
        String fromPassword = "kayclayn5907";

        Session session = Session.getInstance(properties, new Authenticator() {
            
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, fromPassword);
            }
        });
        if(isVerify==true){
             Message message = prepareMessage(session, fromEmail, recepient, code);
        Transport.send(message);
        System.out.println("Message sent successfully, Please check your email");
        }else {
             Message message = prepareMessageForPassword(session, fromEmail, recepient,code);
        Transport.send(message);
        System.out.println("Message sent successfully, Please check your email");
        }
       
    }
     
    private static Message prepareMessage(Session session, String email, String recepient, String code){
               
        try {
            Message message= new MimeMessage(session);
            message.setFrom(new InternetAddress(email));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            message.setSubject("Hello! Welcome to coffee report sale!");
            message.setText("Hey! Congratulation! Thank you for becoming one with us, This is your code:"+code);
            return message;
        } catch (Exception ex) {
            Logger.getLogger(ManualTest.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return null;
    }
    private static Message prepareMessageForPassword(Session session, String email, String recepient, String code){
//               String code=GenerateToken.generateCode();
        try {
            Message message= new MimeMessage(session);
            message.setFrom(new InternetAddress(email));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            message.setSubject("Password recovery");
            message.setText("This is your code:"+code);
            return message;
        } catch (Exception ex) {
            Logger.getLogger(ManualTest.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return null;
    }
}
