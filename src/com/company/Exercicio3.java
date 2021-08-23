package com.company;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(
                "Digite o serviço escolhido, 1 ou 2: "
        );

        int servico = scan.nextInt();

        int custoServico = 0;

        int custoPatrulha = 700;

        switch (servico) {
            case 1:
                custoServico = 1500;
                break;
            case 2:
                custoServico = 1500 + custoPatrulha;
                break;
            default:
                custoServico = 0;
                break;
        }

        System.out.println("Valor a ser pago pelos serviços realizados: R$ " + custoServico);
    }
}
