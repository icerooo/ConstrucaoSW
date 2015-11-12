/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo15;

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
public class PiTest {
    
    @Test
    public void testPi() {
        assertEquals(3.14, Pi.pi(6), 0.5);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testPiValorMenorQue1() {
        Pi.pi(-1);
    }
    
}