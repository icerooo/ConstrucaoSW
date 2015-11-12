/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo38;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Henrique
 */
public class HipotenusaTest {
    
    @Test
    public void testCalculaHipotenusa() {
        Assert.assertEquals(5.0, Hipotenusa.hipotenusa(4, 3), 0.0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testHipotenusaLadoMenorQueOutro() {
        Hipotenusa.hipotenusa(1, 0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testHipotenusaLadosInvalidos() {
        Hipotenusa.hipotenusa(0, 0);
    }

}
