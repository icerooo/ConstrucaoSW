/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo32;

/**
 *
 * @author Henrique
 */
public class Fibonacci {
    
    /**
     * Realiza o cálculo de Fibonacci.
     * @param numeroCalculado Inteiro a ser calculado.
     * @return Inteiro do fibonacci de numeroCalculado.
     */
    public static int fibonacci(int numeroCalculado) {
        if (numeroCalculado < 0) {
            throw new IllegalArgumentException("O parametro deve ser maior que 0.");
        }
        
        int valorAtual = 0;
        int fibonacci = 1;
        
        if (numeroCalculado == 0 || numeroCalculado == 1) {
            return numeroCalculado;
        }
        
        int contador = 2;
        while (contador <= numeroCalculado) {            
            int temporario = fibonacci;
            fibonacci += valorAtual;
            valorAtual = temporario;
            contador += 1;
        }
        
        return fibonacci;
    }
}

