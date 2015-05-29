package my.hibernateExample;

import my.persistence.HibernateUtil;

import org.hibernate.Session;
import java.util.Date;

public class main
{
    public static void main( String[] args )
    {
        System.out.println("Maven + Hibernate + MySQL");
        Session session1 = HibernateUtil.getSessionFactory(1).openSession();
        Session session2 = HibernateUtil.getSessionFactory(2).openSession();
        String data = Long.toString(new Date().getTime()).substring(5);
        update(session1, data);
        update(session2, data);
    }
    
    static void update(Session session, String data){    	
        session.beginTransaction();
        Stock stock = new Stock();        
        
        stock.setStockCode(data);
        stock.setStockName("test_" + data);  
        session.save(stock);
        session.getTransaction().commit();
        System.out.println("Success update to db " + data);
    }
}