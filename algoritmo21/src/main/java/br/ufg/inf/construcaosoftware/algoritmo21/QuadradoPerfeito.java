/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo21;

/**
 *
 * @author Henrique
 */
public class QuadradoPerfeito{

    /**
     * Informa se um quadrado é perfeito.
     * @param k A area do quadrado.
     * @return  true, se o quadrado for perfeito,
     *          false, se o quadrado nao for perfeito.
     */
    public static boolean quadradoPerfeito(int k) {
        if (k < 1) {
            throw new IllegalArgumentException("O valor do parametro deve ser maior ou igual a 1.");
        }
        
        int i = 1;
        int q = 1; 
        
        while (q < k) {
            i = i + 2;
            q = q + i;
        }
        
        if(q == k){
          return true;
        }else{
          return false;
        }
    }
}