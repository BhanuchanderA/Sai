<%@page import="com.jsp.dto.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update data</title>
</head>
<body>
<form action="upd" method="post">
<label> <b>enter the details u want to update</b></label>
<br>
<label> <i> name,branch,email,password can be updated</i></label>
<br>
<br>
<%Student s=(Student)request.getAttribute("obj"); %>
<label> id</label> <input type="number" name="id" required="required" readonly="readonly" value="<%=s.getId()%>"> <br> <br>
<label>name</label> <input type="text" name="name" required="required" value="<%=s.getName()%>"> <br> <br>
<label>branch</label> <input type="text" name="branch" required="required" value="<%=s.getBranch()%>"> <br> <br>
<label>email</label> <input type="email" name="email" required="required" value="<%=s.getEmail()%>"> <br> <br>
<label>password</label> <input type="password" name="password" required="required" value="<%=s.getPassword()%>"> <br> <br>

<input type="submit" value="update">
</form>

</body>
</html>