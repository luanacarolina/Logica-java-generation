package atividade3;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pares=0,impares=0;
        for(int i =1;i<=10;i++){
            System.out.println("Digite o numero "+i);
            int numero = scan.nextInt();
            if(numero % 2 == 0){
                pares++;

            }else{
                impares++;

            }
        }
        System.out.println("A quantidade de números pares são: "+pares);
        System.out.println("A quantidade de numeros impares são "+impares);

    }
}
