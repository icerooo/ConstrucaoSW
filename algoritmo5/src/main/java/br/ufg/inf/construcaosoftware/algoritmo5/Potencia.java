/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo5;

/**
 *
 * @author Henrique
 */
public class Potencia {
    
    /**
     * Calcula a potencia de uma base elevado a um expoente.
     * @param base base
     * @param expoente expoente
     * @return Base elevada ao expoente.
     */
    public static int potencia(int base, int expoente) {
        if (base <= 0 || expoente < 0) {
            throw new IllegalArgumentException("A base maior que 0 e o expoente maior ou igual a 0.");
        }
        
        int contador = 1;
        int potencia = 1;        
        while (contador <= expoente) {            
            potencia *= base;
            contador ++;
        }
        
        return potencia;
    }
}
