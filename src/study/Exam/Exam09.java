package study.Exam;

import java.util.Scanner;

public class Exam09 {


    public int get(String a){


    //    String answer="";




        //ASCII코드로 48이  숫자0 부터 57은 9
        //방법 1
//        for(char b:a.toCharArray()){
//            if(b>=48 && b<=57) answer=answer*10+(b-48);
//        }
//
//
//        return answer;


        //Character.isDig << 숫자냐고 묻는메소드
        //2번째 방법
        String answer="";
        for(char x:a.toCharArray()){
            if(Character.isDigit(x)) answer+=x;
        }
                //문자열을 숫자로 변환하는것.
        return Integer.parseInt(answer);
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String b=sc.nextLine();
        Exam09 T=new Exam09();


        System.out.println(T.get(b));
    }
}
