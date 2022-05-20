package cju.공부.인프런자료구조.배열1;

import java.util.Scanner;

public class 배열0개이상 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);


        int n=sc.nextInt();

        int []data=new int[n];

        for(int i=0; i<n; i++){
            data[i]=sc.nextInt();

        }


        int max=0;

        for(int i=0; i<n; i++) {   //각 구간의 시작점
            int sum=0;
            for (int j = i; j < n; j++) {           //각 구간의 끝점;
                //시작점과 끝점이 같다는것.
                //add data[a]...data[j]
                //if the sum>max
                //max=the sum
                sum+=data[j];
                if (sum > max)
                    max = sum;


            }
        }
            System.out.print(max);
        }
    }

