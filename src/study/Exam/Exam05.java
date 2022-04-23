package study.Exam;

import java.util.Scanner;

public class Exam05 {
    public String solution(String str){
        String answer="";

        //문자배열 생성
        char[]s=str.toCharArray();

        //첫번쨰 길이 , 마지막
            int lt=0, rt=str.length()-1;
            while(lt<rt){

                //알파벳이 아닌가를 묻는다.
                if(!Character.isAlphabetic(s[lt]))
                    lt++;
                else if(!Character.isAlphabetic(s[rt]))
                    rt--;
                
                //스와프 작업
                else{
                    char tmp=s[lt];
                    s[lt]=s[rt];
                    s[rt]=tmp;
                    lt++;
                    rt--;
                }
            }
            //s의 기본형 변수를 String 화 시켜주는것
            answer=String.valueOf(s);



        return answer;
    }


    public static void main(String[] args) {


        //영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만
        //뒤집고 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는
        //프로그램을 작성하세요.

        //toCharArray << 문자배열로 수정하는것
        //lt 를 0번인덱스(left)
        //rt를 맨끝 문자(right)
        //lt 와 rt를 스왑해야함
        //그러면서 동시에증가 시켜야함
        /*
        특수문자면 그냥증가
        lt가 특수문자냐?  라고  if문을 작성하자



        반복문안에 넣어놓음
        if(lt==특)
        lt++           (left)
        elif (rt==특)
        rt--        (right 니깐 감소)

         */

        Exam05 T=new Exam05();
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(T.solution(str));


    }
}
