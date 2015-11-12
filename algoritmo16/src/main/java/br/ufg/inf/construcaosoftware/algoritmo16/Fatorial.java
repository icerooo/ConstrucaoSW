package br.ufg.inf.construcaosoftware.algoritmo16;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Henrique
 */
public class Fatorial {
    
    /**Calcula o fatorial de N
     * @param numero a ser calculado o fatorial
     * @return Fatorial do parametro a ser passado.
     */
    
    public static int fatorial(int numero){
        if(numero < 1){
            throw new IllegalArgumentException();
        }
        
        int contador = 2;
        int fatorial = 1;
        while(contador <= numero){
            fatorial = fatorial * contador;
            contador++;
        }
        return fatorial;
    }
}
