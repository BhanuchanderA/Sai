<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h5>registration</h5>
<form action="register" method="post">
<label> id</label> <input type="number" name="id" required="required"> <br> <br>
<label>name</label> <input type="text" name="name" required="required"> <br> <br>
<label>branch</label> <input type="text" name="branch" required="required"> <br> <br>
<label>email</label> <input type="email" name="email" required="required"> <br> <br>
<label>password</label> <input type="password" name="password" required="required"> <br> <br>

<input type="submit" value="Register">
</form>

</body>
</html>