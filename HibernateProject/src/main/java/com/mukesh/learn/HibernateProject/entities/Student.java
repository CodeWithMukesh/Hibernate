package com.mukesh.learn.HibernateProject.entities;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private int id;
	
	private String name;
	private String city;
	private String email;
	private String mobile;
	@Embedded
	private Certificate cert;
	public Student() {
	}

	public Student(int id, String name, String city, String email, String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.email = email;
		this.mobile = mobile;
	}

	public Student(String name, String city, String email, String mobile) {
		super();
		this.name = name;
		this.city = city;
		this.email = email;
		this.mobile = mobile;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	public Certificate getCert() {
		return cert;
	}

	public void setCert(Certificate cert) {
		this.cert = cert;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", email=" + email + ", mobile=" + mobile
				+ "]";
	}

}