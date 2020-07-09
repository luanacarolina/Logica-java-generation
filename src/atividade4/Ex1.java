package atividade4;

public class Ex1 {

    public static void main(String[] args) {
        int [] a = {1,0,5,-2,-5,7};
        int soma=0;

        System.out.println("Os valores do vetor A são:");
        for(int i =0;i<a.length;i++){
            if(a[i]==a[0] || a[i]==a[1] || a[i]==a[5]){
                soma+=a[i];

            }
            if(a[i]==a[4]){
                a[i]=100;
            }
            System.out.println(a[i]);

        }
        System.out.println("A soma das posições A[0],A[1],A[5] é: "+soma);


    }
}
