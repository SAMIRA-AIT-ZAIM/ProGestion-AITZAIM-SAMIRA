/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.service;

import ma.projet.dao.IDao;
import ma.projet.classes.Tache;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import ma.projet.util.HibernateUtil;

/**
 *
 * @author PC
 */
public class TacheService implements IDao<Tache> {

    @Override
    public boolean create(Tache o) {
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.save(o);
            tx.commit();
            return true;
        } catch (HibernateException e) {
            if(tx != null)
                tx.rollback();
        } finally {
            if(session != null)
                session.close();
        }
        return false;
    }

    @Override
    public boolean delete(Tache o) {
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.delete(o);
            tx.commit();
            return true;
        } catch (HibernateException e) {
            if(tx != null)
                tx.rollback();
        } finally {
            if(session != null)
                session.close();
        }
        return false;
    }

    @Override
    public boolean update(Tache o) {
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.update(o);
            tx.commit();
            return true;
        } catch (HibernateException e) {
            if(tx != null)
                tx.rollback();
        } finally {
            if(session != null)
                session.close();
        }
        return false;
    }

    @Override
    public Tache findById(int id) {
        Tache tache = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            tache = (Tache) session.get(Tache.class, id);
            tx.commit();
        } catch (HibernateException e) {
            if(tx != null)
                tx.rollback();
        } finally {
            if(session != null)
               session.close();
        }
        return tache;
    }

    @Override
    public List<Tache> findAll() {
        List<Tache> taches = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            taches = session.createQuery("from Tache").list();
            tx.commit();
        } catch (HibernateException e) {
            if(tx != null)
                tx.rollback();
        } finally {
            if(session != null)
                session.close();
        }
        return taches;
    }
       public void getTachesPrixSupérieurA1000DH(){
        List<Tache> taches;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            taches = session.createQuery("from Tache where prix > 1000").list();
            tx.commit();
            
//            taches.stream().forEach((t) -> {
//                System.out.println(t);
//            });
            System.out.println("\n-----------------------taches superieurs a 100------------------------\n");
            for(Tache t : taches){
                System.out.println(t);
            }
            
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
    } 
 public void getTachesRealiseesEntreDeuxDate(Date minDate, Date maxDate){
        Session session = null;
        Transaction tx = null;
        String query = "FROM EmployeTache et "
                + "JOIN et.tache Tache "
                + "JOIN et.employe Employe "
                + "WHERE et.dateFinReelle <= CURRENT_DATE() AND "
                + "et.dateDebutReelle >= :minDate AND "
                + "et.dateFinReelle <= :maxDate";
        
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            
            List<Object[]> results = session.createQuery(query)
                    .setParameter("minDate", minDate)
                    .setParameter("maxDate", maxDate)
                    .list();
            
            List<Tache> taches = new ArrayList<>();
            
            for (Object[] result : results) {
                Tache produit = (Tache) result[1];
                taches.add(produit);
            }
            
            for(Tache t : taches){
                System.out.println(t);
            }
            
            tx.commit();
        }catch(HibernateException ex){
            if(tx != null){
                tx.rollback();
            }
        }finally{
            if(session != null){
                session.close();
            }
        }
    }
}
