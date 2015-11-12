/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo25;

/**
 *
 * @author Henrique
 */
public class DivideSubtracoes {
    
    /**
     * Faz operação de divisão de inteiros.
     * @param primeiroValor Primeiro termo.
     * @param segundoValor Segundo termo.
     * @return Inteiro correspondente a quantidade de vezes que é possível 
     * realizar a operação de divisão sobre um inteiro.
     */
    public static int divideSubtracoes(int primeiroValor, int segundoValor) {
        if (primeiroValor < 0 || segundoValor <= 0) {
            throw new IllegalArgumentException("x deve ser maior ou igual a 0 e y maior que zero.");
        }
        
        int contador = 0;
        int soma = primeiroValor;
        
        while (soma >= segundoValor) {            
            soma -= segundoValor;
            contador++;
        }
        
        return contador;
    }
}