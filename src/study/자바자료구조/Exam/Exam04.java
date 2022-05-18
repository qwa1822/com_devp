package study.자바자료구조.Exam;

import java.util.Scanner;

public class Exam04 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int number[] = new int[i];


        for (int a = 0; a < i; a++)
            number[a] = sc.nextInt();
        sc.close();

        int temp = number[i - 1];

        for(int a=i-2; a>0;  a--)
        number[a + 1] = number[a];
        number[0] = temp;


        for (int a = 0; a < i; a++) {
            System.out.println(number[a]);
        }
    }


    }

