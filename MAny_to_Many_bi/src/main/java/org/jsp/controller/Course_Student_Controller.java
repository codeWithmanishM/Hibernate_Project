package org.jsp.controller;

import java.util.ArrayList;
import java.util.List;

import org.jsp.dao.Course_Student_Dao;
import org.jsp.dto.Course;
import org.jsp.dto.Student;

public class Course_Student_Controller 
{
	public static void main(String[] args) 
	{
		Student student = new Student();
//		student.setSid(0);
		student.setName("Manish");
		student.setAddress("Ulhasngar");
		
		Student student1 = new Student();
//		student.setSid(0);
		student1.setName("chetan");
		student1.setAddress("thane");
		
		Course course = new Course();
//		course.setCid(0);
		course.setCname("java");
		course.setType("part Time");
		
		Course course1 = new Course();
//		course.setCid(0); 
		course1.setCname("SQL");
		course1.setType("part Time");
		
		List<Student> list = new ArrayList<Student>();
		list.add(student);
		list.add(student1);
		
		course.setStudent(list);
		course1.setStudent(list);
		
		Course_Student_Dao dao = new Course_Student_Dao();
		
		dao.SaveCourse(course);
		dao.SaveCourse(course1);
		
		dao.SaveStudent(student);
		dao.SaveStudent(student1);
		
	}

}
