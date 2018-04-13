package com.swingDemo.ServiceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.swingDemo.DB.Db;
import com.swingDemo.Model.Student;
import com.swingDemo.Service.StudentService;

public class StudentServiceImpl implements StudentService {
	
	Connection con=null;
	
	

	public StudentServiceImpl() {
		
		con=Db.getDbcon();
	}

	@Override
	public boolean addstudent(Student s) {
		// TODO Auto-generated method stub
		
		String sql="insert into student(name,address,gender,dob,college,semester,faculty,phone,rollno) values(?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement pstm=con.prepareStatement(sql);
			
			pstm.setString(1, s.getName());
			pstm.setString(2, s.getAddress());
			pstm.setString(3, s.getGender());
			pstm.setDate(4, s.getDob());
			pstm.setString(5, s.getCollege());
			pstm.setString(6, s.getSemester());
			pstm.setString(7, s.getFaculty());
			pstm.setString(8, s.getPhone());
			pstm.setInt(9, s.getRollno());
			
			pstm.execute();
			
				return true;
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		
		List<Student> slist= new ArrayList<Student>();
		
		String sql="select * from student";
		
		try {
			
			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery(sql);
			
			while(rs.next()){
				Student s=new Student();
				s.setId(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setFaculty(rs.getString("faculty"));
				s.setCollege(rs.getString("college"));
				
				slist.add(s);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		return slist;
	}

	@Override
	public boolean deletestudent(int id) {
		// TODO Auto-generated method stub
		
		String sql="delete from student where id='"+id+"' ";
		
		try {
			Statement stm=con.createStatement();
			stm.execute(sql);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updatestudent(Student s) {
		
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		
		String sql="update student set name=?,address=?,gender=?,dob=?,college=?,semester=?,faculty=?,phone=?,rollno=? where id=?";
		try {
			PreparedStatement pstm=con.prepareStatement(sql);
			
			pstm.setString(1, s.getName());
			pstm.setString(2, s.getAddress());
			pstm.setString(3, s.getGender());
			pstm.setDate(4, s.getDob());
			pstm.setString(5, s.getCollege());
			pstm.setString(6, s.getSemester());
			pstm.setString(7, s.getFaculty());
			pstm.setString(8, s.getPhone());
			pstm.setInt(9, s.getRollno());
			pstm.setInt(10, s.getId());
			
			pstm.execute();
			
				return true;
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	
		
		
		
		
	}

	@Override
	public Student getById(int id) {
		// TODO Auto-generated method stub
		

		// TODO Auto-generated method stub
		Student s=new Student();
		List<Student> slist= new ArrayList<Student>();
		
		String sql="select * from student where id='"+id+"'";
		
		try {
			
			
			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery(sql);
			
			while(rs.next()){
				
				s.setId(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setFaculty(rs.getString("faculty"));
				s.setCollege(rs.getString("college"));
				s.setAddress(rs.getString("address"));
				s.setGender(rs.getString("gender"));
				s.setDob(rs.getDate("dob"));
				s.setSemester(rs.getString("semester"));
				s.setPhone(rs.getString("phone"));
				s.setRollno(rs.getInt("rollno"));
				
			
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		return s;
	
		
	
	}

}
