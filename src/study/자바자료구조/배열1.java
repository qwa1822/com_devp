package study.자바자료구조;

import java.util.Scanner;

public class 배열1 {
    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);

    int n=sc.nextInt();

    //입력받은 정수를 배열에 저장
    int[]c=new int[n];


    for(int i=0; i<n; i++)
        //정수를 배열에저장.
        c[i]=sc.nextInt();
    sc.close();


    //실제데이터중에 하나를 max에 초기값에 대입
    int sum=0,max=c[0];
    for(int i=0; i<n; i++){

        sum+=c[i];
        
        //현재내가알고 최대값이 최대값보다 크다면
        //max에 저장
        if(c[i]>max)
            max=c[i];
    }

        System.out.println("Your sum"+sum+"Your Big Number"+max);



    }
}
