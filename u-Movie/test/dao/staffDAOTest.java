/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import pojo.Staff;

/**
 *
 * @author Hp
 */
public class staffDAOTest {
    
    public staffDAOTest() {
    }
    
    @Before
    public void setUp() {
        System.out.println("***Start Testing***");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getBy method, of class staffDAO.
     */
    @Test
    public void testGetBy() {
        System.out.println("Login test");
        String uEmail = "admin";
        String uPass = "admin";
        int empty = 0;
        staffDAO instance = new staffDAO();
        List<Staff> result = instance.getBy(uEmail, uPass);
        System.out.println(result.toArray().length);
        assertThat(result.toArray().length, is(not(equalTo(empty))));
        
    }
    
}
