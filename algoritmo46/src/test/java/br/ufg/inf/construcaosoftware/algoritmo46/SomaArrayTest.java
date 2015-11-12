/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo46;

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
public class SomaArrayTest {
    
    SomaArray somaArray;
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8};

    @Test
    public void testSomaArray() {
        assertEquals(10, somaArray.somaArray(array, 4));
    }
    
    @Test
    public void testSomaArray2() {
        assertEquals(36, somaArray.somaArray(array, 8));
    }
    
    @Test
    public void testSomaValoresVetorComUm() {
        assertEquals(1, somaArray.somaArray(array, 1));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSomaArrayNMenorQueZero() {
        somaArray.somaArray(array, -1);
    }
    
}
