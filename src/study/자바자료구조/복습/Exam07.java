package study.자바자료구조.복습;

import java.util.Scanner;

public class Exam07 {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        int i=sc.nextInt();
        int num[]=new int[i];


        for(int a=0; a<i; a++)
            num[a]=sc.nextInt();
        sc.close();



        //모든 구간을 검사해보는것
        //a 가 각구간의 시작점
        int max=0;
        for(int a=0; a<i; a++){
            //각구간의 끝점은 i에서  n까지 증가
            
            
            //sum을 0으로 초기화하고
            int sum=0;
            for(int j=a; j<i; j++){
                //add data[i]...data[j]
                //sum이 max보다 크다면
                //새로운 sum이되는.
                
                
                
                //data[a]~data[j]까지 합이필요하기떄문에 for문
                //구현
                //최대값은  0으로
                //sum+=data[j] 로도 충분히 구현가능
                //밑에코드는 바보같은 코드이다.


                for(int k=a; k<=j; k++){
                sum+=num[k];
                if(sum>max)
                    max=sum;
                }
            }

            System.out.println("The max  is"+max);
        }
    }
}
