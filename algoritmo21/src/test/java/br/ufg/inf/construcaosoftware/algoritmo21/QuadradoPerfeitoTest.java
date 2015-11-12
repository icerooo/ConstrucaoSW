/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo21;

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
public class QuadradoPerfeitoTest {
    
    @Test
    public void testVerificaQuadradoPerfeitoTrue() {
        assertTrue(QuadradoPerfeito.quadradoPerfeito(16));
    }
    
    @Test
    public void testVerificaQuadradoPerfeitoFalse() {
        assertFalse(QuadradoPerfeito.quadradoPerfeito(3));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testVerificaQuadradoPerfeitoinvalido() {
        QuadradoPerfeito.quadradoPerfeito(-5);
    }
    
}
