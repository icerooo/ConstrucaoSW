/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo24;

/**
 *
 * @author Henrique
 */
public class DivideSomas {

    /**
     * Calcula a divisão de um inteiro por outro.
     * @param primeiroValor inteiro com primeiro valor
     * @param segundoValor inteiro com segundo galor
     * @return Inteiro correspondente a divisão de um inteiro por outro.
     */
    public static int divideSomas(int primeiroValor, int segundoValor) {
        if (primeiroValor < 0 || segundoValor <= 0) {
            throw new IllegalArgumentException("primeiroValor deve ser maior ou igual a 0 e segundoValor maior que 0.");
        }

        int contador = 0;
        int soma = segundoValor;
        while (soma <= primeiroValor) {
            soma = soma + segundoValor;
            contador += 1;
        }

        return contador;
    }
}
