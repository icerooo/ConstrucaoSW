/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo19;

/**
 *
 * @author Henrique
 */
public class LogN {
    
    /**
     * Calcula logaritmo
     * @param primeiraVariavel
     * @param segundaVariavel
     * @return resultado logaritmo
     */
    public static double logN(double primeiraVariavel, double segundaVariavel) {
        if (primeiraVariavel < 1 || segundaVariavel < 2) {
            throw new IllegalArgumentException("primeiraVariavel tem que ser maior ou igual a 1. SegundaVariavel tem que ser maior ou igual a 2");
        }
        
        int contador = 2;
        double e = primeiraVariavel + 1;
        double t = primeiraVariavel;
        
        while (contador <= segundaVariavel) {            
            t = (t * primeiraVariavel) / contador;
            e += t;
            contador++;
        }
        
        return e;
    }
}
