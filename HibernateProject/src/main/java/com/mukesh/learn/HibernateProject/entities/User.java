package com.mukesh.learn.HibernateProject.entities;

import java.util.Arrays;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;

@Entity
@Table(name="userdata")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int user_id;
	
	@Column(length = 100)
	private String user_name;
	
	@Column(name = "user_addr",length = 100)
	private String user_address;
	
	//skip to save into the database
	@Transient
	private double x;
	
	@Temporal(TemporalType.DATE)
	private Date reg_date;
	
	@Lob
	private byte[] image;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int user_id, String user_name, String user_address, double x, Date reg_date, byte[] image) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_address = user_address;
		this.x = x;
		this.reg_date = reg_date;
		this.image = image;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_address() {
		return user_address;
	}

	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public Date getReg_date() {
		return reg_date;
	}

	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_name=" + user_name + ", user_address=" + user_address + ", x=" + x
				+ ", reg_date=" + reg_date + ", image=" + Arrays.toString(image) + "]";
	}
	
}
