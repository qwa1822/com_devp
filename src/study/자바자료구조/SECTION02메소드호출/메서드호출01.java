package study.자바자료구조.SECTION02메소드호출;

import java.util.Scanner;

public class 메서드호출01 {
    public static void main(String[] args) {

        //입력으로 두성수 a와 b를 받아 a의 b승을 계산한다.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        //영어로 지수함수 power(a,b) a의b승을 계산<<
        int result = power(a, b);

        System.out.println(result);

        sc.close();


    }



//함수앞에 돌려주는타입을 정해야함(리턴타입)
    //함수늕 리턴타입이 하나
    //나한테 무슨일을 시킬려면 두개의정수를 받아야한다.
    public static int power(int n,int m){
        int prod=1;

        for(int i=0; i<m; i++){
            prod*=n;
        }
        //돌려주는 뜻 return
        return prod;



    }

}
