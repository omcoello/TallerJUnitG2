package com.espol.rentalsystemtest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author omarc
 */
public class CustomerTest {
    
    public CustomerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addMovieRental method, of class Customer.
     */
    @Test
    public void testAddMovieRental() {
        MovieRental arg = new MovieRental(new Movie("Erwin", Movie.CHILDRENS),4);
        Customer instance = new Customer("Erwin");
        instance.addMovieRental(arg);
        // TODO review the generated test code and remove the default call to fail.        
        assertEquals(arg.getMovie()._title, instance._name);
    }

    /**
     * Test of addVideoGameRental method, of class Customer.
     */
    @Test
    public void testAddVideoGameRental() {
        VideoGameRental arg = new VideoGameRental(new Ps3Game("Emilio"), 12, true);
        Customer instance = new Customer("Emilio");
        instance.addVideoGameRental(arg);
        // TODO review the generated test code and remove the default call to fail.
        Ps3Game game = (Ps3Game)arg.getVideoGame();
        assertEquals(game.get_gameName(),instance._name);
    }

    /**
     * Test of statement method, of class Customer.
     */
    @Test
    public void testStatement() {
        System.out.println("statement");
        Customer instance = new Customer("Sasha");
        String expResult = instance.statement();
        String result = instance.statement();
        assertEquals(expResult, result);
    }
    
}
