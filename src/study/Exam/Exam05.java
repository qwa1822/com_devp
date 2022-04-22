package study.Exam;

import java.util.Scanner;

public class Exam05 {
    public String Solution(String str) {
        String answer;

        //문자배열이 생성됨.
        char[] s = str.toCharArray();

        //lt는 첫번째글자
        //rt는 마지막글자 길이-1
        int lt = 0, rt = str.length() - 1;

        //알파벳 확인메소드
        while (lt < rt) {                       //느낌표를 붙인이유는 아닐떄!
            if (!Character.isAlphabetic(s[lt])) lt++;  // s의 lt가 알파벳일떄 참
            else if (!Character.isAlphabetic(s[rt])) rt--;
            else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            answer = String.valueOf(s);

            return answer;
        }
    }
        public static void main (String[]args){

            Exam05 T = new Exam05();

            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            System.out.println(T.Solution(str));
        }
    }

