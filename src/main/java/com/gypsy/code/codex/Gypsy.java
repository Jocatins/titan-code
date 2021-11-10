package com.gypsy.code.codex;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Gypsy  {
	@Id
	private String id ;
	private int age;
	private String name;
	private String description;
	
	public Gypsy() {
		
	}
	
	public Gypsy(String id,  int age ,String name, String description) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.description = description;
		
	}
	public String getId() { 
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return description;
	}
	public void setDesc(String description) {
		this.description = description;
	}
		
}
