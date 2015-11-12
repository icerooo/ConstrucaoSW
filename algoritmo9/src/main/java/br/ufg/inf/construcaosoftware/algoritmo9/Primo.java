/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo9;

/**
 *
 * @author Henrique
 */

public class Primo {

    /**
     * Verifica se o número fornecido é primo.
     * @param numero numero a ser verificado.
     * @return true se é primo, false se nao for primo.
     */
    public static boolean primo(int numero) {
        if (numero <= 1) {
            throw new IllegalArgumentException("O parametro deve ser maior que 1.");
        }
        
        int verificadora = 2;
        
        while (verificadora <= (numero - 1)) {
            if (numero % verificadora == 0) {
                return false;
            }
            verificadora++;
        }
        
        return true;
    }
}

