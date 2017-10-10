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
public class Exercicio7 {
     public static void main(String[] args) {
        // TODO code application logic here
        int n1;
        int n2;
        String Operacao;

        Scanner entradas = new Scanner(System.in);

        System.out.println("Digite a operação desejada: ");
        Operacao = entradas.next();        

        System.out.println("Digite o Primeiro Numero: ");
        n1 = entradas.nextInt();

        System.out.println("Digite o Segundo Numero: ");
        n2 = entradas.nextInt();
        
        switch (Operacao){
            case "+":
                System.out.println("O resultado da Soma é: " + (n1+n2));
                break;
            case "-":
                System.out.println("O resultado da subtração é: " + (n1-n2));
                break;
            case "/":
                System.out.println("O resultado da divisão é: " + (n1/n2));
                break;
            case "*":
                System.out.println("O resultado da multiplicação é: " + (n1*n2));
            }
        
    }   
}
