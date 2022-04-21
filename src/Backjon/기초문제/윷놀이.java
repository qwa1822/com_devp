package Backjon.기초문제;

import java.util.Scanner;

public class 윷놀이 {
    public static void main(String[] args) {

    char[] result={'A','B','C','D'};

    Scanner sc=new Scanner(System.in);

    String[]input=sc.nextLine().split("");
    int sum=0;


    for(int index=0; index<input.length; index++){
        sum+=Integer.parseInt(input[index]);
    }

        System.out.println(result[sum-1]);

        

    }
}
