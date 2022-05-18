package study.UserExamBorn;

import java.util.Scanner;

public class Exam07 {

    public String get(String a) {

        String answer="";
        String b=new StringBuilder(a).reverse().toString();

        if(b.equalsIgnoreCase(a)) answer="Yes";
        else{
            answer="No";
        }


        return answer;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        Exam07 T = new Exam07();

        String b = sc.next();

        System.out.println(T.get(b));
    }
}
