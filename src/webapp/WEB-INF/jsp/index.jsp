<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Home Page</title>
    <link rel="stylesheet" href="https://unpkg.com/@coreui/coreui/dist/css/coreui.min.css">
    <script src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="https://unpkg.com/@coreui/coreui/dist/js/coreui.min.js"></script>

    <style>
.error {
    color: red;
    }
    </style>

</head>
<body>

<form:form method="post" modelAttribute="user">
    Login: <form:input path="login"/><br>
    <form:errors path="login" cssClass="error"/><br>

    Passworld: <form:input path="password"/><br>
    <form:errors path="password" cssClass="error"/><br>

    <input type="submit" value="Log In">
</form:form><br>

<a href="/register">Register New User</a>


</body>
</html>
