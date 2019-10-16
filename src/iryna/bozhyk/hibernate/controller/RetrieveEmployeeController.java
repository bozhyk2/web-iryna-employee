package iryna.bozhyk.hibernate.controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import iryna.bozhyk.hibernate.entity.Employee;

public class RetrieveEmployeeController {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Employee.class)
									.buildSessionFactory();
		List<Employee> emps = new ArrayList<>();
		
		for (int i = 4; i<9; i++){
			Session session = null;
		try{
			session = factory.getCurrentSession();
			session.beginTransaction();
			emps.add(session.get(Employee.class, i)); 
			session.getTransaction().commit();		
		}finally {
			if (session!= null) {
				session.close();
			}
		}
		}
       emps.stream().forEach(System.out::println);
	}

}
