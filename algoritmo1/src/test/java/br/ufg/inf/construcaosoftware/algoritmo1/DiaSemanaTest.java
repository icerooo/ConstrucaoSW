/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo1;

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
public class DiaSemanaTest {
    
    @Test
    public void testDiaSemanaSeteNovembro2015() {
        assertEquals(6, DiaSemana.diaSemana(7, 11, 2015));
    }  
    
    @Test
    public void testCalculaDiaDaSemanaUmJaneiro1753() {
        assertEquals(1, DiaSemana.diaSemana(1, 1, 1753));
    }  
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaDiaDaSemanaDiaMenorQue1() {
        DiaSemana.diaSemana(0, 1, 2015);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaDiaDaSemanaDiaMaiorQue31() {
        DiaSemana.diaSemana(1, 32, 2015);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaDiaDaSemanaMesMenorQue1() {
       DiaSemana.diaSemana(1, 0, 2015);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaDiaDaSemanaMesMaiorQue12() {
        DiaSemana.diaSemana(1, 13, 2015);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculaDiaDaSemanaAnoMenor1753() {
        DiaSemana.diaSemana(1, 1, 1752);
    } 
    
}
