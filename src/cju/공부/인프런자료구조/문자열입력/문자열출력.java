package cju.공부.인프런자료구조.문자열입력;

import java.io.File;
import java.util.Scanner;

public class 문자열출력 {

    static String [] names=new String[1000];
    static int[] numbers=new int[1000];
    static int n=0;

    public static void main(String[] args) {

         Scanner sc=new Scanner(System.in);

         int k=sc.nextInt();
         for(int i=0; i<k; i++){
             names[i]=sc.next();
             numbers[i]=sc.nextInt();
         }
         sc.close();


         for(int i=0; i<k; i++){
             System.out.println();
         }





    }
    public void func()
    {

    }

}
