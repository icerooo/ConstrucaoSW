/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo9;

/**
 *
 * @author Henrique
 */
public class Primo {
    public boolean Primo(int n){
        int i = 2;
        while(i <= (n - 1)){
            if((n % i) == 0){
                return false;
            }
            i = i + 1;
        }
        return true;
    }
}
