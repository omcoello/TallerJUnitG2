/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espol.rentalsystemtest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kcdar
 */
public class MovieRentalTest {
    
    public MovieRentalTest() {
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
     * Test of getDaysRented method, of class MovieRental.
     */
    @Test
    public void testGetDaysRented() {
        System.out.println("getDaysRented");
        Movie peli= new Movie("Toy Story",Movie.CHILDRENS);
        MovieRental instance = new MovieRental(peli,12);
        int expResult = 12;
        int result = instance.getDaysRented();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getMovie method, of class MovieRental.
     */
    @Test
    public void testGetMovie() {
        System.out.println("getMovie");
        Movie peli= new Movie("Toy Story 2",Movie.CHILDRENS);
        MovieRental instance = new MovieRental(peli,5);
        Movie expResult = new Movie("Toy Story 2",Movie.CHILDRENS);
        Movie result = instance.getMovie();
        assertEquals(expResult._title, result._title);
      
    }
    
}
