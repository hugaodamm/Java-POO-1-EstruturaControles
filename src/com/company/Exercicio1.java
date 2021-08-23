package com.company;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");

        int valorProduto = scan.nextInt();
        System.out.println("Digite a fabrica: ");

        int fabrica = scan.nextInt();
        double frete = 0;

        switch (fabrica){
            case 1:
                frete = (valorProduto * 7)/100;
                break;
            case 2:
                frete = (valorProduto * 15)/100;
                break;
            case 3:
                frete = (valorProduto * 22)/100;
                break;
        }

        double valorEnvio = valorProduto + frete;

        double valorlucro = 0.25 * (valorEnvio);

        double valorTotal = valorEnvio + valorlucro;

        System.out.println("% de envio: " + valorEnvio);
        System.out.println("% de lucro: " + valorlucro);
        System.out.println("Preço de venda: " + valorTotal);

    }
}
