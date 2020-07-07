package atividade2;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int maior=0;

        System.out.println("Digite três numeros  inteiros:");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();

        if(n1>n2 & n1>n3){
            maior = n1;
        }else if(n2>n1 & n2>n3){
            maior = n2;
        }else {
            maior = n3;
        }

        System.out.println("O maior número é o "+maior);

    }
}
