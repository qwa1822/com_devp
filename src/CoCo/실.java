package CoCo;

import java.util.Scanner;

public class 실 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int stick=256;
        int x=sc.nextInt();

        int count=0;


        while(x>0){
            if(stick>x){
                stick/=2;
            }
            else {
                x -= stick;
                count++;
            }
        }
        System.out.println(count);

    }
}
