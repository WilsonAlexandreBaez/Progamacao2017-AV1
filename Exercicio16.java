/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listapackage;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author BAEZ
 */
public class Exercicio16 {
     public static void main(String[] args) {
        int conta;
        float saldo,credito,debito, saldoAtual;
      
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o Número da Conta: ");
        conta = s.nextInt();
        System.out.println("Informe o Saldo da Conta: ");
        saldo = s.nextFloat();
        System.out.println("Informe o Valor do Credito: ");
        credito = s.nextFloat();
        System.out.println("Informe o Valor do Dedito: ");
        debito = s.nextFloat();

        saldoAtual = saldo - debito + credito;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("O Saldo Atual é : " + df.format(saldoAtual));
        if (saldoAtual >= 0) {
            System.out.println("Saldo Positivo");
        } else {
            System.out.println("Saldo Negativo");
        }
    }
}
