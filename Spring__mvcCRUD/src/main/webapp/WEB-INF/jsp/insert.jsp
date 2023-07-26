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
if(request.getAttribute("msg")!=null  ){
	out.println(request.getAttribute("msg"));
}
%>

   <form name="frm" method="post"  action="insert" >
   <table cellpadding= "10px " cellspacing="10px">
   
   <tr>
         <td>First name</td>
        <td>
           <input type="text"  name="fname"  ></td>
          <td> <span id="fname" ></span> </td>
   </tr>
   
   
   <tr>
         <td>Last name</td>
        <td>
           <input type="text"  name="lname"  ></td>
        </td>
         <td> <span id="lname" ></span> </td>
   </tr>
   
   <tr>
         <td>Gender</td>
        <td>
           <input type="radio"  name="gender" value=male>male
           <input type="radio"  name="gender" value=female>female
        </td>
   </tr>
   
   <tr>
         <td>Email</td>
        <td>
           <input type="text"  name="email"  ></td>
        </td>
        <td> <span id="email" ></span> </td>
   </tr>
   
   
   <tr>
         <td>Mobile no</td>
        <td>
           <input type="text"  name="mobile"  ></td>
        </td>
        <td> <span id="mobile" ></span> </td>
        
   </tr>
   
  <tr>
         <td>Address</td>
        <td>
           <textarea rows="4"  col="20" name="address"> </textarea>
        </td>
   </tr>
   
     
   <tr>
         <td  colspan="3" align="center" >
         <input type="submit"   name="action" value="insert" class="btn btn-info" >
         
         </td>
   
   </tr>
   
    
   </table>
   </form>
   <a href="show.jsp" >Show student details</a>
   
</body>
</html>