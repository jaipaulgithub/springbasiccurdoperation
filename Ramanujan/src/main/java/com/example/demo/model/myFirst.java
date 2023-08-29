package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class myFirst {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private String name;
private String email;
private long mobile_number;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getMobile_number() {
	return mobile_number;
}
public void setMobile_number(long mobile_number) {
	this.mobile_number = mobile_number;
}
@Override
public String toString() {
	return "myFirst [id=" + id + ", name=" + name + ", email=" + email + ", mobile_number=" + mobile_number
			+ ", getId()=" + getId() + ", getName()=" + getName() + ", getEmail()=" + getEmail()
			+ ", getMobile_number()=" + getMobile_number() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}

	

}
