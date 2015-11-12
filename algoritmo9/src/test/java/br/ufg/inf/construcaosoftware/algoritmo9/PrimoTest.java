/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo9;

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
public class PrimoTest {
    
    
    @Test(expected = IllegalArgumentException.class)
    public void testNumeroMenorQueUm() {
        Primo.primo(0);
    }
    
    @Test
    public void testNumero2() {
        Primo.primo(2);
    }
    
}
