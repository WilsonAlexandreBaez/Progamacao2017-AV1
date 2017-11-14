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
public class Exercicio14 {
        public static void main(String[]args)
    {
        int horasTrabalhada;
        double valorPorHoraTrabalhada;
        double salario;
        double valorPorHora;
        double horasApagar;
        double valorHorasExtras;
        double horasExtras;
        
        
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a quantidade de horas trabalhada: ");
        horasTrabalhada = s.nextInt();
        System.out.println("Digite o valor por hora trabalhada: ");
        valorPorHoraTrabalhada = s.nextDouble();
        
        if (horasTrabalhada > 40)
        {
            horasExtras = (horasTrabalhada - 40);
            valorHorasExtras = horasExtras * valorPorHoraTrabalhada;
           // System.out.println("Valor da hora extra: " + valorHorasExtras);
            salario = (horasTrabalhada * valorPorHoraTrabalhada);
            System.out.println("O valor do Sálario é: "+ df.format(salario));
        }
        else
        {
            salario = horasTrabalhada * valorPorHoraTrabalhada;
            System.out.println("O valor do Sálario é: "+ df.format(salario));
        }
    
    } 
}
