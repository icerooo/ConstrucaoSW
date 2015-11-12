/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo47;

import br.ufg.inf.construcaosoftware.algoritmo46.SomaArray;

/**
 *
 * @author Henrique
 */
public class MediaArray {
    
    /**
     * Calcula media dos itens do vetor.
     * @param vetor vetor de elementos
     * @param n numero de elementos do vetor.
     * @return media dos valores do vetor.
     */
    public static double mediaArray(int[] vetor, int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n tem que ser maior ou igual a 1.");
        }
        
        double somaElementosArray = SomaArray.somaArray(vetor, n);
        
        return somaElementosArray / n;
    }
}

