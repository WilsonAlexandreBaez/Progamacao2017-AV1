/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listapackage;

import java.util.Scanner;

/**
 *
 * @author BAEZ
 */
public class Exercicio15 {
    public static void main(String[] args) {
        int maxima;
        double media;
        int minima;
        int atual;
        
        System.out.println("Sistema de controle de estoque");
        System.out.println("");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a quantidade atual do Estoque: ");
        atual = entrada.nextInt();
        System.out.println("Informe a quantidade maxima do Estoque: ");
        maxima = entrada.nextInt();
        System.out.println("Informe a quantidade minima do Estoque: ");
        minima = entrada.nextInt();
        
        media = ((maxima + minima)/2);
        if (atual >= media){
            System.out.println("Não efetuar compra!");
        }else{
            System.out.println("Efetuar compra!");
        }
    }
}
