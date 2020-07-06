package atividade1;

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x,y;

        System.out.println("Digite os valores de A,B,C,D,E,F na sequência descrita");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double d = scan.nextDouble();
        double e = scan.nextDouble();
        double f = scan.nextDouble();

        x = ((c*e)-(b*f))/((a*e)-(b*d));
        y=((a*f)-(c*d))/((a*e)-(b*d));

        System.out.println("O valor de X é "+x);
        System.out.println("O valor de Y é "+y);

    }
}
