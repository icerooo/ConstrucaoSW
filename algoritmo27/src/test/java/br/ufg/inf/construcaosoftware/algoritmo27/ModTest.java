/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo27;

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
public class ModTest {
    
     @Test
    public void testModuloYMaiorQueZero() {
        assertEquals(0 , Mod.mod(2, 1));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testModXInvalidoNegativo() {
        Mod.mod(-1, 1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testModYInvalidoNegativo() {
        Mod.mod(1, -1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testModuloParametrosNegativos() {
        Mod.mod(-1, -1);
    }
    
     @Test
    public void testModMultiplos() {
        int x = 16;
        int y = 4;
        int expResult = 0;
        int result = Mod.mod(x, y);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testModNaoMultiplos() {
        int x = 15;
        int y = 4;
        int expResult = 3;
        int result = Mod.mod(x, y);
        assertEquals(expResult, result);
    }
}
