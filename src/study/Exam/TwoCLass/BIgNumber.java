package study.Exam.TwoCLass;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class BIgNumber {
    public ArrayList<Integer> solution(int n, int[]arr){
        ArrayList<Integer> answer=new ArrayList<>();

        answer.add(arr[0]);
        for(int i=1; i<n; i++){


            if(arr[i]>arr[i-1]) answer.add(arr[i]);
        }

        return answer;
    }


    public static void main(String[] args) {

        BIgNumber T=new BIgNumber();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        //배열을 동적으로 n개를 잡음
        int[]arr=new int[n];

        //for문을통해 숫자를 집어넣음.
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        //호출 n넘어가고 배열넘어가고
        for(int x:T.solution(n,arr)){
            System.out.println(x+" ");
        }



    }
}
