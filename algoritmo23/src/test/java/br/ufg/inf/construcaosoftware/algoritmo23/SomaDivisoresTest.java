/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo23;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Henrique
 */
public class SomaDivisoresTest {
    
     @Test(expected = IllegalArgumentException.class)
    public void testNMenorOuIgualAZero() {
        SomaDivisores.somaDivisores(0);
    }
    
    @Test
    public void testSomaDivisores() {
        int n = 6;
        int expResult = 6;
        int result = SomaDivisores.somaDivisores(6);
        assertEquals(expResult, result);
    }
    
}
