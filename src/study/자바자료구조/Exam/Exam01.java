package study.자바자료구조.Exam;

import java.util.Scanner;

public class Exam01 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int number[] = new int[a];


        for (int i = 0; i < a; i++)
            number[i] = sc.nextInt();
        sc.close();



        int sum=0,max=number[0];


        for(int i=0; i<a; i++){
            sum+=number[i];
            if(number[i]>max)
                max=number[i];

        }


        System.out.println("Your sum"+sum+"Big Number"+max);

    }
}
