/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo2;

/**
 *
 * @author Henrique
 */
public class Paridade {
    
    /**
     * Determina se o inteiro n é par ou não.
     * @param numero a ser testado.
     * @return true se o inteiro é par e false se não for.
     */
    public static boolean paridade(int numero) {
        if ((numero % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}