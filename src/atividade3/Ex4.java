package atividade3;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int contador = 1,numeroPessoasCalmas=0,numeroMulheresNervosas=0
                ,numeroHomensAgressivos=0, numeroPessoasNervosas40=0, numerosPessoasCalmas18=0;

        while (contador<=150){
            System.out.println("Digite sua idade "+contador);
            int idade = scan.nextInt();
            System.out.println("Digite 1-Feminino/2-Masculino");
            int sexo = scan.nextInt();
            System.out.println("Digite de acordo com as opções 1-Calma(o)/ 2-Nervosa(o) / 3-Agressiva(o)");
            int opcoes = scan.nextInt();

            if(opcoes==1){
                numeroPessoasCalmas++;
            }else if(opcoes==2 && sexo==1){
                numeroMulheresNervosas++;
            }else if(opcoes==3 && sexo==2){
                numeroHomensAgressivos++;
            } else if (idade >= 40 && opcoes == 2 && sexo==1 || sexo==2) {
                numeroPessoasNervosas40++;
            }else if(idade<=18 && opcoes==1){
                numerosPessoasCalmas18++;
            }

            contador++;
        }
        System.out.println("O número de pessoas calmas é: "+numeroPessoasCalmas);
        System.out.println("O número de mulheres nervosas é: "+numeroMulheresNervosas);
        System.out.println("O número de homens agressivos é: "+numeroHomensAgressivos);
        System.out.println("O número de pessoas nervosas com mais de 40 anos é: "+numeroPessoasNervosas40);
        System.out.println("O número de pessoas calmas com menos de 18 anos é: "+numerosPessoasCalmas18);
    }
}
