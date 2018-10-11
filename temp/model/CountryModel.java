package com.online.exam.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country")
public class CountryModel {
	@Id
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	private String name;
	private Integer ftype;
	private String created_at;
	public CountryModel() {
		super();
	}
	public CountryModel(Integer id, String name, Integer ftype, String created_at) {
		super();
		this.id = id;
		this.name = name;
		this.ftype = ftype;
		this.created_at = created_at;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getFtype() {
		return ftype;
	}
	public void setFtype(Integer ftype) {
		this.ftype = ftype;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	
}
