/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo29;

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
public class RaizQuadradaTest {
    
    @Test(expected = IllegalArgumentException.class)
    public void testRadicandoInvalido() {
        int n = 0;
        int i = 2;
        RaizQuadrada.raizQuadrada(n, i);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testIndiceInvalido() {
        int n = 2;
        int i = -1;
        RaizQuadrada.raizQuadrada(n, i);
    }
    
    @Test
    public void testRaizQuadrada() {
        assertEquals(4, RaizQuadrada.raizQuadrada(16,2), 0.9);
    }
    
}
