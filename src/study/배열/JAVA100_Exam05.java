package study.배열;

import java.util.Scanner;

public class JAVA100_Exam05 {
    public static void main(String[] args) {

        //[1] :정수형과 실수형 배열 선언
        int[] ar = {3, 3, 3, 3, 4};

        double[] ar2 = {9.8, 2.45, 5.98, 5.11, 3.14};

        //[2]:마지막 배열 요소값 출력
        System.out.println(ar[ar.length - 1]);  //4
        System.out.println(ar2[ar2.length - 1]); //3.14

        //[3]: 배열명 자체를 찍어서 출력--> 주소(참조)값-->i:정수형 배열
        //D:실수형 배열을 각각 의미함.
        System.out.println(ar);
        System.out.println(ar2);


    }
}
