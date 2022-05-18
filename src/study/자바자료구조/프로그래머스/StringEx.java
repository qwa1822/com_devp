package study.자바자료구조.프로그래머스;

import java.util.Scanner;

public class StringEx {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

       int i=sc.nextInt();
       int number[]=new int[i];

       for(int a=0; a<i; i++)
           number[a]=sc.nextInt();

       sc.close();



       int max=number[0];
       int sum=0;
       for(int a=0; a<i; a++){
           sum+=number[a];
           if(number[a]>max)
               max =number[a];

       }

        System.out.println("This is sum :"+sum+"The big is number"+max);



        


    }







}
