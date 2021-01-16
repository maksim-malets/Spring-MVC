<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 12.08.2020
  Time: 19:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
 The student is confirmed ${student.firstName} ${student.lastName}
<br>
Country is ${student.country}
 <br>
Favorite language is ${student.favoriteLanguage}
<br>
Operating systems are
 <ul>
 <c:forEach var="temp" items="${student.operatingSystems}">
     <li>${temp}</li>
 </c:forEach>
 </ul>
</body>
</html>
