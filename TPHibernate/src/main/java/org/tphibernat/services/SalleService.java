package org.tphibernat.services;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.tphibernat.dao.IDao;
import org.tphibernat.entities.Machine;
import org.tphibernat.entities.Salle;
import org.tphibernat.utils.HibernateUtil;

import java.util.List;

public class SalleService implements IDao<Salle>{

    @Override
    public boolean create(Salle o) {

        Session session = null;
        Transaction tx = null;
        boolean etat = false;

        try{
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.save(o);
            tx.commit();
            etat = true;

        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();

        } finally {
            if (session != null)
                session.close();
        }

        return etat;
    }

    @Override
    public boolean update(Salle o) {

        Session session = null;
        Transaction tx = null;
        boolean etat = false;

        try{
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.update(o);
            tx.commit();
            etat = true;

        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();

        } finally {
            if (session != null)
                session.close();
        }

        return etat;
    }

    @Override
    public boolean delete(Salle o) {

        Session session = null;
        Transaction tx = null;
        boolean etat = false;

        try{
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.delete(o);
            tx.commit();
            etat = true;

        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();

        } finally {
            if (session != null)
                session.close();
        }

        return etat;
    }

    @Override
    public Salle findById(int id) {

        Session session = null;
        Transaction tx = null;
        boolean etat = false;
        Salle salle = null;

        try{
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            salle = session.get(Salle.class, id);
            tx.commit();

        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();

        } finally {
            if (session != null)
                session.close();
        }

        return salle;

    }

    @Override
    public List<Salle> findAll() {
        Session session = null;
        Transaction tx = null;
        List<Salle> salles = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            salles = session.createQuery("from Salle").list();
            tx.commit();

        } catch (Throwable e) {
            tx.rollback();
            e.printStackTrace();

        } finally {
            if (session != null)
                session.close();
        }
        return salles;
    }


}
