/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo13;

/**
 *
 * @author Henrique
 */
public class NumeroHarmonico {
    
    /**
     * Gera um numero harmonica
     * @param Numero que representa quantidade de vezes que vai executar soma
     * @return numero harmonico.
     */
    public static double numeroHarmonico(double numero){
        if (numero < 1) {
            throw new IllegalArgumentException("Parametro tem que ser maior ou igual a 1.");
        }
        int i = 2;
        double s = 1;
        
        while(i <= numero){
            s = s + 1/i;
            i = i + 1;
        }
        return s;
    }
}
