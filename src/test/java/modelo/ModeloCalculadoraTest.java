/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import static modelo.ModeloCalculadora.getInstanciaModeloCalculadora;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ies
 */
public class ModeloCalculadoraTest {
    
    public ModeloCalculadoraTest() {
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
     * Test of sumar method, of class ModeloCalculadora.
     */
    @Test
    public void testSumar_1mas2() {
        System.out.println("sumar");
        int primerNumero = 1;
        int segundoNumero = 2;
        ModeloCalculadora instance = getInstanciaModeloCalculadora();
        int expResult = 3;
        int result = instance.sumar(primerNumero, segundoNumero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of restar method, of class ModeloCalculadora.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        int primerNumero = 0;
        int segundoNumero = 0;
        ModeloCalculadora instance = null;
        int expResult = 0;
        int result = instance.restar(primerNumero, segundoNumero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
