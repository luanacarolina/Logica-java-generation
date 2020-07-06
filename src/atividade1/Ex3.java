package atividade1;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int horas,minutos;

        System.out.println("Digite o tempo de duração em segundos");
        int segundos = scan.nextInt();

        horas = segundos/3600;
        minutos = segundos %3600;
        segundos=minutos%60;
        minutos = minutos/60;

        System.out.println("A duração do evento foi "+horas+" horas "+minutos+" minutos e "+segundos+" segundos");
    }
}
