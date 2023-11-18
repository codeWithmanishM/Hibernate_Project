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
		//student.setSid(0);Autogenerated
		student.setSname("Manish");
		student.setSmarks(85);
		
		Course course = new Course();
		course.setCname("java");
		course.setCmarks(0);
		
		Student student1 = new Student();
		//student.setSid(0);Autogenerated
		student.setSname("Manish");
		student.setSmarks(85);
		
		Course course1 = new Course();
		course.setCname("SQL");
		course.setCmarks(0);
		
		List<Student>list=new ArrayList<Student>();
		list.add(student);
		list.add(student1);
		
		course.setStudent(list);
		course1.setStudent(list);
		
		Course_Student_Dao dao=new Course_Student_Dao();
		
		dao.saveCourse(course);
		dao.saveCourse(course1);
		
		dao.saveStudent(student);
		dao.saveStudent(student1);
		
		
	}
}