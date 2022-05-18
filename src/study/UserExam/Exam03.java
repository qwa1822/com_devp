package study.UserExam;

import java.util.Scanner;
import java.util.*;

public class Exam03 {


    public String get(String s) {

        String answer="";
        int min = Integer.MIN_VALUE;


        String []c=s.split(" ");




       for(String qq:c){
        int len=qq.length();

        if(len>min)
            min=len;
            answer=qq;
       }


       return answer;




    }

    public static void main(String[] args) {

    Exam03 T=new Exam03();
    Scanner sc=new Scanner(System.in);

    String s=sc.next();

        System.out.println(T.get(s));

    }
}
