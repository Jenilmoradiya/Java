<%@page import="com.bean.Student"%>
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
<%
	List<Student> list=(List<Student>)request.getAttribute("list");
%>
<table border="5" cellpadding="10px" cellspacing="10px" width="100%">
	<tr>
		<td>ID</td>
		<td>FIRST NAME</td>
		<td>LAST NAME</td>
		<th>EMAIL</th>
	</tr>
	<%
		for(Student s:list)
		{
	%>
	<tr>
		<td><%=s.getId() %></td>
		<td><%=s.getFname() %></td>
		<td><%=s.getLname() %></td>
		<td><%=s.getEmail() %></td>
	</tr>
	<%		
		}
	%>	

</table>
</body>
</html>