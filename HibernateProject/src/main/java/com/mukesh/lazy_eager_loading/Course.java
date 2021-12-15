package com.mukesh.lazy_eager_loading;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
	@Id
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Course(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + "]";
	}

}
