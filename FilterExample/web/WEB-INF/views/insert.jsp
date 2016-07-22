<%-- 
    Document   : insert
    Created on : 22-Jul-2016, 12:08:04
    Author     : Manjul Sigdel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Enter Your Information to create new account</h1>
        <form action="" method="post">
            <div>
                <label>
                    UserName
                </label>
                <input type="text" name="username" placeholder="Enter username">
            </div>
            <div>
                <label>
                    Password
                </label>
                <input type="password" name="password" placeholder="Enter password">
            </div>
            <div>
                <label>
                    Email
                </label>
                <input type="text" name="email" placeholder="Enter Email">
            </div>
            <button type="submit" >Create</button>
        </form>
    </body>
</html>
