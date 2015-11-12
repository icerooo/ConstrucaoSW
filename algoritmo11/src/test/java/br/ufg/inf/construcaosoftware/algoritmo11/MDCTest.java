/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo11;

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
public class MDCTest {
    
    @Test(expected = IllegalArgumentException.class)
    public void testAMenorQueB() {
        int a = 10;
        int b = 12;
        MDC.mdc(a, b);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testBMenorOuIgualAZero() {
        int a = 10;
        int b = 0;
        MDC.mdc(a, b);
    }
    
    @Test
    public void testMdcNumerosIguais() {
        int a = 10;
        int b = 10;
        int expResult = 10;
        int result = MDC.mdc(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMdcNumerosDiferentes() {
        int a = 15;
        int b = 10;
        int expResult = 5;
        int result = MDC.mdc(a, b);
        assertEquals(expResult, result);
    }
    
}
