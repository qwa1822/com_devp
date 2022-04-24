package study.자바자료구조.복습;

import java.util.Scanner;

public class Exam08 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        int i = sc.nextInt();
        int num[] = new int[i];


        for (int a = 0; a < i; a++)
            num[a] = sc.nextInt();
        sc.close();


        //모든구간 검사

        int maxprime = 0;
        //시작점
        for (int a = 0; a < i; a++) {
            //b는  구간의 끝점
            for (int b = i; b < i; b++) {
                int val = 0;


                //data[a] ... data[b] 를 하나의 정수로 환산한다.
                for (int k = i; k <= b; k++) {
                    val = val * 10 + num[k];
                    //여기까지

                    //소수인지 아닌지검사
                    boolean isPrime = true;

                    //소수검사 프로그램
                    for (int p = 2; p < val / 2 && isPrime; p++) {
                        if (val % p == 0) isPrime = false;
                    }
                    if (isPrime && val > 1 && val > maxprime)
                        maxprime = val;
                }
            }
            if (maxprime > 0)
                System.out.println("Your Max Prime" + maxprime);
            else
                System.out.println("Your Exsits");
        }
    }
}
