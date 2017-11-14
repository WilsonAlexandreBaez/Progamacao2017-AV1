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
public class Erxercicio13 {
    
    public static void main(String[] args) {
        double valor = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a quantiade de maças compradas: ");
        double quantidade = entrada.nextInt();
        if (quantidade < 12){
           valor = (quantidade * 1.30);
            System.out.println("O valor a ser pago "  + quantidade + " é de: " + valor);
    }
        else if(quantidade <=12){
             valor = (quantidade * 1.00);
            System.out.println("O valor a ser pago em " + quantidade + " é de: " + valor);
        }
    }
}
