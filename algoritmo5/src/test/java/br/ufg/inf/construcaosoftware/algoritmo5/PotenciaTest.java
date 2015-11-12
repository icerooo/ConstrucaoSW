/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo5;

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
public class PotenciaTest {
    
    @Test
    public void testPotencia() {
        assertEquals(16, Potencia.potencia(4, 2));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testPotenciaBaseZero() {
        Potencia.potencia(0, 2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testPotenciaExpoenteNegativo() {
        Potencia.potencia(1, -1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaPotenciaParametrosNegativos() {
        Potencia.potencia(-1, -1);
    }

    
}
