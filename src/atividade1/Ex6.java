package atividade1;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double d ;

        System.out.println("Digite os valores de X1 e X2");
        double x1 = scan.nextDouble();
        double x2 = scan.nextDouble();

        System.out.println("Digite os valores de Y1 e Y2");
        double y1 = scan.nextDouble();
        double y2 = scan.nextDouble();

        d = Math.sqrt(Math.pow((x2-x1),2)+(Math.pow((y2-y1),2)));

        System.out.printf("O valor de D é: %.2f ",d);
    }
}
