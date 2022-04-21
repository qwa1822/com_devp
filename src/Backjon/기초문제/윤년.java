package Backjon.기초문제;

import java.util.Scanner;

public class 윤년 {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);


        int i=sc.nextInt();

        if(i%4==0 && i%100!=0 || i%400==0){
            i=1;
            System.out.print(i);
        }
        else{
            i=0;
            System.out.print(i);
        }
    }
}
