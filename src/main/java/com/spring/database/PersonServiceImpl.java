package com.spring.database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class PersonServiceImpl implements PersonService{
	
	private Map<String,Person> persons;
	
	public PersonServiceImpl(){
		persons = new HashMap<String,Person>();
	}
	
	public PersonServiceImpl(Map<String,Person> persons){
		this.persons = persons;
	}

	public Person findByName(String name) {
		Person person = persons.get(name);
		return person;
	}

	public void savePerson(Person person) {
		persons.put(person.getName(), person);
		
	}
	
	public List<Person> getAll(){
		List<Person> personList = new ArrayList<Person>(persons.values());		
		return personList;
	}

	public Map<String, Person> getPersons() {
		return persons;
	}

	public void setPersons(Map<String, Person> persons) {
		this.persons = persons;
	}
	
	

}
