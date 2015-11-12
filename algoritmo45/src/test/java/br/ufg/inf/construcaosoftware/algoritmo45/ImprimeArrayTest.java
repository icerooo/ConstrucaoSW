/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo45;

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
public class ImprimeArrayTest {
    int[] vetor = {1, 2, 3};
    
    @Test(expected = IllegalArgumentException.class)
    public void testImprimeArrayMenorZero() {
        ImprimeArray.imprimeArray(vetor, -1);
    }
    
    @Test
    public void testImprimeArray() {
        System.out.println("imprimeArray");
        ImprimeArray.imprimeArray(vetor, 3);
    }
    
}
