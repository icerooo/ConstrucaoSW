/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo32;

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
public class FibonacciTest {
    @Test
    public void testCalculaFibonacciNIgualZero() {
        Fibonacci.fibonacci(0);
    }
    
     @Test
    public void testCalculaFibonacci() {
        assertEquals(21, Fibonacci.fibonacci(8));
    }
 
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaFibonacciNMenorZero() {
        Fibonacci.fibonacci(-1);
    }
    
}
