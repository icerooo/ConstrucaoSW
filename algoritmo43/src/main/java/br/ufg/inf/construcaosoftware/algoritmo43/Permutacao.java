/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo43;

/**
 *
 * @author Henrique
 */
public class Permutacao {
    
    public static void main(String[] Args){
        String s = "ABCD";
        String p = "";
        
        permutacao(p,s);
    }
    
    public static void permutacao(String p, String s){
        if(s.length() == 1){
            System.out.println(p + s);
        }else{
            for(int i = 1; i < s.length(); i++){
                String s1 = s.substring(0, s.length() - i);
                String p1 = p + s.substring(s.length() - i);
                permutacao(p1, s1);
            }
        }
    }
}
