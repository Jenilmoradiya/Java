<%@page import="com.dao.CartDao"%>
<%@page import="com.bean.CartBean"%>
<%

int cid=Integer.parseInt(request.getParameter("cid"));
int product_qty=Integer.parseInt(request.getParameter("product_qty"));

CartBean c=CartDao.Getcart(cid);
c.setProduct_qty(product_qty);
int total_price=c.getProduct_price()*product_qty;
c.setTotal_price(total_price);
CartDao.updatequantity(c);
response.sendRedirect("cart.jsp");

%>