package study.algorithem;

import java.util.Locale;
import java.util.Scanner;

public class 문자찾기 {


    public int solution(String str,char t){
        int answer=0;
        str=str.toUpperCase();
        t=Character.toUpperCase(t);
//
//        for(int i=0; i<str.length(); i++){
//            if(str.charAt(i)==t) answer++;
//
//        }
   // 문자배열 객체를 생성하는 것 str.toCharArray() <<
        for(char x:str.toCharArray())
            if(x==t) answer++;


        return answer;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        문자찾기 T=new 문자찾기();

        String str=sc.next();


        char c=sc.next().charAt(0);
        System.out.println(T.solution(str,c));

    }
}
