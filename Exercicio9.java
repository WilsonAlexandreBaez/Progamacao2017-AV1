/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listapackage;

/**
 *
 * @author BAEZ
 */
public class Exercicio9 {
  public static void main(String[] args) {
    
        int c = 1;
        c = 0;
        System.out.println("ta valendo: " + c);
        System.out.println(c--);
        System.out.println("decrementou ta valendo: " + c);
        System.out.println(++c);
        System.out.println(c);
        
        c -= --c - c++;
        System.out.println("ta valendo: " + c);
        System.out.println(c--);
         System.out.println("decrementou ta valendo: " + c);
        System.out.println(++c);
         System.out.println("incrementou ta valendo: " + c);
        System.out.println(c);
         System.out.println("ta valendo: " + c);
        // 6 linhas com  o valor 0 (zero).
    }  
}
