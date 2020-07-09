package atividade4;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int contador=0;
        int [][] matriz = new int[3][3];

        System.out.println("Digite os valores da matriz");
        for(int l=0;l<matriz.length;l++){
            for(int c=0;c<matriz.length;c++){
                matriz[l][c]=scan.nextInt();
                if(matriz[l][c]>10){
                    contador ++;
                }
            }
        }
        System.out.println("Os valores da matriz são: ");
        for(int l=0;l<matriz.length;l++){
            for(int c=0;c<matriz.length;c++){
                System.out.print(" "+matriz[l][c]+" ");
            }
            System.out.println();

        }
        System.out.println("A matriz possui "+contador+" numeros maiores que 10");
    }
}
