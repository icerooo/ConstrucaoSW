/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo7;

/**
 *
 * @author Henrique
 */
public class Propriedade3025 {
    
    /**
     * Verifica se o quadrado da soma 
     * @param parametro a ser verificado
     * @return verdadeiro se bater a propriedade, falso no caso contrario.
     */
    public static boolean propriedade3025(int parametro) {
        if (parametro < 0 || parametro > 9999) {
            throw new IllegalArgumentException("N deve sair maior ou igual a zero e menor ou igual a 9999");
        }
        
        int primeiroValor = parametro / 100;
        int segundoValor = parametro % 100;
        if ((primeiroValor + segundoValor) * (primeiroValor + segundoValor) == parametro) {
            return true;
        } else {
            return false;
        }
    }
}
