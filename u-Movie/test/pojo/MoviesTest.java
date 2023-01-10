/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hp
 */
public class MoviesTest {
    
    public MoviesTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAllMov method, of class Movies.
     */
    @Test
    public void testGetAllMov() {
        System.out.println("getAllMov");
        Movies instance = new Movies();
        List<Movies> result = instance.getAllMov();
        assertFalse(result.isEmpty());
    }

    /**
     * Test of goBack method, of class Movies.
     */
    @Test
    public void testGoBack() {
        System.out.println("goBack");
        Movies instance = new Movies();
        String expResult = "dashboard";
        String result = instance.goBack();
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteMov method, of class Movies.
     */
    @Test
    public void testDeleteMov() {
        System.out.println("deleteMov");
        int ids = 0;
        String expResult = "dashboard";
        Movies instance = new Movies();
        String result = instance.deleteMov(ids);
        assertEquals(expResult, result);
    }

    /**
     * Test of getById method, of class Movies.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        int ids = 13;
        Movies instance = new Movies();
        String expResult = "dashboard";
        String result = instance.getById(ids);
        assertEquals(expResult, result);
    }

    /**
     * Test of saveMov method, of class Movies.
     */
    @Test
    public void testSaveMov() {
        System.out.println("saveMov");
        Movies mov = new Movies();
        mov.setTitle("The Call");
        mov.setGenre("Action");
        mov.setLanguage("Korean");
        mov.setCasts("Park Shin-Hye, Jeon Jong-seo, Kim Sung-ryung");
        mov.setDirector("Chung-Hyun Lee");
        mov.setProduction("Yong Film");
        mov.setYtlink("https://www.youtube.com/watch?v=hxkKeniT-0Q");
        mov.setRdate(new GregorianCalendar(2020, 10, 29).getTime());
        String expResult = "dashboard";
        String result = mov.saveMov();
        assertEquals(expResult, result);
    }

    /**
     * Test of editMov method, of class Movies.
     */
    @Test
    public void testEditMov() {
        System.out.println("editMov");
        Movies mov = new Movies();
        mov.setId(13);
        mov.setTitle("The Call");
        mov.setGenre("Action");
        mov.setLanguage("English");
        mov.setCasts("Park Shin-Hye, Jeon Jong-seo, Kim Sung-ryung");
        mov.setDirector("Chung-Hyun Lee");
        mov.setProduction("Yong Film");
        mov.setYtlink("https://www.youtube.com/watch?v=hxkKeniT-0Q");
        String expResult = "dashboard";
        String result = mov.editMov();
        assertEquals(expResult, result);
    }

    /**
     * Test of getId method, of class Movies.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Movies instance = new Movies();
        Integer expResult = 13;
        instance.setId(13);
        Integer result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Movies.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = 13;
        Movies instance = new Movies();
        instance.setId(id);
    }

    /**
     * Test of getTitle method, of class Movies.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Movies instance = new Movies();
        String expResult = "The Call";
        instance.setTitle(expResult);
        String result = instance.getTitle();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTitle method, of class Movies.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "The Call";
        Movies instance = new Movies();
        instance.setTitle(title);
    }

    /**
     * Test of getYtlink method, of class Movies.
     */
    @Test
    public void testGetYtlink() {
        System.out.println("getYtlink");
        Movies instance = new Movies();
        String expResult = "https://www.youtube.com/watch?v=hxkKeniT-0Q";
        instance.setYtlink(expResult);
        String result = instance.getYtlink();
        assertEquals(expResult, result);
    }

    /**
     * Test of setYtlink method, of class Movies.
     */
    @Test
    public void testSetYtlink() {
        System.out.println("setYtlink");
        String ytlink = "https://www.youtube.com/watch?v=hxkKeniT-0Q";
        Movies instance = new Movies();
        instance.setYtlink(ytlink);
    }

    /**
     * Test of getGenre method, of class Movies.
     */
    @Test
    public void testGetGenre() {
        System.out.println("getGenre");
        Movies instance = new Movies();
        String expResult = "Action";
        instance.setGenre(expResult);
        String result = instance.getGenre();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGenre method, of class Movies.
     */
    @Test
    public void testSetGenre() {
        System.out.println("setGenre");
        String genre = "Action";
        Movies instance = new Movies();
        instance.setGenre(genre);
    }

    /**
     * Test of getRdate method, of class Movies.
     */
    @Test
    public void testGetRdate() {
        System.out.println("getRdate");
        Movies instance = new Movies();
        Date expResult = new GregorianCalendar(2020, 10, 29).getTime();
        instance.setRdate(expResult);
        Date result = instance.getRdate();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRdate method, of class Movies.
     */
    @Test
    public void testSetRdate() {
        System.out.println("setRdate");
        Date rdate = new GregorianCalendar(2020, 10, 29).getTime();
        Movies instance = new Movies();
        instance.setRdate(rdate);
    }

    /**
     * Test of getLanguage method, of class Movies.
     */
    @Test
    public void testGetLanguage() {
        System.out.println("getLanguage");
        Movies instance = new Movies();
        String expResult = "English";
        instance.setLanguage(expResult);
        String result = instance.getLanguage();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLanguage method, of class Movies.
     */
    @Test
    public void testSetLanguage() {
        System.out.println("setLanguage");
        String language = "English";
        Movies instance = new Movies();
        instance.setLanguage(language);
    }

    /**
     * Test of getCasts method, of class Movies.
     */
    @Test
    public void testGetCasts() {
        System.out.println("getCasts");
        Movies instance = new Movies();
        String expResult = "Park Shin-Hye, Jeon Jong-seo, Kim Sung-ryung";
        instance.setCasts(expResult);
        String result = instance.getCasts();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCasts method, of class Movies.
     */
    @Test
    public void testSetCasts() {
        System.out.println("setCasts");
        String casts = "Park Shin-Hye, Jeon Jong-seo, Kim Sung-ryung";
        Movies instance = new Movies();
        instance.setCasts(casts);
    }

    /**
     * Test of getDirector method, of class Movies.
     */
    @Test
    public void testGetDirector() {
        System.out.println("getDirector");
        Movies instance = new Movies();
        String expResult = "Chung-Hyun Lee";
        instance.setDirector(expResult);
        String result = instance.getDirector();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDirector method, of class Movies.
     */
    @Test
    public void testSetDirector() {
        System.out.println("setDirector");
        String director = "Chung-Hyun Lee";
        Movies instance = new Movies();
        instance.setDirector(director);
    }

    /**
     * Test of getProduction method, of class Movies.
     */
    @Test
    public void testGetProduction() {
        System.out.println("getProduction");
        Movies instance = new Movies();
        String expResult = "Yong Film";
        instance.setProduction(expResult);
        String result = instance.getProduction();
        assertEquals(expResult, result);
    }

    /**
     * Test of setProduction method, of class Movies.
     */
    @Test
    public void testSetProduction() {
        System.out.println("setProduction");
        String production = "Yong Film";
        Movies instance = new Movies();
        instance.setProduction(production);
    }

    /**
     * Test of getTempimg method, of class Movies.
     */
    @Test
    public void testGetTempimg() {
        System.out.println("getTempimg");
        Movies instance = new Movies();
        String expResult = "hxkKeniT-0Q";
        instance.setTempimg(expResult);
        String result = instance.getTempimg();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTempimg method, of class Movies.
     */
    @Test
    public void testSetTempimg() {
        System.out.println("setTempimg");
        String tempimg = "hxkKeniT-0Q";
        Movies instance = new Movies();
        instance.setTempimg(tempimg);
    }
    
}
