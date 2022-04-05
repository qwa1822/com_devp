package udemy;

import java.util.Scanner;

public class ex03 {


    public static void main(String[] args) {





        printMultiple(7);
        printMultiple();

    //메소드 오버로딩



    }




    static void printMultiple(int n){
        for(int i=0; i<=10; i++){
            System.out.printf("%d* %d = %d",n,i,n*i).println();
        }
    }

    static void printMultiple(){
        for(int i=0; i<=10; i++){
            System.out.printf("%d* %d = %d",5,i,5*i).println();
        }
    }


}



