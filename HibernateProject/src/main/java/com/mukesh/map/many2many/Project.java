package com.mukesh.map.many2many;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
@Entity
public class Project {

	@Id
	private int pid;
	private String pname;
	@ManyToMany(mappedBy = "project")
	private List<Employee> employee;
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Project(int pid, String pname, List<Employee> employee) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.employee = employee;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pname=" + pname + ", employee=" + employee + "]";
	}
	
	
	
	
	}
