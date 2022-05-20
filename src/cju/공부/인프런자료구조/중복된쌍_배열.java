package cju.공부.인프런자료구조;

import java.util.Scanner;

public class 중복된쌍_배열 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int ace[]=new int[i];

        for(int a=0; a<ace.length; a++){
            ace[a]=sc.nextInt();
        }


        int count=0;
        for(int a=0; a<i-1; a++){
            for(int j=a+1; j<i; j++){
                //ace[a] ace[j]
                if(ace[a]==ace[j]){
                    count++;
                }
            }
        }

        System.out.println("중복된 쌍은"+count);

    }
}
