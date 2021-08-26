/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espol.rentalsystemtest;


import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author omarc
 */
public class CustomerTest {
    
    public CustomerTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    
    /**
     * Test of addMovieRental method, of class Customer.
     */
    @org.junit.jupiter.api.Test
    public void testAddMovieRental() {
        System.out.println("addMovieRental");
        MovieRental arg = new MovieRental(new Movie("Erwin", Movie.CHILDRENS),4);
        Customer instance = new Customer("Erwin");
        instance.addMovieRental(arg);
        // TODO review the generated test code and remove the default call to fail.        
        assertEquals(arg.getMovie()._title, instance._name);
    }

    /**
     * Test of addVideoGameRental method, of class Customer.
     */
    @org.junit.jupiter.api.Test
    public void testAddVideoGameRental() {
        System.out.println("addVideoGameRental");
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
    @org.junit.jupiter.api.Test
    public void testStatement() {
        System.out.println("statement");
        Customer instance = new Customer("Sasha");
        String expResult = instance.statement();
        String result = instance.statement();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
