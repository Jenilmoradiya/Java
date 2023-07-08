<%@page import="java.util.List"%>
<%@page import="com.bean.wishlistBean"%>
<%@page import="com.dao.WishlistDao"%>
<%

 int pid=Integer.parseInt(request.getParameter("pid"));
 int uid=Integer.parseInt(request.getParameter("uid"));

 
  wishlistBean w=new wishlistBean();
  w.setPid(pid);
  w.setUid(uid);
  WishlistDao.Removefromwatchlist(w);
  List<wishlistBean> list=WishlistDao.DisplaytoWishlist(uid);
  session.setAttribute("wishlist_count", list.size());
  request.setAttribute("msg", "Product removed from Wishlist");
  request.getRequestDispatcher("Wishlist-grid.jsp").forward(request, response);
%>