package cju.공부.인프런자료구조;

import java.util.Scanner;

public class 배열 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int ace[]=new int[n];
        int sum=0;

        for(int i=0; i<ace.length; i++){
            ace[i]=sc.nextInt();


        }

        int max=ace[0];   // max가유지 실제로 있는데이터중 하나
        //실제 데이터중 하나를 뽑기떄문에 ace[0]부터시작

        for(int i=0; i<ace.length; i++){
            sum+=ace[i];
            if(ace[i]>max ) max=ace[i];

        }

        System.out.println(sum);
        System.out.println(max);

    }
}
