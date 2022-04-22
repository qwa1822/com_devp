package study.Exam;

import Show.Exam;

import java.util.Locale;
import java.util.Scanner;

public class Exam01 {
    public int get(String s, char t) {

        int answer = 0;
        s=s.toUpperCase();
        t=Character.toUpperCase(t);


        for(int i=0; i<s.length(); i++)
            if(s.charAt(i)==t)
                answer++;


        return answer;

    }

    public static void main(String[] args) {
        Exam01 exam = new Exam01();
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char c = sc.next().charAt(0);




        System.out.println(exam.get(s,c));
    }
}
