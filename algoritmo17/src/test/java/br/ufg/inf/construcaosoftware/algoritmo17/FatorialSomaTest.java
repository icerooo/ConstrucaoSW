/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo17;

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
public class FatorialSomaTest {
    
    @Test
    public void testFatorialvalorIgualUm() {
        assertEquals(1, FatorialSoma.fatorialSoma(1), 0.0);
    }
    
    @Test
    public void testFatorialValorMaiorQueUm() {
        assertEquals(2, FatorialSoma.fatorialSoma(2), 0.0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFatorialValorInvalido() {
        FatorialSoma.fatorialSoma(0);
    }

}
