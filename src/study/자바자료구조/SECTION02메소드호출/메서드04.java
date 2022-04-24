package study.자바자료구조.SECTION02메소드호출;

import java.util.Scanner;

public class 메서드04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number[] = new int[n];

        for (int i = 0; i < n; i++) {
            number[i] = sc.nextInt();
            sc.close();
        }

        BubbleArray(n, number);

        System.out.println("Sorted data:");
        for (int i = 0; i < n; i++)
            System.out.println(number[i]);


    }


    static void BubbleArray(int n, int[] Array) {
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (Array[j] > Array[j + 1]) {

                    if (Array[j] > Array[j + 1]) {
                        int temp = Array[j];
                        Array[j] = Array[j + 1];
                        Array[j + 1] = temp;

                        //swap data[j] and data[j+1]
                    /*
                    값에의한 호출(참조에 의한 호출)
                    swap메서드를 호출하는 순간 data[j]와 data[j+1]의 값이 각각
                    a와 b에복사된다. 그뿐이다. 즉 완전히
                    별개의 변수이다.
                     */

                    }
                }
            }

        }


    }
}
