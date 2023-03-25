package com.techhub.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employe")
public class Employe {
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	@Id
	private int id;
	private String uname;
	
	@Override
	public String toString() 
	{
	return "Employe [id=" + id + ", uername=" + uname + "]";
	}

}
