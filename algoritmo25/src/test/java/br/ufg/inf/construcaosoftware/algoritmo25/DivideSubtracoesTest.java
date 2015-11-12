/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo25;

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
public class DivideSubtracoesTest {
    

    @Test(expected = IllegalArgumentException.class)
    public void testDivideSubtracoesParametroUmNegativo() {
        DivideSubtracoes.divideSubtracoes(-1, 2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testDivideSubtracoesParametroDoisInvalido() {
        DivideSubtracoes.divideSubtracoes(1, 0);
    }
    
    public void testDivideSubtracoes() {
        assertEquals(0, DivideSubtracoes.divideSubtracoes(1, 2));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testivideSubtracoesParametrosInvalidos() {
        DivideSubtracoes.divideSubtracoes(1, 0);
    }
    
}
