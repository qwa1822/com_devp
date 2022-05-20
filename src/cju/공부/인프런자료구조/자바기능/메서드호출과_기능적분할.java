package cju.공부.인프런자료구조.자바기능;

import java.util.Scanner;

public class 메서드호출과_기능적분할 {

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();


        int result=pow(a,b);

        System.out.println(result);

    }

    public static int pow(int a,int b){
        int count=1;


        for(int i=0; i<b; i++)
            count*=a;


        return count;
    }


}
