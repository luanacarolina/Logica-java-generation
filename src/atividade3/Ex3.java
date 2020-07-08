package atividade3;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade =0 ,idade21=0,idade50=0;

        while (idade!=-99){
            System.out.println("Digite sua idade");
            idade = scan.nextInt();
            System.out.println("Sua idade é "+idade+" anos");
            if(idade < 21){
                idade21 ++;
            }else if(idade >=50){
                idade50 ++;
            }
        }

        System.out.println("Quantidade pessoas com idade menor que 21 "+idade21);
        System.out.println("Quantidade pessoas com idade maior que 50 anos "+idade50);
    }
}
