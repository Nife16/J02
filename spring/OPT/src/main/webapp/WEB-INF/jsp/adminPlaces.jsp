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
    <link rel="stylesheet" href="/css/adminPlaces.css">
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
        <div class="flex-col">
            <div class="box">
                <form:form modelAttribute="place" action="adminPlaces" method="post">
                    <div class="flex-col">
                        <h1>Create Places for Users! Get to work billy!</h1>
                        <div class="flex-row justify-center text-input-margin">
                            <!-- form:input so spring can track your input to a variable -->
                            <!-- The path represents the variable to set the data to -->
                            <div>Name: </div><form:input path="name" class="text-input" type="text" />
                        </div>
                        <div class="flex-row justify-center text-input-margin">
                            <!-- form:input so spring can track your input to a variable -->
                            <!-- The path represents the variable to set the data to -->
                            <div>Price: </div><form:input path="price" class="text-input" type="decimal" />
                        </div>
                        <div class="flex-row justify-center text-input-margin">
                            <!-- form:input so spring can track your input to a variable -->
                            <!-- The path represents the variable to set the data to -->
                            <div>Image URL: </div><form:input path="imgUrl" class="text-input" type="text" />
                        </div>
                            <!-- form:button so it can submit the spring form on submit (when clicked) -->
                        <form:button type="submit" class="button">Submit</form:button>
                    </div>
                </form:form>
            </div>
            <div>
                <c:forEach items="${allPlaces}" var="place">
                    <a href="/updatePlace/${place.getId()}" class="box flex-col">
                        <div>Name: ${place.getName()}</div>
                        <div>Price: ${place.getPrice()}</div>
                        <img src="${place.getImgUrl()}" class="placeImage" />
                    </a>
                </c:forEach>
            </div>
        </div>
    </div>
</body>
</html>