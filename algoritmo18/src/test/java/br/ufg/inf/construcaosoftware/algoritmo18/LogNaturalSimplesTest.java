/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo18;

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
public class LogNaturalSimplesTest {
    
   
    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroValorInvalido() {
        LogNaturalSimples.logNaturalSimples(0, 2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSegundoValorInvalido() {
        LogNaturalSimples.logNaturalSimples(1, 1);
    }
}
