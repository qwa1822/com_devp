package study.UserExamBorn;

import java.util.Scanner;

public class Exam01 {

    public int get(String a,char c){


        a=a.toUpperCase();
        c=Character.toUpperCase(c);
        int sum=0;

        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)==c)
                sum++;
        }

        return sum;
    }

    public static void main(String[] args) {


        Exam01 T=new Exam01();

        Scanner sc=new Scanner(System.in);

        String a=sc.next();
        char b=sc.next().charAt(0);


        System.out.println(T.get(a,b));
    }
}
