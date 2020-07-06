package atividade1;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua idade em anos , meses e dias");
        int anos = scan.nextInt();
        int meses = scan.nextInt();
        int dias = scan.nextInt();

        anos = anos*365;
        meses= meses*31;
        dias = anos+meses+dias;
        System.out.println("Sua idade em dias é "+dias);
    }
}
