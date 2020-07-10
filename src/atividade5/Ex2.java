package atividade5;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double altura,peso,imc;
        System.out.println("Digite sua altura");
        altura = scan.nextDouble();

        System.out.println("Digite seu peso");
        peso = scan.nextDouble();

        imc = peso/(Math.pow(altura,2));

        if(imc<18.5){
            System.out.println("Abaixo do peso");
        }else if(imc>=18.5 && imc<=25){
            System.out.println("Peso normal");
        }else if(imc>=25 && imc<=30){
            System.out.println("Acima do peso");
        }else if(imc>30){
            System.out.println("Obeso");
        }

    }
}
