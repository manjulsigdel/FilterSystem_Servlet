<%-- 
    Document   : users.jsp
    Created on : 22-Jul-2016, 12:35:43
    Author     : Manjul Sigdel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Users</h1>
        <table>
            <tr>
                <th>Id</th>
                <th>UserName</th>
                <th>Password</th>
                <th>Email</th>
            </tr>
            <c:forEach var="user" items="${requestScope.allusers}">
              <tr>
                <td>${user.id}</td>
                <td>${user.userName}</td>
                <td>${user.password}</td>
                <td>${user.email}</td>
            </tr>  
            </c:forEach>
            
        </table>
    </body>
</html>
