/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo34;

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
public class CPFTest {
    
   @Test(expected = IllegalArgumentException.class)
    public void testVetorTamanhoDiferenteDeOnze() {
        int[] digitos = new int[10];
        CPF.cpf(digitos);
    }

    @Test
    public void testCpfInvalido() {
        int[] digitos = {2, 3, 2, 2, 7, 5, 1, 9, 4, 1, 1};
        boolean expResult = false;
        boolean result = CPF.cpf(digitos);
        assertEquals(expResult, result);
    }

    @Test
    public void testCpfValido() {
        int[] digitos = {0, 5, 0, 7, 8, 8, 0, 1, 1, 0, 3};
        boolean expResult = true;
        boolean result = CPF.cpf(digitos);
        assertEquals(expResult, result);
    }
}
