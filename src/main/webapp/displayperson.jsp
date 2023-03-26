
<%@page import="com.jsp.dto.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr >
<th>id</th>
<th>branch</th>
<th>name</th>
<th>email</th>
<th>password</th> </tr>
<%List<Student> l=(List<Student>)request.getAttribute("di");%>
 <%for(Student e : l) {%>
 <tr>
 
<td><%=  e.getId() %></td>
<td><%= e.getBranch() %></td>
<td><%=  e.getName() %></td>
<td><%=  e.getEmail() %></td>
<td><%=  e.getPassword() %></td>
</tr>

<%} %>
</table>

<form action="home.jsp">
<input type="submit" value="back to home">
</form>

</body>
</html>