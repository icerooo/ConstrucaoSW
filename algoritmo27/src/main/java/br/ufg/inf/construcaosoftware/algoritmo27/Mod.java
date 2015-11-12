/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo27;

/**
 *
 * @author Henrique
 */
 public class Mod{
    /**
     * Executa a operação módulo.
     * @param x Termo a se aplicar módulo.
     * @param y Termo cujo valor se aplica o módulo.
     * @return int dos modulos.
     */
    public static int mod(int x, int y) {
        if (x <= 0) {
            throw new IllegalArgumentException("O x deve ser maior que zero.");
        }
        if (y < 0) {
            throw new IllegalArgumentException("O y deve ser maior ou igual a zero.");
        }
        
        int s = x;
        
        while (s >= y) {
            s = s - y;
        }
        
        return s;
    }
}
