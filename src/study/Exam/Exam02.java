package study.Exam;

import Show.Exam;

import java.util.Locale;
import java.util.Scanner;

public class Exam02 {
    public String solution(String str){
        String answer="";

        //String이 객체개열로 생성되는것

        //Ascll 번호 x>97 && x<=122 << 소문자 A~Z
        //answer+=(char)(x-32);  소문자가 x를빼서 대문자가되는것

        for(char x:str.toCharArray()){
            if(Character.isLowerCase(x))
                answer+=Character.toUpperCase(x);
            else answer+=Character.toLowerCase(x);
        }

        return answer;
    }


    public static void main(String[] args) {
    Exam02 Exam=new Exam02();
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
        System.out.println(Exam.solution(str));


    }
}
