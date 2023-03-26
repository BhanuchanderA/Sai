<%@page import="com.jsp.dto.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table style="border: 2px solid; ">
<tr style="border: 2px solid; ">
<th style="border: 2px solid; ">id</th>
<th style="border: 2px solid; ">branch</th>
<th style="border: 2px solid; ">name</th>
<th style="border: 2px solid; ">email</th>
<th style="border: 2px solid; ">password</th>
</tr>
<%-- <%Student s=request.getAttribute("abc"); %> --%>
<%Student s=(Student)request.getAttribute("abc"); %>

<tr style="border: 2px solid; ">
<td style="border: 2px solid; "><%=  s.getId() %></td>
<td style="border: 2px solid; "><%=s.getBranch() %></td>
<td style="border: 2px solid; "><%=  s.getName() %></td>
<td style="border: 2px solid; "><%=  s.getEmail() %></td>
<td style="border: 2px solid; "><%=  s.getPassword() %></td>
</tr>
</table>

<%-- <%List<Employee> l=(List<Employee>)request.getAttribute("abc");%>
<%for(Employee e : l) {%>
<%=  e.getId() %>
<%=  e.getName() %>
<%=  e.getEmail() %>
<%=  e.getPassword() %>
<%} %> --%>

</body>
</html>