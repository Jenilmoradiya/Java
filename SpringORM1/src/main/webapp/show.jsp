<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="com.bean.StudenBean"%>

<%@page import="java.util.List"%>
<%@page import="com.Dao.StudentDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
</head>

<body>

<%

ApplicationContext ac=new ClassPathXmlApplicationContext("Beans.xml");
StudentDao sd=ac.getBean("studentDao",StudentDao.class);
List<StudenBean> list=sd.getAllStudent();

%>

<table border="5" width="100%" cellpadding="10px" cellspacing="10px">
 
          <tr>
               <th>ID</th>
               <th>FIRST NAME</th>
               <th>LAST NAME</th>
               <th>GENDER</th>
               <th>EMAIL</th>
               <th>MOBILE N0</th>
               <th>ADDRESS</th>
               <th>EDIT</th>
               <th>DELETE</th>
               
          </tr>   
          
       <%
       for(StudenBean s:list){
       %>   
       <tr>
              <td><%=s.getId()%></td>
              <td><%=s.getFname() %></td>
              <td><%=s.getLname() %></td>
              <td><%=s.getGender() %></td>
              <td><%=s.getEmail() %></td>
              <td><%=s.getMobile() %></td>
              <td><%=s.getAddress() %></td> 
              
              <td>
                        
          <form  name="edit" method="post"  action="StudentController" >
          
          <input type="hidden"  name="id"  value="<%=s.getId()%>"> 
          <input type="submit"  name="action" value="EDIT"  class="btn btn-primary">
          </form>             
              </td>
              
              
                <td>
                        
          <form  name="delete" method="post"  action="StudentController" >
          
          <input type="hidden"  name="id"  value="<%=s.getId()%>"> 
          <input type="submit"  name="action" value="DELETE"  class="btn btn-danger">
          </form>             
              </td>
       </tr>
       <%
       }
       %>

          </table>
           <a href="index.jsp" >Add student details</a>
</body>
</html>