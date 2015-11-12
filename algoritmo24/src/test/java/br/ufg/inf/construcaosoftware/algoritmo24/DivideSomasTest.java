/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo24;

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
public class DivideSomasTest {
    
    
    @Test
    public void testDivideSomas() {
        assertEquals(0, DivideSomas.divideSomas(1, 2));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testDivideSomasParametroUmMenorQueZero() {
        DivideSomas.divideSomas(-1, 2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testDivideSomasParametroDoisIgualZero() {
        DivideSomas.divideSomas(2, 0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testDivideSomasParametrosInvalidos() {
        DivideSomas.divideSomas(2, 0);
    }
}
