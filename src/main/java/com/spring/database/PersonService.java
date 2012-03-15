package com.spring.database;

import java.util.List;

public interface PersonService {
	public Person findByName(String name);
	public void savePerson(Person person);
	public List<Person> getAll();
}
