package atividade1;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double r,s,d;

        System.out.println("Digite o valor de A");
        int a = scan.nextInt();
        System.out.println("Digite o valor de B");
        int b = scan.nextInt();
        System.out.println("Digite o valor de C");
        int c = scan.nextInt();

        r = Math.pow((a+b),2);
        s = Math.pow((b+c),2);
        d= (r+s)/2;

        System.out.println("O valor de R é "+r);
        System.out.println("O valor de S é "+s);
        System.out.println("O valor de D é "+d);

    }


}
