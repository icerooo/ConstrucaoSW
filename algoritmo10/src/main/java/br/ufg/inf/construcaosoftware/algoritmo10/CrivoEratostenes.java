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
    public void CrivoEratostenes(int[] A, int n){
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
