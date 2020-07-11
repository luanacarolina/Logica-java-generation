package atividade5;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        //[0-25], [26-50], [51-75] e [76-100].
        Scanner scan = new Scanner(System.in);
        int numero =0,contador25 =0,contador26 =0,contador51 =0,contador76 =0;
        for(int i=0;numero>=0;i++){
            System.out.println("Digite um numero ");
            numero = scan.nextInt();
            if(numero>=0 && numero<=25){
                contador25++;
            }else if(numero>=26 && numero <=50){
                contador26++;
            }else if(numero>=51 && numero <=75){
                contador51++;
            }else if(numero>=76 && numero<=100){
                contador76++;
            }
        }
        System.out.println("Qtd de numeros no intervalo de [0-25] é de: "+contador25);
        System.out.println("Qtd de numeros no intervalo de [26-50] é de: "+contador26);
        System.out.println("Qtd de numeros no intervalo de [51-75] é de: "+contador51);
        System.out.println("Qtd de numeros no intervalo de [76-100] é de: "+contador76);
    }
}

