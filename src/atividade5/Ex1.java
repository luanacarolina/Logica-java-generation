package atividade5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(".00");
        double preco ,juros ,calculo;
        System.out.println("Digite o preço do produto: ");
         preco = scan.nextDouble();

        System.out.println("Digite a forma de pagamento de acordo com as opções:");
        System.out.println("1.À vista em dinheiro ou cheque, recebe 20% de desconto:");
        System.out.println("2.À vista no cartão de crédito, recebe 15% de desconto:");
        System.out.println("3.Em duas vezes, preço normal de etiqueta sem juros:");
        System.out.println("4.Em três vezes, preço normal de etiqueta mais juros de 10%:");
        int opcoes = scan.nextInt();

        if(opcoes==1){
            calculo= (preco*20)/100;
            calculo = preco -calculo;
            System.out.println("Opção 1 escolhida , o valor total a pagar é de R$"+calculo);
        }else if(opcoes==2){
            calculo = (preco*15)/100;
            calculo = preco -calculo;
            System.out.println("Opção 2 escolhida , o valor total a pagar é de R$"+calculo);
        }else if(opcoes==3){
            calculo = preco/2;
            System.out.println("Opção 3 escolhida , o valor total a pagar é de 2 parcelas de R$"+df.format(calculo));
        }else if(opcoes==4){
            calculo=(preco*10)/100;
            calculo = preco+calculo;
            calculo = preco/3;
            System.out.println("Opção 4 escolhida , o valor total a pagar é de 3 parcelas de R$"+df.format(calculo));
        }

    }
}
