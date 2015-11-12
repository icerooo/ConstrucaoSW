/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo2;

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

public class ParidadeTest {
    
    @Test
    public void testVerificaParidadeVerdadeiro() {
        assertTrue(Paridade.paridade(4));
    }   
    
    @Test
    public void testVerificaParidadeFalso() {
        assertFalse(Paridade.paridade(5));
    }   
}

