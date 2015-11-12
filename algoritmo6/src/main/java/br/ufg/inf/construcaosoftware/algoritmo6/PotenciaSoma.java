/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo6;

import br.ufg.inf.construcaosoftware.algoritmo4.Produto;

/**
 *
 * @author Henrique
 */
public class PotenciaSoma {
    
    /**
     * Calcula a soma das potÃªncias 
     * @param base Base
     * @param expoente Expoente
     * @return Inteiro base elevado ao expoente.
     */
    public static float potenciaSoma(int base, int expoente) {
        if (base <= 0 || expoente < 1) {
            throw new IllegalArgumentException("A base maior que 0. "
                    + " O expoente maior ou igual a 1.");
        }
        
        int contador = 1;
        float potencia = base;
        while (contador < expoente) {            
            potencia = Produto.produto(potencia, base);
            contador += 1;
        }
        
        return potencia;
    }
}
