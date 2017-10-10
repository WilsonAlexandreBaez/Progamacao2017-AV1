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
public class Exercicio10 {
    public static void main(String[] args) {

        int a, b, c;
        for (a = 2; a <= 10; a += 2) {
            for (b = a; b <= 2; b++) {
                for (c = 1; c <= a; c += b) {
                    System.out.println("" + a + b + c);
                    
                }
            }
        }
    }    
}
//Resultado 221.