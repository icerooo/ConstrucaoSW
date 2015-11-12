/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo38;

/**
 *
 * @author Henrique
 */
public class Hipotenusa {
    
    /**
     * Calcula hipotenusa.
     * @param LadoA
     * @param ladoB
     * @return Hipotenusa dos valores.
     */
    public static double hipotenusa(double ladoA, double ladoB) {
        if (ladoA < 1 || ladoB < 1) {
            throw new IllegalArgumentException("Os lados devem ser maiores que ou iguais a 1.");
        }
        
        double x = ladoA * ladoA;
        double y = ladoB * ladoB;
        double r = Math.sqrt(x + y);
        
        return r;
    }
}

