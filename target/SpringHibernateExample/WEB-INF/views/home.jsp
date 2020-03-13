<%--
  Created by IntelliJ IDEA.
  User: THANHLONG
  Date: 12/03/2020
  Time: 08:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>HOME PAGE</h1>
    <table>
        <thead>
            <th>STT</th>
            <th>Id</th>
            <th>Name</th>
        </thead>
        <tbody>
        <c:choose>
            <c:when test="${empty listCategory}">
                <tr colspan="3">NO DATA</tr>
            </c:when>
            <c:otherwise>
                <c:forEach begin="0" end="${listCategory.size()-1}" varStatus="stt" var="category" items="${listCategory}">
                    <tr>${stt.index+1}</tr>
                    <tr>${category.categoryId}</tr>
                    <tr>${category.categoryName}</tr>
                </c:forEach>
            </c:otherwise>
        </c:choose>
        </tbody>
    </table>
</body>
</html>
