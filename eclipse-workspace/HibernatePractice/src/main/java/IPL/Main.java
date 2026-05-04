package IPL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {

        // Hibernate Configuration
        Configuration config = new Configuration();

        // Load hibernate.cfg.xml
        config.configure("hibernate.cfg.xml");

        // Register entity class
        config.addAnnotatedClass(Ipl.class);

        // Build SessionFactory
        SessionFactory factory = config.buildSessionFactory();

        // Open Session
        Session session = factory.openSession();


        
        // Begin Transaction
        Transaction tx = session.beginTransaction();

//        Ipl obj;
////
//        obj = new Ipl();
//        obj.setNo(6);
//        obj.setTeamName("CSK");
//        obj.setWins(3);
//        obj.setLosses(5);
//        session.persist(obj);


        
        // Commit transaction
       
        
        Ipl i = session.get(Ipl.class, 6);
        
        System.out.println(i);
        
        tx.commit();
        // Close resources
        session.close();
        factory.close();

//        System.out.println("IPL standings inserted successfully.");
    }
}