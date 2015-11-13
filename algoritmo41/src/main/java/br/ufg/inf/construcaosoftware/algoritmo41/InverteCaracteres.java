/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo41;

/**
 *
 * @author Henrique
 */
public class InverteCaracteres {
    /**
     * Inverte uma string
     * @param string string a ser invertida.
     * @return String invertida.
     */
    public static String inverteCaracteres(String string) {
        if (string.equals("")) {
            throw new IllegalArgumentException("A string não pode ser vazia.");
        }
        
        String ultimoChar;
        if (string.length() == 1) {
            return string;
        } else {
            ultimoChar = string.substring(string.length()-1);
            String temp = string.substring(0, string.length()-1);
            return ultimoChar + inverteCaracteres(temp);
        }
    }
}
