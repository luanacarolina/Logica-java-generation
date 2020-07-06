package atividade1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(".00");
        double porcentagemDistribuidor,impostos,valorConsumidor;

        System.out.println("Digite o valor de fabrica do veiculo");
        double valorFabrica = scan.nextDouble();

        porcentagemDistribuidor = (valorFabrica*28)/100;
        impostos = (valorFabrica*45)/100;
        valorConsumidor=valorFabrica+porcentagemDistribuidor+impostos;

        System.out.println("A porcentagem ao distribuidor é de R$ "+df.format(porcentagemDistribuidor));
        System.out.println("O valor dos impostos é de R$ "+df.format(impostos));
        System.out.println("O valor final ao consumidor é de R$ "+df.format(valorConsumidor));

    }
}
