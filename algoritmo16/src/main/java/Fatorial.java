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
    public int Fatorial(int n){
        int i = 2;
        int f = 1;
        while(i <= n){
            f = f * i;
            i++;
        }
        return f;
    }
}
