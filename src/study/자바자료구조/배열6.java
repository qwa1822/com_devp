package study.자바자료구조;

import java.util.Scanner;

public class 배열6 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);


        int b=sc.nextInt();
        int number[]=new int[b];


        for(int i=0; i<b; i++)
            number[i]=sc.nextInt();
            sc.close();

        //모든구간 검사
        int  max=0;
        for(int i=0; i<b; i++){
            int sum=0;
            //길이가 1인구간
            for(int j=i; j<b; j++){
                //add data[i]...data[j]
                //if the sum>max
                // max = the sum;

                sum+=number[j];
                if(sum>max)
                    max=sum;

            }
        }

        System.out.println(max);

    }
}
