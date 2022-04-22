package study.Exam;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class Exam04 {


    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer=new ArrayList<>();

       for(String x: str){
           char[] s=x.toCharArray();
           //문자배열화

           int lt=0, rt=x.length()-1;
           while(lt<rt){
               char tmp=s[lt];
               s[lt]=s[rt];
               s[rt]=tmp;
               lt++;
               rt--;
           }
           
           //String.valueOf static으로선언된 클래스
           String tmp=String.valueOf(s);
           answer.add(tmp);


           return answer;
       }



        return answer;
    }
    public static void main(String[] args) {


        Exam04 T=new Exam04();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[]str=new String[n];

//        n개의 배열을 저장,
        for(int i=0; i<n; i++){
            str[i]=sc.next();
        }
        for(String x: T.solution(n,str)){
            System.out.println(x);
        }

    }
}
