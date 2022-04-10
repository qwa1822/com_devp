package Backjon;

import java.util.Scanner;

public class BackJon10952 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        while (true) {

            int c = sc.nextInt();
            int d = sc.nextInt();

            if (c == 0 && d == 0) {
                sc.close();
                break;
            }
            System.out.println(c + d);
        }
    }
}
