/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo28;

import br.ufg.inf.construcaosoftware.algoritmo24.DivideSomas;
import br.ufg.inf.construcaosoftware.algoritmo4.Produto;

/**
 *
 * @author Henrique
 */
public class Divide {
    
    /**
     * Realiza a operação de divisão.
     * @param a Dividendo
     * @param b Divisor.
     * @param k 
     */
    public static void divide(int a, int b, int k) {
        if(a < 1 && b < 1){
            throw new IllegalArgumentException();
        }    
        
        int d = DivideSomas.divideSomas(a, b);
        System.out.println(d);
        int r = a % b;
        if (r != 0) {
            System.out.println(",");
        }
        while (r != 0 && k > 0) {            
            r = (int) Produto.produto(10, r);
            d = DivideSomas.divideSomas(r, b);
            System.out.println(d);
            r = r % b;
            k -= 1;
        }
    }
}
