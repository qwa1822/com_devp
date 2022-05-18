package study.UserExam;

import javax.swing.text.AttributeSet;
import java.util.Scanner;

public class Exam02 {
    public String get(String a) {
        String c="";





        for(char b:a.toCharArray()) {
            if (Character.isLowerCase(b))
                c += Character.toUpperCase(b);
            else{
                c+=Character.toLowerCase(b);
            }
        }
            return c;
    }


    public static void main(String[] args) {


        Exam02 T=new Exam02();
        Scanner sc=new Scanner(System.in);

        String s=sc.next();

        System.out.println(T.get(s));

    }

}
