package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Student;
import com.util.StudentUtil;

public class StudentDao {

	public static int insertStudent(Student s)
	{
		int result=0;
		try {
			Connection conn=StudentUtil.createConnection();
			String sql="insert into s1(fname,lname,email) values(?,?,?)";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, s.getFname());
			pst.setString(2, s.getLname());
			pst.setString(3, s.getEmail());
			result=pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public static List<Student> getAllStudent()
	{
		List<Student> list=new ArrayList<Student>();
		try {
			Connection conn=StudentUtil.createConnection();
			String sql="select * from s1";
			PreparedStatement pst=conn.prepareStatement(sql);
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				Student s=new Student();
				s.setId(rs.getInt("id"));
				s.setFname(rs.getString("fname"));
				s.setLname(rs.getString("lname"));
				s.setEmail(rs.getString("email"));
				list.add(s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
