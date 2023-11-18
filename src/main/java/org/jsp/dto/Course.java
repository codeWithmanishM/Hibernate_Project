package org.jsp.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Course 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Cid;
	private String Cname;
	private double Cmarks;
	
	@ManyToMany(cascade=CascadeType.ALL)
	List<Student> student;

	public int getCid() {
		return Cid;
	}

	public void setCid(int cid) {
		Cid = cid;
	}

	public String getCname() {
		return Cname;
	}

	public void setCname(String cname) {
		Cname = cname;
	}

	public double getCmarks() {
		return Cmarks;
	}

	public void setCmarks(double cmarks) {
		Cmarks = cmarks;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Course [Cid=" + Cid + ", Cname=" + Cname + ", Cmarks=" + Cmarks + ", student=" + student + "]";
	}
	
	
}
