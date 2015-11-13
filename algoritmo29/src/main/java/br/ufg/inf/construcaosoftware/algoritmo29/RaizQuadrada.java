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
    public static double raizQuadrada(double radicando, int index) {
        if (radicando <= 0) {
            throw new IllegalArgumentException("O n deve ser maior que zero.");
        }
        if (index < 0) {
            throw new IllegalArgumentException("O indice deve ser maior ou igual a zero.");
        }
        
        double raiz = 1;
        
        while (index >= 0) {
            raiz = (raiz + radicando / raiz) / 2;
            index--;
        }
        
        return raiz;
    }
}
