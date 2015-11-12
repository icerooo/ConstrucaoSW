/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo29;

/**
 *
 * @author Henrique
 */
public class RaizQuadrada {
    /**
     * Calcula a raiz.
     * @param n Radicando.
     * @param i Indice.
     * @return  Raiz.
     */
    public static double raizQuadrada(double n, int i) {
        if (n <= 0) {
            throw new IllegalArgumentException("O n deve ser maior que zero.");
        }
        if (i < 0) {
            throw new IllegalArgumentException("O indice deve ser maior ou igual a zero.");
        }
        
        double r = 1;
        
        while (i >= 0) {
            r = (r + n / r) / 2;
            i--;
        }
        
        return r;
    }
}
