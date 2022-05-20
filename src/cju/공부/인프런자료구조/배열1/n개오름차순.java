package cju.공부.인프런자료구조.배열1;

import java.util.Scanner;

public class n개오름차순 {
    public static void main(String[] args) {


       Scanner sc=new Scanner(System.in);

       int i=sc.nextInt();
       int ace[]=new int[i];

       for(int a=0; a<i; a++){

           int input=sc.nextInt();

           int j=a-1;

           while(j>=0 && ace[j]<input){
                ace[j+1]=ace[j];
                j--;
           }
           ace[j+1]=input;


           for(int k=0; k<=i; k++){
               System.out.print(ace[k]+" ");
               System.out.println();
           }

       }
    }

}
