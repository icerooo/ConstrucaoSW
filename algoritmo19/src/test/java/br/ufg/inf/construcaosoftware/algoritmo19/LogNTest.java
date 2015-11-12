/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo19;

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
public class LogNTest {
    
    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroVariavelMenorQueUm() {
        LogN.logN(0, 3);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSegundaVariavelMenorQueDois() {
        LogN.logN(1, 1);
    }
    
    @Test
    public void testLogN() {
        double primeiraVariavel = 25.0;
        double segundaVariavel = 2.0;
        LogN instance = new LogN();
        double expResult = 338.5;
        double result = instance.logN(primeiraVariavel, segundaVariavel);
        assertEquals(expResult, result, 0.0);
    }
    
}
