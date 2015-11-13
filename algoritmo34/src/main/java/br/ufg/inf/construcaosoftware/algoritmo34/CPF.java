/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo34;

/**
 *
 * @author Henrique
 */
public class CPF {
    
    /**
     * Verifica se um CPF e valido. 
     * @param digitos Vetor com os digitos do CPF. Deve conter exatamente 11
     * elementos.
     * @return true se o CPF for valido, false se for invalido.
     * @throws IllegalArgumentException Se o vetor de digitos conter um numero
     * de elementos diferente de 11. 
     */
    public static boolean cpf(int[] digitos) {
        if (digitos.length != 11) {
            throw new IllegalArgumentException("O vetor deve ter 11 digitos.");
        }

        int contador = 8 - 1;
        int variavelUm = digitos[9 - 1];
        int variavelDois = digitos[9 - 1];

        while (contador >= 0) {
            variavelUm = variavelUm + digitos[contador];
            variavelDois = variavelDois + variavelUm;
            contador--;
        }

        int verificadorUm = (variavelDois % 11) % 10;
        int VerificadorDois = ((variavelDois - variavelUm + 9 * verificadorUm) % 11) % 10;

        return verificadorUm == digitos[9] && VerificadorDois == digitos[10];
    }
}
