/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo41;

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
public class InverteCaracteresTest {
    
    @Test
    public void testInverteCaracteresOvo() {
        assertEquals("ovo", InverteCaracteres.inverteCaracteres("ovo"));
    }
    
    @Test
    public void testInverteCaracteresArvore() {
        assertEquals("arvore", InverteCaracteres.inverteCaracteres("erovra"));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testInverteCaracteresVAzio() {
        InverteCaracteres.inverteCaracteres("");
    }
    
    
}
