package cju.공부.인프런자료구조.자바기능;

import java.util.Scanner;

public class 오름차정렬 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();      //지역변수
        int ace[] = new int[n];

        for (int i = 0; i < n; i++) {
            ace[i] = sc.nextInt();
        }

        bubbleSort(n,ace);


        System.out.println("SOr ted data:");
        for(int i=0; i<n; i++){
            System.out.println(ace[i]);
        }
    }

    static void bubbleSort(int n,int[]data){

        for(int i=n-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(data[j]>data[j+1]){
                    //swap data[j] and data[j+1]
                    int tmp=data[j];
                    data[j]=data[j+1];
                    data[j+1]=tmp;
                }
            }
        }




    }




}


