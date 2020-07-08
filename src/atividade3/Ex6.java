package atividade3;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double media=0,soma=0,contador=0;

        int numero;
        do{
            System.out.println("Digite um numero");
            numero=scan.nextInt();

            if(numero % 3 ==0){
                soma+=numero;
                media = soma/contador;
                contador ++;
            }

        }while(numero!=0);

        System.out.println("A média dos numeros multiplos de 3 é: "+media);
    }
}
