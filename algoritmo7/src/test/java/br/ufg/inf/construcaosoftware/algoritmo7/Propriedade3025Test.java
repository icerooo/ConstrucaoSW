/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo7;

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
public class Propriedade3025Test {

    @Test
    public void testVerificaPropriedadeParametro1() {
        assertTrue(Propriedade3025.propriedade3025(0));
    }
    
    @Test
    public void testVerificaPropriedadeParametro2() {
        assertFalse(Propriedade3025.propriedade3025(2));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testVerificaMenorQueZero() {
        assertFalse(Propriedade3025.propriedade3025(-1));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testVerificaParametroMaiorQue9999() {
        assertFalse(Propriedade3025.propriedade3025(10000));
    }
}
