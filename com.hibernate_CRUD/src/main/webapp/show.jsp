<%@page import="com.Dao.EmpDao"%>
<%@page import="com.Bean.EmpBean"%>
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

List<EmpBean> list=EmpDao.getshowMethod();

%>

<table border="5" width="100%" cellpadding="10px" cellspacing="10px">
 
          <tr>
               <th>EID</th>
               <th>FIRST NAME</th>
               <th>LAST NAME</th>
               <th>ADDRESS</th>
               <th>MOBILE N0</th>
               <th>GENDER</th>
               <th>EMAIL</th> 
               <th>EDIT</th>
               <th>DELETE</th>
               
          </tr>   
          
       <%
       for(EmpBean s:list){
       %>   
       <tr>
              <td><%=s.getEid()%></td>
              <td><%=s.getFname()%></td>
              <td><%=s.getLname()%></td>
              <td><%=s.getAddress()%></td>  
              <td><%=s.getMobile()%></td>
              <td><%=s.getGender()%></td>
              <td><%=s.getEmail()%></td>

               
              
              <td>
                        
          <form  name="edit" method="post"  action="EmpController" >
          
          <input type="hidden"  name="eid"  value="<%=s.getEid()%>"> 
          <input type="submit"  name="action" value="EDIT"  class="btn btn-primary">
          </form>             
              </td>
              
              
                <td>
                        
          <form  name="delete" method="post"  action="EmpController" >
          
          <input type="hidden"  name="eid"  value="<%=s.getEid()%>"> 
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