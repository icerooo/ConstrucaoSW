/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo3;

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
    public void testomaNaturalIgualUm() {
        assertEquals(1, SomaNaturais.somaNaturais(1));
    }
    
    @Test
    public void testSomaNaturalIgualSeis() {
        assertEquals(6, SomaNaturais.somaNaturais(3));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSomaNaturalIgualZero() {
        SomaNaturais.somaNaturais(0);
    }

}
