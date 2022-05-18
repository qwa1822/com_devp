package study.자바자료구조.Chapter3String;

import java.util.Scanner;

public class sort {



    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("첫번째 정수");
        a=sc.nextInt();
        System.out.println("두번째 정수");
        b=sc.nextInt();
        System.out.println("세번쨰 정수");
        c=sc.nextInt();



        if(a<=1000 && b<=1000 && c<=1000){
            if(a>=b && a<=c || a<b && a>c)
                System.out.println(a);
            if(b>=a && b<=c || b<a && b>c)
                System.out.println(b);
            else
                System.out.println(c);

        }
        else
            System.out.println("잘못입력");
    }
}
