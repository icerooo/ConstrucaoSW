/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo8;

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
public class Propriedade153Test {
    
    @Test(expected = IllegalArgumentException.class)
    public void testParametroMenorQueZero() {
        int n = -1;
        Propriedade153.propriedade153(n);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testParametroMaiorQue999() {
        int n = 1000;
        Propriedade153.propriedade153(n);
    }
    
    @Test
    public void testPropriedade153() {
        int n = 153;
        boolean expResult = true;
        boolean result = Propriedade153.propriedade153(n);
        assertEquals(expResult, result);
    }
    
}