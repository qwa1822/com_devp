package study.UserExam;

import java.util.Scanner;

public class UserExam08 {


    public int get(String a){

        int result=0;
        for(char b:a.toCharArray()){
            if(b>=48 && b<=57){
                result=result*10+(b-48);
            }

        }
        return result;
    }
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        String b=sc.nextLine();

        UserExam08 T=new UserExam08();

        System.out.println(T.get(b));
    }
}
