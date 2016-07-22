/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.filterexample.dao.impl;

import com.leapfrog.filterexample.constants.SQLConstant;
import com.leapfrog.filterexample.dao.UserDAO;
import com.leapfrog.filterexample.dbutil.DBConnection;
import com.leapfrog.filterexample.entity.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Manjul Sigdel
 */
public class UserDAOImplDB implements UserDAO{
    DBConnection db = new DBConnection();
    @Override
    public List<User> getAll()throws ClassNotFoundException,SQLException {
        List<User> userList = new ArrayList<>();
        
            db.open();
            db.initStatement(SQLConstant.USER_GETALL);
            ResultSet rs= db.exetuteQuery();
            while(rs.next()){
                User u = new User();
                u.setId(rs.getInt("user_id"));
                u.setUserName(rs.getString("user_name"));
                u.setPassword(rs.getString("password"));
                u.setEmail(rs.getString("email"));
                u.setStatus(rs.getBoolean("status"));
                userList.add(u);
            }
            db.close();
        
        return userList;
        
    }

    @Override
    public int insert(User u)throws ClassNotFoundException,SQLException {
        
        
            db.open();
            PreparedStatement stmt=db.initStatement(SQLConstant.USER_INSERT);
            stmt.setString(1, u.getUserName());
            stmt.setString(2, u.getPassword());
            stmt.setString(3, u.getEmail());
            stmt.setBoolean(4, u.isStatus());
            int result = db.executeUpdate();
            db.close();
            return result;
        
       
      
    }

    @Override
    public User login(String userName, String password)throws ClassNotFoundException,SQLException {
        for(User u:getAll()){
            if(u.getUserName().equals(userName)&& u.getPassword().equals(password)){
                return u;
                
            }
        }
        return null;
    }

    @Override
    public void forgotPassword(String email)throws ClassNotFoundException,SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User getById(int id) throws ClassNotFoundException,SQLException{
        for(User u:getAll()){
            if(u.getId()==id){
                return u;
            }
        }
        return null;
    }
    
}
