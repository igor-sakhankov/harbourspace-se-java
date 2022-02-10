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


	protected static boolean isPalindrome(int p) {
		final var s = String.valueOf(p);
		if(s.charAt(0) != s.charAt(s.length() - 1)) {
			return false;
		}

		return false;
	}

	private static void test() {
		isEqual(true, isPalindrome(121));
		isEqual(false, isPalindrome(123));
		isEqual(true, isPalindrome(1));
	}

	private static void isEqual(boolean expected, boolean given) {
		if( expected != given) {
			throw new RuntimeException("TEST IS FAILING");
		}
	}
}
