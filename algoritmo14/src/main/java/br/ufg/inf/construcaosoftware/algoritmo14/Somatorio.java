/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo14;

/**
 *
 * @author Henrique
 */
public class Somatorio {
    public float Somatorio(int n){
        int i = 1;
        int s = 0;
        while(i <= n){
            int d = 1 + (i * i);
            s = s + 1 / d;
            i++;
        }
        return s;
    }
}
