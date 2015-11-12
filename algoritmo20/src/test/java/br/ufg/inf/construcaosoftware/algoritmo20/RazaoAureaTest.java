/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo20;

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
public class RazaoAureaTest {
    
    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroMenorOuIgualAZero() {
        RazaoAurea.razaoAurea(0, 1, 1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSegundoMenorOuIgualPrimeiro() {
        RazaoAurea.razaoAurea(10, 10, 1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFatorMenorOuIgualAZero() {
        RazaoAurea.razaoAurea(10, 15, 0);
    }
    
    @Test
    public void testRazaoAurea() {
        int x = 20;
        int y = 35;
        int fator = 11;
        double expResult = 1.6;
        double result = RazaoAurea.razaoAurea(x, y, fator);
        assertEquals(expResult, result, 0.1);
    }
    
}
