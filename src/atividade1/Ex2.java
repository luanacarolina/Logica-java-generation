package atividade1;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            int anos ,meses;

        System.out.println("Digite sua idade em dias");
        int dias = scan.nextInt();

        anos = dias/365;
        meses = dias%365;
        dias= meses%31;
        meses = meses/31;

        System.out.println("Sua idade é "+anos+" anos "+meses+" meses e "+dias+" dias");
    }

}
