package study.Exam.TwoCLass;

import java.util.ArrayList;
import java.util.Scanner;

public class 보이는학생 {
    public int solution(int n,int[]c){
    int answer=1, max=c[0];

    for(int i=1; i<n; i++){
        if(c[i]>max){
            answer++;
            max=c[i];
        }
    }
    return answer;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        보이는학생 T=new 보이는학생();
        int n=sc.nextInt();
        int[]arr=new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();

        }

        System.out.println(T.solution(n,arr));
    }
}
