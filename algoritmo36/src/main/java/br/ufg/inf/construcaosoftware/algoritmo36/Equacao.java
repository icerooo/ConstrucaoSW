/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo36;

/**
 *
 * @author Henrique
 */
public class Equacao {
    
     /**
     * Metodo que soma +1 cada vez que o if for atendido.
     * return soma das equacoes
     */
    
    public static int equacao() {
        int soma = 0;
        int variavelX = 0;
        int variavelY = 0;
        int variavelZ = 0;
        int variavelW = 0;
        
        while (variavelX <= 96) {            
            variavelY = 1;
            while (variavelY <= 65) {                
                variavelZ = 1;
                while (variavelZ <= 39) {                    
                    variavelW = 1;
                    while (variavelW <= 28) {                        
                        if (2 * variavelX + 3 * variavelY + 5 * variavelZ 
                            + 7 * variavelW == 210) {
                            soma += 1;
                        }
                        variavelW += 1;
                    }
                    variavelZ += 1;
                }
                variavelY += 1;
            }
            variavelX += 1;
        }
        
        return soma;
    }
}
