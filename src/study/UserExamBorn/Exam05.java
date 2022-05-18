package study.UserExamBorn;

import Show.Exam;

import java.util.Scanner;

public class Exam05 {
    public String get(String a) {

        String answer = "";


        char[] b = a.toCharArray();


        int lt = 0, rt = a.length() - 1;
        while (lt < rt) {
            if (!Character.isLowerCase(b[lt]))
                lt++;
            else if (!Character.isLowerCase(b[rt]))
                rt--;

            else {
                char temp = b[lt];
                b[lt] = b[rt];
                b[rt] = temp;
                lt++;
                rt--;
            }


        }

        answer = String.valueOf(b);

        return answer;

    }

    public static void main(String[] args) {
        Exam05 T = new Exam05();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        System.out.println(T.get(a));
    }
}
