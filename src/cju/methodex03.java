package cju;

import java.util.Scanner;

public class methodex03 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int i=sc.nextInt();

        getStar(i);


    }

    public static void getStar(int b){
        for(int i=0; i<=b; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
