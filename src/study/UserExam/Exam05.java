package study.UserExam;

import java.util.Scanner;

public class Exam05 {
    public String get(String c) {


        String answer = "";

        char[] b = c.toCharArray();


        int lt = 0, rt = c.length() - 1;

        while (lt < rt) {
            if (!Character.isAlphabetic(b[lt]))
                lt++;
            else if (!Character.isAlphabetic(b[rt]))
                rt--;
            else {
                char tmp =b[lt];
                b[lt]=b[rt];
                b[rt]=tmp;
                lt++;
                rt--;
            }

        }
        answer=String.valueOf(b);
        return answer;
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        Exam05 T = new Exam05();


        String s = sc.next();


        System.out.println(T.get(s));
    }

}
