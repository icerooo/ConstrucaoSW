/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo43;

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
public class PermutacaoTest {
    
    @Test
    public void testPermutacaoChar() {
        String prefixo = "";
        String s = "X";
        Permutacao.permutacao(prefixo, s);
    }
    
    @Test
    public void testPermutacao() {
        String prefixo = "";
        String s = "ABCD";
        Permutacao.permutacao(prefixo, s);
    }
    
}
