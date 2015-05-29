package my.hibernateExample;

import my.persistence.HibernateUtil;

import org.hibernate.Session;

 
public class main
{
    public static void main( String[] args )
    {
        System.out.println("Maven + Hibernate + MySQL");
        Session session1 = HibernateUtil.getSessionFactory(1).openSession();
        Session session2 = HibernateUtil.getSessionFactory(2).openSession();
        
        update(session1);
        update(session2);
    }
    
    static void update(Session session){    	
        session.beginTransaction();
        Stock stock = new Stock();
  
        stock.setStockCode("1234");
        stock.setStockName("ha sun");
  
        session.save(stock);
        session.getTransaction().commit();
    }
}