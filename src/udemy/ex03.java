package udemy;

import sun.nio.cs.ext.MacHebrew;

import java.util.Scanner;

public class ex03 {


    public static void main(String[] args) {
          int g;
        System.out.println(g=sum(15,25));
        int d;
        System.out.println(d=sum(15,25,35));



        int calculator=calculator_Max(g,d);
        System.out.println(calculator);

    }


    static int sum(int firstNumber,int secondNumber){
        int sum=firstNumber+secondNumber;
        return sum;
    }

    static int sum(int firstNumber,int secondNumber,int thirdNumber){
        int sum=firstNumber+secondNumber+thirdNumber;
        return sum;
    }


    static int calculator_Max(int a,int b){
        int n=Math.max(a,b);
        return n;
    }



}



