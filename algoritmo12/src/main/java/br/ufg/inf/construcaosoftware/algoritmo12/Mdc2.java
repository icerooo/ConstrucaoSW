/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo12;

/**
 *
 * @author Henrique
 */
public class Mdc2{
    
    public int Mdc2(int a, int b){
        
        while(a != b){
            if(a > b){
                a = a - b;
            }else{
                b = b - a;
            }
        }
        return a;
    } 
}
