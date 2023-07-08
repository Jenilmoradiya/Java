<%@page import="com.dao.ProductDao"%>
<%@page import="com.dao.CartDao"%>
<%@page import="com.bean.ProductBean"%>
<%@page import="com.bean.CartBean"%>
<%@page import="java.util.List"%>
<%@page import="com.bean.wishlistBean"%>
<%@page import="com.dao.WishlistDao"%>
<%

 int pid=Integer.parseInt(request.getParameter("pid"));
 int uid=Integer.parseInt(request.getParameter("uid"));

 
  CartBean c=new CartBean();
  c.setPid(pid);
  c.setUid(uid);
  ProductBean p=ProductDao.productinfo(pid);
  int product_price=p.getProduct_price();
  c.setProduct_price(product_price);
  c.setProduct_qty(1);
  c.setTotal_price(product_price);
  CartDao.AddToCart(c);
  List<CartBean> list1=CartDao.FetchdetailsForCart(uid);
  session.setAttribute("cart_count", list1.size());
  response.sendRedirect("cart.jsp");
%>