package iryna.bozhyk.hibernate.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import iryna.bozhyk.hibernate.entity.Employee;

public class DeleteEmployeerController {
	
	public static void main(String [] args) {
		
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Employee.class)
								.buildSessionFactory();
		for (int i = 1; i<4; i++) {
			Session session = null; 
			try {
				session = factory.getCurrentSession();
				session.beginTransaction();
				Employee tmpEmployee = session.get(Employee.class, i);
				session.delete(tmpEmployee);
				session.getTransaction().commit();
				
			}finally {
				if(session!=null) {
					session.close();
				}
			}
		}
		
	}

}
