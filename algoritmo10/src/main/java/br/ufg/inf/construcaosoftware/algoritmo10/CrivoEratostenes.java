/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo10;

/**
 *
 * @author Henrique
 */
public class CrivoEratostenes {
    /**
     * Dado um vetor e uma posicao , atribui valor 1 nas posicoes que nao contem primo.
     * @param A vetor com inteiros.
     * @param n tamanho do vetor.
     */

    public static void crivoEratostenes(int[] A, int n){
        if (n < 2) {
            throw new IllegalArgumentException("n deve ser maior ou igual a 2.");
        }
        
        int i = 2;
        while(i <= n/2){
            if(A[i] == 0){
                int c = i + 1;
                while(c <= n){
                    A[c] = 1;
                    c = c + i;
                }
            }
            i = i + 1;
        }
    }
}
