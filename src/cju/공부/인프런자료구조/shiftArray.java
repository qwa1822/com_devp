package cju.공부.인프런자료구조;

import java.util.Scanner;

public class shiftArray {
    public static void main(String[] args) {



        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ace[]=new int[n];

        for(int i=0; i<ace.length; i++){
            ace[i]=sc.nextInt();
        }


        int tmp=ace[n-1];
        for(int i=n-2; i>0; i--) {
            ace[i+1]=ace[i];
            ace[0]=tmp;
        }

        for(int i=0; i<ace.length; i++){
            System.out.print(ace[i]+"\t");
        }
    }



}
