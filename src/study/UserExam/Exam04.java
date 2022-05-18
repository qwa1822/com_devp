package study.UserExam;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam04 {
    public ArrayList<String> get(int n, String[]str){
        ArrayList<String> answer=new ArrayList<>();
        for(String x:str){
            char[]s=x.toCharArray();


            int lt=0, rt=x.length()-1;
            while(lt<rt){
                char tmp=s[lt];
                s[lt]=s[rt];
                s[rt]=tmp;
                lt++;
                rt--;
            }
            String tmp=String.valueOf(s);
            answer.add(tmp);
        }
        return answer;
    }
    public static void main(String[] args) {


        Exam04 T=new Exam04();
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
       String[]str=new String[i];


       for(int a=0; a<i; a++) {
        str[i]=sc.next();


       }

       for(String s:T.get(i,str)){
           System.out.println(s);



       }

    }
}
