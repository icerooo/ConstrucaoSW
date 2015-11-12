/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo10;

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
public class CrivoEratostenesTest {
    
    @Test
    public void testCrivoEratostenesPrimo() {
        int[] array = {1, 2, 0};
        CrivoEratostenes.crivoEratostenes(array, 2);
        assertEquals(0, array[2]);
    }
    
    @Test
    public void testCrivoEratostenesNaoPrimo() {
        int[] array = {1, 2, 0, 0, 0, 0, 0};
        CrivoEratostenes.crivoEratostenes(array, 6);
        assertEquals(1, array[3]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculaCrivoEratostenesIMenorQueDois() {
        int[] array = null;
        CrivoEratostenes.crivoEratostenes(array, 1);
    }
    
}
