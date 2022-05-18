package study.UserExamBorn;

import Show.Exam;

import java.util.Scanner;

public class Exam02 {

    public String get(String  a){

        String answer="";




        for(char b:a.toCharArray()){
            if(Character.isLowerCase(b))
                answer+=Character.toUpperCase(b);
            else{
                answer+=Character.toLowerCase(b);
            }






        }
        return answer;
    }

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        String s=sc.next();

        Exam02 T=new Exam02();

        System.out.println(T.get(s));
    }
}
