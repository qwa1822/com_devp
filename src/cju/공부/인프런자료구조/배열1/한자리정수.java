package cju.공부.인프런자료구조.배열1;

import java.util.Scanner;

public class 한자리정수 {

    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);

    int a=sc.nextInt();
    int[]data=new int[a];

    for(int i=0; i<a; i++){
        data[i]=sc.nextInt();
    }

    int max=0;
    for(int i=0; i<a; i++){   //구간의 시작점
        for(int j=i; j<a; j++) {    //구간의 끝점까지


            //convert data[i]....data[j]까지 into an integer 정수로변환
            //test if it is a prime 소수인지를 검사해야한다.
            //그게 소수라면 현재까지 알고있는최대값과 비교


            //val=0
            //val=val*10+1=1
            //val=val*10+9=19
            //val=19*10+4=194;
            //이런식으로 DIgit으로 왼쪽으로 읽으면서 정수로반환

            int val=0;
            for(int k=i; k<=j; k++){
                val=val*10+data[k];
            }



            //소수인지 아닌지를 검사하는것.
            boolean isPrime=true;
            for(int k=2; k*k<=val && isPrime; k++)
                if(val%k==0 )
                    isPrime=false;


            //참이면
            if(isPrime && val>1 &&  val>max)
                max=val;
            

        }
    }

    if(max>0)
        System.out.println(max);
    else
        System.out.println("No Prime number");
    }


}
