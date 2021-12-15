package com.mukesh.lazy_eager_loading;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Candidate {

	@Id
	private int c_id;
	private String c_name;
	private String c_address;

	@OneToMany
	private List<Course> course;

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String getC_address() {
		return c_address;
	}

	public void setC_address(String c_address) {
		this.c_address = c_address;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	public Candidate(int c_id, String c_name, String c_address, List<Course> course) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.c_address = c_address;
		this.course = course;
	}

	public Candidate() {
		super();
		// TODO Auto-generated constructor stub
	}

}
