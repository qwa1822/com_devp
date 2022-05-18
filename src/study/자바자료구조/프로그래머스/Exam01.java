package study.자바자료구조.프로그래머스;

import java.util.Scanner;

public class Exam01 {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        int i=sc.nextInt();
        int number[]=new int[i];


        for(int a=0; a<i; a++)
            number[a]=sc.nextInt();
        sc.close();


        int sum=0, max=number[0];
        for(int a=0; a<i; a++){
            sum+=number[a];
            if(number[a]>max)
                max=number[a];
        }


        System.out.println("The sum is "+sum + "This is max is"+max);


    }
}
