/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.GregorianCalendar;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import pojo.Movies;
import util.fdoUtil;

/**
 *
 * @author Hp
 */
public class movDAOTest {
    
    public movDAOTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of rtvMov method, of class movDAO.
     */
    @Test
    public void testRtvMov() {
        System.out.println("Test Movie List");
        movDAO instance = new movDAO();
        List<Movies> result = instance.rtvMov();
        System.out.println("Total movies: " + result.toArray().length);
        assertFalse(result.isEmpty());
    }

    /**
     * Test of getbyID method, of class movDAO.
     */
    @Test
    public void testGetbyID() {
        System.out.println("Test Search by ID");
        String idMov = "6";
        movDAO instance = new movDAO();
        List<Movies> result = instance.getbyID(idMov);
        assertFalse(result.isEmpty());
    }

    /**
     * Test of addMovie method, of class movDAO.
     */
    @Test
    public void testAddMovie() {
        System.out.println("Test add a movie");
        
        Movies mov = new Movies();
        mov.setTitle("The Call");
        mov.setGenre("Action");
        mov.setLanguage("Korean");
        mov.setCasts("Park Shin-Hye, Jeon Jong-seo, Kim Sung-ryung");
        mov.setDirector("Chung-Hyun Lee");
        mov.setProduction("Yong Film");
        mov.setYtlink("hxkKeniT-0Q");
        mov.setRdate(new GregorianCalendar(2020, 10, 29).getTime());
        
        movDAO instance = new movDAO();
        instance.addMovie(mov);
        
        assertNotNull(mov);
    }

    /**
     * Test of deleteMovie method, of class movDAO.
     */
    @Test
    public void testDeleteMovie() {
        System.out.println("Test Delete Movie");
        
        Integer idMov = 13;
        movDAO instance = new movDAO();
        Transaction transaction = null;
        Session session = fdoUtil.getSessionFactory().openSession();
        
        
        transaction = session.beginTransaction();                
        instance.deleteMovie(idMov);
        transaction.commit();
        
        Movies deleteMovies = (Movies) session.get(Movies.class, idMov);
        assertNull(deleteMovies);
    }

    /**
     * Test of editMovie method, of class movDAO.
     */
    @Test
    public void testEditMovie() {
        System.out.println("Test Edit Movie");
        
        movDAO instance = new movDAO();
        Transaction transaction = null;
        Session session = fdoUtil.getSessionFactory().openSession();
        
        int id = 6;
        Movies mov  = new Movies();
        mov.setId(id);
        mov.setTitle("The Call");
        mov.setGenre("Horror");
        mov.setLanguage("English");
        mov.setCasts("Park Shin-Hye, Jeon Jong-seo, Kim Sung-ryung");
        mov.setDirector("Chung-Hyun Lee");
        mov.setProduction("Yong Film");
        mov.setYtlink("hxkKeniT-0Q");
        mov.setRdate(new GregorianCalendar(2020, 10, 29).getTime());
        
        transaction = session.beginTransaction();
        instance.editMovie(mov);
        transaction.commit();
        
        Movies updateMovies = (Movies) session.get(Movies.class, id);
        
        String expResult = "The Call";
        String result = updateMovies.getTitle();
        
        assertEquals(expResult, result);
        
        
    }
    
}
