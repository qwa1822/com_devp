package study.Exam;

import java.util.Scanner;
import java.util.*;
public class Exam03 {
    public String Solution(String str) {
        String answer = "";
        int m=Integer.MIN_VALUE,pos;
        //가장 작은값으로 초기화
        //str은 문장이고 단어들을 it is 이것들을
        //띄어쓰기로 분리해서 string 배열들로 저장하는것

        //방법 2
        while((pos=str.indexOf(' '))!=-1){
            String tmp=str.substring(0,pos);
            int len=tmp.length();
            if(len>m){
                m=len;
                answer=tmp;

            }
            str=str.substring(pos+1);
            if(str.length()>m) answer=str;
        }
//        //띄어쓰기로 구분되는것  spring 단어들이 저장되는것
//        String[]s=str.split(" ");


        //String 이니깐  "" ;<<



        //방법 1
        //배열 for-each
//        for(String x:s){
//            int len=x.length();
//            if(len>m){
//                m=len;
//                answer=x;
//            }
//        }



        return answer;
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        Exam03 exam = new Exam03();

        String str = sc.nextLine();
        //한줄을 받아야하기떄문에 nextLine() 으로받음


        System.out.println(exam.Solution(str));


    }
}
