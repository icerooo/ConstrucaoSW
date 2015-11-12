/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo22;

import static br.ufg.inf.construcaosoftware.algoritmo23.SomaDivisores.somaDivisores;

/**
 *
 * @author Henrique
 */

public class Amigos {
    
    /**
     * Verifica se parametros são iguais a soma dos seus próprios divisores.
     * @param primeiroValor Primeiro inteiro.
     * @param segundoValor Segundo inteiro.
     * @return true se a propriedade é válida ou false.
     */
    public static boolean amigos(int primeiroValor, int segundoValor) {
        if (primeiroValor <= 0 || segundoValor <= 0) {
            throw new IllegalArgumentException("Parametros devem maiores que 0.");
        }
        
        int somaDivisoresprimeiroValor = somaDivisores(primeiroValor);
        int somaDivisoressegundoValor = somaDivisores(segundoValor);
        
        if (somaDivisoresprimeiroValor == primeiroValor &&
                somaDivisoressegundoValor == segundoValor) {
            return true;
        } else {
            return false;
        }
    }
}
