/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo48;

/**
 *
 * @author Henrique
 */
public class BubbleSort{
    /**
     * Ordena algoritmos por bubblesort.
     * @param A vetor com valores.
     * @param n tamanho do vetor.
     * @return vetor ordenado.
     */
    
  public static int[] bubbleSort(int[] A,int n){
     if(n < 0){
         throw new IllegalArgumentException();
     } 
      
    int p = n;
    while(p >= 1){
      int i = 0;
      while(i < p - 1){
        if(A[i] > A[i+1]){
          int t = A[i];
            A[i] = A[i+1];
            A[i+1] = t;
        }
        i++;
      }
      p = p - 1;
    }
    return A;
  }
}
