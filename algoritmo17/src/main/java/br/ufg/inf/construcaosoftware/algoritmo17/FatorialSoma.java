/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo17;


/**
 *
 * @author Henrique
 */
public class FatorialSoma {
    public static float FatorialSoma(int n){
        float i = 2;
        float f = 1;
        while(i <= n){
            f = br.ufg.inf.construcaosoftware.algoritmo4.Produto.produto(f,i);
        }
        return f;
    }
}
