/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.filterexample.controller;

import com.leapfrog.filterexample.dao.UserDAO;
import com.leapfrog.filterexample.dao.impl.UserDAOImpl;
import com.leapfrog.filterexample.dao.impl.UserDAOImplDB;
import com.leapfrog.filterexample.system.Controller;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.PageContext;

/**
 *
 * @author User
 */

public class DefaultController extends Controller{
    UserDAO userDAO = new UserDAOImplDB();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       // userDAO.forgotPassword("manjulsigdel@gmail.com");
        
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        
        out.println("<h1>Welcome to my servlet Page</h1>");
        request.getRequestDispatcher("/WEB-INF/views/default.jsp").forward(request, response);
    }
    
}
