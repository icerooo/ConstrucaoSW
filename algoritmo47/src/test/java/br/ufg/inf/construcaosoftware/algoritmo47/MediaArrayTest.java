/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo47;

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
public class MediaArrayTest {
    int[] array = {1, 2, 3};
    
    @Test
    public void testMediaArrayTamanhoUm() {
        assertEquals(1, MediaArray.mediaArray(array, 1), 0.0);
    }
    
    @Test
    public void testMediaArray() {
        assertEquals(2, MediaArray.mediaArray(array, 3), 0.0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testMediaArrayNMenorQueZero() {
        MediaArray.mediaArray(array, -1);
    }

}