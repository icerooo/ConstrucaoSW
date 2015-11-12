/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo11;

/**
 *
 * @author Henrique
 */
public class MDC {

    /**
     * Calcula o MDC entre dois inteiros.
     * @param parametroUm Numero maior ou igual a 'b'.
     * @param parametroDois Numero maior que zero.
     * @return  O Maximo Divisor Comum.
     */
    public static int mdc(int parametroUm, int parametroDois) {
        if (parametroUm < parametroDois) {
            throw new IllegalArgumentException("O 'a' deve ser maior ou igual a 'b'.");
        }
        if (parametroDois <= 0) {
            throw new IllegalArgumentException("O 'b' deve ser maior que zero.");
        }

        while (parametroDois != 0) {
            int m = parametroUm % parametroDois;
            parametroUm = parametroDois;
            parametroDois = m;
        }
        
        return parametroUm;
    }
}
