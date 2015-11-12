/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo17;
import static br.ufg.inf.construcaosoftware.algoritmo4.Produto.produto;

/**
 *
 * @author Henrique
 */
public class FatorialSoma {
    
     /**
     * Calcula o fatorial de um numero.
     * @param n  o numero que se deseja obter o fatorial.
     * @return  O resultado do fatorial.
     * @throws IllegalArgumentException Se n for menor que um.
     */
    public static float fatorialSoma(int n){
        if(n < 1){
            throw new IllegalArgumentException();
        }
        
        float i = 2;
        float f = 1;
        while(i <= n){
            f = produto(f,i);
            i++;
        }
        return f;
    }
}
