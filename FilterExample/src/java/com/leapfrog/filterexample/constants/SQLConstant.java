/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.filterexample.constants;

/**
 *
 * @author Manjul Sigdel
 */
public class SQLConstant {
    public static final String USER_INSERT ="INSERT INTO " + TableConstant.TABLE_USER + "(user_name,password,email,status) VALUES(?,?,?,?)";
    public static final String USER_GETALL="SELECT * FROM " + TableConstant.TABLE_USER;
}
