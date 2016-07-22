<%-- 
    Document   : login
    Created on : 20-Jul-2016, 18:44:26
    Author     : Manjul Sigdel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login page</title>
    </head>
    <body>
        <h1>Enter your Informaiton</h1>
        <form action="" method="post">
            <div>
                <label>User Name</label>
                <input type="text" name="username" required="required" placeholder="Enter User Name">
                
            </div>
            <div>
                <label>Password</label>
                <input type="password" name="password" required="required" placeholder="Enter Password">
                
            </div>
            <button type="submit">Ok</button>
        </form>
    </body>
</html>
