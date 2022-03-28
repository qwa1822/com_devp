package CoCo;

import java.util.Scanner;

public class ifex01 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        int a = sc.nextInt();

        for (int number = 1; number <= a; number++) {
            for (int i = a; i >=number; i--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2*number-1;  j++) {
                System.out.print("*");
            }

            for (int c = a; c>=number; c--) {
                System.out.print(" ");
            }

            System.out.println();

        }


    }
}
