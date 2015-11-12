/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo26;

import br.ufg.inf.construcaosoftware.algoritmo25.DivideSubtracoes;

/**
 *
 * @author Henrique
 */
public class ModSimples {
  /**
     * Calcula o mod entre dois numeros, utilizando o metodo divideSubtracoes .
     * @param x Primeiro numero.
     * @param y Segundo numero,.
     * @return  resto da divisao.
     */
    public static int modSimples(int x, int y) {
        if (x <= 0 || y <= 0) {
            throw new IllegalArgumentException("Os parametros devem ser maiores que zero.");
        }
        
        int divisao = DivideSubtracoes.divideSubtracoes(x, y);
        
        return x - divisao * y;
    }
}
