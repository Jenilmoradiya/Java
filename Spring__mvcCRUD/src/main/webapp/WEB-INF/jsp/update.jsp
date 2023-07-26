
<%@page import="com.bean.StudenBean"%>
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
 StudenBean s=(StudenBean)request.getAttribute("s");

%>

   <form name="frm" method="post"  action="update" >
   <table cellpadding= "10px " cellspacing="10px">
   
   <tr>
   <td><input type="hidden" name="id" value="<%=s.getId() %>" >
   
   </tr>
   
   
   <tr>
         <td>First name</td>
        <td>
           <input type="text"  name="fname" value="<%=s.getFname() %>"  ></td>
          <td> <span id="fname" ></span> </td>
   </tr>
   
   
   <tr>
         <td>Last name</td>
        <td>
           <input type="text"  name="lname" value="<%=s.getLname() %>"  ></td>
        </td>
         <td> <span id="lname" ></span> </td>
   </tr>
   
   <tr>
         <td>Gender</td>
        <td>
        
        <%
             if(s.getGender().equals("male")){
            	 %>
            	 
            	 <input type="radio"  name="gender" value="male" checked="checked"  >male
            	 <input type="radio"  name="gender" value="female"  >female
            	 <%
             }
        
             else{
          %>  	 
            	 <input type="radio"  name="gender" value="male"  >male
                  <input type="radio"  name="gender" value="female"  checked="checked">female
         <% 
             }
        %>
        
        
        
           
        </td>
   </tr>
   
   <tr>
         <td>Email</td>
        <td>
        
           <input type="text"  name="email" value="<%=s.getEmail() %>"  ></td>
        </td>
        <td> <span id="email" ></span> </td>
   </tr>
   
   
   <tr>
         <td>Mobile no</td>
        <td>
           <input type="text"  name="mobile" value="<%=s.getMobile() %>"  ></td>
        </td>
        <td> <span id="mobile" ></span> </td>
        
   </tr>
   
  <tr>
         <td>Address</td>
        <td>
           <textarea rows="4"  col="20" name="address"  ><%=s.getAddress() %></textarea>
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