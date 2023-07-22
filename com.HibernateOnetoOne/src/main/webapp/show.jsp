<%@page import="com.Dao.EmpDao"%>
<%@page import="com.Bean.Emp"%>
<%@page import="java.util.List"%>
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

List<Emp> list=EmpDao.ShowAllData();

%>

<table border="5" width="100%" cellpadding="10px" cellspacing="10px">
 
          <tr>
               <th>EID</th>
               <th>FIRST NAME</th>
               <th>LAST NAME</th>
               <th>EMAIL</th>
               <th>EPID</th>
               <th>DEPARTMENT</th>
               <th>JOB</th> 
               <th>EDIT</th>
               <th>DELETE</th>
               
          </tr>   
          
       <%
       for(Emp e:list){
       %>   
       <tr>
              <td><%=e.getEinfo().getEpid()%></td>
              <td><%=e.getEinfo().getFname()%></td>
              <td><%=e.getEinfo().getLname()%></td>
              <td><%=e.getEinfo().getEmail()%></td>  
              <td><%=e.getEid()%></td>
              <td><%=e.getDepartment()%></td>
              <td><%=e.getJob()%></td>

               
              
              <td>
                        
          <form  name="edit" method="post"  action="EmpController" >
          
          <input type="hidden"  name="eid"  value="<%=e.getEid()%>"> 
          <input type="submit"  name="action" value="EDIT"  class="btn btn-primary">
          </form>             
              </td>
              
              
                <td>
                        
          <form  name="delete" method="post"  action="EmpController" >
          
          <input type="hidden"  name="eid"  value="<%=e.getEid()%>"> 
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