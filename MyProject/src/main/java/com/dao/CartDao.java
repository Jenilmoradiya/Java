package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.CartBean;
import com.bean.wishlistBean;
import com.util.UserUtil;

public class CartDao {

	
	public static void AddToCart(CartBean c) {
		
		try {
			Connection conn=UserUtil.CreateConnection();
			String sql="insert into cart (pid,uid,product_price,product_qty,total_price) values(?,?,?,?,?)";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, c.getPid());
			pst.setInt(2, c.getUid());
			pst.setInt(3, c.getProduct_price());
			pst.setInt(4, c.getProduct_qty());
			pst.setInt(5, c.getTotal_price());
			pst.executeUpdate();			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static List<CartBean> FetchdetailsForCart(int uid){
		
		String payment_status="false";
		List<CartBean> list1=new ArrayList<>();
		
		try {
			Connection conn=UserUtil.CreateConnection();
			String sql="select * from cart where uid=? and payment_status=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, uid);
			pst.setString(2, payment_status);
			ResultSet rst=pst.executeQuery();
			while(rst.next()) {
				
				CartBean c=new CartBean();
				
				c.setCid(rst.getInt("cid"));
				c.setPid(rst.getInt("pid"));
				c.setUid(rst.getInt("uid"));
				c.setProduct_price(rst.getInt("product_price"));
				c.setProduct_qty(rst.getInt("product_qty"));
				c.setTotal_price(rst.getInt("total_price"));
				c.setPayment_status(rst.getString("payment_status"));
				list1.add(c);
				
			}
			
			
			
		} catch (Exception e) {
		 e.printStackTrace();
		}
		
		return list1;
	}
	
public static void Removefromcart(CartBean c) {
		
		try {
			Connection conn=UserUtil.CreateConnection();
			String sql="delete from cart where pid=? and uid=?";
			PreparedStatement  pst=conn.prepareStatement(sql);
			pst.setInt(1, c.getPid() );
			pst.setInt(2, c.getUid());
			pst.executeUpdate();
			
			}catch(Exception e) {
		   }
		}


public static CartBean Getcart(int cid){
	
	CartBean c=null;
	
	try {
		Connection conn=UserUtil.CreateConnection();
		String sql="select * from cart where cid=?";
		PreparedStatement pst=conn.prepareStatement(sql);
		pst.setInt(1, cid);
		ResultSet rst=pst.executeQuery();
		while(rst.next()) {
			
			c=new CartBean();
			
			c.setCid(rst.getInt("cid"));
			c.setPid(rst.getInt("pid"));
			c.setUid(rst.getInt("uid"));
			c.setProduct_price(rst.getInt("product_price"));
			c.setProduct_qty(rst.getInt("product_qty"));
			c.setTotal_price(rst.getInt("total_price"));
			c.setPayment_status(rst.getString("payment_status"));
		}
	} catch (Exception e) {
	 e.printStackTrace();
	}
	
	return c;
 }
public static Boolean checkcart(int pid,int uid) {
	
	Boolean flag=false;
	String payment_status="false";
	try {
		Connection conn=UserUtil.CreateConnection();
		String sql="select * from cart where uid=? and pid=? and payment_status=?";
		PreparedStatement pst=conn.prepareStatement(sql);
		pst.setInt(1, uid);
		pst.setInt(2, pid);
		pst.setString(3, payment_status);
		ResultSet rst=pst.executeQuery();
		
		if(rst.next()) {
			flag=true;
		}
		
	} catch (Exception e) {

	}
	return flag;
}

    public static void updatequantity(CartBean c) {
    	

    	try {
    		Connection conn=UserUtil.CreateConnection();
    		String sql="update cart set product_qty=?,total_price=? where cid=?";
    		PreparedStatement pst=conn.prepareStatement(sql);
    		pst.setInt(1, c.getProduct_qty());
    		pst.setInt(2, c.getTotal_price());
    		pst.setInt(3, c.getCid());
    		pst.executeUpdate();
    	} catch (Exception e) {
    	 e.printStackTrace();
    	}
    } 


    public static void updateCartStatus(int cid) {
    	
    String payment_status="true";
    	try {
    		Connection conn=UserUtil.CreateConnection();
    		String sql="update cart set payment_status=? where cid=?";
    		PreparedStatement pst=conn.prepareStatement(sql);
    		pst.setString(1, payment_status);
    		pst.setInt(2, cid);
   
    		pst.executeUpdate();
    	} catch (Exception e) {
    	 e.printStackTrace();
    	}
    } 

	public static List<CartBean> FetchdetailsForOrders(int uid){
		
		String payment_status="true";
		List<CartBean> list1=new ArrayList<>();
		
		try {
			Connection conn=UserUtil.CreateConnection();
			String sql="select * from cart where uid=? and payment_status=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, uid);
			pst.setString(2, payment_status);
			ResultSet rst=pst.executeQuery();
			while(rst.next()) {
				
				CartBean c=new CartBean();
				
				c.setCid(rst.getInt("cid"));
				c.setPid(rst.getInt("pid"));
				c.setUid(rst.getInt("uid"));
				c.setProduct_price(rst.getInt("product_price"));
				c.setProduct_qty(rst.getInt("product_qty"));
				c.setTotal_price(rst.getInt("total_price"));
				c.setPayment_status(rst.getString("payment_status"));
				list1.add(c);
				
			}
			
			
			
		} catch (Exception e) {
		 e.printStackTrace();
		}
		
		return list1;
	}
	
}

