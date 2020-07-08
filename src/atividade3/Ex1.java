package atividade3;

public class Ex1 {

    public static void main(String[] args) {

        System.out.println("Números de 1000 a 1999");

        for(int i =1000;i<=1999;i++){
            if(i % 11 == 5){
                System.out.println(i);
            }
        }
    }
}
