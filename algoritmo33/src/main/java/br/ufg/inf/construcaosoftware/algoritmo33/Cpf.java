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
     * Valida o CPF fornecido.
     * @param cpf CPF a ser verificado.
     * @return true se o CPF for valido, falso caso contrario.
     */

    public static void cpf(int[] d){
        int sj= d[1] + 2*d[2] + 3*d[3] + 4*d[4] + 5*d[5] + 6*d[6] + 7*d[7] + 8*d[8] + 9*d[9];
        int sk= d[2] + 2*d[3] + 3*d[4] + 4*d[5] + 5*d[6] + 6*d[7] + 7*d[8] + 8*d[9] + 9*d[910];
    }
}
