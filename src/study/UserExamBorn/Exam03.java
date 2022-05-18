package study.UserExamBorn;

import Show.Exam;

import java.util.Scanner;

public class Exam03 {

    public String get(String a){

        String[]b=a.split(" ");
        String answer="";
        int min=Integer.MIN_VALUE;


        for(String c:b){
        int len=c.length();
        if(len>min)
            min=len;
            answer=c;


        }
        return answer;

    }
    public static void main(String[] args) {

        Exam03 T=new Exam03();
        Scanner sc=new Scanner(System.in);


        String input=sc.nextLine();
        System.out.println(T.get(input));
    }
}
