package org.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.dto.Course;
import org.jsp.dto.Student;

public class Course_Student_Dao 
{
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	private EntityManager em = emf.createEntityManager();
	private EntityTransaction et = em.getTransaction();
	
	public void saveStudent(Student student)
	{
		et.begin();
		em.persist(student);
		et.commit();
	}
	
	public void saveCourse(Course course)
	{
		et.begin();
		em.persist(course);
		et.commit();
	}
	
	public void updateStudent(int Sid,List<Course>course)
	{
		et.begin();
		Student student = em.find(Student.class,Sid);
		if (student!=null) 
		{
			List<Course> course1 =student.getCourse();
			course1.addAll(course);
			em.merge(student);
			et.commit();
		} else {
			System.out.println("Student id not present");
		}
	}
	
	public void updateCourse(int Cid, List<Student>student)
	{
		et.begin();
		Course course = em.find(Course.class, Cid);
		if (course!=null) 
		{
			List <Student> student1 = course.getStudent();
			student1.addAll(student);
			em.merge(course);
			et.commit();
		} else {
			System.out.println("Course id not found");
		}
	}
	
	public void findStudent(int Sid)
	{
		Student student = em.find(Student.class, Sid);
		if (student!=null) 
		{
			System.out.println(student);
		}
		else {
			System.out.println("null");
		}
	}
	public void findCourse(int Cid)
	{
		Course course = em.find(Course.class, Cid);
		if (course!=null) 
		{
			System.out.println(course);
		}
		else {
			System.out.println("null");
		}
	}
	
	public void DeleteStudent(int Sid)
	{
		et.begin();
		Student student = em.find(Student.class, Sid);
		if (student!=null) {
			em.remove(student);
			et.commit();
		}
		else {
			System.out.println("Student not found");
		}
	}
	public void DeleteCourse(int Cid)
	{
		et.begin();
		Course course = em.find(Course.class, Cid);
		if (course!=null) 
		{
			em.remove(course);
			et.commit();
		}
		else {
			System.out.println("Course not found");
		}
	}
	public void findAll()
	{
		Query  query = em.createQuery("select s from student s");
		List<Student> list = query.getResultList();
		System.out.println(list);
	}
}
