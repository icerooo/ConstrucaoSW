/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo22;

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
public class AmigosTest {
    
    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroMenorIgualZero() {
        Amigos.amigos(0, 3);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroMenorIgualZero() {
        Amigos.amigos(5, -2);
    }
}
