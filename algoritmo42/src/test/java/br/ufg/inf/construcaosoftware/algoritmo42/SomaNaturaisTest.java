/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo42;

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
public class SomaNaturaisTest {  
    
    @Test
    public void testSomaNaturaisValor5() {
        assertEquals(15, SomaNaturais.somaNaturais(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSomaNaturais() {
        SomaNaturais.somaNaturais(0);
    }

}
