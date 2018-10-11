package com.online.exam.country;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Country {
	
	@Id
	private String id;
	private String name;
	private String ftype;
	public Country() {
		super();
	}
	public Country(String id, String name, String ftype) {
		super();
		this.id = id;
		this.name = name;
		this.ftype = ftype;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFtype() {
		return ftype;
	}
	public void setFtype(String ftype) {
		this.ftype = ftype;
	}

}

