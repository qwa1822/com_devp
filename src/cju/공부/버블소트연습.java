package cju.공부;

import java.util.Scanner;

public class 버블소트연습 {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);


        int array[]={
                10,30,40,2,3,5,1,50,5102,1332,3,421,13,4124,141,4,232,314,21
        };

        for(int i=0; i<array.length; i++){

            for(int j=0; j<array.length; j++){

                if(array[i]<array[j]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }

        }

        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
