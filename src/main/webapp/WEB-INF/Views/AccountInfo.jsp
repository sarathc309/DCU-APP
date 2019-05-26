<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table>
<tr>
<th>Account Name</th>
<th>Balance</th>
</tr>
<c:forEach items="${account_list}" var="list" varStatus="">
<tr>
<td>${list.acct_name }INGS ACCOUNT</td>
 <td>${list.amount }</td>



</tr>


</c:forEach>

</table>


</body>
</html>