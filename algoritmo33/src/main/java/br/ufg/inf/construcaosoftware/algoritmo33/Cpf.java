/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo33;

/**
 *
 * @author Henrique
 */
public class Cpf {
     /**
     * Verifica se o CPF e valido atraves da comparacao.
     * @param digitos vetor contendo um CPF. 
     * @return true para CPF valido, false para CPF invalido.
     */
    public static boolean cpf(int[] digitos) {
        if (digitos.length != 11) {
            throw new IllegalArgumentException("O vetor deve conter 11 digitos.");
        }

        int somaVerificaoPrimaria = digitos[0] + 2 * digitos[1] + 3 * digitos[2]
                + 4 * digitos[3] + 5 * digitos[4] + 6 * digitos[5]
                + 7 * digitos[6] + 8 * digitos[7] + 9 * digitos[8];

        int somaVerificaoSecundaria = digitos[1] + 2 * digitos[2] + 3 * digitos[3]
                + 4 * digitos[4] + 5 * digitos[5] + 6 * digitos[6]
                + 7 * digitos[7] + 8 * digitos[8] + 9 * digitos[9];

        int verificaoPrimaria = (somaVerificaoPrimaria % 11) % 10;
        int verificaoSecundaria = (somaVerificaoSecundaria % 11) % 10;

        return verificaoPrimaria == digitos[9] && verificaoSecundaria == digitos[10];
    }
}
