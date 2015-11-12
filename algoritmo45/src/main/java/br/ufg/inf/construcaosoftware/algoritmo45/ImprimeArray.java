/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo45;

/**
 *
 * @author Henrique
 */
public class ImprimeArray {
/**
     * Metodo que imprime vetor.
     * @param array Array de elementos.
     * @param tamanhoVetor numero de elementos a serem impressos.
     */
    public static void imprimeArray(int[] vetor, int tamanhoVetor) {
        if (tamanhoVetor < 0) {
            throw new IllegalArgumentException("O numero de elementos deve ser maior ou igual a 0.");
        }
        
        int contador = 1;
        while (contador <= tamanhoVetor) {            
            System.out.println(vetor[contador - 1]);
            contador += 1;
        }
    }
}

