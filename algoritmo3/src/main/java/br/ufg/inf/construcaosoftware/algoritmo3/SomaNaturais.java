/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo3;

/**
 *
 * @author Henrique
 */

/**
 * Classe contendo mÃ©todo para calcular a soma de n inteiros.
 */
public class SomaNaturais {
    
    /**
     * Soma de inteiros.
     * @param numero max da soma.
     * @return soma dos numeros.
     */
    public static int somaNaturais(int numero) {
        if (numero < 1) {
            throw new IllegalArgumentException("O numero deve ser maior ou igual a 1");
        }
        int i = 2;
        int s = 1;
        
        while (i <= numero) {            
            s += i;
            i += 1;
        }
        
        return s;
    }
}
