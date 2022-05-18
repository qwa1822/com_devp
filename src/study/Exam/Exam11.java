package study.Exam;

import java.util.Scanner;

public class Exam11 {
    public String solutin(String s) {
        String answer = "";


        s = s + " ";
        int cnt = 1;

        //빈문자 전까지만 출력
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) cnt++;
            else {
                answer += s.charAt(i);
                if (cnt > 1) answer += String.valueOf(cnt);
                cnt = 1;
            }
        }
        return answer;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exam11 T = new Exam11();

        String b = sc.next();
        System.out.println(T.solutin(b));
    }
}
