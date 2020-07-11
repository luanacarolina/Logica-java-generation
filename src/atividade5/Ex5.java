package atividade5;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] vetor = new double[5];
        int opcoes = 1;

        while (opcoes != 0) {
            System.out.println("Entre com uma opção");
            opcoes = scan.nextInt();
            if ( opcoes==1 || opcoes==2) {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Digite um numero");
                    vetor[i] = scan.nextDouble();

                }
                if (opcoes == 1) {
                    for (int i = 0; i < 5; i++) {
                        System.out.println(vetor[i]);
                    }
                } if (opcoes == 2) {
                    for (int i = 4; i >= 0; i--) {
                        System.out.println(vetor[i]);
                    }
                }
            }else {
                System.out.println("Código invalido");
            }
        }
    }
}