package com.edubridge.hibernate.annotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UserSession {

	public static Session getSession() {
		Configuration cfg = new Configuration();
		cfg.configure("empuprsav.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		return session;
	}
}
