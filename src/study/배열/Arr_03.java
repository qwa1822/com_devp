package study.배열;

import java.util.Arrays;
import java.util.Scanner;

public class Arr_03 {
    public static void main(String[] args) {




        //[!]:배열 복사하기
        //arraycoopu()메서드 사용--> 사용법-->System.arraycoopy(원본배열명,???,복사배열명,???,길이);

        //[1]:ar , ar2배열 선언
        int[]ar={1,2,3,4,5};           //3,4,5
        int[]ar2={1,2,3,4,5,6,7,8,9,10};  //5,6,7


        //[2]:배열 복사하기-->System.arraycoopy();
        System.arraycopy(ar,2,ar2,4,3);  //[1,2,3,4,3,4,5,8,9,10]
        //배열의 넘버가 바뀐걸 확인할수있다.

        System.out.println(Arrays.toString(ar2));


    }
}
