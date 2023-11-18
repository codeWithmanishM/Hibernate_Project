package org.jsp.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
@Entity
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Sid;
	private String Sname;
	private double Smarks;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinColumn
	List<Course> course;

	public int getSid() {
		return Sid;
	}

	public void setSid(int sid) {
		Sid = sid;
	}

	public String getSname() {
		return Sname;
	}

	public void setSname(String sname) {
		Sname = sname;
	}

	public double getSmarks() {
		return Smarks;
	}

	public void setSmarks(double smarks) {
		Smarks = smarks;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", Sname=" + Sname + ", Smarks=" + Smarks + ", course=" + course + "]";
	}
	
	
}
