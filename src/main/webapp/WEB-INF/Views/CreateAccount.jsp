<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
     <%@ taglib  uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Account Page</title>


<style>
.error {color: red}
</style>
<script type="text/javascript" src="./lib/jquery-3.4.1.min.js"></script>
<script type="text/javascript">

$("#form").submit(function(e){ 
        if (!$('input[type=checkbox]:checked').length) { 
            alert("Please select checkec box to agree the terms.");  
                return false; 
            
        } 
        return true
    }); 




</script>
</head>
<body>

<font color="red">${Message}</font>
<form:form action="submitAccountValidation" modelAttribute="custom" method="post">

<h1>choose the type of account below </h1>

<div>
Select the Account Type<form:select path="bnk_acct.acct_cd">

<form:options items="${custom.acct_cd}"/>
<form:errors path="bnk_acct.acct_cd" cssClass="error"></form:errors>

</form:select>
</div>
<br></br>
Account Balance<form:input path="balance.balance"/>
<form:errors path="balance.balance"  cssClass="error"></form:errors>
<br></br>

<input type="submit" value="Create Account">
<br></br>
<form:checkbox path="account.is_account_active"   value="YES"/>
Please Check the box to Agree the Terms and Conditions of DCU App
<form:errors path="account.is_account_active" cssClass="error"></form:errors>

</form:form>

</body>
</html>
