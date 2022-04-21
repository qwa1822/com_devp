package study.삼항연산자;

import java.util.Scanner;

public class Exam02 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int i=sc.nextInt();
        i=0;





        while(i<=30){
            if(i%2==0)
                System.out.println(i);


            i++;


        }
        i=sc.nextInt();
        i=0;
        while(i<=30){
            if(i%2!=0)

                System.out.println(i);
            i++;
        }

    }
}
