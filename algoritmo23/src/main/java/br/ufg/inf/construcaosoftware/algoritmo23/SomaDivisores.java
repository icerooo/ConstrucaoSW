/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo23;

import static br.ufg.inf.construcaosoftware.algoritmo27.Mod.mod;

/**
 *
 * @author Henrique
 */
public class SomaDivisores {
    
    /**
     * Calcula a soma dos divisores do numero fornecido.
     * @param n numero do qual se deseja obter a soma dos divisores.
     * @return Soma dos divisores.
     */
    public static int somaDivisores(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("O parametro deve ser maior que zero.");
        }
        
        int d = 2;
        int s = 1;
        
        while (d <= n / 2) {
            if (mod(n, d) == 0) {
                s = s + d;
            }
            d++;
        }
        
        return s;
    }
}
