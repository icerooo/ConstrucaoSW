/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo12;

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
public class Mdc2Test {
    
    @Test
    public void testMdc2A4B2() {
        assertEquals(2, Mdc2.mdc2(4, 2));
    }
    
     @Test
    public void testMdcNumerosIguais() {
        int a = 10;
        int b = 10;
        int expResult = 10;
        int result = Mdc2.mdc2(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMdcNumerosDiferentes() {
        int a = 15;
        int b = 10;
        int expResult = 5;
        int result = Mdc2.mdc2(a, b);
        assertEquals(expResult, result);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testMdc2ParametrosInvalido() {
        Mdc2.mdc2(-2, -1);
    }

    
}
