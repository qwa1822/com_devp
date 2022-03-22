package java_egoing;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        String all="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int i=sc.nextInt();
        int c=sc.nextInt();

        if(i>=0 && i<=26 && c>=0){
            System.out.println(all.length()<c?"Error":all.substring(i-1,i-1+c));
        }

    }
}
