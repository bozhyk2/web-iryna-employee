package iryna.bozhyk.hibernate.controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import iryna.bozhyk.hibernate.entity.Employee;

public class EmployeerController {

	
	public static void main (String [] args) {
		List <Employee> emps = new ArrayList<>();
		emps.add(new Employee ("Tim", "Buchalka", "Udemy"));
		emps.add(new Employee ("Iryna", "Bozhyk", "Arton"));
		emps.add(new Employee ("Viktoryya", "Bozhyk", "Bozhyk Company"));
		emps.add(new Employee ("Chad", "Darby", "Udemy"));
		emps.add(new Employee ("Sasha", "Kopyl", "ITE"));
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Employee.class)
									.buildSessionFactory();
		
		try (Session session = factory.getCurrentSession()){
			
		
				
		}
	}
}
