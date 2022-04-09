package Backjon;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        int sum=0;
        int min=100;


        for(int i=0; i<7; i++){
            int number=sc.nextInt();
            if(number%2!=0) {
                sum += number;
                min = Math.min(number, min);

            }


        }

        if(sum==0){
            System.out.println(-1);
        }
        else{
            System.out.println(sum);
            System.out.println(min);
        }


    }
}
