package study.UserExamBorn;

import java.util.Locale;
import java.util.Scanner;

public class Exam08 {


    public String get(String a){


        String answer="";
        a=a.toUpperCase().replaceAll("[^A-Z]","");
        String tmp=new StringBuilder(a).reverse().toString();
        if(a.equalsIgnoreCase(tmp)) answer="Yes";
        else{
            answer="No";
        }


        return answer;
    }
    public static void main(String[] args) {




        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();

        Exam08 T=new Exam08();


        System.out.println(T.get(s));


    }




}
