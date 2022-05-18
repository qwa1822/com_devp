package study.UserExam;

import java.util.Scanner;

public class Exam06 {

    public String get(String s){


        String answer="";


       for(int i=0; i<s.length(); i++){
           if(s.indexOf(s.charAt(i))==i)
               answer+=s.charAt(i);
       }





        return answer;
    }


    public static void main(String[] args) {

    Exam06 T=new Exam06();

        Scanner sc=new Scanner(System.in);
        String hel=sc.nextLine();

        System.out.println(T.get(hel));
    }
}
