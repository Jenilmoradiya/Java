package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.wishlistBean;
import com.util.UserUtil;

public class WishlistDao {

	public static void Addtowishlist(wishlistBean w) {
		try {
		Connection conn=UserUtil.CreateConnection();
		String sql="insert into wishlist(pid,uid) values(?,?)";
		PreparedStatement  pst=conn.prepareStatement(sql);
		pst.setInt(1, w.getPid() );
		pst.setInt(2, w.getUid());
		pst.executeUpdate();
		
		}catch(Exception e) {
	   }
	}
	
	public static List<wishlistBean> DisplaytoWishlist(int uid){
		
		List<wishlistBean> list=new ArrayList<>();
		
		try {
			Connection conn=UserUtil.CreateConnection();
			String sql="select * from wishlist where uid=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, uid);
			ResultSet rst=pst.executeQuery();
			
			while(rst.next()) {
				wishlistBean wish=new wishlistBean();
				
				wish.setUid(rst.getInt("uid"));
				wish.setPid(rst.getInt("pid"));
	            wish.setWid(rst.getInt("wid"));
				list.add(wish);
			}
			
		} catch (Exception e) {

		}
		
		return list;
		
	}
	
	public static Boolean checkwislist(int pid,int uid) {
		
		Boolean flag=false;
		
		try {
			Connection conn=UserUtil.CreateConnection();
			String sql="select * from wishlist where uid=? and pid=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, uid);
			pst.setInt(2, pid);
			ResultSet rst=pst.executeQuery();
			
			if(rst.next()) {
				flag=true;
			}
			
		} catch (Exception e) {

		}
		return flag;
	}
	
	public static void Removefromwatchlist(wishlistBean w) {
		
		try {
			Connection conn=UserUtil.CreateConnection();
			String sql="delete from wishlist where pid=? and uid=?";
			PreparedStatement  pst=conn.prepareStatement(sql);
			pst.setInt(1, w.getPid() );
			pst.setInt(2, w.getUid());
			pst.executeUpdate();
			
			}catch(Exception e) {
		   }
		}
		
	
}
