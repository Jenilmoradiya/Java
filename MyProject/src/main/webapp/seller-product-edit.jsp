<%@page import="com.dao.ProductDao"%>
<%@page import="com.bean.ProductBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ include file="seller-header.jsp" %>
<!DOCTYPE html>
<html lang="zxx">

<head>
    
</head>

<body>
    
    <!-- Breadcrumb Section Begin -->
    <section class="breadcrumb-section set-bg" data-setbg="img/breadcrumb.jpg">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <div class="breadcrumb__text">
                        <h2>Edit product</h2>
                        <div class="breadcrumb__option">
                            <a href="./index.jsp">Home</a>
                            <span>Edit product</span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Breadcrumb Section End -->

  <%
   if(request.getAttribute("msg")!=null){
	   
	   out.println(request.getAttribute("msg"));
   }
  int pid=Integer.parseInt(request.getParameter("pid"));
  ProductBean p=ProductDao.productinfo(pid);
  
  %>
    
    <!-- Contact Form Begin -->
    <div class="contact-form spad">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="contact__form__title">
                        <h2>Edit product</h2>
                    </div>
                </div>
            </div>
            <form action="ProductController" method="post"   enctype="multipart/form-data" > <!--to add images  -->
            <input type="hidden"  name="uid" value="<%=u.getUid() %>">
            <input type="hidden"  name="pid" value="<%=p.getPid() %>">
                <div class="row">
                   <div class="col-lg-6 col-md-12">
                      <select name="product_category" >
                      <%
                      if(p.getProduct_category().equals("fruits")){
                    	  %>   	  
                            <option>----Select product category----</option>
                      <option value="fruits" selected="selected">Fruits</option>
                      <option value="vegetables">Vegetables</option>  
                   
                   <% 	  
                      }
                      else{
                    	  %>  
                     <option>----Select product category----</option>
                      <option value="fruits" >Fruits</option>
                      <option value="vegetables" selected="selected">Vegetables</option>  
                   <%  	  
                      }         
                      %>
                      </select>
                    </div> 
                   
                   <div class="col-lg-6 col-md-6">
                        <input type="text" value="<%=p.getProduct_name() %>" name="product_name">
                    </div> 
                    <div class="col-lg-6 col-md-6">
                        <input type="text" value="<%=p.getProduct_price() %>" name="product_price">
                    </div> 
                   
                    <div class="col-lg-6 col-md-6">
                      <img src="product_image//<%=p.getProduct_image() %>"  width="100px" height="100px"  >
                    </div>
                   
                    <div class="col-lg-6 col-md-6">
                        <input type="file" placeholder="Product image" name="product_image" >
                    </div>
                    <div class="col-lg-12 text-center">
                        <textarea placeholder="Product details" name="product_details"><%=p.getProduct_details() %></textarea>
                        <button type="submit" name="action" value="update product" class="site-btn">update product</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
    <!-- Contact Form End -->

    <!-- Footer Section Begin -->
    <footer class="footer spad">
        <div class="container">
            <div class="row">
                <div class="col-lg-3 col-md-6 col-sm-6">
                    <div class="footer__about">
                        <div class="footer__about__logo">
                            <a href="./index.jsp"><img src="img/logo.png" alt=""></a>
                        </div>
                        <ul>
                            <li>Address: 60-49 Road 11378 New York</li>
                            <li>Phone: +65 11.188.888</li>
                            <li>Email: hello@colorlib.com</li>
                        </ul>
                    </div>
                </div>
                <div class="col-lg-4 col-md-6 col-sm-6 offset-lg-1">
                    <div class="footer__widget">
                        <h6>Useful Links</h6>
                        <ul>
                            <li><a href="#">About Us</a></li>
                            <li><a href="#">About Our Shop</a></li>
                            <li><a href="#">Secure Shopping</a></li>
                            <li><a href="#">Delivery infomation</a></li>
                            <li><a href="#">Privacy Policy</a></li>
                            <li><a href="#">Our Sitemap</a></li>
                        </ul>
                        <ul>
                            <li><a href="#">Who We Are</a></li>
                            <li><a href="#">Our Services</a></li>
                            <li><a href="#">Projects</a></li>
                            <li><a href="#">Contact</a></li>
                            <li><a href="#">Innovation</a></li>
                            <li><a href="#">Testimonials</a></li>
                        </ul>
                    </div>
                </div>
                <div class="col-lg-4 col-md-12">
                    <div class="footer__widget">
                        <h6>Join Our Newsletter Now</h6>
                        <p>Get E-mail updates about our latest shop and special offers.</p>
                        <form action="#">
                            <input type="text" placeholder="Enter your mail">
                            <button type="submit" class="site-btn">Subscribe</button>
                        </form>
                        <div class="footer__widget__social">
                            <a href="#"><i class="fa fa-facebook"></i></a>
                            <a href="#"><i class="fa fa-instagram"></i></a>
                            <a href="#"><i class="fa fa-twitter"></i></a>
                            <a href="#"><i class="fa fa-pinterest"></i></a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-12">
                    <div class="footer__copyright">
                        <div class="footer__copyright__text"><p><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
  Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
  <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p></div>
                        <div class="footer__copyright__payment"><img src="img/payment-item.png" alt=""></div>
                    </div>
                </div>
            </div>
        </div>
    </footer>
    <!-- Footer Section End -->

    <!-- Js Plugins -->
    <script src="js/jquery-3.3.1.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.nice-select.min.js"></script>
    <script src="js/jquery-ui.min.js"></script>
    <script src="js/jquery.slicknav.js"></script>
    <script src="js/mixitup.min.js"></script>
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/main.js"></script>



</body>

</html>