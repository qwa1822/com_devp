package study.자바자료구조;

import java.util.Scanner;

public class 오름차순정렬 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] data = new int[n];


        for (int i = 0; i < n; i++)
            data[i] = sc.nextInt();
        sc.close();

        //bubble sort
        //맨뒷자리부터
        for (int i = n - 1; i > 0; i--) {

            //data[0]....data[n];
            for (int j = 0; j < i; j++) {
                //다음값까지 계산
                if (data[j] > data[j + 1]) {
                    //swap data[j] and data[j+1]


                    //이것은 임시공간
                    int tmp = data[j];


                    //두 값의 공간을 swap
                    data[j] = data[j + 1];
                    data[j + 1] = tmp;

                }
            }

        }


        System.out.println("Sorted Data:");
        for(int i=0; i<n; i++)
            System.out.println(data[i]);
    }
}
