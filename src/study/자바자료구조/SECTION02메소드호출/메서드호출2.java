package study.자바자료구조.SECTION02메소드호출;

import java.util.Scanner;

public class 메서드호출2 {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);


       for(int n=2; n<=100000; n++){
           if(isPrime(n))
               System.out.println(n);

       }
    }

        //하나의 정수를하나받아 소수인지아닌지 테스트
    static boolean isPrime(int k){
    if(k<2) return false;
    for(int i=2; i*i<k; i++)
        if(k%i==0)

            //return 값은 값을돌려주는 역할도하지만
            //그것의 부수작용으로 이함수를 돌려준다는것도 가능
            //return을받으면 종료된다는 뜻도 가지고있음.

            return false;
    return true;
        
    }
}
