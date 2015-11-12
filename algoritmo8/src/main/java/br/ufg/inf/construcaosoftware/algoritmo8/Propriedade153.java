/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo8;

/**
 *
 * @author Henrique
 */
public class Propriedade153 {

    /**
     * Calcula se parametro possui propriedade do 153.
     * @param parametro numero a ser verificado.
     * @return  true se possuir a propriedade,
     *          false se nao possuir a propriedade.
     */
    public static boolean propriedade153(int parametro) {
        if (parametro < 0 || parametro > 999) {
            throw new IllegalArgumentException("Paramtro maior ou igual a zero e menor ou igual a 999.");
        }
        
        int i = parametro / 100;
        int j = (parametro - 100 * i) / 10;
        int k = parametro % 10;
        
        return (i * i * i) + (j * j * j) + (k * k * k) == parametro;
    }
}