package com.company;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu RG: ");
        int RG = scan.nextInt();

        System.out.println("Digite o valor do seu salário: ");
        double salario = scan.nextInt();

        double novoSalario = 0;
        double valorTotal = 0;

        if (salario <= 20000){
            valorTotal = salario * 0.20;
        }
        else{
            if (salario > 20000 && salario <= 45000){
                valorTotal = salario * 0.10;
            }else{
                if (salario >= 45000){
                 valorTotal = salario * 0.05;
                }
            }
        }
        novoSalario = salario + valorTotal;

        System.out.println("Seu RG é: " + RG);
        System.out.println("Seu novo salário é: " + novoSalario);
    }
}
