package atividade1;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double media ;

        System.out.println("Digite a primeira nota");
        double nota1= scan.nextDouble();

        System.out.println("Digite a segunda nota:");
        double nota2 = scan.nextDouble();

        System.out.println("Digite a terceira nota:");
        double nota3 = scan.nextDouble();

        media = ((nota1*2)+(nota2*3)+(nota3*5))/10;

        System.out.println("Nota 1: "+nota1);
        System.out.println("Nota 2: "+nota2);
        System.out.println("Nota 3: "+nota3);

        System.out.println("A média das notas é: "+media);
    }
}
