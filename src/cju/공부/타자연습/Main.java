package cju.공부.타자연습;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int i=sc.nextInt();

        int ace[]=new int[i];


        for(int a=0; a<ace.length; a++){
            ace[a]=sc.nextInt();
        }

        int count=0;
        for(int a=0; a<i-1; a++){
            for(int b=a+1; b<i; b++){
                if(ace[a]==ace[b]){
                    count++;
                }
            }


        }

        System.out.println(count);
    }
}
