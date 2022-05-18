package study.Exam;

import java.util.Scanner;

public class Exam12 {

    public String get(int n,String a){
    String answer="";
    for(int i=0; i<n; i++){
        String tmp= a.substring(0,7).replace('#','1').replace('*','0');

        //parseInt 정수화 시키는것   tmp를 2진수화 시키는것
        int num=Integer.parseInt(tmp,2);


        //char를 이용해 문자화

        answer+=(char)num;

        System.out.println(tmp+ " "+num);
        a=a.substring(7);
        //7부터 끝까지
    }

    return answer;
    }
    public static void main(String[] args) {

        Exam12 T=new Exam12();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.next();
        System.out.println(T.get(n,str));
    }
}
