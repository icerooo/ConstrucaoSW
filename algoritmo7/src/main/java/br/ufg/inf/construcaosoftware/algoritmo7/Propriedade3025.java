/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo7;

/**
 *
 * @author Henrique
 */
public class Propriedade3025 {
    public boolean Propriedade3025(int n){
        int i = n/100;
        int j = n % 100;
        if((i + j)*2 == n){
            return true;
        }else{
            return false;
        }
    }
}
