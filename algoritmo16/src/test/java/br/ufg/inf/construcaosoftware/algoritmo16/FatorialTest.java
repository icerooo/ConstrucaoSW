/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo16;

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
public class FatorialTest {
    
    @Test
    public void testFatorialDeUm() {
        assertEquals(1, Fatorial.fatorial(1));
    }

    @Test
    public void testaFatorialDeSeis() {
        assertEquals(6, Fatorial.fatorial(3));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFatorialZero() {
        Fatorial.fatorial(0);
    }

    
}
