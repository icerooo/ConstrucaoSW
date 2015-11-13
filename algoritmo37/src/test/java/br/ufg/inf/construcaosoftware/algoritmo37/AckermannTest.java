/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo37;

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
public class AckermannTest {
    
   @Test
    public void testAplicaFuncaoDeAckermann() {
        assertEquals(7, Ackermann.ackermann(2, 2));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testAckermannprimeiroParametroInvalido() {
        Ackermann.ackermann(-1, 1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testAckermannSegundoParametroInvalido() {
        Ackermann.ackermann(1, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAckermannParametrosInvalido() {
        Ackermann.ackermann(-1, -1);
    }
    
}
