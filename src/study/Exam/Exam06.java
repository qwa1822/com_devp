package study.Exam;

import Show.Exam;

import java.util.Scanner;

public class Exam06 {
    public String get(String str){
        String answer="";
            
        for(int i=0; i<str.length(); i++){
            //System.out.println(str.charAt(i)+" "+i+str.indexOf(str.charAt(i)));
            if(str.indexOf(str.charAt(i))==i) answer+=str.charAt(i);  // i가 처음으로 발견되는 인덱스번호랑 i랑 같더라

        }  
        //제일처음에 인덱스를 뽑아내는것

        return answer;
    }
    public static void main(String[] args) {
        Exam06 T=new Exam06();
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(T.get(str));

    }
}
