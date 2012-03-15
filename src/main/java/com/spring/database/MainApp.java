package com.spring.database;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		PersonService personService = context.getBean("personService",PersonService.class);
		Person person = new Person("karan",32);
		personService.savePerson(person);
		
		Person per = personService.findByName("karan");
		System.out.println("Name: - "+per.getName());
		System.out.println("Name: - "+per.getAge());

		for(Person p:personService.getAll()){
			System.out.println("Person Name:- "+p.getName()+", Age "+p.getAge());
		}
	}

}
