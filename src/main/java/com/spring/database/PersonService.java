package com.spring.database;

public interface PersonService {
	public Person findByName(String name);
	public void savePerson(Person person);
}
