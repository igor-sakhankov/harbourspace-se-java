package com.example.hello;

class Person {

	Person(Long id, String name, String surname) {
		this.id = id;
		this.firstName = name;
		this.surname = surname;
	}

	private Long id;

	private String firstName;

	private String surname;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
}