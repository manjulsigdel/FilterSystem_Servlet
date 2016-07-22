/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.filterexample.dao;

import com.leapfrog.filterexample.entity.User;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Manjul Sigdel
 */
public interface UserDAO {
    User login(String userName, String password)throws ClassNotFoundException,SQLException;
    void forgotPassword(String email)throws ClassNotFoundException,SQLException;
    User getById(int id)throws ClassNotFoundException,SQLException;
    List<User> getAll()throws ClassNotFoundException,SQLException;
    int insert(User u)throws ClassNotFoundException,SQLException;
}
