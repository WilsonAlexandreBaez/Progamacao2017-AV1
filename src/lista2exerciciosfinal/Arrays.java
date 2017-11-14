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
public class Arrays { //classe de vetores
    int[] vet; //vetor de inteiros
    int resultado = 0; //variavel para receber
    
    public int soma(){ //metodo soma
        for (int i = 0; i < vet.length; i++){ //i inicia em 0, enquanto i for menor que o tamanho da sua array(3) soma mais im no i
            resultado = resultado + vet[i]; // resultado recebe o resultado + o valor que está armazenado no "i" = 0
       }
        return resultado; // retorna o resultado
    }
    public static void main(String[] args) { //main
      Scanner entre = new Scanner(System.in);
      
      Arrays vetor = new Arrays(); //aqui instanciou a classe Arrays
      int qt = 0;
       System.out.println("Digite Quantidade de numeros a serem digitados: ");
       qt = entre.nextInt();
       vetor.vet = new int[qt];
      
      for(int i = 0; i < vetor.vet.length; i++){
          System.out.print("Digite o " + (i+1 ) +  " Numero: " );
          vetor.vet[i] = entre.nextInt();
      }     
      
      System.out.println("O resultado eh: " + vetor.soma());
    }
    
}
