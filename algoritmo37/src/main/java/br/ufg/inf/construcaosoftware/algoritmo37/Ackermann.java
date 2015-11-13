/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo37;

/**
 *
 * @author Henrique
 */
public class Ackermann {
   /**
     * Realiza a função de Ackermann.
     * @param primeiroParametro
     * @param segundoParametro
     * @return Inteiro com resultado de Ackermann
     */
    public static int ackermann(int primeiroParametro, int segundoParametro) {
        if (primeiroParametro < 0 || segundoParametro < 0) {
            throw new IllegalArgumentException("As entradas devem ser maiores que 0.");
        }
        
        if (primeiroParametro == 0) {
            return segundoParametro + 1;
        }
        
        if (segundoParametro == 0) {
            return ackermann(primeiroParametro - 1, 1);
        }
        
        return ackermann(primeiroParametro - 1, ackermann(primeiroParametro, segundoParametro - 1));
    } 
}
