<!-- The form tag will allow you to grab the information 
from the form and send it to the controller -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- Allows you to use c tags, tags that do things like if statements and loops -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Allows for java stuff on the page -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="/css/signUp.css">
    <link rel="stylesheet" href="/css/flex.css">
    <link rel="stylesheet" href="/css/main.css">
</head>
<body class="flex-col">
    <div class="header flex-row">
        <a href="/sign-up" class="header-link">Sign Up</a>
        <a href="/" class="header-link">Home</a>
        <a href="/sign-in" class="header-link">Sign In</a>
    </div>
    <div class="main-content flex-row">
        <div class="signup-box flex-col">
            <h1>Sign In</h1>
            <!-- form:form tags are for spring forms so you can
                send this data to the controller -->
            <!-- modelAttribute points to the object that captures data from the form -->
            <!-- action points to the Controller url to go to when form is submitted -->
            <!-- method is the type of request for the Controller path (Usually always post for forms) -->
            <form:form modelAttribute="user" action="sign-in" method="post">
                <div class="flex-col">
                    <div class="flex-row justify-center text-input-margin">
                        <!-- form:input so spring can track your input to a variable -->
                        <!-- The path represents the variable to set the data to -->
                        <div>Email: </div><form:input path="email" class="text-input" type="text" />
                    </div>
                    <div class="flex-row justify-center text-input-margin">
                        <!-- form:input so spring can track your input to a variable -->
                        <!-- The path represents the variable to set the data to -->
                        <div>Password: </div><form:input path="password" class="text-input" type="password" />
                    </div>
                        <!-- form:button so it can submit the spring form on submit (when clicked) -->
                    <form:button type="submit" class="button">Submit</form:button>
                </div>
            </form:form>
        </div>
    </div>
</body>
</html>