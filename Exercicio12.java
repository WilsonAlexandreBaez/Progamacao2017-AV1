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
public class Exercicio12 {
      public static void main(String[] args) {
        
        int ladox, ladoy, ladoz;
        int opcao = 1;
        while (opcao == 1) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Entre com o lado x:");
            ladox = entrada.nextInt();
            System.out.println("");
            System.out.println("Entre com lado y:");
            ladoy = entrada.nextInt();
            System.out.println("");
            System.out.println("Entre com lado z:");
            ladoz = entrada.nextInt();
            System.out.println("");
            if ((ladox < ladoy + ladoz) && (ladoy < ladox + ladoz) && (ladoz < ladox + ladoy)) {
                if (ladox == ladoy && ladox == ladoz) {
                    System.out.println("Triangulo Equilatero");
                } else if ((ladox == ladoy) || (ladox == ladoz)) {
                    System.out.println("Triangulo Isosceles");
                } else {
                    System.out.println("Triângulo Escaleno");
                }
            } else {
                System.out.println("Não é um triangulo!");
            }
            System.out.println("");
            System.out.println("Deseja continuar? 1 = sim, 2 = não");
            opcao = entrada.nextInt();
            System.out.println("");
        }
        System.out.println("Obrigado por utilizar nosso App!");
    }  
}
