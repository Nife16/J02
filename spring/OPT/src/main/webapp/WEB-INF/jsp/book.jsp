<!-- The form tag will allow you to grab the information 
from the form and send it to the controller -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- Allows you to use c tags, tags that do things like if statements and loops -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Allows for java stuff on the page -->
<!-- <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> -->
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
    <c:choose>
        <c:when test="${user != null}">
            <div class="header flex-row">
                <div class="header-link">Hello ${user.getName()}</div>
                <a href="/" class="header-link">Home</a>
                <a href="/logout" class="header-link">Log Out</a>
            </div>
        </c:when>
        <c:otherwise>
            <div class="header flex-row">
                <a href="/sign-up" class="header-link">Sign Up</a>
                <a href="/" class="header-link">Home</a>
                <a href="/sign-in" class="header-link">Sign In</a>
            </div>
        </c:otherwise>
    </c:choose>
    <div class="main-content flex-row">
        <div class="signup-box flex-col">
            <h1>Book</h1>
            <!-- form:form tags are for spring forms so you can
                send this data to the controller -->
            <!-- modelAttribute points to the object that captures data from the form -->
            <!-- action points to the Controller url to go to when form is submitted -->
            <!-- method is the type of request for the Controller path (Usually always post for forms) -->
            <form:form modelAttribute="reservation" action="" method="post">
                <div class="flex-col">
                    <div class="flex-row justify-center text-input-margin">
                        <!-- form:input so spring can track your input to a variable -->
                        <!-- The path represents the variable to set the data to -->
                        <div>Number of People: </div><form:input path="numberOfPeople" class="text-input" type="number" />
                    </div>
                    <div class="flex-row justify-center text-input-margin">
                        <!-- form:input so spring can track your input to a variable -->
                        <!-- The path represents the variable to set the data to -->
                        <div>Round Trip? </div><form:checkbox path="roundtrip" class="text-input" />
                    </div>
                    <div class="flex-row justify-center text-input-margin">
                        <!-- form:input so spring can track your input to a variable -->
                        <!-- The path represents the variable to set the data to -->
                        <div>Start of Trip: </div><form:input path="startOfTrip" class="text-input" type="date" />
                    </div>
                    <div class="flex-row justify-center text-input-margin">
                        <!-- form:input so spring can track your input to a variable -->
                        <!-- The path represents the variable to set the data to -->
                        <div>End of Trip: </div><form:input path="endOfTrip" class="text-input" type="date" />
                    </div>
                        <!-- form:button so it can submit the spring form on submit (when clicked) -->
                    <form:button type="submit" class="button">Submit</form:button>
                </div>
            </form:form>
        </div>
    </div>
</body>
</html>