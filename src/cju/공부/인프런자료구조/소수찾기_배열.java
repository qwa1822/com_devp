package cju.공부.인프런자료구조;

import java.util.Scanner;

public class 소수찾기_배열 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n=10111;
        boolean isPrime=true;

       //n이 소수인지 알고 싶으면 2~n-1 까지 나누어봐서 나누어떨어지면 소수가아님.
        //2,3,...,n-1    // 2/n n의약수가 4보다 클수 없기떄문에

        for(int i=2; i<=n/2; i++){   //n이 소수인지 검사하는것.
            if(n%i==0) {  //나누어 떨어진다면 약수가아님. //not prime
              isPrime=false;   //나누어떨어지면 false
            }

            if(isPrime)   //isPrime이 참이라면
                System.out.println(n);   //출력
        }
        
    }
}
