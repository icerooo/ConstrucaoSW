/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo15;

/**
 *
 * @author Henrique
 */
public class Pi{
    /**Calcula Pi.
     * @param N numero de pi
     * @return valor de pi
     */
    public static float pi(int n){
        if(n < 1){
            throw new IllegalArgumentException();
        }
        
        int i = 1;
        int s = -1;
        int d = -1;
        float p = 0;
        
        while(i <= n){
            d = d + 2;
            s = -1 * s;
            p = p + 4*s/d;
            i++;
        }
        return p;
    }
}
