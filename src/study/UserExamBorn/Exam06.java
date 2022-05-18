package study.UserExamBorn;

import java.util.Scanner;

public class Exam06 {

    public String Hel(String a){



        String answer="";
        for(int i=0; i<a.length(); i++){
            if(a.indexOf(a.charAt(i))==i){
                answer+=a.charAt(i);
            }
        }

        return answer;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);


        Exam06 T=new Exam06();
        String b=sc.next();

        System.out.println(T.Hel(b));
    }
}
