/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo20;

/**
 *
 * @author Henrique
 */
public class RazaoAurea {
    
    /**
     * Calcula razao aurea.
     * @param parametroUm primeiro termo.
     * @param parametroDois segundo termo.
     * @param fator Fator.
     * @return razão áurea.
     */
    public static double razaoAurea(double parametroUm, double parametroDois, double fator) {
        if (parametroUm <= 0 || parametroDois <= parametroUm || fator <= 0) {
            throw new IllegalArgumentException("parametroUm deve ser maior que 0. parametroDois deve ser maior parametroUm. fator deve ser maior que 0.");
        }
        
        double tc = parametroDois;
        double ta = parametroUm;
        int auxiliar = 1;
        
        while (auxiliar <= fator) {            
            tc = tc + ta;
            ta = tc - ta;
            auxiliar++;
        }
        
        return tc / ta;
    }
}

