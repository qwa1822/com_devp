package study.Exam;

import java.util.Scanner;

public class 문자거리 {
                            //문자열받고 문자받고.
    public int[] solution(String s, char t){

        //문자열를 동적으로 받음. 0~10번까지 인덱스배열
    int[]answer=new int[s.length()];
    //1000으로 잡음
    int p=1000;
    for(int i=0; i<s.length(); i++){
        //문자냐고 묻는것
        if(s.charAt(i)==t){
            //아니면  0을 집어넣어서 넣어줌.
            p=0;
            answer[i]=p;
        }
        else{
            //p를 1증가시켜줌.
            p++;
            answer[i]=p;
        }

    }
        p=1000;
    for(int i=s.length()-1; i>=0; i--){
        if(s.charAt(i)==t)
            p=0;
        else{
            //p를 1증가시켜줌.
            p++;
            answer[i]=Math.min(answer[i],p);
        }

    }

        return answer;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        문자거리 T=new 문자거리();
        String str=sc.next();
        char c=sc.next().charAt(0);

        for(int x:T.solution(str,c)){
            System.out.print(x+" ");
        }
    }
}
