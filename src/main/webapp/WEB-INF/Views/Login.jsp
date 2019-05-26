<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to DCU App Login Page</title>

<style>
.error {color: red}
</style>

</head>
<body>
<h1>
<marquee>
Please enter your username and password below
</marquee>
</h1>
<font color="red">${errorMessage}</font>
    <form:form action="validate" method="post" modelAttribute="user">
        Username <form:input path="user_name"/>
        <form:errors path="user_name" cssClass="error" />
        <br/>
          <br/>
          
        Password  <form:password path="password"/> 
              <form:errors path="password" cssClass="error" />
        <br/>
        <br/>
        <input type="submit" value="Submit"/>
       
        
         
    </form:form>
    
    <form action="register">
    <input type="submit" value="Register">
    
    </form>
    
    
    
</body>
</html>