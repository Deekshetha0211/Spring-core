package com.training.spring;

//import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;
//import lombok.NoArgsConstructor;

@Data
//@NoArgsConstructor
public class Person {
	
	private String firstName;
	
	private String lastName;
	
	private int age;
	
	//@Autowired
	//private Car myCar;
	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(){
		this.age = age;
	}

	
	
	

}