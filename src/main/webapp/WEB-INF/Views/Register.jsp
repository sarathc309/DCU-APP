<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
     <%@ taglib  uri="http://www.springframework.org/tags" prefix="spring" %>
     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Insert title here </title>

<style>
.error {color: red}
</style>
</head>
<body>




<!--      Spring binding when we have more than model classes            -->
<font color="red">${message}</font>

<form action="registerform" method="post">
<h1>
Please enter your Personal information below </h1>
<spring:bind path="user_info.user_name">
  Username <input type="text" name="${status.expression}" value="${status.value}"><br />
        </spring:bind>

<spring:bind path="user_info.password">
  password <input type="password" name="${status.expression}" value="${status.value}"><br />
        </spring:bind>

<spring:bind path="personal_info.first_name">
 First Name  <input type="text" name="${status.expression}" value="${status.value}"><br />
        </spring:bind>
<spring:bind path="personal_info.last_name">
 Last Name  <input type="text" name="${status.expression}" value="${status.value}"><br />
        </spring:bind>
        
<spring:bind path="personal_info.e_mail">
 E-Mail  <form:input path="personal_info.e_mail" cssClass="error"/>
 <br />
        </spring:bind>        
        
    
      
        
<spring:bind path="personal_info.phone_no">
 Phone Number  <input type="text" name="${status.expression}" value="${status.value}"><br />
        </spring:bind>        
                
<spring:bind path="personal_info.ssn">
 SSN  <input type="text" name="${status.expression}" value="${status.value}"><br />
        </spring:bind>        
        
        

<input type="submit" value="Create"/>
</form>







</body>
</html>