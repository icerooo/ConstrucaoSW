/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo4;

/**
 *
 * @author Henrique
 */
public class Produto {
    
    /**
     * Calcula o produto.
     * @param variavelUM Primeira variavel.
     * @param variavelDois Segunda variavel.
     * @return valor do produto. 
     */
    
    public static float produto(float variavelUM, float variavelDois) {
        if (variavelUM < 0 || variavelDois < 0) {
            throw new IllegalArgumentException("Os parametros tem que ser maiores ou iguais a 0.");
        }
        
        int contador = 1;
        float somatorio = 0;
        
        while (contador <= variavelDois) {            
            somatorio += variavelUM;
            contador += 1;
        }
        
        return somatorio;
    }
}
