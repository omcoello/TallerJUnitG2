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
public class VideoGameRentalTest {
    
    public VideoGameRentalTest() {
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
     * Test of getDaysRented method, of class VideoGameRental.
     */
    @Test
    public void testGetDaysRented() {
        System.out.println("getDaysRented");
        Ps3Game game= new Ps3Game("God of war 3");
        VideoGameRental instance = new VideoGameRental(game,12,true);
        int expResult = 12;
        int result = instance.getDaysRented();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getVideoGame method, of class VideoGameRental.
     */
    @Test
    public void testGetVideoGame() {
        System.out.println("getVideoGame");
        Ps3Game game= new Ps3Game("Battlefield 1");
        VideoGameRental instance = new VideoGameRental(game,8,true);
        Object expResult = game;
        Object result = instance.getVideoGame();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCharge method, of class VideoGameRental.
     */
    @Test
    public void testGetCharge() {
        System.out.println("getCharge");
        Ps3Game game= new Ps3Game("Injustice");
        VideoGameRental instance = new VideoGameRental(game,1,true);
        double expResult = game.getCharge(1,true);
        double result = instance.getCharge();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of getFrequentRenterPoints method, of class VideoGameRental.
     */
    @Test
    public void testGetFrequentRenterPoints() {
        System.out.println("getFrequentRenterPoints");
        Ps3Game game= new Ps3Game("Fifa 19");
        VideoGameRental instance = new VideoGameRental(game,3,true);
        int expResult = game.getFrequentRenterPoints(3, true);
        int result = instance.getFrequentRenterPoints();
        assertEquals(expResult, result);
    }
    
}
