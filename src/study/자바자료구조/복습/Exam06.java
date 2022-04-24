package study.자바자료구조.복습;

import java.util.Scanner;

public class Exam06 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        int i = sc.nextInt();
        int number[] = new int[i];

        //쌍검사는 두개의 중첩된 FOR문으로
        //가능

        for (int a = 0; a < i; a++)
            number[a] = sc.nextInt();
        sc.close();

        //쌍검사는 두개의 중첩된 FOR문으로
        //가능
        int count=0;
        for(int a=0; a<i-1; a++){
            
            //각각의 쌍을 검사
            
            //j 는  a+1 부터시작하는이유는
            // a ,j 같이시자하면 0,0 1,1, 2,2 이렇게
            //엮이게 되기떄문에 
            //a <j  라는식
            for(int j=a+1; j<i; j++){
                
                //data[a] data[j] 모든 쌍을 검사
                /*
                0 0
                0 1
                0 2
                0 n-1
                까지 검사

                 */

                //data[a]= = number[j] 를검사해서
                //count값을 증가시킨다면
                //모든 중복된 쌍을 찾을수 있다.
                if(number[a]==number[j])
                    count++;
            }

        }

        System.out.println(count);
    }


}
