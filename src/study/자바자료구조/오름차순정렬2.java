package study.자바자료구조;

import java.util.Scanner;

public class 오름차순정렬2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int[] data = new int[n];


        for (int i = 0; i < n; i++) {
            //입력을 받은후
            int tmp = sc.nextInt();

            //뒤에서 부터 찾아야되기떄문에
            int j = i - 1;

            //data[j] 새로입력된 tmp보다 클때까지
            //while문을 빠져나오기위해 j>0
            while (j>=0 && data[j] > tmp) {

                //한칸씩 뒤로 보낸다
                data[j + 1] = data[j];
                j--;
            }

            // data[j+1] 자리에 tmp가 들어간다

            data[j + 1] = tmp;


            //출력 root
            for(int k=0; k<i; k++)
                System.out.print(data[k]+ " ");
            System.out.println();

        }


        sc.close();
    }
}
