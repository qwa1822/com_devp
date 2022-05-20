package cju;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("입력하세요");
        String input = removeWhite(sc.nextLine());

        int i = Integer.parseInt(sc.nextLine());

        int strike[] = new int[i];
        int ball[] = new int[i];


        for (int a = 0; a < i; a++) {
            String output = removeWhite(sc.nextLine());

            strike[a] = Strikecount(input, output);
            ball[a] = ballcount(input, output);


        }

        for (int a = 0; a < i; a++) {
            int s = strike[a];
            int b = ball[a];

            if (s == 0 && b == 0) {
                System.out.println("OUT");
            }
            if (s > 0) {
                System.out.print(s + "S");
            }
            if (b > 0) {
                System.out.print(b + "B");
            }
            System.out.println();
        }
    }



    static String removeWhite(String s){
    return  s.replaceAll("\\s","");
    }



    static int Strikecount(String input,String output){
        int strike=0;


        for(int i=0; i<4; i++){
            if(input.charAt(i)==output.charAt(i)){
                strike++;
            }
        }
        return strike;
    }


    static int ballcount(String input,String output){
        int ballcount=0;

        for(int i=0; i<4; i++){
            if(input.charAt(i)==output.charAt(i)){
                continue;

            }
            if(input.contains(output.charAt(i)+"")){
                ballcount++;
            }
        }
        return ballcount++;
    }

}
