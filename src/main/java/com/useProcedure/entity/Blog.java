package com.useProcedure.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor

@Entity
@Table(name = "blog")

@NamedStoredProcedureQueries({ @NamedStoredProcedureQuery(name = "firstProcedure", procedureName = "getDataBlog",parameters = {
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "user_id", type = Integer.class) }),
		@NamedStoredProcedureQuery(name = "secondProcedure", procedureName = "get_users", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "user_id", type = Integer.class),@StoredProcedureParameter(mode = ParameterMode.OUT, name = "name", type = String.class) }) })
public class Blog {

	@Id
	private int id;
	private String name;
	private String city;

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

	public Blog(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public Blog() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Blog [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

}