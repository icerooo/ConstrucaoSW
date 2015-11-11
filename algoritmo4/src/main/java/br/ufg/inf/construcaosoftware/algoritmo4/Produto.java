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
   public static float produto(float a, float b){
    int i = 1;
    float s = 0;
    
    while(i <= b){
    s = s + a;
    i++;
    }
    return s;
   }
}
