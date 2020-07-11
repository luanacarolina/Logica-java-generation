package atividade5;

public class Ex4 {

    public static void main(String[] args) {
        int x=0,y=0,soma=0;
        for(int i =1;i<=99;i++){
            y+=1;
            System.out.println(i+"/"+y);
            i+=1;
            soma +=i/y;

        }
        System.out.println(soma);
    }
}
