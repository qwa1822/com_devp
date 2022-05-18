package cju.공부.JavaStduy;

public class 파보나치수열 {
    public static void main(String[] args) {
        long a = 1;       //숫자가 굉장히 커지기 때문에 long으로 선언한다.

        long b = 1;

        long c;

        long arrNum[] = new long[20];        //20번째까지의 피보나치 수열을 담는다.

        int w = 0;    //루프변수 초기화


        arrNum[0] = a;
        arrNum[1] = b;


        // 1	1	2	3	5	8
        // a	b	c
        //		a	b	c(a+b)	.....
        //
        //c는 a와 b를 더한값이 되고, 현재 b값은 a변수에 현재 c값은 b변수에 전달하며 한칸씩 나아간다.
        //20번을 돌아가며 a, b, c의 자리를 변경해준다.


        while(w<18){

             c=a+b;
             a=b;
             b=c;
             arrNum[w+2]=c;
             w++;
        }

        for (int i = 0; i < arrNum.length; i++) {
            System.out.println(arrNum[i]);
        }
    }

}
