package study.자바자료구조.SECTION02메소드호출;

import java.util.Scanner;

public class 메서드03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int number[] = new int[n];

        for (int i = 0; i < n; i++)
            number[i] = sc.nextInt();
            sc.close();

            //배열의 이름을 적어주면됨 (배열을 넘겨주려면)
            bubblesort(n,number);

        System.out.println("Sorted Data:");
        for(int i=0; i<n; i++)
            System.out.println(number[i]);

    }
    
    //아무것도 리턴타입이 없을때 void
   static void bubblesort(int n, int[]Array)
   {
    for(int i=n-1; i>0; i--){
        for(int j=0; j<i; j++){
            //앞에있는거랑 하낰씩 비교하기위해 +1 0,1  0번쨰랑 1번쨰랑비교
            if(Array[j]>Array[j+1]){
                
                //tmp에다가 j값을 저장시켜놈
                int tmp=Array[j];
                //j값에다가 j+1값을 넘겨줌
                Array[j]=Array[j+1];
                //j+1값에다가 tmp값을 옮겨넣어줌.
                Array[j+1]=tmp;

            }
        }
    }


   }





}

