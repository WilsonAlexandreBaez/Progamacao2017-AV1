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
public class Exercicio11 {
       public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        int numero = entrada.nextInt();
        if (numero < 10) {
            System.out.println(numero + " É menor que 10");
        } else if (numero > 10){
            System.out.println(numero + " É maior que 10");
        } else if (numero == 10){
            System.out.println(numero + " É igual a 10");
        }
    } 
}
