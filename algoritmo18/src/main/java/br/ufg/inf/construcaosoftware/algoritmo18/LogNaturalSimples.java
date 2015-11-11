/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo18;

/**
 *
 * @author Henrique
 */
public class LogNaturalSimples {
    public float LogNaturalSimples(int n, int k){
        int i = 2;
        float e = n + 1;
        /*while(i <= k){
            int p = Potencia(n,i);
            int f = Fatorial(i);
            e = e + p / f;
            i++;
        }*/
        return e;
    }
}
