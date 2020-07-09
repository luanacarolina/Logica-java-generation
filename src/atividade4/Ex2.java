package atividade4;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] vetor = new int[6];
        int pares=0 ,somaPar=0,impares=0,contImpar=0;


        for(int i =0;i<vetor.length;i++){
            System.out.println("Digite o numero "+(i+1));
            vetor[i]=scan.nextInt();


        }

        for(int i =0;i<vetor.length;i++){
            if(vetor[i]%2==0){
                pares=vetor[i];
                somaPar+=pares;
                System.out.println(" Numero Par Digitado: "+pares);
            }else{
                impares=vetor[i];
                System.out.println("Numero Impar Digitado: "+impares);
                contImpar++;
            }

        }
        System.out.println("\nA soma dos  numeros pares digitados são: "+somaPar);
        System.out.println("A quantidade de  numeros impares digitados é: "+contImpar);


    }
}
