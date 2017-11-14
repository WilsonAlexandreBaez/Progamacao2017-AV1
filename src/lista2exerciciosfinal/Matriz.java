/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2exerciciosfinal;

import java.util.Scanner;

/**
 *
 * @author BAEZ
 */
 class Matriz {
    private double mat[][];
    private int n1;
    private int n2;
    
    public Matriz (int l, int c){ 
        n1 = l; 
        n2 = c; 
        mat = new double [n1][n2]; 
        }
    public void lerMatriz(){ 
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < n1; i++) { 
        for (int j = 0; j < n2; j++) { 
        System.out.println("Digite o elemento da linha [" + (i + 1) + "] da coluna [" + (j + 1) + "]: "); 
        mat[i][j] = input.nextInt(); 
        System.out.println(""); 
    } 
    } 
    } 
    public void exibirMatriz(){

        for (int i = 0; i < n1; i++) { 
        for (int j = 0; j < n2; j++) { 
        System.out.print(mat[i][j] + " "); 
    } 
    } 
    }
}

