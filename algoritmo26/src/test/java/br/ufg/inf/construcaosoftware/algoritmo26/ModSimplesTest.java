/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo26;

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
public class ModSimplesTest {
    
    @Test
    public void testModSimples() {
        int x = 6;
        int y = 2;
        int expResult = 0;
        int result = ModSimples.modSimples(x, y);
        assertEquals(expResult, result);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testValorDeYInvalido() {
        ModSimples.modSimples(1, -3);
    }
    
     @Test(expected = IllegalArgumentException.class)
    public void testValorDeXInvalido() {
        ModSimples.modSimples(0, 1);
    }
      
}
