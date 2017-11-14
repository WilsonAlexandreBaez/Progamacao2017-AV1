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
public class Exercicio8 {
        public static void main(String[] args) {
        // TODO code application logic here
        int nota1;
        int nota2;
        double media;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Digite a primeira: ");
        nota1 = entrada.nextInt();
        
        System.out.println("Digite a segunda: ");
        nota2 = entrada.nextInt ();
        
        media = (nota1 + nota2) /2;
        if (media >= 6){
            System.out.println("Aprovado!");
        } else{
            System.out.println("Rprovado!");
        }
    }
    
}
