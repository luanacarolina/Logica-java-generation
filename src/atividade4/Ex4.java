package atividade4;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[][] matriz1 = new double[2][2];
        double[][] matriz2 = new double[2][2];
        double[][] matriz3 = new double[2][2];
        
        for (int l = 0; l < 2; l++) {
            for (int c = 0; c < 2; c++) {
                System.out.println("Digite o valor da primeira matriz");
                matriz1[l][c] = scan.nextDouble();
                System.out.println("Digite o valor da segunda matriz");
                matriz2[l][c] = scan.nextDouble();
            }
        }
        System.out.println("Digite de acordo com as opções: 1 -Somar as duas matrizes " +
                "2-Subtrair a primeira Matriz da Segunda /\n3- Adicionar uma constante as " +
                "duas Matrizes / 4- Imprimir as matrizes");
        int opçoes = scan.nextInt();
        for (int l = 0; l < 2; l++) {
            for(int c =0;c<2;c++){
                if(opçoes==1){
                    matriz3[l][c]=matriz1[l][c]+matriz2[l][c];
                    System.out.print(" "+matriz3[l][c]);
                }else if(opçoes==2){
                    matriz3[l][c]=matriz1[l][c]-matriz2[l][c];
                    System.out.print(" "+matriz3[l][c]);
                }
            }
            System.out.println("");
        }
            if(opçoes==3){
                System.out.println("Digite uma constante");
                int constante = scan.nextInt();
            for(int l=0;l<2;l++){
                for(int c=0;c<2;c++){
                    matriz1[l][c]+=constante;
                    matriz2[l][c]+=constante;
                    System.out.print(" M1 "+matriz1[l][c]);
                }
                System.out.println();

            }
                System.out.println();
                for(int l=0;l<2;l++){
                    for(int c=0;c<2;c++){
                        System.out.print(" M2 "+matriz1[l][c]);
                    }
                    System.out.println();
                }
        }else if(opçoes==4){
                System.out.println("Matriz 1 ");
                for(int l=0;l<2;l++){
                    for(int c=0;c<2;c++){
                        System.out.print("  "+matriz1[l][c]);
                    }
                    System.out.println();
                }
                System.out.println("Matriz 2 ");
                for(int l=0;l<2;l++){
                    for(int c=0;c<2;c++){
                        System.out.print("  "+matriz2[l][c]);
                    }
                    System.out.println();
                }
            }
    }
}

