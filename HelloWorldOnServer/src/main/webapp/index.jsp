<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>My JSP page with a background image</title>
    <style>
        body {
            background-image: url('background.gif');
            background-repeat: no-repeat;
            background-size: cover;
        }
        input[type="text"] {
            width: 100%;
            padding: 12px 20px;
            margin: 8px 0;
            box-sizing: border-box;
            border: 2px solid #ccc;
            border-radius: 4px;
        }
    </style>
</head>
<body>
    <h1>Welcome to my JSP page with a background image</h1>
    <p>This is some text on the page.</p>
    <form>
        <label for="input-field">Enter your name:</label>
        <input type="text" id="input-field" name="input-field">
    </form>
</body>
</html>