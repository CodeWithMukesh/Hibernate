package com.mukesh.map.many2many;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Employee {
	@Id
	private int id;
	private String name;
	private String post;
	
	@ManyToMany
	@JoinTable(name="p_mgmt",
		joinColumns = {@JoinColumn(name="eid")},
		inverseJoinColumns = {@JoinColumn(name="pid")}
			)
	
	private List<Project> project;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String post, List<Project> project) {
		super();
		this.id = id;
		this.name = name;
		this.post = post;
		this.project = project;
	}

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

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", post=" + post + ", project=" + project + "]";
	}
	
	
	
	}