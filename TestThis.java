package com.edubridge.hibernate.annotation;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestThis {

	
	public static void main(String[] args) {
		try {

			Configuration cfg = new Configuration();
			cfg.configure("emp.cfg.xml");
			SessionFactory factory = cfg.buildSessionFactory();
			Session session = factory.openSession();
			//Transaction t = session.beginTransaction();
			Transaction t=session.beginTransaction();
			Address address = new Address();
			
			address.setStreet("PoongaRoad");
			address.setCity("palani");
			address.setState("TN");
			address.setPincode("624601");
			
			UserDetails user = new UserDetails();
			
			user.setUserName("Aravindh");
			user.setUserId(100);
			user.setPhone("976934899");
			user.setDob(new Date());
			user.setAddress(address);
			
			session.save(user);
			t.commit();
			session.close();
			
		}catch(Exception e) {
	
			System.out.println(e.getMessage());

		}
	}
}
