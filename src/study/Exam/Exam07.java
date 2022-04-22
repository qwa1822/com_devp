package study.Exam;

import java.util.Locale;
import java.util.Scanner;

public class Exam07 {

    public String solution(String str){
        String answer="YES";
        //뒤집는거
        String tmp=new StringBuilder(str).reverse().toString();
        //뒤집어진거랑 원래문자열이랑 같냐?
        //equals는 대소문자를 구분함.
        if(str.equalsIgnoreCase(tmp)) answer="Yes";
        return answer;



        //문제1
//        str=str.toUpperCase();
//        int len=str.length();
//        for(int i=0; i<len/2; i++){
//            if(str.charAt(i)!=str.charAt(len-i-1)) return "NO";
//        }





    }
    public static void main(String[] args) {

    Exam07 T=new Exam07();
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(T.solution(str));
    }
}
