package study.Exam;

import java.util.Scanner;

public class Exam07 {

    public String solution(String str){
        String answer="YES";
        //뒤집는거
        String tmp=new StringBuilder(str).reverse().toString();
        //뒤집어진거랑 원래문자열이랑 같냐?
        //equals는 대소문자를 구분함.
        if(str.equalsIgnoreCase(tmp)) answer="Yes";
        return answer;



        //문제1
//        str=str.toUpperCase();
//        int len=str.length();
//        for(int i=0; i<len/2; i++){
//            if(str.charAt(i)!=str.charAt(len-i-1)) return "NO";
//        }





    }
    public static void main(String[] args) {

    Exam07 T=new Exam07();
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(T.solution(str));
    }

    public static class Exam09 {
        public int get(String a){

            int answer=0;


            //문자배열이돼서 for-each가 가능해진다.
            for(char x:a.toCharArray())

                //48부터 시작하는거는 ASCLL 코드로 48이 0이고
                // 57이 9이기 떄문이다.
                if(x>=48 && x<=57) answer=answer*10+(x-48);  //48을뺴줘야지 숫자 0이된다.


            return answer;
        }


        public static void main(String[] args) {

        //문자 '0'  '9'  48~57 AsCll 코드
            //answer = answer*10+(x-48) << x-48 은 처음에 0이다.
            //   0  =     0  * 10 +0
            //  1  =       0* 10 +1


            Scanner sc=new Scanner(System.in);

            String b=sc.nextLine();

            Exam09 T=new Exam09();


            System.out.println(T.get(b));

        }
    }
}
