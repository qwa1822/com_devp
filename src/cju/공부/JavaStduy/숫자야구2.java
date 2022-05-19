package cju.공부.JavaStduy;

import java.util.Scanner;

public class 숫자야구2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String answer = removeWhitespace(scanner.nextLine());

        int n = Integer.parseInt(scanner.nextLine());
        int[] balls = new int[n];
        int[] strikes = new int[n];

        for(int i = 0;i < n;i++) {
            String input = removeWhitespace(scanner.nextLine());
            strikes[i] = strikeCount(answer, input);
            balls[i] = ballCount(answer, input);
        }

        for(int i = 0;i < n;i++) {
            int s = strikes[i];
            int b = balls[i];
            if(s == 0 && b == 0) {
                System.out.print("OUT");
            }
            if(s > 0) {
                System.out.print(s + "S");
            }
            if(b > 0) {
                System.out.print(b + "B");
            }
            System.out.println();
        }
    }

    public static String removeWhitespace(String s) {
        return s.replaceAll("\\s","");
    }

    public static int ballCount(String answer, String input) {
        int balls = 0;
        for(int i = 0;i < 4;i++) {
            if(answer.charAt(i) == input.charAt(i)) {
                continue;
            }
            if(answer.contains(input.charAt(i) + "")) {
                balls++;
            }
        }
        return balls;
    }

    public static int strikeCount(String answer, String input) {
        int strikes = 0;
        for(int i = 0;i < 4;i++) {
            if(answer.charAt(i) == input.charAt(i)) {
                strikes++;
            }
        }
        return strikes;
    }
}
