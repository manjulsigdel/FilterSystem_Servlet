/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.filterexample.dao.impl;

import com.leapfrog.filterexample.dao.UserDAO;
import com.leapfrog.filterexample.entity.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Manjul Sigdel
 */
public class UserDAOImpl implements UserDAO {

    @Override
    public User login(String userName, String password) {
        for (User u : getAll()) {
            if (u.getUserName().equals(userName) && u.getPassword().equals(password)) {
                return u;
            }
        }
        return null;
    }

    @Override
    public void forgotPassword(String email) {
        // Recipient's email ID needs to be mentioned.

        // Sender's email ID needs to be mentioned
        String from = "manjulsigdel@gmail.com";

        // Assuming you are sending email from localhost
        String host = "smtp.wlink.com.np";

        // Get system properties
        Properties properties = System.getProperties();

        // Setup mail server
        properties.setProperty("mail.smtp.host", host);

        // Get the default Session object.
        Session session = Session.getDefaultInstance(properties);

        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(email));

            // Set Subject: header field
            message.setSubject("Your Password Request.");
            String body = "Dear\r\n, Your Password Is 12345";
            // Now set the actual message
            message.setText(body);

            // Send message
            Transport.send(message);

        } catch (MessagingException mex) {

        }
    }

    @Override
    public User getById(int id) {
        for (User u : getAll()) {
            if (u.getId() == id) {
                return u;
            }
        }
        return null;
    }

    @Override
    public List<User> getAll() {
        List<User> userList = new ArrayList<>();
        userList.add(new User(1, "manjul", "manjul", "manjulsigdel@gmail.com", true));
        userList.add(new User(2, "sagar", "sagar", "manjulsigdel@gmail.com", false));
        return userList;
    }

    @Override
    public int insert(User u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
