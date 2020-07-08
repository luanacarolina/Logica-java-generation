package atividade3;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soma =0,numero;
        do{
        System.out.println("Digite um numero");
        numero = scan.nextInt();
        soma +=numero;
        }while (numero!=0);

        System.out.println("A soma dos numeros digitados é: "+soma);
    }
}
