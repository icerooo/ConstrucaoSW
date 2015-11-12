/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo42;

/**
 *
 * @author Henrique
 */
public class SomaNaturais {
    
    /**
     * Recursivamente realiza subtracao de n, Um por Um.
     * @param n Inteiro a ser subtraido.
     * @return valor 1.
     */
    public static int somaNaturais(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n deve ser maior ou igual a 1.");
        }
        if (n == 1) {
            return 1;
        } else {
            return somaNaturais(n - 1) + n;
        }
    }
}
