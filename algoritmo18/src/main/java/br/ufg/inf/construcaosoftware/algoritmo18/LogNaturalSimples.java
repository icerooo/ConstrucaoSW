/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo18;

import br.ufg.inf.construcaosoftware.algoritmo16.Fatorial;
import br.ufg.inf.construcaosoftware.algoritmo5.Potencia;

/**
 *
 * @author Henrique
 */
public class LogNaturalSimples {
    /**.
    * Calcula o logaritmo natural simples 
     * @param n logaritmando, o numero do qual se deseja obter o logaritmo.
     * @param k luantidade de termos da somatoria
     * @return  O resultado do logaritmo.
     */
     
    public static int logNaturalSimples(int n, int k) {
        if (n < 1 || k < 2) {
            throw new IllegalArgumentException("Parametros Informados Invalidos.");
        }
        
        int contador = 2;
        int e = n + 1;
        int p;
        int f;
        while (contador <= k) {            
            p = Potencia.potencia(n, contador);
            f = Fatorial.fatorial(contador);

            e = e + p / f;
            contador++;
        }
        
        return e;
    }
}

