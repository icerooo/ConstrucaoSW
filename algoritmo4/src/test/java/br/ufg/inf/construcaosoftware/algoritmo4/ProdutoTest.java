/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo4;

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
public class ProdutoTest {
    
    @Test
    public void testProduto() {
        assertEquals(1, Produto.produto(1, 1), 0.0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testProdutoPrimeiroMenorQueZero() {
        assertEquals(1, Produto.produto(-1, 1));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testProdutoSegundoMenorQueZero() {
        assertEquals(1, Produto.produto(1, -1));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testProdutoParametrosNegativos() {
        assertEquals(1, Produto.produto(-1, -1));
    }

    
}
