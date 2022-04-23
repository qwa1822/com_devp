package study.자바자료구조;

import java.util.Scanner;

public class 배열1 {
    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);

    int n=sc.nextInt();
    int[]c=new int[n];


    for(int i=0; i<n; i++)
        c[i]=sc.nextInt();
    sc.close();

    int sum=0,max=c[0];
    for(int i=0; i<n; i++){

        sum+=c[i];
        if(c[i]>max)
            max=c[i];
    }

        System.out.println("Your sum"+sum+"Your Big Number"+max);



    }
}
