package com.company;

import java.util.Scanner;


public class Exercicio3 {
    public static void main(String[] args) {

        Scanner tecla = new Scanner(System.in);

        System.out.println("Digite o serviço escolhido: ");

        int servico = tecla.nextInt();

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

        System.out.println("VALOR FINAL a ser pago pelo serviço realizado: R$ " + custoServico);
    }
}
