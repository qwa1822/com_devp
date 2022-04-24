package study.자바자료구조;

import java.util.Scanner;

public class 배열4 {
    public static void main(String[] args) {

        //소수인지 아닌지를 검사하는 정수를 작성
        //2,3,...,n-1;
        //2,3,...., sqrt(n) << 까지만 돌아도된다.

        for (int n = 2; n <= 100000; n++) {

            boolean isPrime = true;
       /*
        //n이라는 정수가 소수인지 검사하는
        n이 소수가 아니라는 증거를 찾고있는것
        n이 i로 나누어 떨어지면 소수가아니라는것 ,
        */
            for (int i = 2; i * i <= n / 2 && isPrime; i++) {
                //i*i 의 제곱이 n보다 작다는것...
                //isPrime이 false면 for문을 돌지않고
                //빠져나온다
                if (n % i == 0)
                    //not prime
                    isPrime = false;
                if (isPrime)
                    System.out.println(n);

            }
        }


        Scanner sc = new Scanner(System.in);

    }
}
