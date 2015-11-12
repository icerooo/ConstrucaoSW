/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo46;

/**
 *
 * @author Henrique
 */
public class SomaArray {
    
    /**
     * Calcula a soma dos elementos do array fornecido.
     * @param array Array cujos elementos serão somados.
     * @param n
     * @return Inteiro correspondente ao valor da soma dos n elementos.
     */
    public static int somaArray(int array[], int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n deve ser maior ou igual a 1.");
        }
        
        int somatorio = 0;
        int contador = 0;        
        while (contador <= (n - 1)) {            
            somatorio += array[contador];
            contador += 1;
        }
        
        return somatorio;
    }
}