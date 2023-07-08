<%@page import="com.bean.CartBean"%>
<%@page import="com.dao.CartDao"%>
<%@page import="java.util.List"%>
<%@page import="com.bean.wishlistBean"%>
<%@page import="com.dao.WishlistDao"%>
<%

 int pid=Integer.parseInt(request.getParameter("pid"));
 int uid=Integer.parseInt(request.getParameter("uid"));

 
  CartBean c=new CartBean();
  c.setPid(pid);
  c.setUid(uid);
  CartDao.Removefromcart(c);
  List<CartBean> list1=CartDao.FetchdetailsForCart(uid);
  session.setAttribute("cart_count", list1.size());
  request.setAttribute("msg", "Product removed from cart");
  request.getRequestDispatcher("cart.jsp").forward(request, response);
%>