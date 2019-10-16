package iryna.bozhyk.hibernate.controller;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import iryna.bozhyk.hibernate.entity.Employee;

public class QueryEmployeeController {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Employee.class)
									.buildSessionFactory();
		Session session = null;
		List<Employee> emps =null;
		try {
			session = factory.getCurrentSession();
			session.beginTransaction();
			emps = session.createQuery("from Employee e WHERE e.company = 'Arton'",Employee.class).getResultList();
			session.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		emps.stream().forEach(System.out::println);

	}

}
