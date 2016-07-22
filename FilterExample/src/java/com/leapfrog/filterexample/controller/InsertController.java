/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.filterexample.controller;

import com.leapfrog.filterexample.dao.UserDAO;
import com.leapfrog.filterexample.dao.impl.UserDAOImpl;
import com.leapfrog.filterexample.dao.impl.UserDAOImplDB;
import com.leapfrog.filterexample.entity.User;
import com.leapfrog.filterexample.system.Controller;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Manjul Sigdel
 */
@WebServlet(name = "insert" , urlPatterns = {"/insert"})
public class InsertController extends Controller{
    UserDAO userDAO=new UserDAOImplDB();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/views/insert.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        User u =new User();
        u.setUserName(request.getParameter("username"));
        u.setPassword(request.getParameter("password"));
        u.setEmail(request.getParameter("email"));
        try {
            userDAO.insert(u);
            if(u==null){
            response.sendRedirect(request.getContextPath()+"/insert?error");
        }else{
           // request.getSession(true).setAttribute("loggedin", user);
            response.sendRedirect(request.getContextPath()+"/login");
        }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InsertController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(InsertController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
