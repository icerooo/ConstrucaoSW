/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo12;


/**
 * Classe contendo método que calcula o máximo divisor comum entre os dois parametros fornencidos.
 */
public class Mdc2 {
    
    /**Calcula o maximo divisor comum entre a e b.
     * @param a valor inteiro
     * @param b valor inteiro
     * @return valor correspondente ao divisor comum entre a e b.
     */
    public static int mdc2(int a, int b){
        if(a < b && b < 1){
            throw new IllegalArgumentException("parametro a deve ser maior ou igual a b e parametro b deve ser maior que Zero.");
        }
        
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
