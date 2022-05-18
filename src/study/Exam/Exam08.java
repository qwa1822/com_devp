package study.Exam;

import java.util.Scanner;

public class Exam08 {
    public String solution(String s){
        String answer="No";
        //정규식을 써야함. 대문자 A~Z까지 아니면?
        //^ << 꺾새가 부정이기떄문에
        s=s.toUpperCase().replaceAll("[^A-Z]","");
        //String 변환해줘야힘.
        String tmp=new StringBuilder(s).reverse().toString();

        //s 값과 tmp 값이 같으면?
        if(s.equals(tmp)) answer="YES";

        System.out.println(s);

        return answer;

    }

    public static void main(String[] args) {
        Exam08 T=new Exam08();
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(T.solution(s));
    }
}
