<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1">
            <thead>
                <tr>
                    <th>id</th>
                    <th>username</th>
                    <th>email</th>
                    <th>password</th>
                    <th>mobile</th>
                    <th>image</th>
                    <th>address</th>
                    <th>city id</th>
                    <th>action</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="user" items="${listusers}">
                    <tr>
                        <td><c:out value="${user.id}" /></td>
                        <td><c:out value="${user.username}" /></td>
                        <td><c:out value="${user.email}" /></td>
                        <td><c:out value="${user.password}" /></td>
                        <td><c:out value="${user.mobile}" /></td>
                        <td><c:out value="${user.image}" /></td>
                        <td><c:out value="${user.address}" /></td>
                        <td><c:out value="${user.city_id}" /></td>
                        <td></td>
                    </tr>
                </c:forEach>
                
            </tbody>
        </table>

    </body>
</html>
