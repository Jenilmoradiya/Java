<%@page import="com.dao.ProductDao"%>
<%
 int pid=Integer.parseInt(request.getParameter("pid"));
 ProductDao.deleteproduct(pid);
 response.sendRedirect("seller-viewproduct.jsp");

%>