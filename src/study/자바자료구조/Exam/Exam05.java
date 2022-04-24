package study.자바자료구조.Exam;

import java.util.Scanner;

public class Exam05 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        //소수냐 아닌지를 검사하는것.

        //2, 3, ... ,  n/2  n의 약수가
        //하나라도 나눠떨어지면

        //방법 1
//        int n=10110;
//        boolean isPrime=true;
//        for(int i=2; i<n/2; i++){
//
//            //약수가찾아지면 소수가 아니기떄문에
//            if(n%i==0)
//                isPrime=false;
//            break;
//        }
//        if(isPrime)
//            System.out.println(n);


        //방법 2
        //for문안에 조건 i<=n/2 && isPrime 을 걸어줌
        //isPrime 을 만족시켜주지않으면 for문 빠져나오게 만듬.
        boolean isPrime = true;


        // j*j의제곱이  n보다 작으면
        //root계산
        for (int n = 2; n <= 1000; n++) {

            for (int j = 2; j * j <= n && isPrime; j++) {

                //n이 소수인지 아닌지 검사하는것
                if (n % j == 0)
                    isPrime = false;
            }
            if (isPrime)
                System.out.println(n);
        }
    }
}

