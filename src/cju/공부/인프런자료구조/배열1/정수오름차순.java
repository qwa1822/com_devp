package cju.공부.인프런자료구조.배열1;

import java.util.Scanner;

public class 정수오름차순 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();

        int num[]=new int[a];

        for(int i=0; i<a; i++){
            num[i]=sc.nextInt();
        }
        for(int i=a-1; i>0; i--){

            //data[0]...data[i]
            for(int j=0; j<i; j++){
                if(num[j]>num[j+1]){

                    //swap data[j] and data[j+1]
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
        for(int i=0; i<a; i++){
            System.out.println(num[i]);
        }
    }
}
