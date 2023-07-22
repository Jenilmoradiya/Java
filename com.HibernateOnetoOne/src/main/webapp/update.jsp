<%@page import="com.Bean.Emp"%>


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
if(request.getAttribute("msg")!=null  ){
	out.println(request.getAttribute("msg"));
}
Emp e=(Emp)request.getAttribute("e");

%>

   <form name="frm" method="post"  action="EmpController" >
   <table cellpadding= "10px " cellspacing="10px">
   
   <tr>
   <td><input type="hidden" name="eid" value="<%=e.getEid() %>" >
   <td><input type="hidden" name="epid" value="<%=e.getEinfo().getEpid() %>" >
   
   </tr>
   
   
   <tr>
         <td>First name</td>
        <td>
           
          <input type="text"  name="fname" value="<%=e.getEinfo().getFname() %>" ></td>
          
   </tr>
   
   
   <tr>
         <td>Last name</td>
        <td>
           <input type="text"  name="lname" value="<%=e.getEinfo().getLname() %>"  ></td>
        </td>
           </tr>
   
   
    <tr>
         <td>Email</td>
        <td>
        
           <input type="text"  name="email" value="<%=e.getEinfo().getEmail() %>"  ></td>
        </td>
         </tr>
   
            
        
   <tr>
           <td>Department</td>
        <td>
           <input type="text"  name="department" value="<%=e.getDepartment() %>"  ></td>
        </td>
        <td> <span id="mobile" ></span> </td>
        
   </tr>
    
   <tr>
         <td>Job</td>
        <td>
           <input type="text"  name="job" value="<%=e.getJob() %>"  ></td>
        </td>
        
   </tr>
  
   
     
   <tr>
         <td  colspan="3" align="center" >
         <input type="submit"   name="action" value="update" class="btn btn-info" >
         
         </td>
   
   </tr>
   
    
   </table>
   </form>
   <a href="show.jsp" >Show student details</a>
   
</body>
</html>