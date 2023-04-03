package org.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.Course;
import org.jsp.dto.Student;



public class Course_Student_Dao 
{
	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mbi");
	private EntityManager entityManager = entityManagerFactory.createEntityManager();
	private EntityTransaction entityTransaction = entityManager.getTransaction();

	public void SaveStudent(Student student) {
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
	}

	public void SaveCourse(Course course)
	{
		entityTransaction.begin();
		entityManager.persist(course);
		entityTransaction.commit();
	}

}
