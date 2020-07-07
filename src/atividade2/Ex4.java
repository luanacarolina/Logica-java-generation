package atividade2;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        int numero = scan.nextInt();

        if(numero % 2 ==0){
            System.out.println("Você digitou um numero par , a raiz quadrada desse número é  "+ Math.sqrt(numero));
        }else {
            System.out.println("Você digitou um numero impar , o numero elevado ao  quadrado é  "+ Math.pow(numero,2));
        }


    }
}
