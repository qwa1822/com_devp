package java_egoing;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a >= 1 && a <= 26 && a+b<= 27) {
            System.out.println(b > s.length() ? "Error" : s.substring(a - 1, a - 1 + b));
        }
        else{
            System.out.println("Error");
        }

    }
}
