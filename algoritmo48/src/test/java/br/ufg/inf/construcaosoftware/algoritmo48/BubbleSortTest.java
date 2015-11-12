/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.construcaosoftware.algoritmo48;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Henrique
 */
public class BubbleSortTest {

    @Test
    public void testBubbleSort() {
        System.out.println("bubbleSort");
        int[] A = {7,6,4,2,5};
        int n = 5;
        BubbleSort.bubbleSort(A, n);
        System.out.println(A[0] +"" + A[1] + "" + A[2] + "" +A[3]+ "" + A[4]);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testNMenorQueZero() {
        System.out.println("bubbleSort");
        int[] A = {7,6,4,2,5};
        int n = -1;
        BubbleSort.bubbleSort(A, n);
        System.out.println(A[0] +"" + A[1] + "" + A[2] + "" +A[3]+ "" + A[4]);
    }
}
