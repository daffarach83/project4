/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.Movies;
import util.fdoUtil;

/**
 *
 * @author Farhan
 */
public class movDAO {
    // Untuk menampilkan data ke tabel
    public List<Movies> rtvMov() {
        List listMov = new ArrayList();
        Transaction transaction = null;
        Session session = fdoUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction();
            Query query = session.createQuery("from Movies");
            listMov = query.list();
            transaction.commit();      
        } catch (Exception e) {
            System.out.println(e);
        } finally{
            session.close();
        }
        return listMov;
    }
    
     // untuk mencari/seach data, manipulasi data seperti delete, edit, dan search
    public List<Movies> getbyID(String idMov) {
        Movies mov = new Movies();
        List<Movies> listMov = new ArrayList();
        Transaction transaction = null;
        Session session = fdoUtil.getSessionFactory().openSession();
        
        try {
            transaction = session.beginTransaction();
            Query query = session.createQuery("from Movies where id = :id");
            query.setString("id", idMov);
            mov = (Movies) query.uniqueResult();
            listMov = query.list();
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e);
        } finally{
            session.close();
        }
        return listMov;
    }
    
    // untuk add data
    public void addMovie(Movies mov){
        Transaction transaction = null;
        Session session = fdoUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction();
            session.save(mov);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e);
        } finally{
            session.close();
        }
    }
    
    // untuk delete berdcasarkan id
    public void deleteMovie(Integer idMov) {
        Transaction transaction = null;
        Session session = fdoUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction();
            Movies mv = (Movies) session.load(Movies.class, new Integer(idMov));
            session.delete(mv);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e);
        } finally{
            session.close();
        }
    }
    
    // untuk edit
    public void editMovie(Movies movies) {
        Transaction transaction = null;
        Session session = fdoUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction();
            session.update(movies);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e);
        } finally{
            session.close();
        }
    }    
}
