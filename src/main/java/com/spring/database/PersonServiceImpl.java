package com.spring.database;

import java.util.HashMap;
import java.util.Map;

public class PersonServiceImpl implements PersonService{
	
	private Map<String,Person> persons;
	
	public PersonServiceImpl(){
		persons = new HashMap<String,Person>();
	}

	public Person findByName(String name) {
		Person person = persons.get(name);
		return person;
	}

	public void savePerson(Person person) {
		persons.put(person.getName(), person);
		
	}

}
