package com.example.hibernate_demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Alien objAlien = new Alien();
        objAlien.setAid(14);
        objAlien.setName("Avinash");
        objAlien.setColor("white");
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
        SessionFactory sFactory = con.buildSessionFactory();
        Session session = sFactory.openSession();
        Transaction txTransaction = session.beginTransaction();
        
        session.save(objAlien);
        
        txTransaction.commit();
    }
}
