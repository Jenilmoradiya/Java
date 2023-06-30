package com.Dao;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.bean.Student;
import com.util.StudentUtil;
import java.util.*;


public class StudentDao {

	public static void insertStudent(Student s) {
		try {
		Connection conn=StudentUtil.CreateConnection();
		
		
		
		String sql=" insert into crud(fname,lname,gender,email,mobile,address) values(?,?,?,?,?,?)"; 
		PreparedStatement pst=conn.prepareStatement(sql);
			
		pst.setString(1,s.getFname());	
		pst.setString(2,s.getLname());
		pst.setString(3,s.getGender());
		pst.setString(4,s.getEmail());
		pst.setString(5,s.getMobile());
		pst.setString(6,s.getAddress());
			
			pst.executeUpdate();
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
	}

	public static List<Student> GetStudentInfo(){
		
		List<Student> list= new ArrayList<Student>();
	
		
		try {
			
			Connection conn=StudentUtil.CreateConnection();
			String sql="select * from crud";
			PreparedStatement pst=conn.prepareStatement(sql);
			ResultSet rs=pst.executeQuery();
			
			while(rs.next()) {
				
				Student s=new Student();
				
				s.setId(rs.getInt("id"));
				s.setFname(rs.getString("fname"));
				s.setLname(rs.getString("lname"));
			
				s.setGender(rs.getString("gender"));
				s.setEmail(rs.getString("email"));
				
				s.setMobile(rs.getString("mobile"));
				s.setAddress(rs.getString("address"));
			
				list.add(s);

				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
		
	}


	public static Student GetStudent(int id){
		 
		    Student s=null;
		try {
			
			Connection conn=StudentUtil.CreateConnection();
			String sql="select * from crud where id=?";
			PreparedStatement pst=conn.prepareStatement(sql);
		    pst.setInt(1, id);
			ResultSet rs=pst.executeQuery();
			
			if(rs.next()) {
				
				 s=new Student();
				
				s.setId(rs.getInt("id"));
				s.setFname(rs.getString("fname"));
				s.setLname(rs.getString("lname"));
			
				s.setGender(rs.getString("gender"));
				s.setEmail(rs.getString("email"));
				
				s.setMobile(rs.getString("mobile"));
				s.setAddress(rs.getString("address"));
			
			

				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return s;
		
	}	
	
	

	public static void updateStudent(Student s) {
		try {
		Connection conn=StudentUtil.CreateConnection();
		
		
		
		String sql=" update crud set fname=?, lname=?, gender=?,email=?,mobile=?,address=? where id=? "; 
		PreparedStatement pst=conn.prepareStatement(sql);
			
		pst.setString(1,s.getFname());	
		pst.setString(2,s.getLname());
		pst.setString(3,s.getGender());
		pst.setString(4,s.getEmail());
		pst.setString(5,s.getMobile());
		pst.setString(6,s.getAddress());
		pst.setInt(7,s.getId());	
			pst.executeUpdate();
			
		} catch (SQLException e) {
		
			e.printStackTrace();
			
		}
		}public static void deleteStudent(int id) {
			try {
				Connection conn=StudentUtil.CreateConnection();
				String sql=" delete from crud where id=?"; 
				PreparedStatement pst=conn.prepareStatement(sql);
					pst.setInt(1, id );
				
					pst.executeUpdate();
					
				} catch (SQLException e) {
				
					e.printStackTrace();
				}
		
		
	}
	
}
