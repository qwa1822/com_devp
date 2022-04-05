package CoCo;

import java.util.Scanner;

public class ifex01 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int number=sc.nextInt();


        for(int i=0; i<number; i++){
            for(int j=number; j>=i; j--){
                System.out.print("*");
            }
            for(int c=1; c<=i*2-1; c++){
                System.out.print(" ");
            }

            for(int c=number; c>=i; c--){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
