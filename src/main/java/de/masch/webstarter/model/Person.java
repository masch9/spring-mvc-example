package de.masch.webstarter.model;


public class Person {

	private String firstName;

	private String lastName;

	private int age;

	private boolean alive;

	public Person() {}

	public Person(final String firstName, final String lastName, final int age, final boolean alive) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.alive = alive;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(final int age) {
		this.age = age;
	}

	public boolean isAlive() {
		return this.alive;
	}

	public void setAlive(final boolean alive) {
		this.alive = alive;
	}
}
