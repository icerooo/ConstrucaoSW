/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo6;

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
public class PotenciaSomaTest {
    
    @Test
    public void testPotenciaSoma() {
        int x = 2;
        int y = 3;
        int expResult = 8;
        float result = PotenciaSoma.potenciaSoma(x, y);
        assertEquals(expResult, result, 0.0);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testPotenciaSomaBaseZero() {
        PotenciaSoma.potenciaSoma(0, 1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testPotenciaSomaExpoenteZero() {
        PotenciaSoma.potenciaSoma(1, 0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testPotenciaSomaParametrosZerado() {
        PotenciaSoma.potenciaSoma(0, 0);
    }
}