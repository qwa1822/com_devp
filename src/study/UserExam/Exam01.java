package study.UserExam;

import java.util.Locale;
import java.util.Scanner;

public class Exam01 {

    public int get(String c,char a){

        int num=0;
        c=c.toUpperCase();
        a=Character.toUpperCase(a);

        for(int i=0; i<c.length(); i++){
            if(c.charAt(i)==a)
                num++;
        }

        return num;

    }


    public static void main(String[] args) {

        Exam01 T=new Exam01();
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        char c=sc.next().charAt(0);

        System.out.println(T.get(a,c));

    }
}
