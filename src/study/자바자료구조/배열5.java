package study.자바자료구조;

import java.util.Scanner;

public class 배열5 {

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        int i=sc.nextInt();

        int number[]=new int[i];

        for(int a=0; a<i; a++)
            number[a]=sc.nextInt();
        sc.close();


        //모든 쌍을 점검
        int count=0;
        for(int a=0; a<i; a++){
            for(int j=a+1; j<i; j++){
                //i<j 가 클떄만 검사
                if( number[a]==number[j])
                    count++;
                //data[i] data[j] 의 한쌍을 검사
                /*
                이중 for문을 통해
                0 0
                0 1
                0 2
                1 0
                1 1
                1 2
                이런식으로 검사하는것이다.
                 */

            }
        }
        System.out.println(count);


    }
}
