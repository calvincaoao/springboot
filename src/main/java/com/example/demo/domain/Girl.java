package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;

//import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
public class Girl{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String cupSize;
	
	//@Min(value =16,message ="too young to entry")
	private Integer age;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCupSize() {
		return cupSize;
	}

	public void setCupSize(String cupSize) {
		this.cupSize = cupSize;
	}

	//@Min(value =16,message ="too young to entry")
	public Integer getAge() {
		return age;
	}
    
	@Min(value =16,message ="too young to entry")
	public void setAge(Integer age) {
		this.age = age;
	}
}