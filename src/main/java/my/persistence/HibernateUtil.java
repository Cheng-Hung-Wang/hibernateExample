package my.persistence;

import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;
 
public class HibernateUtil {
 
    private static final SessionFactory sessionFactory1 = buildSessionFactory(1);
    private static final SessionFactory sessionFactory2 = buildSessionFactory(2);
    
    private static SessionFactory buildSessionFactory(int num) {
 
        try {
 
            // Create the SessionFactory from hibernate.cfg.xml
        	if (num==1)
        		return new Configuration().configure().buildSessionFactory();
        	if (num==2)
        		return new Configuration().configure("hibernate2.cfg.xml").buildSessionFactory();
        	throw new ExceptionInInitializerError();
        }
 
        catch (Throwable ex) {
 
            // Make sure you log the exception, as it might be swallowed
 
            System.err.println("Initial SessionFactory creation failed." + ex);
 
            throw new ExceptionInInitializerError(ex);
 
        }
 
    }
 
    public static SessionFactory getSessionFactory(int num) {
 
    	if (num==1)
    		return sessionFactory1;
    	if (num==2)
    		return sessionFactory2;
        throw new ExceptionInInitializerError();
 
    }
 
    public static void shutdown() {
 
     // Close caches and connection pools
 
     getSessionFactory(1).close();
     getSessionFactory(2).close();
    }
 
}