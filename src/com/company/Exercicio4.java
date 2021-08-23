package com.company;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner tecla = new Scanner(System.in);

        int qtdeDiarioABC = 0;
        int qtdeDiarioAC = 0;
        int qtdeDiarioAB = 0;
        int qtdeDiarioBC = 0;
        int qtdeDiarioA = 0;

        for (int i = 0; i < 5; i++) {
            int leDiarioA = 2;
            int leDiarioB = 2;
            int leDiarioC = 2;

            System.out.println("Vamos falar sobre o entrevistado, seleciona um dos números: " + (i + 1));

            System.out.println("Ele le o Diario A? (1: Sim e 2: Não)");
            leDiarioA = tecla.nextInt();

            System.out.println("Ele le o Diário B? (1 - Sim e 2 - Nao)");
            leDiarioB = tecla.nextInt();

            System.out.println("Ele le o Diário C? (1 - Sim e 2 - Nao)");
            leDiarioC = tecla.nextInt();

            if (leDiarioA == 1 && leDiarioB != 1 && leDiarioC != 1)
                qtdeDiarioA += 1;
            else if (leDiarioA == 1 && leDiarioB != 1 && leDiarioC == 1)
                qtdeDiarioAC += 1;
            else if (leDiarioA == 1 && leDiarioB == 1 && leDiarioC != 1)
                qtdeDiarioAB += 1;
            else if (leDiarioA != 1 && leDiarioB == 1 && leDiarioC == 1)
                qtdeDiarioBC += 1;
            else if (leDiarioA == 1 && leDiarioB == 1 && leDiarioC == 1)
                qtdeDiarioABC += 1;
        }

        System.out.println("Quantidade de leitores que leem apenas o Diario A: " + qtdeDiarioA);
        System.out.println("Quantidade de leitores que leem apenas o Diario A e C: " + qtdeDiarioAC);
        System.out.println("Quantidade de leitores que leem apenas o Diario A e B: " + qtdeDiarioAB);
        System.out.println("Quantidade de leitores que leem apenas o Diario B e C: " + qtdeDiarioBC);
        System.out.println("Quantidade de leitores que leem o Diario A, B e C: " + qtdeDiarioABC);

    }
}
