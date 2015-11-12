/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo14;

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
public class SomatorioTest {
    
  @Test
    public void testSomatorioValorIgualAUm() {
        assertEquals(0.5, Somatorio.somatorio(1), 0.0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void tesSomatorioValorIgualAZero() {
        Somatorio.somatorio(0);
    }
}
