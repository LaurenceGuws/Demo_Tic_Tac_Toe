<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>My JSP page with a background image</title>
    <style>
        body {
            background-image: url('${pageContext.request.contextPath}/background.gif');
            background-repeat: no-repeat;
            background-size: cover;
        }
    </style>
</head>
<body>
    <h1>Welcome to my JSP page with a background image</h1>
    <p>This is some text on the page.</p>
</body>
</html>