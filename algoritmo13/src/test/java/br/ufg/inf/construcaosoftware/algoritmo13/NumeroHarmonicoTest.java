/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo13;

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
public class NumeroHarmonicoTest {
    
    @Test
    public void testNumeroHarmonicoDeUm() {
        assertEquals(1.0, NumeroHarmonico.numeroHarmonico(1.0), 0.0);
    }
    
    public void testNumeroHarmonicoDeDois() {
        assertEquals(1.5, NumeroHarmonico.numeroHarmonico(2.0), 0.0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testalcuCNumeroHarmonicoMenorQueUm() {
        NumeroHarmonico.numeroHarmonico(-2.1);
    }
}