package cju;

import java.util.Scanner;

public class getStar2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);


        int c=sc.nextInt();


        getStart(c);
    }


    public static void getStart(int number){

       for(int i=1; i<=number; i++){
           for(int j=number-1; j>=i; j--){
               System.out.print(" ");
           }

           for(int j=1; j<=i; j++){
               System.out.print("*");
           }
           System.out.println("");
       }
    }
}
