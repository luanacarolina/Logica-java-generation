package atividade2;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String categoria = " ";
        System.out.println("Digite sua idade");
        int idade = scan.nextInt();

        if(idade>=10 && idade<=14){
            categoria = "Infantil";
        }else if(idade >=15 && idade<=17){
            categoria="Juvenil";
        }else if(idade>=18 && idade <=25){
            categoria="Adulto";
        }

        System.out.println("Sua idade é "+idade+" anos ,você está na categoria "+categoria);
    }
}
