package atividade5;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int []vetor = new int[3];
        int [][]matriz = new int[3][3];

        for(int i =0;i<vetor.length;i++){
            System.out.println("Digite 3 valores");
            vetor[i]=scan.nextInt();
        }
        System.out.println("Digite os valores da matriz 3X3");
        for(int l=0;l<3;l++){
            for(int c=0;c<3;c++){
                matriz[l][c]=scan.nextInt();

            }
        }
        System.out.println("Os valores do vetor são");
        for(int i =0;i<vetor.length;i++){
            System.out.print(" "+vetor[i]);

        }
        System.out.println();
        for(int l=0;l<3;l++){
            for(int c=0;c<3;c++){
                matriz[l][c]=matriz[l][c]*vetor[c];

            }
        }
        System.out.println("Os valores da matriz são");
        for(int l=0;l<3;l++){
            for(int c=0;c<3;c++){
                System.out.print(" "+matriz[l][c]);

            }
            System.out.println();
        }
    }
}
