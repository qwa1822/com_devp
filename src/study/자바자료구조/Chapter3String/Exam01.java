package study.자바자료구조.Chapter3String;

import java.util.Arrays;
import java.util.Scanner;

public class Exam01 {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];


        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();


        }


        for (int b = 0; b < arr.length; b++) {
            for (int c = b + 1; c > 0; c--) {
                if (arr[b] > arr[c]) {
                    int temp = arr[c];
                    arr[b] = arr[c];
                    arr[c] = temp;
                }
            }
        }


        for (int array : arr){
            System.out.println(arr);

    }
}
}
